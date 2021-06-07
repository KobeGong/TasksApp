package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: wj  reason: default package */
/* compiled from: PG */
public final class wj extends Handler {
    private WeakReference a;

    public wj(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
                return;
            case 0:
            default:
                return;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                return;
        }
    }
}
