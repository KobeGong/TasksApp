package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: yp  reason: default package */
/* compiled from: PG */
public final class yp implements pp {
    private final int a;
    private CharSequence b;
    private CharSequence c;
    private Intent d;
    private char e;
    private int f = 4096;
    private char g;
    private int h = 4096;
    private Drawable i;
    private Context j;
    private CharSequence k;
    private CharSequence l;
    private ColorStateList m = null;
    private PorterDuff.Mode n = null;
    private boolean o = false;
    private boolean p = false;
    private int q = 16;

    public yp(Context context, CharSequence charSequence) {
        this.j = context;
        this.a = 16908332;
        this.b = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.g;
    }

    @Override // defpackage.pp
    public final int getAlphabeticModifiers() {
        return this.h;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.i;
    }

    public final Intent getIntent() {
        return this.d;
    }

    public final int getItemId() {
        return this.a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.e;
    }

    @Override // defpackage.pp
    public final int getNumericModifiers() {
        return this.f;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.b;
    }

    public final CharSequence getTitleCondensed() {
        return this.c != null ? this.c : this.b;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.q & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.q & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.q & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.q & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.g = Character.toLowerCase(c2);
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.g = Character.toLowerCase(c2);
        this.h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.q = (z ? 1 : 0) | (this.q & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.q = (z ? 2 : 0) | (this.q & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.q = (z ? 16 : 0) | (this.q & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.i = drawable;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.i = ob.a(this.j, i2);
        b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.d = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.e = c2;
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.e = c2;
        this.f = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.e = c2;
        this.g = Character.toLowerCase(c3);
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.e = c2;
        this.f = KeyEvent.normalizeMetaState(i2);
        this.g = Character.toLowerCase(c3);
        this.h = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.b = this.j.getResources().getString(i2);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.c = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        this.q = (z ? 0 : 8) | (this.q & 8);
        return this;
    }

    @Override // defpackage.pp
    public final void setShowAsAction(int i2) {
    }

    @Override // defpackage.pp
    public final View getActionView() {
        return null;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pp
    public final rs a() {
        return null;
    }

    @Override // defpackage.pp
    public final pp a(rs rsVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pp
    public final boolean expandActionView() {
        return false;
    }

    @Override // defpackage.pp
    public final boolean collapseActionView() {
        return false;
    }

    @Override // defpackage.pp
    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pp
    public final pp a(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // defpackage.pp
    public final CharSequence getContentDescription() {
        return this.k;
    }

    @Override // defpackage.pp
    public final pp b(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    @Override // defpackage.pp
    public final CharSequence getTooltipText() {
        return this.l;
    }

    @Override // defpackage.pp
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        this.o = true;
        b();
        return this;
    }

    @Override // defpackage.pp
    public final ColorStateList getIconTintList() {
        return this.m;
    }

    @Override // defpackage.pp
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.n = mode;
        this.p = true;
        b();
        return this;
    }

    @Override // defpackage.pp
    public final PorterDuff.Mode getIconTintMode() {
        return this.n;
    }

    private final void b() {
        if (this.i == null) {
            return;
        }
        if (this.o || this.p) {
            this.i = jd.d(this.i);
            this.i = this.i.mutate();
            if (this.o) {
                jd.a(this.i, this.m);
            }
            if (this.p) {
                jd.a(this.i, this.n);
            }
        }
    }

    @Override // defpackage.pp, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pp, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pp
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }
}
