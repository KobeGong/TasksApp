package defpackage;

/* renamed from: tc reason: default package */
/* compiled from: PG */
final class tc extends defpackage.td {
    tc() {
        super(0);
    }

    public final boolean a(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public final void b(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
        }
    }

    public final void a(android.view.ViewParent viewParent, android.view.View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
        }
    }

    public final void a(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
        }
    }

    public final void a(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
        }
    }

    public final boolean a(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean a(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }
}
