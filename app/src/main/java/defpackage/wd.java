package defpackage;

import android.os.Message;
import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: wd  reason: default package */
/* compiled from: PG */
public final class wd implements View.OnClickListener {
    private final /* synthetic */ AlertController a;

    public wd(AlertController alertController) {
        this.a = alertController;
    }

    public final void onClick(View view) {
        Message message;
        if (view == this.a.h && this.a.j != null) {
            message = Message.obtain(this.a.j);
        } else if (view == this.a.l && this.a.n != null) {
            message = Message.obtain(this.a.n);
        } else if (view != this.a.p || this.a.r == null) {
            message = null;
        } else {
            message = Message.obtain(this.a.r);
        }
        if (message != null) {
            message.sendToTarget();
        }
        this.a.F.obtainMessage(1, this.a.b).sendToTarget();
    }
}
