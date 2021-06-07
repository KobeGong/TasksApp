package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cif  reason: default package */
/* compiled from: PG */
final class cif implements cgx {
    public final /* synthetic */ cie a;

    cif(cie cie) {
        this.a = cie;
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(2, simpleName);
        cie cie = this.a;
        if (cie.c != null) {
            cie.c.cancel(true);
            cie.c = null;
        }
        if (cie.d != null) {
            cie.d.cancel(true);
            cie.d = null;
        }
        this.a.d = ((ScheduledExecutorService) this.a.e.a()).schedule(new cig(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
