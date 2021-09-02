package defpackage;

/* renamed from: wd reason: default package */
/* compiled from: PG */
public final class wd implements android.view.View.OnClickListener {
    private final /* synthetic */ android.support.v7.app.AlertController a;

    public wd(android.support.v7.app.AlertController alertController) {
        this.a = alertController;
    }

    public final void onClick(android.view.View view) {
        android.os.Message message;
        if (view == this.a.h && this.a.j != null) {
            message = android.os.Message.obtain(this.a.j);
        } else if (view == this.a.l && this.a.n != null) {
            message = android.os.Message.obtain(this.a.n);
        } else if (view != this.a.p || this.a.r == null) {
            message = null;
        } else {
            message = android.os.Message.obtain(this.a.r);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.a.F.obtainMessage(1, this.a.b).sendToTarget();
    }
}
