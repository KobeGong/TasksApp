package defpackage;

/* renamed from: uj reason: default package */
/* compiled from: PG */
public class uj {
    private static java.lang.reflect.Field a;
    private static boolean b;

    uj() {
    }

    public void a(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        if (compoundButton instanceof defpackage.vt) {
            ((defpackage.vt) compoundButton).a(colorStateList);
        }
    }

    public void a(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        if (compoundButton instanceof defpackage.vt) {
            ((defpackage.vt) compoundButton).a(mode);
        }
    }

    public android.graphics.drawable.Drawable a(android.widget.CompoundButton compoundButton) {
        if (!b) {
            try {
                java.lang.reflect.Field declaredField = android.widget.CompoundButton.class.getDeclaredField("mButtonDrawable");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
            }
            b = true;
        }
        if (a != null) {
            try {
                return (android.graphics.drawable.Drawable) a.get(compoundButton);
            } catch (java.lang.IllegalAccessException e2) {
                a = null;
            }
        }
        return null;
    }
}
