package defpackage;

/* renamed from: add reason: default package */
/* compiled from: PG */
public final class add {
    static void a(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(defpackage.agr.d);
            } else {
                drawable.setState(defpackage.agr.e);
            }
            drawable.setState(state);
        }
    }

    public static boolean b(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = drawable;
        while (true) {
            if (android.os.Build.VERSION.SDK_INT >= 17 || !(drawable2 instanceof android.graphics.drawable.LayerDrawable)) {
                if (!(drawable2 instanceof android.graphics.drawable.DrawableContainer)) {
                    if (!(drawable2 instanceof defpackage.C0001pg)) {
                        if (!(drawable2 instanceof defpackage.xy)) {
                            if (!(drawable2 instanceof android.graphics.drawable.ScaleDrawable)) {
                                break;
                            }
                            drawable2 = ((android.graphics.drawable.ScaleDrawable) drawable2).getDrawable();
                        } else {
                            drawable2 = ((defpackage.xy) drawable2).a;
                        }
                    } else {
                        drawable2 = ((defpackage.C0001pg) drawable2).a();
                    }
                } else {
                    android.graphics.drawable.Drawable.ConstantState constantState = drawable2.getConstantState();
                    if (constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState) {
                        for (android.graphics.drawable.Drawable b : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                            if (!b(b)) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static android.graphics.PorterDuff.Mode a(int i, android.graphics.PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return android.graphics.PorterDuff.Mode.SRC_OVER;
            case 5:
                return android.graphics.PorterDuff.Mode.SRC_IN;
            case 9:
                return android.graphics.PorterDuff.Mode.SRC_ATOP;
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static {
        new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            try {
                java.lang.Class.forName("android.graphics.Insets");
            } catch (java.lang.ClassNotFoundException e) {
            }
        }
    }
}
