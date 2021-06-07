package defpackage;

import android.os.Bundle;
import android.os.Looper;

/* renamed from: nc  reason: default package */
/* compiled from: PG */
public final class nc extends ac implements od {
    public final int g;
    public final Bundle h = null;
    public final oc i;
    public nd j;
    private y k;

    public nc(int i2, Bundle bundle, oc ocVar) {
        super((byte) 0);
        this.g = i2;
        this.i = ocVar;
        oc ocVar2 = this.i;
        if (ocVar2.d != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        ocVar2.d = this;
        ocVar2.c = i2;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ac
    public final void a() {
        oc ocVar = this.i;
        ocVar.f = true;
        ocVar.h = false;
        ocVar.g = false;
        ocVar.e();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ac
    public final void b() {
        oc ocVar = this.i;
        ocVar.f = false;
        ocVar.f();
    }

    public final oc a(y yVar, nb nbVar) {
        nd ndVar = new nd(this.i, nbVar);
        a(yVar, ndVar);
        if (this.j != null) {
            a(this.j);
        }
        this.k = yVar;
        this.j = ndVar;
        return this.i;
    }

    public final void c() {
        y yVar = this.k;
        nd ndVar = this.j;
        if (yVar != null && ndVar != null) {
            super.a((ag) ndVar);
            a(yVar, ndVar);
        }
    }

    @Override // defpackage.ac
    public final void a(ag agVar) {
        super.a(agVar);
        this.k = null;
        this.j = null;
    }

    public final void d() {
        this.i.b();
        this.i.g = true;
        nd ndVar = this.j;
        if (ndVar != null) {
            a((ag) ndVar);
            if (ndVar.b) {
                ndVar.a.j_();
            }
        }
        oc ocVar = this.i;
        if (ocVar.d == null) {
            throw new IllegalStateException("No listener register");
        } else if (ocVar.d != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            ocVar.d = null;
            oc ocVar2 = this.i;
            ocVar2.h = true;
            ocVar2.f = false;
            ocVar2.g = false;
            ocVar2.i = false;
        }
    }

    @Override // defpackage.od
    public final void b(Object obj) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(obj);
            return;
        }
        synchronized (this.a) {
            z = this.e == ac.b;
            this.e = obj;
        }
        if (z) {
            a.a().b(this.f);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        jd.a((Object) this.i, sb);
        sb.append("}}");
        return sb.toString();
    }
}
