package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: uj  reason: default package */
/* compiled from: PG */
public class uj {
    private static Field a;
    private static boolean b;

    uj() {
    }

    public void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof vt) {
            ((vt) compoundButton).a(colorStateList);
        }
    }

    public void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (compoundButton instanceof vt) {
            ((vt) compoundButton).a(mode);
        }
    }

    public Drawable a(CompoundButton compoundButton) {
        if (!b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                return (Drawable) a.get(compoundButton);
            } catch (IllegalAccessException e2) {
                a = null;
            }
        }
        return null;
    }
}
