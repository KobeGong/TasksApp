package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.ViewTreeObserver;

/* renamed from: hb  reason: default package */
/* compiled from: PG */
public final class hb implements ViewTreeObserver.OnPreDrawListener {
    private final /* synthetic */ CoordinatorLayout a;

    public hb(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.a(0);
        return true;
    }
}
