package defpackage;

import android.view.View;

/* renamed from: ask  reason: default package */
final /* synthetic */ class ask implements View.OnFocusChangeListener {
    private final asi a;

    ask(asi asi) {
        this.a = asi;
    }

    public final void onFocusChange(View view, boolean z) {
        asi asi = this.a;
        if (!z) {
            asi.U();
        }
    }
}
