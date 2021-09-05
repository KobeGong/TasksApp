package defpackage;

/* renamed from: ez reason: default package */
/* compiled from: PG */
public final class NavigationMenu extends MenuBuilder {
    public NavigationMenu(android.content.Context context) {
        super(context);
    }

    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        MenuItemImpl ziVar = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu fjVar = new NavigationSubMenu(this.a, this, ziVar);
        ziVar.setSubMenu((SubMenuBuilder) fjVar);
        return fjVar;
    }
}
