package defpackage;

/* renamed from: gz reason: default package */
/* compiled from: PG */
public final class gz implements android.view.ViewGroup.OnHierarchyChangeListener {
    private final /* synthetic */ android.support.design.widget.CoordinatorLayout a;

    public gz(android.support.design.widget.CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        if (this.a.d != null) {
            this.a.d.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
        this.a.a(2);
        if (this.a.d != null) {
            this.a.d.onChildViewRemoved(view, view2);
        }
    }
}
