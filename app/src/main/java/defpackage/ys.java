package defpackage;

/* renamed from: ys reason: default package */
/* compiled from: PG */
public abstract class ys implements MenuPresenter {
    public android.content.Context a;
    public android.content.Context b;
    public MenuBuilder c;
    public MenuPresenter_Callback d;
    public defpackage.zv e;
    public int f;
    private android.view.LayoutInflater g;
    private int h = 2131034115;
    private int i = 2131034114;

    public ys(android.content.Context context) {
        this.a = context;
        this.g = android.view.LayoutInflater.from(context);
    }

    public abstract void a(MenuItemImpl ziVar, defpackage.zw zwVar);

    public void a(android.content.Context context, MenuBuilder zeVar) {
        this.b = context;
        android.view.LayoutInflater.from(this.b);
        this.c = zeVar;
    }

    public defpackage.zv a(android.view.ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (defpackage.zv) this.g.inflate(this.h, viewGroup, false);
            this.e.a(this.c);
            a(true);
        }
        return this.e;
    }

    public void a(boolean z) {
        int i2;
        int i3;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.e;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.j();
                java.util.ArrayList i4 = this.c.i();
                int size = i4.size();
                int i5 = 0;
                i2 = 0;
                while (i5 < size) {
                    MenuItemImpl ziVar = (MenuItemImpl) i4.get(i5);
                    if (c(ziVar)) {
                        android.view.View childAt = viewGroup.getChildAt(i2);
                        MenuItemImpl ziVar2 = childAt instanceof defpackage.zw ? ((defpackage.zw) childAt).a() : null;
                        android.view.View a2 = a(ziVar, childAt, viewGroup);
                        if (ziVar != ziVar2) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((android.view.ViewGroup) this.e).addView(a2, i2);
                        }
                        i3 = i2 + 1;
                    } else {
                        i3 = i2;
                    }
                    i5++;
                    i2 = i3;
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean a(android.view.ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public final void setCallback(MenuPresenter_Callback zuVar) {
        this.d = zuVar;
    }

    public android.view.View a(MenuItemImpl ziVar, android.view.View view, android.view.ViewGroup viewGroup) {
        defpackage.zw zwVar;
        if (view instanceof defpackage.zw) {
            zwVar = (defpackage.zw) view;
        } else {
            zwVar = (defpackage.zw) this.g.inflate(this.i, viewGroup, false);
        }
        a(ziVar, zwVar);
        return (android.view.View) zwVar;
    }

    public boolean c(MenuItemImpl ziVar) {
        return true;
    }

    public void onCloseMenu(MenuBuilder zeVar, boolean z) {
        if (this.d != null) {
            this.d.onCloseMenu(zeVar, z);
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder aad) {
        if (this.d != null) {
            return this.d.a(aad);
        }
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public final boolean a(MenuItemImpl ziVar) {
        return false;
    }

    public final boolean b(MenuItemImpl ziVar) {
        return false;
    }

    public final int getId() {
        return this.f;
    }
}
