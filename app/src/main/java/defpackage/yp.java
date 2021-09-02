package defpackage;

/* renamed from: yp reason: default package */
/* compiled from: PG */
public final class yp implements defpackage.pp {
    private final int a;
    private java.lang.CharSequence b;
    private java.lang.CharSequence c;
    private android.content.Intent d;
    private char e;
    private int f = 4096;
    private char g;
    private int h = 4096;
    private android.graphics.drawable.Drawable i;
    private android.content.Context j;
    private java.lang.CharSequence k;
    private java.lang.CharSequence l;
    private android.content.res.ColorStateList m = null;
    private android.graphics.PorterDuff.Mode n = null;
    private boolean o = false;
    private boolean p = false;
    private int q = 16;

    public yp(android.content.Context context, java.lang.CharSequence charSequence) {
        this.j = context;
        this.a = 16908332;
        this.b = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.g;
    }

    public final int getAlphabeticModifiers() {
        return this.h;
    }

    public final int getGroupId() {
        return 0;
    }

    public final android.graphics.drawable.Drawable getIcon() {
        return this.i;
    }

    public final android.content.Intent getIntent() {
        return this.d;
    }

    public final int getItemId() {
        return this.a;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.e;
    }

    public final int getNumericModifiers() {
        return this.f;
    }

    public final int getOrder() {
        return 0;
    }

    public final android.view.SubMenu getSubMenu() {
        return null;
    }

    public final java.lang.CharSequence getTitle() {
        return this.b;
    }

    public final java.lang.CharSequence getTitleCondensed() {
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

    public final android.view.MenuItem setAlphabeticShortcut(char c2) {
        this.g = java.lang.Character.toLowerCase(c2);
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.g = java.lang.Character.toLowerCase(c2);
        this.h = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final android.view.MenuItem setCheckable(boolean z) {
        this.q = (z ? 1 : 0) | (this.q & -2);
        return this;
    }

    public final android.view.MenuItem setChecked(boolean z) {
        this.q = (z ? 2 : 0) | (this.q & -3);
        return this;
    }

    public final android.view.MenuItem setEnabled(boolean z) {
        this.q = (z ? 16 : 0) | (this.q & -17);
        return this;
    }

    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.i = drawable;
        b();
        return this;
    }

    public final android.view.MenuItem setIcon(int i2) {
        this.i = defpackage.ob.a(this.j, i2);
        b();
        return this;
    }

    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.d = intent;
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char c2) {
        this.e = c2;
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char c2, int i2) {
        this.e = c2;
        this.f = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final android.view.MenuItem setShortcut(char c2, char c3) {
        this.e = c2;
        this.g = java.lang.Character.toLowerCase(c3);
        return this;
    }

    public final android.view.MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.e = c2;
        this.f = android.view.KeyEvent.normalizeMetaState(i2);
        this.g = java.lang.Character.toLowerCase(c3);
        this.h = android.view.KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final android.view.MenuItem setTitle(int i2) {
        this.b = this.j.getResources().getString(i2);
        return this;
    }

    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.c = charSequence;
        return this;
    }

    public final android.view.MenuItem setVisible(boolean z) {
        this.q = (z ? 0 : 8) | (this.q & 8);
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final android.view.View getActionView() {
        return null;
    }

    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final defpackage.rs a() {
        return null;
    }

    public final defpackage.pp a(defpackage.rs rsVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean expandActionView() {
        return false;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final defpackage.pp a(java.lang.CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final java.lang.CharSequence getContentDescription() {
        return this.k;
    }

    public final defpackage.pp b(java.lang.CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    public final java.lang.CharSequence getTooltipText() {
        return this.l;
    }

    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.m = colorStateList;
        this.o = true;
        b();
        return this;
    }

    public final android.content.res.ColorStateList getIconTintList() {
        return this.m;
    }

    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.n = mode;
        this.p = true;
        b();
        return this;
    }

    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.n;
    }

    private final void b() {
        if (this.i == null) {
            return;
        }
        if (this.o || this.p) {
            this.i = defpackage.jd.d(this.i);
            this.i = this.i.mutate();
            if (this.o) {
                defpackage.jd.a(this.i, this.m);
            }
            if (this.p) {
                defpackage.jd.a(this.i, this.n);
            }
        }
    }

    public final /* synthetic */ android.view.MenuItem setActionView(int i2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ android.view.MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.l = charSequence;
        return this;
    }

    public final /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }
}
