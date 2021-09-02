package defpackage;

/* renamed from: sc reason: default package */
/* compiled from: PG */
public final class sc {
    private static final defpackage.se a;

    public static android.view.MenuItem a(android.view.MenuItem menuItem, defpackage.rs rsVar) {
        if (menuItem instanceof defpackage.pp) {
            return ((defpackage.pp) menuItem).a(rsVar);
        }
        android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void a(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).a(charSequence);
        } else {
            a.a(menuItem, charSequence);
        }
    }

    public static void b(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).b(charSequence);
        } else {
            a.b(menuItem, charSequence);
        }
    }

    public static void a(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).setNumericShortcut(c, i);
        } else {
            a.b(menuItem, c, i);
        }
    }

    public static void b(android.view.MenuItem menuItem, char c, int i) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).setAlphabeticShortcut(c, i);
        } else {
            a.a(menuItem, c, i);
        }
    }

    public static void a(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).setIconTintList(colorStateList);
        } else {
            a.a(menuItem, colorStateList);
        }
    }

    public static void a(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        if (menuItem instanceof defpackage.pp) {
            ((defpackage.pp) menuItem).setIconTintMode(mode);
        } else {
            a.a(menuItem, mode);
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            a = new defpackage.sd();
        } else {
            a = new defpackage.se();
        }
    }
}
