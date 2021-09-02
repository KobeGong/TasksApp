package defpackage;

/* renamed from: sq reason: default package */
/* compiled from: PG */
class sq extends defpackage.sp {
    sq() {
    }

    public final int j(android.view.View view) {
        return view.getLayoutDirection();
    }

    public final int k(android.view.View view) {
        return view.getPaddingStart();
    }

    public final int l(android.view.View view) {
        return view.getPaddingEnd();
    }

    public final void a(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public final int m(android.view.View view) {
        return view.getWindowSystemUiVisibility();
    }

    public final boolean n(android.view.View view) {
        return view.isPaddingRelative();
    }

    public final android.view.Display o(android.view.View view) {
        return view.getDisplay();
    }
}
