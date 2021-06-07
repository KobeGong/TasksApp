package defpackage;

import android.support.design.internal.NavigationMenuItemView;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: fd  reason: default package */
/* compiled from: PG */
public final class fd extends aet {
    public final ArrayList a = new ArrayList();
    public zi b;
    public boolean c;
    private final /* synthetic */ fb f;

    public fd(fb fbVar) {
        this.f = fbVar;
        b();
    }

    @Override // defpackage.aet
    public final long a(int i) {
        return (long) i;
    }

    @Override // defpackage.aet
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.aet
    public final int b(int i) {
        ff ffVar = (ff) this.a.get(i);
        if (ffVar instanceof fg) {
            return 2;
        }
        if (ffVar instanceof fe) {
            return 3;
        }
        if (!(ffVar instanceof fh)) {
            throw new RuntimeException("Unknown item type.");
        } else if (((fh) ffVar).a.hasSubMenu()) {
            return 1;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z;
        int i;
        int i2;
        if (!this.c) {
            this.c = true;
            this.a.clear();
            this.a.add(new fe());
            int i3 = -1;
            int i4 = 0;
            boolean z2 = false;
            int size = this.f.c.i().size();
            int i5 = 0;
            while (i5 < size) {
                zi ziVar = (zi) this.f.c.i().get(i5);
                if (ziVar.isChecked()) {
                    a(ziVar);
                }
                if (ziVar.isCheckable()) {
                    ziVar.a(false);
                }
                if (ziVar.hasSubMenu()) {
                    SubMenu subMenu = ziVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i5 != 0) {
                            this.a.add(new fg(this.f.o, 0));
                        }
                        this.a.add(new fh(ziVar));
                        boolean z3 = false;
                        int size2 = this.a.size();
                        int size3 = subMenu.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            zi ziVar2 = (zi) subMenu.getItem(i6);
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
                                this.a.add(new fh(ziVar2));
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
                            this.a.add(new fg(this.f.o, this.f.o));
                        }
                    } else if (z2 || ziVar.getIcon() == null) {
                        z = z2;
                        i = i4;
                    } else {
                        z = true;
                        c(i4, this.a.size());
                        i = i4;
                    }
                    fh fhVar = new fh(ziVar);
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
            ((fh) this.a.get(i)).b = true;
            i++;
        }
    }

    public final void a(zi ziVar) {
        if (this.b != ziVar && ziVar.isCheckable()) {
            if (this.b != null) {
                this.b.setChecked(false);
            }
            this.b = ziVar;
            ziVar.setChecked(true);
        }
    }

    @Override // defpackage.aet
    public final /* synthetic */ void a(afv afv) {
        afv afv2 = afv;
        if (afv2 instanceof fi) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) afv2.a;
            if (navigationMenuItemView.d != null) {
                navigationMenuItemView.d.removeAllViews();
            }
            navigationMenuItemView.c.setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // defpackage.aet
    public final /* synthetic */ void a(afv afv, int i) {
        afv afv2 = afv;
        switch (b(i)) {
            case 0:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) afv2.a;
                navigationMenuItemView.f = this.f.j;
                navigationMenuItemView.g = navigationMenuItemView.f != null;
                if (navigationMenuItemView.e != null) {
                    navigationMenuItemView.a(navigationMenuItemView.e.getIcon());
                }
                if (this.f.h) {
                    vo.a.b(navigationMenuItemView.c, this.f.g);
                }
                if (this.f.i != null) {
                    navigationMenuItemView.c.setTextColor(this.f.i);
                }
                sn.a(navigationMenuItemView, this.f.k != null ? this.f.k.getConstantState().newDrawable() : null);
                fh fhVar = (fh) this.a.get(i);
                navigationMenuItemView.a = fhVar.b;
                int i2 = this.f.l;
                navigationMenuItemView.setPadding(i2, 0, i2, 0);
                navigationMenuItemView.c.setCompoundDrawablePadding(this.f.m);
                navigationMenuItemView.a(fhVar.a);
                return;
            case 1:
                ((TextView) afv2.a).setText(((fh) this.a.get(i)).a.getTitle());
                return;
            case 2:
                fg fgVar = (fg) this.a.get(i);
                afv2.a.setPadding(0, fgVar.a, 0, fgVar.b);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.aet
    public final /* synthetic */ afv a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new fi(this.f.f, viewGroup, this.f.p);
            case 1:
                return new afv(this.f.f, viewGroup, (byte) 0);
            case 2:
                return new afv(this.f.f, viewGroup);
            case 3:
                return new afv((View) this.f.b, (char) 0);
            default:
                return null;
        }
    }
}
