package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: jy  reason: default package */
/* compiled from: PG */
public class jy {
    private static LayoutTransition a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    public ju a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        jz jzVar;
        ViewGroup viewGroup3 = viewGroup;
        while (true) {
            if (viewGroup3 != null) {
                if (viewGroup3.getId() == 16908290 && (viewGroup3 instanceof ViewGroup)) {
                    viewGroup2 = viewGroup3;
                    break;
                } else if (viewGroup3.getParent() instanceof ViewGroup) {
                    viewGroup3 = (ViewGroup) viewGroup3.getParent();
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        if (viewGroup2 != null) {
            int childCount = viewGroup2.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    jzVar = new jz(viewGroup2.getContext(), viewGroup2, viewGroup, (byte) 0);
                    break;
                }
                View childAt = viewGroup2.getChildAt(i);
                if (childAt instanceof ka) {
                    jzVar = ((ka) childAt).a;
                    break;
                }
                i++;
            }
        } else {
            jzVar = null;
        }
        return jzVar;
    }

    public void a(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (a == null) {
            jw jwVar = new jw();
            a = jwVar;
            jwVar.setAnimator(2, null);
            a.setAnimator(0, null);
            a.setAnimator(1, null);
            a.setAnimator(3, null);
            a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!e) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                        }
                        e = true;
                    }
                    if (d != null) {
                        try {
                            d.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                        }
                    }
                }
                if (layoutTransition != a) {
                    viewGroup.setTag(R.id.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
            }
            c = true;
        }
        if (b != null) {
            try {
                z2 = b.getBoolean(viewGroup);
                if (z2) {
                    b.setBoolean(viewGroup, false);
                }
            } catch (IllegalAccessException e5) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(R.id.transition_layout_save);
        if (layoutTransition2 != null) {
            viewGroup.setTag(R.id.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    jy() {
    }
}
