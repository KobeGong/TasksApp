package defpackage;

/* renamed from: zj reason: default package */
/* compiled from: PG */
public class zj extends defpackage.yt implements android.view.MenuItem {
    public java.lang.reflect.Method e;

    zj(android.content.Context context, defpackage.pp ppVar) {
        super(context, ppVar);
    }

    public int getItemId() {
        return ((defpackage.pp) this.d).getItemId();
    }

    public int getGroupId() {
        return ((defpackage.pp) this.d).getGroupId();
    }

    public int getOrder() {
        return ((defpackage.pp) this.d).getOrder();
    }

    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        ((defpackage.pp) this.d).setTitle(charSequence);
        return this;
    }

    public android.view.MenuItem setTitle(int i) {
        ((defpackage.pp) this.d).setTitle(i);
        return this;
    }

    public java.lang.CharSequence getTitle() {
        return ((defpackage.pp) this.d).getTitle();
    }

    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        ((defpackage.pp) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public java.lang.CharSequence getTitleCondensed() {
        return ((defpackage.pp) this.d).getTitleCondensed();
    }

    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        ((defpackage.pp) this.d).setIcon(drawable);
        return this;
    }

    public android.view.MenuItem setIcon(int i) {
        ((defpackage.pp) this.d).setIcon(i);
        return this;
    }

    public android.graphics.drawable.Drawable getIcon() {
        return ((defpackage.pp) this.d).getIcon();
    }

    public android.view.MenuItem setIntent(android.content.Intent intent) {
        ((defpackage.pp) this.d).setIntent(intent);
        return this;
    }

    public android.content.Intent getIntent() {
        return ((defpackage.pp) this.d).getIntent();
    }

    public android.view.MenuItem setShortcut(char c, char c2) {
        ((defpackage.pp) this.d).setShortcut(c, c2);
        return this;
    }

    public android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((defpackage.pp) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public android.view.MenuItem setNumericShortcut(char c) {
        ((defpackage.pp) this.d).setNumericShortcut(c);
        return this;
    }

    public android.view.MenuItem setNumericShortcut(char c, int i) {
        ((defpackage.pp) this.d).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((defpackage.pp) this.d).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((defpackage.pp) this.d).getNumericModifiers();
    }

    public android.view.MenuItem setAlphabeticShortcut(char c) {
        ((defpackage.pp) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        ((defpackage.pp) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((defpackage.pp) this.d).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((defpackage.pp) this.d).getAlphabeticModifiers();
    }

    public android.view.MenuItem setCheckable(boolean z) {
        ((defpackage.pp) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((defpackage.pp) this.d).isCheckable();
    }

    public android.view.MenuItem setChecked(boolean z) {
        ((defpackage.pp) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((defpackage.pp) this.d).isChecked();
    }

    public android.view.MenuItem setVisible(boolean z) {
        return ((defpackage.pp) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((defpackage.pp) this.d).isVisible();
    }

    public android.view.MenuItem setEnabled(boolean z) {
        ((defpackage.pp) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((defpackage.pp) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((defpackage.pp) this.d).hasSubMenu();
    }

    public android.view.SubMenu getSubMenu() {
        return a(((defpackage.pp) this.d).getSubMenu());
    }

    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((defpackage.pp) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new defpackage.zn(this, onMenuItemClickListener) : null);
        return this;
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((defpackage.pp) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((defpackage.pp) this.d).setShowAsAction(i);
    }

    public android.view.MenuItem setShowAsActionFlags(int i) {
        ((defpackage.pp) this.d).setShowAsActionFlags(i);
        return this;
    }

    public android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new defpackage.zl(view);
        }
        ((defpackage.pp) this.d).setActionView(view);
        return this;
    }

    public android.view.MenuItem setActionView(int i) {
        ((defpackage.pp) this.d).setActionView(i);
        android.view.View actionView = ((defpackage.pp) this.d).getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            ((defpackage.pp) this.d).setActionView((android.view.View) new defpackage.zl(actionView));
        }
        return this;
    }

    public android.view.View getActionView() {
        android.view.View actionView = ((defpackage.pp) this.d).getActionView();
        if (actionView instanceof defpackage.zl) {
            return (android.view.View) ((defpackage.zl) actionView).a;
        }
        return actionView;
    }

    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ((defpackage.pp) this.d).a((defpackage.rs) actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public android.view.ActionProvider getActionProvider() {
        defpackage.rs a = ((defpackage.pp) this.d).a();
        if (a instanceof defpackage.zk) {
            return ((defpackage.zk) a).b;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((defpackage.pp) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((defpackage.pp) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((defpackage.pp) this.d).isActionViewExpanded();
    }

    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        ((defpackage.pp) this.d).setOnActionExpandListener(onActionExpandListener != null ? new defpackage.zm(this, onActionExpandListener) : null);
        return this;
    }

    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        ((defpackage.pp) this.d).a(charSequence);
        return this;
    }

    public java.lang.CharSequence getContentDescription() {
        return ((defpackage.pp) this.d).getContentDescription();
    }

    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        ((defpackage.pp) this.d).b(charSequence);
        return this;
    }

    public java.lang.CharSequence getTooltipText() {
        return ((defpackage.pp) this.d).getTooltipText();
    }

    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        ((defpackage.pp) this.d).setIconTintList(colorStateList);
        return this;
    }

    public android.content.res.ColorStateList getIconTintList() {
        return ((defpackage.pp) this.d).getIconTintList();
    }

    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        ((defpackage.pp) this.d).setIconTintMode(mode);
        return this;
    }

    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return ((defpackage.pp) this.d).getIconTintMode();
    }

    /* access modifiers changed from: 0000 */
    public defpackage.zk a(android.view.ActionProvider actionProvider) {
        return new defpackage.zk(this, actionProvider);
    }
}
