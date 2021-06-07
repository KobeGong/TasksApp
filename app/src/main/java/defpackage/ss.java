package defpackage;

import android.view.View;

/* renamed from: ss  reason: default package */
/* compiled from: PG */
class ss extends sr {
    ss() {
    }

    @Override // defpackage.sw
    public final void q(View view) {
        view.setAccessibilityLiveRegion(1);
    }

    @Override // defpackage.sw, defpackage.sp
    public final void a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // defpackage.sw
    public final boolean r(View view) {
        return view.isLaidOut();
    }

    @Override // defpackage.sw
    public final boolean s(View view) {
        return view.isAttachedToWindow();
    }
}
