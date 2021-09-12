package android.support.design.internal;

import defpackage.LayoutManager;
import defpackage.MenuBuilder;

/* compiled from: PG */
public class NavigationMenuView extends android.support.v7.widget.RecyclerView implements defpackage.zv {
    public NavigationMenuView(android.content.Context context) {
        this(context, null);
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a((LayoutManager) new defpackage.adw(0));
    }

    public final void a(MenuBuilder zeVar) {
    }
}
