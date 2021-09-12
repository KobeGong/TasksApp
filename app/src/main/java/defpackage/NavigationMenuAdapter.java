package defpackage;

/* renamed from: fd reason: default package */
/* compiled from: PG */
public final class NavigationMenuAdapter extends RecyclerViewAdapter {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public MenuItemImpl b;
    public boolean c;
    private final /* synthetic */ NavigationMenuPresenter f;

    public NavigationMenuAdapter(NavigationMenuPresenter fbVar) {
        this.f = fbVar;
        b();
    }

    public final long getItemId(int i) {
        return i;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int i) {
        defpackage.ff ffVar = (defpackage.ff) this.a.get(i);
        if (ffVar instanceof defpackage.fg) {
            return 2;
        }
        if (ffVar instanceof defpackage.fe) {
            return 3;
        }
        if (!(ffVar instanceof defpackage.fh)) {
            throw new java.lang.RuntimeException("Unknown item type.");
        } else if (((defpackage.fh) ffVar).a.hasSubMenu()) {
            return 1;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        boolean z;
        int i;
        int i2;
        if (!this.c) {
            this.c = true;
            this.a.clear();
            this.a.add(new defpackage.fe());
            int i3 = -1;
            int i4 = 0;
            boolean z2 = false;
            int size = this.f.menu.i().size();
            int i5 = 0;
            while (i5 < size) {
                MenuItemImpl ziVar = (MenuItemImpl) this.f.menu.i().get(i5);
                if (ziVar.isChecked()) {
                    a(ziVar);
                }
                if (ziVar.isCheckable()) {
                    ziVar.a(false);
                }
                if (ziVar.hasSubMenu()) {
                    android.view.SubMenu subMenu = ziVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i5 != 0) {
                            this.a.add(new defpackage.fg(this.f.paddingSeparator, 0));
                        }
                        this.a.add(new defpackage.fh(ziVar));
                        boolean z3 = false;
                        int size2 = this.a.size();
                        int size3 = subMenu.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            MenuItemImpl ziVar2 = (MenuItemImpl) subMenu.getItem(i6);
                            if (ziVar2.isVisible()) {
                                if (!z3 && ziVar2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (ziVar2.isCheckable()) {
                                    ziVar2.a(false);
                                }
                                if (ziVar.isChecked()) {
                                    a(ziVar);
                                }
                                this.a.add(new defpackage.fh(ziVar2));
                            }
                        }
                        if (z3) {
                            c(size2, this.a.size());
                        }
                    }
                    i2 = i3;
                } else {
                    int groupId = ziVar.getGroupId();
                    if (groupId != i3) {
                        i = this.a.size();
                        z = ziVar.getIcon() != null;
                        if (i5 != 0) {
                            i++;
                            this.a.add(new defpackage.fg(this.f.paddingSeparator, this.f.paddingSeparator));
                        }
                    } else if (z2 || ziVar.getIcon() == null) {
                        z = z2;
                        i = i4;
                    } else {
                        z = true;
                        c(i4, this.a.size());
                        i = i4;
                    }
                    defpackage.fh fhVar = new defpackage.fh(ziVar);
                    fhVar.b = z;
                    this.a.add(fhVar);
                    z2 = z;
                    i4 = i;
                    i2 = groupId;
                }
                i5++;
                i3 = i2;
            }
            this.c = false;
        }
    }

    private final void c(int i, int i2) {
        while (i < i2) {
            ((defpackage.fh) this.a.get(i)).b = true;
            i++;
        }
    }

    public final void a(MenuItemImpl ziVar) {
        if (this.b != ziVar && ziVar.isCheckable()) {
            if (this.b != null) {
                this.b.setChecked(false);
            }
            this.b = ziVar;
            ziVar.setChecked(true);
        }
    }

    public final /* synthetic */ void a(RecyclerViewHolder afv) {
        RecyclerViewHolder afv2 = afv;
        if (afv2 instanceof defpackage.fi) {
            android.support.design.internal.NavigationMenuItemView navigationMenuItemView = (android.support.design.internal.NavigationMenuItemView) afv2.itemView;
            if (navigationMenuItemView.d != null) {
                navigationMenuItemView.d.removeAllViews();
            }
            navigationMenuItemView.c.setCompoundDrawables(null, null, null, null);
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerViewHolder afv, int i) {
        RecyclerViewHolder afv2 = afv;
        switch (getItemViewType(i)) {
            case 0:
                android.support.design.internal.NavigationMenuItemView navigationMenuItemView = (android.support.design.internal.NavigationMenuItemView) afv2.itemView;
                navigationMenuItemView.f = this.f.j;
                navigationMenuItemView.g = navigationMenuItemView.f != null;
                if (navigationMenuItemView.e != null) {
                    navigationMenuItemView.a(navigationMenuItemView.e.getIcon());
                }
                if (this.f.h) {
                    defpackage.vo.a.b(navigationMenuItemView.c, this.f.g);
                }
                if (this.f.i != null) {
                    navigationMenuItemView.c.setTextColor(this.f.i);
                }
                ViewCompat.a(navigationMenuItemView, this.f.k != null ? this.f.k.getConstantState().newDrawable() : null);
                defpackage.fh fhVar = (defpackage.fh) this.a.get(i);
                navigationMenuItemView.a = fhVar.b;
                int i2 = this.f.l;
                navigationMenuItemView.setPadding(i2, 0, i2, 0);
                navigationMenuItemView.c.setCompoundDrawablePadding(this.f.m);
                navigationMenuItemView.a(fhVar.a);
                return;
            case 1:
                ((android.widget.TextView) afv2.itemView).setText(((defpackage.fh) this.a.get(i)).a.getTitle());
                return;
            case 2:
                defpackage.fg fgVar = (defpackage.fg) this.a.get(i);
                afv2.itemView.setPadding(0, fgVar.a, 0, fgVar.b);
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ RecyclerViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new defpackage.fi(this.f.layoutInflater, viewGroup, this.f.p);
            case 1:
                return new RecyclerViewHolder(this.f.layoutInflater, viewGroup, (byte)0);
            case 2:
                return new RecyclerViewHolder(this.f.layoutInflater, viewGroup);
            case 3:
                return new RecyclerViewHolder(this.f.headerLayout, (byte)0);
            default:
                return null;
        }
    }
}
