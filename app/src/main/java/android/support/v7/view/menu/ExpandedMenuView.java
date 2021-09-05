package android.support.v7.view.menu;

import defpackage.MenuBuilder;
import defpackage.MenuItemImpl;
import defpackage.MenuPresenter;

/* compiled from: PG */
public final class ExpandedMenuView extends android.widget.ListView implements android.widget.AdapterView.OnItemClickListener, defpackage.zg, defpackage.zv {
    private static final int[] a = {16842964, 16843049};
    private MenuBuilder b;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        defpackage.agw a2 = defpackage.agw.a(context, attributeSet, a, i, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.b.recycle();
    }

    public final void a(MenuBuilder zeVar) {
        this.b = zeVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean a(MenuItemImpl ziVar) {
        return this.b.a((android.view.MenuItem) ziVar, (MenuPresenter) null, 0);
    }

    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        a((MenuItemImpl) getAdapter().getItem(i));
    }
}
