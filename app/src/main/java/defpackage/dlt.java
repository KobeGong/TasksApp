package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dlt  reason: default package */
/* compiled from: PG */
public final class dlt {
    public final dhn a;

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

    public final void a(int i, dha dha) {
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

    public final void a(int i, Object obj, dkh dkh) {
        this.a.a(i, (djo) obj, dkh);
    }

    @Deprecated
    public final void b(int i, Object obj, dkh dkh) {
        dhn dhn = this.a;
        dhn.a(i, 3);
        dkh.a((Object) ((djo) obj), dhn.b);
        dhn.a(i, 4);
    }

    @Deprecated
    public final void a(int i) {
        this.a.a(i, 3);
    }

    @Deprecated
    public final void b(int i) {
        this.a.a(i, 4);
    }

    public final void a(int i, Object obj) {
        if (obj instanceof dha) {
            this.a.b(i, (dha) obj);
        } else {
            this.a.b(i, (djo) obj);
        }
    }

    dlt(dhn dhn) {
        this.a = (dhn) dim.a((Object) dhn, "output");
        this.a.b = this;
    }
}
