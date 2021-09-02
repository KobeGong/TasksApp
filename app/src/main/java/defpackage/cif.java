package defpackage;

/* renamed from: cif reason: default package */
/* compiled from: PG */
final class cif implements defpackage.cgx {
    public final /* synthetic */ defpackage.cie a;

    cif(defpackage.cie cie) {
        this.a = cie;
    }

    public final void b(android.app.Activity activity) {
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(2, simpleName);
        defpackage.cie cie = this.a;
        if (cie.c != null) {
            cie.c.cancel(true);
            cie.c = null;
        }
        if (cie.d != null) {
            cie.d.cancel(true);
            cie.d = null;
        }
        this.a.d = ((java.util.concurrent.ScheduledExecutorService) this.a.e.a()).schedule(new defpackage.cig(this, simpleName), 10, java.util.concurrent.TimeUnit.SECONDS);
    }
}
