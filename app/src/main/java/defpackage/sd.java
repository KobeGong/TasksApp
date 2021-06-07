package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: sd  reason: default package */
/* compiled from: PG */
final class sd extends se {
    sd() {
    }

    @Override // defpackage.se
    public final void a(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    @Override // defpackage.se
    public final void b(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    @Override // defpackage.se
    public final void a(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    @Override // defpackage.se
    public final void b(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    @Override // defpackage.se
    public final void a(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    @Override // defpackage.se
    public final void a(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }
}
