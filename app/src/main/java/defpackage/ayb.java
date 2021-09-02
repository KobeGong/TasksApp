package defpackage;

/* renamed from: ayb reason: default package */
/* compiled from: PG */
public final class ayb extends defpackage.lb {
    public android.app.Dialog U = null;
    public android.content.DialogInterface.OnCancelListener V = null;

    public final android.app.Dialog c() {
        if (this.U == null) {
            this.b = false;
        }
        return this.U;
    }

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.V != null) {
            this.V.onCancel(dialogInterface);
        }
    }
}
