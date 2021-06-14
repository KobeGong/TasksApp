package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: ez  reason: default package */
/* compiled from: PG */
public final class NavigationMenu extends MenuBuilder {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // android.view.Menu, defpackage.ze
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl ziVar = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu fjVar = new NavigationSubMenu(this.a, this, ziVar);
        ziVar.setSubMenu(fjVar);
        return fjVar;
    }
}
