package defpackage;

/* renamed from: ss reason: default package */
/* compiled from: PG */
class ss extends defpackage.sr {
    ss() {
    }

    public final void q(android.view.View view) {
        view.setAccessibilityLiveRegion(1);
    }

    public final void a(android.view.View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public final boolean r(android.view.View view) {
        return view.isLaidOut();
    }

    public final boolean s(android.view.View view) {
        return view.isAttachedToWindow();
    }
}
