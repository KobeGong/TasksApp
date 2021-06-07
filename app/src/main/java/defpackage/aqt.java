package defpackage;

import android.content.DialogInterface;

/* renamed from: aqt  reason: default package */
final /* synthetic */ class aqt implements DialogInterface.OnDismissListener {
    private final aql a;

    aqt(aql aql) {
        this.a = aql;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
