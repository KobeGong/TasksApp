package defpackage;

/* renamed from: aqt reason: default package */
final /* synthetic */ class aqt implements android.content.DialogInterface.OnDismissListener {
    private final defpackage.aql a;

    aqt(defpackage.aql aql) {
        this.a = aql;
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.a.finish();
    }
}
