package defpackage;

/* renamed from: axr reason: default package */
/* compiled from: PG */
public final class axr extends android.app.DialogFragment {
    public android.app.Dialog a = null;
    public android.content.DialogInterface.OnCancelListener b = null;

    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        if (this.a == null) {
            setShowsDialog(false);
        }
        return this.a;
    }

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b.onCancel(dialogInterface);
        }
    }
}
