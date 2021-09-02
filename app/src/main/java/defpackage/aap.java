package defpackage;

/* renamed from: aap reason: default package */
/* compiled from: PG */
public final class aap extends defpackage.ys {
    public defpackage.aas g;
    public int h;
    public boolean i;
    public defpackage.aau j;
    public defpackage.aaq k;
    public defpackage.aar l;
    public final defpackage.aav m = new defpackage.aav(this);
    public int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final android.util.SparseBooleanArray s = new android.util.SparseBooleanArray();
    private android.view.View t;
    private defpackage.yr u;

    public aap(android.content.Context context) {
        super(context);
    }

    public final void a(android.content.Context context, defpackage.ze zeVar) {
        boolean z = true;
        super.a(context, zeVar);
        android.content.res.Resources resources = context.getResources();
        defpackage.yb a = defpackage.yb.a(context);
        if (!this.p) {
            if (android.os.Build.VERSION.SDK_INT < 19 && android.view.ViewConfiguration.get(a.a).hasPermanentMenuKey()) {
                z = false;
            }
            this.o = z;
        }
        this.q = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = a.a();
        int i2 = this.q;
        if (this.o) {
            if (this.g == null) {
                this.g = new defpackage.aas(this, this.a);
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
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

    public final defpackage.zv a(android.view.ViewGroup viewGroup) {
        defpackage.zv zvVar = this.e;
        defpackage.zv a = super.a(viewGroup);
        if (zvVar != a) {
            ((android.support.v7.widget.ActionMenuView) a).a(this);
        }
        return a;
    }

    public final android.view.View a(defpackage.zi ziVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = ziVar.getActionView();
        if (actionView == null || ziVar.i()) {
            actionView = super.a(ziVar, view, viewGroup);
        }
        actionView.setVisibility(ziVar.isActionViewExpanded() ? 8 : 0);
        android.support.v7.widget.ActionMenuView actionMenuView = (android.support.v7.widget.ActionMenuView) viewGroup;
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(android.support.v7.widget.ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public final void a(defpackage.zi ziVar, defpackage.zw zwVar) {
        zwVar.a(ziVar);
        android.support.v7.view.menu.ActionMenuItemView actionMenuItemView = (android.support.v7.view.menu.ActionMenuItemView) zwVar;
        actionMenuItemView.c = (android.support.v7.widget.ActionMenuView) this.e;
        if (this.u == null) {
            this.u = new defpackage.yr(this);
        }
        actionMenuItemView.d = this.u;
    }

    public final boolean c(defpackage.zi ziVar) {
        return ziVar.f();
    }

    public final void a(boolean z) {
        boolean z2;
        boolean z3 = false;
        super.a(z);
        ((android.view.View) this.e).requestLayout();
        if (this.c != null) {
            defpackage.ze zeVar = this.c;
            zeVar.j();
            java.util.ArrayList arrayList = zeVar.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2);
            }
        }
        java.util.ArrayList arrayList2 = this.c != null ? this.c.k() : null;
        if (this.o && arrayList2 != null) {
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (!((defpackage.zi) arrayList2.get(0)).isActionViewExpanded()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.g == null) {
                this.g = new defpackage.aas(this, this.a);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.g.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                android.support.v7.widget.ActionMenuView actionMenuView = (android.support.v7.widget.ActionMenuView) this.e;
                defpackage.aas aas = this.g;
                defpackage.aba a = android.support.v7.widget.ActionMenuView.a();
                a.a = true;
                actionMenuView.addView(aas, a);
            }
        } else if (this.g != null && this.g.getParent() == this.e) {
            ((android.view.ViewGroup) this.e).removeView(this.g);
        }
        ((android.support.v7.widget.ActionMenuView) this.e).b = this.o;
    }

    public final boolean a(android.view.ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.g) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.aad r9) {
        /*
            r8 = this;
            r3 = 1
            r4 = 0
            boolean r0 = r9.hasVisibleItems()
            if (r0 != 0) goto L_0x0009
        L_0x0008:
            return r4
        L_0x0009:
            r0 = r9
        L_0x000a:
            ze r1 = r0.l
            ze r2 = r8.c
            if (r1 == r2) goto L_0x0015
            ze r0 = r0.l
            aad r0 = (defpackage.aad) r0
            goto L_0x000a
        L_0x0015:
            android.view.MenuItem r6 = r0.getItem()
            zv r0 = r8.e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x007d
            int r7 = r0.getChildCount()
            r5 = r4
        L_0x0024:
            if (r5 >= r7) goto L_0x007d
            android.view.View r2 = r0.getChildAt(r5)
            boolean r1 = r2 instanceof defpackage.zw
            if (r1 == 0) goto L_0x0079
            r1 = r2
            zw r1 = (defpackage.zw) r1
            zi r1 = r1.a()
            if (r1 != r6) goto L_0x0079
        L_0x0037:
            if (r2 == 0) goto L_0x0008
            android.view.MenuItem r0 = r9.getItem()
            int r0 = r0.getItemId()
            r8.n = r0
            int r1 = r9.size()
            r0 = r4
        L_0x0048:
            if (r0 >= r1) goto L_0x0087
            android.view.MenuItem r5 = r9.getItem(r0)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x007f
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x007f
            r0 = r3
        L_0x005b:
            aaq r1 = new aaq
            android.content.Context r4 = r8.b
            r1.<init>(r8, r4, r9, r2)
            r8.k = r1
            aaq r1 = r8.k
            r1.a(r0)
            aaq r0 = r8.k
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0082
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        L_0x0079:
            int r1 = r5 + 1
            r5 = r1
            goto L_0x0024
        L_0x007d:
            r2 = 0
            goto L_0x0037
        L_0x007f:
            int r0 = r0 + 1
            goto L_0x0048
        L_0x0082:
            super.a(r9)
            r4 = r3
            goto L_0x0008
        L_0x0087:
            r0 = r4
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aap.a(aad):boolean");
    }

    public final boolean e() {
        if (!this.o || i() || this.c == null || this.e == null || this.l != null || this.c.k().isEmpty()) {
            return false;
        }
        this.l = new defpackage.aar(this, new defpackage.aau(this, this.b, this.c, this.g));
        ((android.view.View) this.e).post(this.l);
        super.a((defpackage.aad) null);
        return true;
    }

    public final boolean f() {
        if (this.l == null || this.e == null) {
            defpackage.aau aau = this.j;
            if (aau == null) {
                return false;
            }
            aau.c();
            return true;
        }
        ((android.view.View) this.e).removeCallbacks(this.l);
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

    public final boolean a() {
        int i2;
        java.util.ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.c != null) {
            java.util.ArrayList i10 = this.c.i();
            i2 = i10.size();
            arrayList = i10;
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i11 = this.h;
        int i12 = this.r;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.e;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        int i15 = 0;
        while (i15 < i2) {
            defpackage.zi ziVar = (defpackage.zi) arrayList.get(i15);
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
        android.util.SparseBooleanArray sparseBooleanArray = this.s;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = i12;
        int i19 = i16;
        int i20 = 0;
        while (i17 < i2) {
            defpackage.zi ziVar2 = (defpackage.zi) arrayList.get(i17);
            if (ziVar2.h()) {
                android.view.View a = a(ziVar2, this.t, viewGroup);
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
                    android.view.View a2 = a(ziVar2, this.t, viewGroup);
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
                        defpackage.zi ziVar3 = (defpackage.zi) arrayList.get(i24);
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

    public final void a(defpackage.ze zeVar, boolean z) {
        g();
        super.a(zeVar, z);
    }

    public final android.os.Parcelable c() {
        defpackage.aaw aaw = new defpackage.aaw();
        aaw.a = this.n;
        return aaw;
    }

    public final void a(android.os.Parcelable parcelable) {
        if (parcelable instanceof defpackage.aaw) {
            defpackage.aaw aaw = (defpackage.aaw) parcelable;
            if (aaw.a > 0) {
                android.view.MenuItem findItem = this.c.findItem(aaw.a);
                if (findItem != null) {
                    a((defpackage.aad) findItem.getSubMenu());
                }
            }
        }
    }

    public final void a(android.support.v7.widget.ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }
}
