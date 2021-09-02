package defpackage;

/* renamed from: sd reason: default package */
/* compiled from: PG */
final class sd extends defpackage.se {
    sd() {
    }

    public final void a(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public final void b(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public final void a(android.view.MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public final void b(android.view.MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public final void a(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public final void a(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }
}
