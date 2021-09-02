package defpackage;

/* renamed from: cih reason: default package */
/* compiled from: PG */
final class cih implements defpackage.cgy {
    public final /* synthetic */ defpackage.cie a;

    cih(defpackage.cie cie) {
        this.a = cie;
    }

    public final void a(android.app.Activity activity) {
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(3, simpleName);
        defpackage.cie cie = this.a;
        if (cie.c != null) {
            cie.c.cancel(true);
            cie.c = null;
        }
        if (cie.d != null) {
            cie.d.cancel(true);
            cie.d = null;
        }
        this.a.c = ((java.util.concurrent.ScheduledExecutorService) this.a.e.a()).schedule(new defpackage.cii(this, simpleName), 10, java.util.concurrent.TimeUnit.SECONDS);
    }
}
