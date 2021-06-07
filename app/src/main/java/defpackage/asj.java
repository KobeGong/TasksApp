package defpackage;

import android.view.View;

/* renamed from: asj  reason: default package */
final /* synthetic */ class asj implements View.OnFocusChangeListener {
    private final asi a;

    asj(asi asi) {
        this.a = asi;
    }

    public final void onFocusChange(View view, boolean z) {
        asi asi = this.a;
        if (!z) {
            asi.T();
        }
    }
}
