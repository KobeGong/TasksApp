package defpackage;

/* renamed from: cit reason: default package */
/* compiled from: PG */
final class cit extends defpackage.cgj {
    public final java.lang.Object d = new java.lang.Object();
    public final int e;
    public final boolean f;
    public final java.util.List g;
    public final defpackage.cis h;

    cit(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i, int i2, boolean z, defpackage.cly cly) {
        super(coe, application, clt, i, Integer.MAX_VALUE);
        this.e = i2;
        this.f = z;
        this.g = new java.util.ArrayList(i2);
        this.h = new defpackage.cis(cly);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        synchronized (this.d) {
            this.g.clear();
        }
    }
}
