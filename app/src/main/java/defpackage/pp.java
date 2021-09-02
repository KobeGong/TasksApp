package defpackage;

/* renamed from: pp reason: default package */
/* compiled from: PG */
public interface pp extends android.view.MenuItem {
    defpackage.pp a(java.lang.CharSequence charSequence);

    defpackage.pp a(defpackage.rs rsVar);

    defpackage.rs a();

    defpackage.pp b(java.lang.CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    android.view.View getActionView();

    int getAlphabeticModifiers();

    java.lang.CharSequence getContentDescription();

    android.content.res.ColorStateList getIconTintList();

    android.graphics.PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    java.lang.CharSequence getTooltipText();

    boolean isActionViewExpanded();

    android.view.MenuItem setActionView(int i);

    android.view.MenuItem setActionView(android.view.View view);

    android.view.MenuItem setAlphabeticShortcut(char c, int i);

    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    android.view.MenuItem setNumericShortcut(char c, int i);

    android.view.MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    android.view.MenuItem setShowAsActionFlags(int i);
}
