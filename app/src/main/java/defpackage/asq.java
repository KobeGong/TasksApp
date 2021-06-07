package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: asq  reason: default package */
final /* synthetic */ class asq implements View.OnClickListener {
    private final asi a;

    asq(asi asi) {
        this.a = asi;
    }

    public final void onClick(View view) {
        asi asi = this.a;
        String str = asi.U;
        if (asi.V != null) {
            str = asi.V.b;
        }
        atd atd = new atd();
        Bundle bundle = new Bundle();
        bundle.putString("selectedTaskList", str);
        atd.e(bundle);
        atd.a(asi.t, "TaskListSelectorBottomSheetDialogFragment");
    }
}
