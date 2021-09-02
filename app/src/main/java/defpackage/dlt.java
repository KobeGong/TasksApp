package defpackage;

/* renamed from: dlt reason: default package */
/* compiled from: PG */
final class dlt {
    public final defpackage.dhn a;

    public final void a(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void a(int i, long j) {
        this.a.a(i, j);
    }

    public final void b(int i, long j) {
        this.a.c(i, j);
    }

    public final void a(int i, float f) {
        this.a.a(i, f);
    }

    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    public final void b(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void c(int i, long j) {
        this.a.a(i, j);
    }

    public final void c(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void d(int i, long j) {
        this.a.c(i, j);
    }

    public final void d(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    public final void a(int i, defpackage.dha dha) {
        this.a.a(i, dha);
    }

    public final void e(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void f(int i, int i2) {
        this.a.d(i, i2);
    }

    public final void e(int i, long j) {
        this.a.b(i, j);
    }

    public final void a(int i, java.lang.Object obj, defpackage.dkh dkh) {
        this.a.a(i, (defpackage.djo) obj, dkh);
    }

    @java.lang.Deprecated
    public final void b(int i, java.lang.Object obj, defpackage.dkh dkh) {
        defpackage.dhn dhn = this.a;
        defpackage.djo djo = (defpackage.djo) obj;
        dhn.a(i, 3);
        dkh.a((java.lang.Object) djo, dhn.b);
        dhn.a(i, 4);
    }

    @java.lang.Deprecated
    public final void a(int i) {
        this.a.a(i, 3);
    }

    @java.lang.Deprecated
    public final void b(int i) {
        this.a.a(i, 4);
    }

    public final void a(int i, java.lang.Object obj) {
        if (obj instanceof defpackage.dha) {
            this.a.b(i, (defpackage.dha) obj);
        } else {
            this.a.b(i, (defpackage.djo) obj);
        }
    }

    dlt(defpackage.dhn dhn) {
        this.a = (defpackage.dhn) defpackage.dim.a((java.lang.Object) dhn, "output");
    }
}
