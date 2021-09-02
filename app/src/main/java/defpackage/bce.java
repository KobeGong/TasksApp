package defpackage;

/* renamed from: bce reason: default package */
/* compiled from: PG */
final class bce implements java.lang.Runnable {
    public final /* synthetic */ defpackage.bcc a;
    private final defpackage.bcd b;

    bce(defpackage.bcc bcc, defpackage.bcd bcd) {
        this.a = bcc;
        this.b = bcd;
    }

    public final void run() {
        if (this.a.c) {
            defpackage.axq axq = this.b.b;
            if (axq.a()) {
                this.a.a.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.a(this.a.a(), axq.c, this.b.a, false), 1);
            } else if (defpackage.axv.a(axq.b)) {
                android.app.Activity a2 = this.a.a();
                defpackage.bax bax = this.a.a;
                int i = axq.b;
                defpackage.bcc bcc = this.a;
                android.app.Dialog a3 = defpackage.axt.a((android.content.Context) a2, i, (defpackage.beh) new defpackage.bej(defpackage.axv.a(a2, i, "d"), bax), (android.content.DialogInterface.OnCancelListener) bcc);
                if (a3 != null) {
                    defpackage.axt.a(a2, a3, "GooglePlayServicesErrorDialog", (android.content.DialogInterface.OnCancelListener) bcc);
                }
            } else if (axq.b == 18) {
                defpackage.axt.a(this.a.a().getApplicationContext(), (defpackage.bas) new defpackage.bcf(this, defpackage.axt.a(this.a.a(), (android.content.DialogInterface.OnCancelListener) this.a)));
            } else {
                this.a.a(axq, this.b.a);
            }
        }
    }
}
