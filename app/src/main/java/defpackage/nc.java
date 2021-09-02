package defpackage;

/* renamed from: nc reason: default package */
/* compiled from: PG */
public final class nc extends defpackage.ac implements defpackage.od {
    public final int g;
    public final android.os.Bundle h = null;
    public final defpackage.oc i;
    public defpackage.nd j;
    private LifecycleOwner k;

    public nc(int i2, android.os.Bundle bundle, defpackage.oc ocVar) {
        super(0);
        this.g = i2;
        this.i = ocVar;
        defpackage.oc ocVar2 = this.i;
        if (ocVar2.d != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        ocVar2.d = this;
        ocVar2.c = i2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        defpackage.oc ocVar = this.i;
        ocVar.f = true;
        ocVar.h = false;
        ocVar.g = false;
        ocVar.e();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        defpackage.oc ocVar = this.i;
        ocVar.f = false;
        ocVar.f();
    }

    public final defpackage.oc a(LifecycleOwner yVar, defpackage.nb nbVar) {
        defpackage.nd ndVar = new defpackage.nd(this.i, nbVar);
        a(yVar, ndVar);
        if (this.j != null) {
            a((defpackage.ag) this.j);
        }
        this.k = yVar;
        this.j = ndVar;
        return this.i;
    }

    public final void c() {
        LifecycleOwner yVar = this.k;
        defpackage.nd ndVar = this.j;
        if (yVar != null && ndVar != null) {
            super.a((defpackage.ag) ndVar);
            a(yVar, ndVar);
        }
    }

    public final void a(defpackage.ag agVar) {
        super.a(agVar);
        this.k = null;
        this.j = null;
    }

    public final void d() {
        this.i.b();
        this.i.g = true;
        defpackage.nd ndVar = this.j;
        if (ndVar != null) {
            a((defpackage.ag) ndVar);
            if (ndVar.b) {
                ndVar.a.j_();
            }
        }
        defpackage.oc ocVar = this.i;
        if (ocVar.d == null) {
            throw new java.lang.IllegalStateException("No listener register");
        } else if (ocVar.d != this) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            ocVar.d = null;
            defpackage.oc ocVar2 = this.i;
            ocVar2.h = true;
            ocVar2.f = false;
            ocVar2.g = false;
            ocVar2.i = false;
        }
    }

    public final void b(java.lang.Object obj) {
        boolean z;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            a(obj);
            return;
        }
        synchronized (this.a) {
            z = this.e == defpackage.ac.b;
            this.e = obj;
        }
        if (z) {
            defpackage.a.a().b(this.f);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        defpackage.jd.a((java.lang.Object) this.i, sb);
        sb.append("}}");
        return sb.toString();
    }
}
