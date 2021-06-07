package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: baf  reason: default package */
/* compiled from: PG */
public final class baf implements bau, bci {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final axv d;
    public final bah e;
    public final Map f;
    public final Map g = new HashMap();
    public bdj h;
    public Map i;
    public ayf j;
    public volatile bae k;
    public int l;
    public final azx m;
    public final bav n;
    private axq o = null;

    public baf(Context context, azx azx, Lock lock, Looper looper, axv axv, Map map, bdj bdj, Map map2, ayf ayf, ArrayList arrayList, bav bav) {
        this.c = context;
        this.a = lock;
        this.d = axv;
        this.f = map;
        this.h = bdj;
        this.i = map2;
        this.j = ayf;
        this.m = azx;
        this.n = bav;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((bch) obj).b = this;
        }
        this.e = new bah(this, looper);
        this.b = lock.newCondition();
        this.k = new azv(this);
    }

    @Override // defpackage.bau
    public final bca a(bca bca) {
        bca.d();
        return this.k.a(bca);
    }

    @Override // defpackage.bau
    public final bca b(bca bca) {
        bca.d();
        return this.k.b(bca);
    }

    @Override // defpackage.bau
    public final void a() {
        this.k.c();
    }

    @Override // defpackage.bau
    public final axq b() {
        a();
        while (e()) {
            try {
                this.b.await();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                return new axq(15, null);
            }
        }
        if (d()) {
            return axq.a;
        }
        if (this.o != null) {
            return this.o;
        }
        return new axq(13, null);
    }

    @Override // defpackage.bau
    public final void c() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(axq axq) {
        this.a.lock();
        try {
            this.o = axq;
            this.k = new azv(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.bau
    public final boolean d() {
        return this.k instanceof azi;
    }

    @Override // defpackage.bau
    public final boolean e() {
        return this.k instanceof azk;
    }

    @Override // defpackage.bau
    public final boolean a(bbh bbh) {
        return false;
    }

    @Override // defpackage.bau
    public final void f() {
    }

    @Override // defpackage.bci
    public final void a(axq axq, ayd ayd, boolean z) {
        this.a.lock();
        try {
            this.k.a(axq, ayd, z);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.ayr
    public final void a(int i2) {
        this.a.lock();
        try {
            this.k.a(i2);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(bag bag) {
        this.e.sendMessage(this.e.obtainMessage(1, bag));
    }

    @Override // defpackage.bau
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.k);
        for (ayd ayd : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) ayd.b).println(":");
            ((ayj) this.f.get(ayd.b())).a(concat, printWriter);
        }
    }
}
