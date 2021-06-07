package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: tb  reason: default package */
/* compiled from: PG */
public final class tb {
    public static final td a;

    @Deprecated
    public static boolean a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof sj) {
            return ((sj) viewParent).a(view, view2, i, i2);
        }
        if (i2 == 0) {
            return a.a(viewParent, view, view2, i);
        }
        return false;
    }

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof sj) {
            ((sj) viewParent).b(view2, i);
        } else if (i2 == 0) {
            a.b(viewParent, view, view2, i);
        }
    }

    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof sj) {
            ((sj) viewParent).c(view, i);
        } else if (i == 0) {
            a.a(viewParent, view);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof sj) {
            ((sj) viewParent).a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            a.a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof sj) {
            ((sj) viewParent).a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            a.a(viewParent, view, i, i2, iArr);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new tc();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new td((byte) 0);
        } else {
            a = new td();
        }
    }
}
