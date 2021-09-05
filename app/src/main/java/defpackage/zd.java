package defpackage;

/* renamed from: zd reason: default package */
/* compiled from: PG */
public final class zd extends android.widget.BaseAdapter {
    private static final int c = 2131034130;
    public MenuBuilder a;
    public boolean b;
    private int d = -1;
    private final boolean e;
    private final android.view.LayoutInflater f;

    public zd(MenuBuilder zeVar, android.view.LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.a = zeVar;
        a();
    }

    public final int getCount() {
        java.util.ArrayList i = this.e ? this.a.k() : this.a.i();
        if (this.d < 0) {
            return i.size();
        }
        return i.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        boolean z;
        int i2 = 0;
        if (view == null) {
            view2 = this.f.inflate(c, viewGroup, false);
        } else {
            view2 = view;
        }
        int groupId = ((MenuItemImpl) getItem(i)).getGroupId();
        int i3 = i + -1 >= 0 ? ((MenuItemImpl) getItem(i - 1)).getGroupId() : groupId;
        android.support.v7.view.menu.ListMenuItemView listMenuItemView = (android.support.v7.view.menu.ListMenuItemView) view2;
        if (!this.a.b() || groupId == i3) {
            z = false;
        } else {
            z = true;
        }
        if (listMenuItemView.b != null) {
            android.widget.ImageView imageView = listMenuItemView.b;
            if (listMenuItemView.d || !z) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        defpackage.zw zwVar = (defpackage.zw) view2;
        if (this.b) {
            android.support.v7.view.menu.ListMenuItemView listMenuItemView2 = (android.support.v7.view.menu.ListMenuItemView) view2;
            listMenuItemView2.e = true;
            listMenuItemView2.c = true;
        }
        zwVar.a((MenuItemImpl) getItem(i));
        return view2;
    }

    private final void a() {
        MenuItemImpl ziVar = this.a.j;
        if (ziVar != null) {
            java.util.ArrayList k = this.a.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) k.get(i)) == ziVar) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public final /* synthetic */ java.lang.Object getItem(int i) {
        java.util.ArrayList i2 = this.e ? this.a.k() : this.a.i();
        if (this.d >= 0 && i >= this.d) {
            i++;
        }
        return (MenuItemImpl) i2.get(i);
    }
}
