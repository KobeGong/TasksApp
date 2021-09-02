package defpackage;

/* renamed from: wj reason: default package */
/* compiled from: PG */
public final class wj extends android.os.Handler {
    private java.lang.ref.WeakReference a;

    public wj(android.content.DialogInterface dialogInterface) {
        this.a = new java.lang.ref.WeakReference(dialogInterface);
    }

    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.a.get(), message.what);
                return;
            case 1:
                ((android.content.DialogInterface) message.obj).dismiss();
                return;
            default:
                return;
        }
    }
}
