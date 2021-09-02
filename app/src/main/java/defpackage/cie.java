package defpackage;

/* renamed from: cie reason: default package */
/* compiled from: PG */
final class cie {
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final defpackage.cij b;
    public java.util.concurrent.ScheduledFuture c;
    public java.util.concurrent.ScheduledFuture d;
    public final defpackage.clt e;
    public final defpackage.cha f;
    public final defpackage.cgx g;
    public final defpackage.cgy h;

    cie(defpackage.cij cij, android.app.Application application, defpackage.clt clt) {
        this(cij, clt, defpackage.cha.a(application));
    }

    private cie(defpackage.cij cij, defpackage.clt clt, defpackage.cha cha) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new defpackage.cif(this);
        this.h = new defpackage.cih(this);
        this.b = cij;
        this.e = clt;
        this.f = cha;
    }
}
