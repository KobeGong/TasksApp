package defpackage;

import android.view.Display;
import android.view.View;

/* renamed from: sq  reason: default package */
/* compiled from: PG */
class sq extends sp {
    sq() {
    }

    @Override // defpackage.sw
    public final int j(View view) {
        return view.getLayoutDirection();
    }

    @Override // defpackage.sw
    public final int k(View view) {
        return view.getPaddingStart();
    }

    @Override // defpackage.sw
    public final int l(View view) {
        return view.getPaddingEnd();
    }

    @Override // defpackage.sw
    public final void a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // defpackage.sw
    public final int m(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Override // defpackage.sw
    public final boolean n(View view) {
        return view.isPaddingRelative();
    }

    @Override // defpackage.sw
    public final Display o(View view) {
        return view.getDisplay();
    }
}
