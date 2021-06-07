package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cih  reason: default package */
/* compiled from: PG */
final class cih implements cgy {
    public final /* synthetic */ cie a;

    cih(cie cie) {
        this.a = cie;
    }

    @Override // defpackage.cgy
    public final void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(3, simpleName);
        cie cie = this.a;
        if (cie.c != null) {
            cie.c.cancel(true);
            cie.c = null;
        }
        if (cie.d != null) {
            cie.d.cancel(true);
            cie.d = null;
        }
        this.a.c = ((ScheduledExecutorService) this.a.e.a()).schedule(new cii(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
