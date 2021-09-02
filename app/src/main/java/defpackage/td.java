package defpackage;

/* renamed from: td reason: default package */
/* compiled from: PG */
class td {
    td() {
    }

    public boolean a(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        if (viewParent instanceof defpackage.si) {
            return ((defpackage.si) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void b(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        if (viewParent instanceof defpackage.si) {
            ((defpackage.si) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    public void a(android.view.ViewParent viewParent, android.view.View view) {
        if (viewParent instanceof defpackage.si) {
            ((defpackage.si) viewParent).onStopNestedScroll(view);
        }
    }

    public void a(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof defpackage.si) {
            ((defpackage.si) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void a(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof defpackage.si) {
            ((defpackage.si) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean a(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        if (viewParent instanceof defpackage.si) {
            return ((defpackage.si) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean a(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        if (viewParent instanceof defpackage.si) {
            return ((defpackage.si) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }

    td(byte b) {
        this();
    }
}
