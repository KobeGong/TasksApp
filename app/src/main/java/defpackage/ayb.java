package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: ayb  reason: default package */
/* compiled from: PG */
public final class ayb extends lb {
    public Dialog U = null;
    public DialogInterface.OnCancelListener V = null;

    @Override // defpackage.lb
    public final Dialog c() {
        if (this.U == null) {
            ((lb) this).b = false;
        }
        return this.U;
    }

    @Override // defpackage.lb
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.V != null) {
            this.V.onCancel(dialogInterface);
        }
    }
}
