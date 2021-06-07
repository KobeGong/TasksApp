package defpackage;

import android.content.DialogInterface;

/* renamed from: apc  reason: default package */
public final /* synthetic */ class apc implements DialogInterface.OnDismissListener {
    private final Runnable a;

    public apc(Runnable runnable) {
        this.a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.run();
    }
}
