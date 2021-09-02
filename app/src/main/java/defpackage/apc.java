package defpackage;

/* renamed from: apc reason: default package */
public final /* synthetic */ class apc implements android.content.DialogInterface.OnDismissListener {
    private final java.lang.Runnable a;

    public apc(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.a.run();
    }
}
