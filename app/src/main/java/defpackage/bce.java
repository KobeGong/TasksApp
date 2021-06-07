package defpackage;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: bce  reason: default package */
/* compiled from: PG */
final class bce implements Runnable {
    public final /* synthetic */ bcc a;
    private final bcd b;

    bce(bcc bcc, bcd bcd) {
        this.a = bcc;
        this.b = bcd;
    }

    public final void run() {
        if (this.a.c) {
            axq axq = this.b.b;
            if (axq.a()) {
                this.a.a.startActivityForResult(GoogleApiActivity.a(this.a.a(), axq.c, this.b.a, false), 1);
            } else if (axv.a(axq.b)) {
                Activity a2 = this.a.a();
                bax bax = this.a.a;
                int i = axq.b;
                bcc bcc = this.a;
                Dialog a3 = axt.a(a2, i, new bej(axv.a(a2, i, "d"), bax), bcc);
                if (a3 != null) {
                    axt.a(a2, a3, "GooglePlayServicesErrorDialog", bcc);
                }
            } else if (axq.b == 18) {
                axt.a(this.a.a().getApplicationContext(), new bcf(this, axt.a(this.a.a(), this.a)));
            } else {
                this.a.a(axq, this.b.a);
            }
        }
    }
}
