package defpackage;

/* renamed from: jy reason: default package */
/* compiled from: PG */
class jy {
    private static android.animation.LayoutTransition a;
    private static java.lang.reflect.Field b;
    private static boolean c;
    private static java.lang.reflect.Method d;
    private static boolean e;

    public defpackage.ju a(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup viewGroup2;
        defpackage.jz jzVar;
        android.view.ViewGroup viewGroup3 = viewGroup;
        while (true) {
            if (viewGroup3 != null) {
                if (viewGroup3.getId() == 16908290 && (viewGroup3 instanceof android.view.ViewGroup)) {
                    viewGroup2 = viewGroup3;
                    break;
                } else if (viewGroup3.getParent() instanceof android.view.ViewGroup) {
                    viewGroup3 = (android.view.ViewGroup) viewGroup3.getParent();
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
                    jzVar = new defpackage.jz(viewGroup2.getContext(), viewGroup2, viewGroup, 0);
                    break;
                }
                android.view.View childAt = viewGroup2.getChildAt(i);
                if (childAt instanceof defpackage.ka) {
                    jzVar = ((defpackage.ka) childAt).a;
                    break;
                }
                i++;
            }
        } else {
            jzVar = null;
        }
        return jzVar;
    }

    public void a(android.view.ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (a == null) {
            defpackage.jw jwVar = new defpackage.jw();
            a = jwVar;
            jwVar.setAnimator(2, null);
            a.setAnimator(0, null);
            a.setAnimator(1, null);
            a.setAnimator(3, null);
            a.setAnimator(4, null);
        }
        if (z) {
            android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!e) {
                        try {
                            java.lang.reflect.Method declaredMethod = android.animation.LayoutTransition.class.getDeclaredMethod("cancel", new java.lang.Class[0]);
                            d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (java.lang.NoSuchMethodException e2) {
                        }
                        e = true;
                    }
                    if (d != null) {
                        try {
                            d.invoke(layoutTransition, new java.lang.Object[0]);
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e3) {
                        }
                    }
                }
                if (layoutTransition != a) {
                    viewGroup.setTag(2131755044, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!c) {
            try {
                java.lang.reflect.Field declaredField = android.view.ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e4) {
            }
            c = true;
        }
        if (b != null) {
            try {
                z2 = b.getBoolean(viewGroup);
                if (z2) {
                    b.setBoolean(viewGroup, false);
                }
            } catch (java.lang.IllegalAccessException e5) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        android.animation.LayoutTransition layoutTransition2 = (android.animation.LayoutTransition) viewGroup.getTag(2131755044);
        if (layoutTransition2 != null) {
            viewGroup.setTag(2131755044, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    jy() {
    }
}
