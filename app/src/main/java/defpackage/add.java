package defpackage;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

/* renamed from: add  reason: default package */
/* compiled from: PG */
public final class add {
    static void a(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(agr.d);
            } else {
                drawable.setState(agr.e);
            }
            drawable.setState(state);
        }
    }

    public static boolean b(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (true) {
            if (Build.VERSION.SDK_INT < 17 && (drawable2 instanceof LayerDrawable)) {
                return false;
            }
            if (drawable2 instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                if (constantState instanceof DrawableContainer.DrawableContainerState) {
                    Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                    for (Drawable drawable3 : children) {
                        if (!b(drawable3)) {
                            return false;
                        }
                    }
                }
            } else if (drawable2 instanceof AbstractC0001pg) {
                drawable2 = ((AbstractC0001pg) drawable2).a();
            } else if (!(drawable2 instanceof xy)) {
                if (!(drawable2 instanceof ScaleDrawable)) {
                    break;
                }
                drawable2 = ((ScaleDrawable) drawable2).getDrawable();
            } else {
                drawable2 = ((xy) drawable2).a;
            }
        }
        return true;
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    static {
        new Rect();
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }
}
