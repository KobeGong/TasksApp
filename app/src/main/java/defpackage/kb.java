package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: kb  reason: default package */
/* compiled from: PG */
public final class kb {
    public static final ki a;
    public static final Property b = new kc(Float.class, "translationAlpha");
    private static Field c;
    private static boolean d;

    static void a(View view, float f) {
        a.a(view, f);
    }

    static void a(View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            d = true;
        }
        if (c != null) {
            try {
                c.setInt(view, (c.getInt(view) & -13) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            a = new kh();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new kg();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new kf();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new ke();
        } else {
            a = new ki();
        }
        new kd(Rect.class, "clipBounds");
    }
}
