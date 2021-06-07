package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gz  reason: default package */
/* compiled from: PG */
public final class gz implements ViewGroup.OnHierarchyChangeListener {
    private final /* synthetic */ CoordinatorLayout a;

    public gz(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.a.d != null) {
            this.a.d.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.a.a(2);
        if (this.a.d != null) {
            this.a.d.onChildViewRemoved(view, view2);
        }
    }
}
