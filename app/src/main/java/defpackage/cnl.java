package defpackage;

/* renamed from: cnl reason: default package */
/* compiled from: PG */
public final class cnl extends java.lang.ref.PhantomReference {
    public final java.lang.String a;
    public defpackage.cnl b;
    public defpackage.cnl c;

    public cnl(java.lang.Object obj, java.lang.String str, java.lang.ref.ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = str;
    }

    public final void a(defpackage.cnl cnl) {
        defpackage.cky.a((java.lang.Object) cnl);
        this.b = cnl;
        this.c = cnl.c;
        if (this.c != null) {
            this.c.b = this;
        }
        cnl.c = this;
    }

    public final defpackage.cnl a() {
        if (this.b != null) {
            this.b.c = this.c;
        }
        if (this.c != null) {
            this.c.b = this.b;
        }
        this.c = null;
        this.b = null;
        return this;
    }
}
