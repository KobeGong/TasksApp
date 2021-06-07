package defpackage;

import android.view.View;

/* renamed from: sv  reason: default package */
/* compiled from: PG */
final class sv extends st {
    sv() {
    }

    @Override // defpackage.sw
    public final void d(View view, int i) {
        view.setScrollIndicators(i, 3);
    }

    @Override // defpackage.st, defpackage.sw
    public final void b(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    @Override // defpackage.st, defpackage.sw
    public final void c(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    sv(byte b) {
        this();
    }

    sv(char c) {
        this((byte) 0);
    }
}
