package defpackage;

import android.view.View;
import android.view.ViewParent;

/* access modifiers changed from: package-private */
/* renamed from: td  reason: default package */
/* compiled from: PG */
public class td {
    td() {
    }

    public boolean a(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof si) {
            return ((si) viewParent).onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void b(ViewParent viewParent, View view, View view2, int i) {
        if (viewParent instanceof si) {
            ((si) viewParent).onNestedScrollAccepted(view, view2, i);
        }
    }

    public void a(ViewParent viewParent, View view) {
        if (viewParent instanceof si) {
            ((si) viewParent).onStopNestedScroll(view);
        }
    }

    public void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        if (viewParent instanceof si) {
            ((si) viewParent).onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        if (viewParent instanceof si) {
            ((si) viewParent).onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (viewParent instanceof si) {
            return ((si) viewParent).onNestedFling(view, f, f2, z);
        }
        return false;
    }

    public boolean a(ViewParent viewParent, View view, float f, float f2) {
        if (viewParent instanceof si) {
            return ((si) viewParent).onNestedPreFling(view, f, f2);
        }
        return false;
    }

    td(byte b) {
        this();
    }
}
