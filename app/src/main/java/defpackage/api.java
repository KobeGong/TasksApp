package defpackage;

import android.content.DialogInterface;

/* renamed from: api  reason: default package */
public final /* synthetic */ class api implements DialogInterface.OnDismissListener {
    private final Runnable a;

    public api(Runnable runnable) {
        this.a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.run();
    }
}
