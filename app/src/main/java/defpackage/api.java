package defpackage;

/* renamed from: api reason: default package */
public final /* synthetic */ class api implements android.content.DialogInterface.OnDismissListener {
    private final java.lang.Runnable a;

    public api(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.a.run();
    }
}
