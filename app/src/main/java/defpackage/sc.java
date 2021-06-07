package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: sc  reason: default package */
/* compiled from: PG */
public final class sc {
    private static final se a;

    public static MenuItem a(MenuItem menuItem, rs rsVar) {
        if (menuItem instanceof pp) {
            return ((pp) menuItem).a(rsVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).a(charSequence);
        } else {
            a.a(menuItem, charSequence);
        }
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).b(charSequence);
        } else {
            a.b(menuItem, charSequence);
        }
    }

    public static void a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).setNumericShortcut(c, i);
        } else {
            a.b(menuItem, c, i);
        }
    }

    public static void b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).setAlphabeticShortcut(c, i);
        } else {
            a.a(menuItem, c, i);
        }
    }

    public static void a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).setIconTintList(colorStateList);
        } else {
            a.a(menuItem, colorStateList);
        }
    }

    public static void a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof pp) {
            ((pp) menuItem).setIconTintMode(mode);
        } else {
            a.a(menuItem, mode);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            a = new sd();
        } else {
            a = new se();
        }
    }
}
