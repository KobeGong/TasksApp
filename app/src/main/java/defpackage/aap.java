package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: aap  reason: default package */
/* compiled from: PG */
public final class aap extends ys {
    public aas g;
    public int h;
    public boolean i;
    public aau j;
    public aaq k;
    public aar l;
    public final aav m = new aav(this);
    public int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final SparseBooleanArray s = new SparseBooleanArray();
    private View t;
    private yr u;

    public aap(Context context) {
        super(context);
    }

    @Override // defpackage.ys, defpackage.zt
    public final void a(Context context, ze zeVar) {
        boolean z = true;
        super.a(context, zeVar);
        Resources resources = context.getResources();
        yb a = yb.a(context);
        if (!this.p) {
            if (Build.VERSION.SDK_INT < 19 && ViewConfiguration.get(a.a).hasPermanentMenuKey()) {
                z = false;
            }
            this.o = z;
        }
        this.q = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = a.a();
        int i2 = this.q;
        if (this.o) {
            if (this.g == null) {
                this.g = new aas(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.r = i2;
        float f = resources.getDisplayMetrics().density;
        this.t = null;
    }

    public final void d() {
        this.o = true;
        this.p = true;
    }

    @Override // defpackage.ys
    public final zv a(ViewGroup viewGroup) {
        zv zvVar = this.e;
        zv a = super.a(viewGroup);
        if (zvVar != a) {
            ((ActionMenuView) a).a(this);
        }
        return a;
    }

    @Override // defpackage.ys
    public final View a(zi ziVar, View view, ViewGroup viewGroup) {
        View actionView = ziVar.getActionView();
        if (actionView == null || ziVar.i()) {
            actionView = super.a(ziVar, view, viewGroup);
        }
        actionView.setVisibility(ziVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.ys
    public final void a(zi ziVar, zw zwVar) {
        zwVar.a(ziVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zwVar;
        actionMenuItemView.c = (ActionMenuView) this.e;
        if (this.u == null) {
            this.u = new yr(this);
        }
        actionMenuItemView.d = this.u;
    }

    @Override // defpackage.ys
    public final boolean c(zi ziVar) {
        return ziVar.f();
    }

    @Override // defpackage.ys, defpackage.zt
    public final void a(boolean z) {
        boolean z2 = false;
        super.a(z);
        ((View) this.e).requestLayout();
        if (this.c != null) {
            ze zeVar = this.c;
            zeVar.j();
            ArrayList arrayList = zeVar.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2);
            }
        }
        ArrayList k2 = this.c != null ? this.c.k() : null;
        if (this.o && k2 != null) {
            int size2 = k2.size();
            if (size2 == 1) {
                z2 = !((zi) k2.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.g == null) {
                this.g = new aas(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                aas aas = this.g;
                aba a = ActionMenuView.a();
                a.a = true;
                ((ActionMenuView) this.e).addView(aas, a);
            }
        } else if (this.g != null && this.g.getParent() == this.e) {
            ((ViewGroup) this.e).removeView(this.g);
        }
        ((ActionMenuView) this.e).b = this.o;
    }

    @Override // defpackage.ys
    public final boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.g) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ys, defpackage.zt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.aad r9) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aap.a(aad):boolean");
    }

    public final boolean e() {
        if (!this.o || i() || this.c == null || this.e == null || this.l != null || this.c.k().isEmpty()) {
            return false;
        }
        this.l = new aar(this, new aau(this, this.b, this.c, this.g));
        ((View) this.e).post(this.l);
        super.a((aad) null);
        return true;
    }

    public final boolean f() {
        if (this.l == null || this.e == null) {
            aau aau = this.j;
            if (aau == null) {
                return false;
            }
            aau.c();
            return true;
        }
        ((View) this.e).removeCallbacks(this.l);
        this.l = null;
        return true;
    }

    public final boolean g() {
        return f() | h();
    }

    public final boolean h() {
        if (this.k == null) {
            return false;
        }
        this.k.c();
        return true;
    }

    public final boolean i() {
        return this.j != null && this.j.e();
    }

    @Override // defpackage.ys, defpackage.zt
    public final boolean a() {
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.c != null) {
            ArrayList i10 = this.c.i();
            i2 = i10.size();
            arrayList = i10;
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i11 = this.h;
        int i12 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.e;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        int i15 = 0;
        while (i15 < i2) {
            zi ziVar = (zi) arrayList.get(i15);
            if (ziVar.h()) {
                i13++;
            } else if (ziVar.g()) {
                i14++;
            } else {
                z2 = true;
            }
            if (!this.i || !ziVar.isActionViewExpanded()) {
                i9 = i11;
            } else {
                i9 = 0;
            }
            i15++;
            i11 = i9;
        }
        if (this.o && (z2 || i13 + i14 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = this.s;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = i12;
        int i19 = i16;
        int i20 = 0;
        while (i17 < i2) {
            zi ziVar2 = (zi) arrayList.get(i17);
            if (ziVar2.h()) {
                View a = a(ziVar2, this.t, viewGroup);
                if (this.t == null) {
                    this.t = a;
                }
                a.measure(makeMeasureSpec, makeMeasureSpec);
                i3 = a.getMeasuredWidth();
                int i21 = i18 - i3;
                if (i20 != 0) {
                    i3 = i20;
                }
                int groupId = ziVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                ziVar2.c(true);
                i4 = i21;
                i5 = i19;
            } else if (ziVar2.g()) {
                int groupId2 = ziVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i19 > 0 || z3) && i18 > 0;
                if (z4) {
                    View a2 = a(ziVar2, this.t, viewGroup);
                    if (this.t == null) {
                        this.t = a2;
                    }
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth = a2.getMeasuredWidth();
                    int i22 = i18 - measuredWidth;
                    if (i20 == 0) {
                        i7 = measuredWidth;
                    } else {
                        i7 = i20;
                    }
                    boolean z5 = (i22 + i7 > 0) & z4;
                    i6 = i22;
                    z = z5;
                } else {
                    z = z4;
                    i6 = i18;
                    i7 = i20;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i8 = i19;
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i23 = i19;
                    for (int i24 = 0; i24 < i17; i24++) {
                        zi ziVar3 = (zi) arrayList.get(i24);
                        if (ziVar3.getGroupId() == groupId2) {
                            if (ziVar3.f()) {
                                i23++;
                            }
                            ziVar3.c(false);
                        }
                    }
                    i8 = i23;
                } else {
                    i8 = i19;
                }
                if (z) {
                    i8--;
                }
                ziVar2.c(z);
                i4 = i6;
                i5 = i8;
                i3 = i7;
            } else {
                ziVar2.c(false);
                i3 = i20;
                i4 = i18;
                i5 = i19;
            }
            i17++;
            i19 = i5;
            i18 = i4;
            i20 = i3;
        }
        return true;
    }

    @Override // defpackage.ys, defpackage.zt
    public final void a(ze zeVar, boolean z) {
        g();
        super.a(zeVar, z);
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        aaw aaw = new aaw();
        aaw.a = this.n;
        return aaw;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof aaw) {
            aaw aaw = (aaw) parcelable;
            if (aaw.a > 0 && (findItem = this.c.findItem(aaw.a)) != null) {
                a((aad) findItem.getSubMenu());
            }
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }
}
