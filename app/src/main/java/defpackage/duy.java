package defpackage;

/* renamed from: duy reason: default package */
/* compiled from: PG */
abstract class duy implements defpackage.dth {
    duy() {
    }

    /* access modifiers changed from: protected */
    public abstract defpackage.dth c();

    public final java.lang.Runnable a(defpackage.dxc dxc) {
        return c().a(dxc);
    }

    public final void a(defpackage.dpw dpw) {
        c().a(dpw);
    }

    public defpackage.dta a(defpackage.dpb dpb, defpackage.dor dor, defpackage.dna dna) {
        return c().a(dpb, dor, dna);
    }

    public final defpackage.dwd b() {
        return c().b();
    }

    public final defpackage.dmv a() {
        return c().a();
    }

    public java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.String obj = c().toString();
        return new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 2 + java.lang.String.valueOf(obj).length()).append(simpleName).append("[").append(obj).append("]").toString();
    }
}
