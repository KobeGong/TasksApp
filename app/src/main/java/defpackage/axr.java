package defpackage;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: axr  reason: default package */
/* compiled from: PG */
public final class axr extends DialogFragment {
    public Dialog a = null;
    public DialogInterface.OnCancelListener b = null;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.a == null) {
            setShowsDialog(false);
        }
        return this.a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b.onCancel(dialogInterface);
        }
    }
}
