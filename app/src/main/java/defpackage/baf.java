package defpackage;

/* renamed from: baf reason: default package */
/* compiled from: PG */
public final class baf implements defpackage.bau, defpackage.bci {
    public final java.util.concurrent.locks.Lock a;
    public final java.util.concurrent.locks.Condition b;
    public final android.content.Context c;
    public final defpackage.axv d;
    public final defpackage.bah e;
    public final java.util.Map f;
    public final java.util.Map g = new java.util.HashMap();
    public defpackage.bdj h;
    public java.util.Map i;
    public defpackage.ayf j;
    public volatile defpackage.bae k;
    public int l;
    public final defpackage.azx m;
    public final defpackage.bav n;
    private defpackage.axq o = null;

    public baf(android.content.Context context, defpackage.azx azx, java.util.concurrent.locks.Lock lock, android.os.Looper looper, defpackage.axv axv, java.util.Map map, defpackage.bdj bdj, java.util.Map map2, defpackage.ayf ayf, java.util.ArrayList arrayList, defpackage.bav bav) {
        this.c = context;
        this.a = lock;
        this.d = axv;
        this.f = map;
        this.h = bdj;
        this.i = map2;
        this.j = ayf;
        this.m = azx;
        this.n = bav;
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList2.get(i2);
            i2++;
            ((defpackage.bch) obj).b = this;
        }
        this.e = new defpackage.bah(this, looper);
        this.b = lock.newCondition();
        this.k = new defpackage.azv(this);
    }

    public final defpackage.bca a(defpackage.bca bca) {
        bca.d();
        return this.k.a(bca);
    }

    public final defpackage.bca b(defpackage.bca bca) {
        bca.d();
        return this.k.b(bca);
    }

    public final void a() {
        this.k.c();
    }

    public final defpackage.axq b() {
        a();
        while (e()) {
            try {
                this.b.await();
            } catch (java.lang.InterruptedException e2) {
                java.lang.Thread.currentThread().interrupt();
                return new defpackage.axq(15, null);
            }
        }
        if (d()) {
            return defpackage.axq.a;
        }
        if (this.o != null) {
            return this.o;
        }
        return new defpackage.axq(13, null);
    }

    public final void c() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.axq axq) {
        this.a.lock();
        try {
            this.o = axq;
            this.k = new defpackage.azv(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final boolean d() {
        return this.k instanceof defpackage.azi;
    }

    public final boolean e() {
        return this.k instanceof defpackage.azk;
    }

    public final boolean a(defpackage.bbh bbh) {
        return false;
    }

    public final void f() {
    }

    public final void a(defpackage.axq axq, defpackage.ayd ayd, boolean z) {
        this.a.lock();
        try {
            this.k.a(axq, ayd, z);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(android.os.Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(int i2) {
        this.a.lock();
        try {
            this.k.a(i2);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.bag bag) {
        this.e.sendMessage(this.e.obtainMessage(1, bag));
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        java.lang.String concat = java.lang.String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.k);
        for (defpackage.ayd ayd : this.i.keySet()) {
            printWriter.append(str).append(ayd.b).println(":");
            ((defpackage.ayj) this.f.get(ayd.b())).a(concat, printWriter);
        }
    }
}
