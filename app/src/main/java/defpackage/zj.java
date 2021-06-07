package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: zj  reason: default package */
/* compiled from: PG */
public class zj extends yt implements MenuItem {
    public Method e;

    zj(Context context, pp ppVar) {
        super(context, ppVar);
    }

    public int getItemId() {
        return ((pp) this.d).getItemId();
    }

    public int getGroupId() {
        return ((pp) this.d).getGroupId();
    }

    public int getOrder() {
        return ((pp) this.d).getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((pp) this.d).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((pp) this.d).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((pp) this.d).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((pp) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((pp) this.d).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((pp) this.d).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((pp) this.d).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((pp) this.d).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((pp) this.d).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((pp) this.d).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((pp) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((pp) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((pp) this.d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((pp) this.d).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((pp) this.d).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((pp) this.d).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((pp) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((pp) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((pp) this.d).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((pp) this.d).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((pp) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((pp) this.d).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((pp) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((pp) this.d).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((pp) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((pp) this.d).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((pp) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((pp) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((pp) this.d).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(((pp) this.d).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((pp) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new zn(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((pp) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((pp) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((pp) this.d).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new zl(view);
        }
        ((pp) this.d).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((pp) this.d).setActionView(i);
        View actionView = ((pp) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((pp) this.d).setActionView(new zl(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((pp) this.d).getActionView();
        if (actionView instanceof zl) {
            return (View) ((zl) actionView).a;
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((pp) this.d).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        rs a = ((pp) this.d).a();
        if (a instanceof zk) {
            return ((zk) a).b;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((pp) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((pp) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((pp) this.d).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((pp) this.d).setOnActionExpandListener(onActionExpandListener != null ? new zm(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((pp) this.d).a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((pp) this.d).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((pp) this.d).b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((pp) this.d).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((pp) this.d).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((pp) this.d).getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((pp) this.d).setIconTintMode(mode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((pp) this.d).getIconTintMode();
    }

    /* access modifiers changed from: package-private */
    public zk a(ActionProvider actionProvider) {
        return new zk(this, actionProvider);
    }
}
