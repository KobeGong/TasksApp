package defpackage;

/* renamed from: yv reason: default package */
/* compiled from: PG */
final class yv extends defpackage.zq implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener, defpackage.zt {
    private android.widget.PopupWindow.OnDismissListener A;
    public final android.os.Handler a;
    public final java.util.List b = new java.util.ArrayList();
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener c = new defpackage.yw(this);
    public android.view.View d;
    public android.view.ViewTreeObserver e;
    public boolean f;
    private final android.content.Context h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private final java.util.List m = new java.util.ArrayList();
    private final android.view.View.OnAttachStateChangeListener n = new defpackage.yx(this);
    private final defpackage.aek o = new defpackage.yy(this);
    private int p = 0;
    private int q = 0;
    private android.view.View r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private defpackage.zu z;

    public yv(android.content.Context context, android.view.View view, int i2, int i3, boolean z2) {
        this.h = context;
        this.r = view;
        this.j = i2;
        this.k = i3;
        this.l = z2;
        this.x = false;
        this.s = i();
        android.content.res.Resources resources = context.getResources();
        this.i = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131689495));
        this.a = new android.os.Handler();
    }

    public final void b(boolean z2) {
        this.x = z2;
    }

    public final void d() {
        if (!f()) {
            for (defpackage.ze c2 : this.m) {
                c(c2);
            }
            this.m.clear();
            this.d = this.r;
            if (this.d != null) {
                boolean z2 = this.e == null;
                this.e = this.d.getViewTreeObserver();
                if (z2) {
                    this.e.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.n);
            }
        }
    }

    public final void e() {
        int size = this.b.size();
        if (size > 0) {
            defpackage.za[] zaVarArr = (defpackage.za[]) this.b.toArray(new defpackage.za[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                defpackage.za zaVar = zaVarArr[i2];
                if (zaVar.a.r.isShowing()) {
                    zaVar.a.e();
                }
            }
        }
    }

    public final boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        e();
        return true;
    }

    private final int i() {
        if (defpackage.sn.a.j(this.r) == 1) {
            return 0;
        }
        return 1;
    }

    public final void a(defpackage.ze zeVar) {
        zeVar.a((defpackage.zt) this, this.h);
        if (f()) {
            c(zeVar);
        } else {
            this.m.add(zeVar);
        }
    }

    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(defpackage.ze r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.h
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r0)
            zd r0 = new zd
            boolean r1 = r12.l
            r0.<init>(r13, r7, r1)
            boolean r1 = r12.f()
            if (r1 != 0) goto L_0x014c
            boolean r1 = r12.x
            if (r1 == 0) goto L_0x014c
            r1 = 1
            r0.b = r1
        L_0x001a:
            r1 = 0
            android.content.Context r2 = r12.h
            int r3 = r12.i
            int r8 = a(r0, r1, r2, r3)
            ael r9 = new ael
            android.content.Context r1 = r12.h
            int r2 = r12.j
            int r3 = r12.k
            r9.<init>(r1, r2, r3)
            aek r1 = r12.o
            r9.b = r1
            r9.m = r12
            r9.a(r12)
            android.view.View r1 = r12.r
            r9.l = r1
            int r1 = r12.q
            r9.j = r1
            r9.b()
            r9.h()
            r9.a(r0)
            r9.b(r8)
            int r0 = r12.q
            r9.j = r0
            java.util.List r0 = r12.b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01b4
            java.util.List r0 = r12.b
            java.util.List r1 = r12.b
            int r1 = r1.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            za r0 = (defpackage.za) r0
            ze r3 = r0.b
            r1 = 0
            int r4 = r3.size()
            r2 = r1
        L_0x006f:
            if (r2 >= r4) goto L_0x015f
            android.view.MenuItem r1 = r3.getItem(r2)
            boolean r5 = r1.hasSubMenu()
            if (r5 == 0) goto L_0x015a
            android.view.SubMenu r5 = r1.getSubMenu()
            if (r13 != r5) goto L_0x015a
            r6 = r1
        L_0x0082:
            if (r6 != 0) goto L_0x0163
            r1 = 0
        L_0x0085:
            r3 = r1
            r4 = r0
        L_0x0087:
            if (r3 == 0) goto L_0x021c
            java.lang.reflect.Method r0 = defpackage.ael.a
            if (r0 == 0) goto L_0x009f
            java.lang.reflect.Method r0 = defpackage.ael.a     // Catch:{ Exception -> 0x0233 }
            android.widget.PopupWindow r1 = r9.r     // Catch:{ Exception -> 0x0233 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0233 }
            r5 = 0
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0233 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0233 }
            r0.invoke(r1, r2)     // Catch:{ Exception -> 0x0233 }
        L_0x009f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00ab
            android.widget.PopupWindow r0 = r9.r
            r1 = 0
            r0.setEnterTransition(r1)
        L_0x00ab:
            java.util.List r0 = r12.b
            java.util.List r1 = r12.b
            int r1 = r1.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            za r0 = (defpackage.za) r0
            ael r0 = r0.a
            ade r0 = r0.e
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r5 = r12.d
            r5.getWindowVisibleDisplayFrame(r2)
            int r5 = r12.s
            r6 = 1
            if (r5 != r6) goto L_0x01ba
            r5 = 0
            r1 = r1[r5]
            int r0 = r0.getWidth()
            int r0 = r0 + r1
            int r0 = r0 + r8
            int r1 = r2.right
            if (r0 > r1) goto L_0x01c4
            r0 = 1
            r1 = r0
        L_0x00e3:
            r0 = 1
            if (r1 != r0) goto L_0x01c8
            r0 = 1
        L_0x00e7:
            r12.s = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x01cb
            r9.l = r3
            r2 = 0
            r1 = 0
        L_0x00f3:
            int r5 = r12.q
            r5 = r5 & 5
            r6 = 5
            if (r5 != r6) goto L_0x020f
            if (r0 == 0) goto L_0x0207
            int r0 = r2 + r8
        L_0x00fe:
            r9.g = r0
            r0 = 1
            r9.i = r0
            r0 = 1
            r9.h = r0
            r9.a(r1)
        L_0x0109:
            za r0 = new za
            int r1 = r12.s
            r0.<init>(r9, r13, r1)
            java.util.List r1 = r12.b
            r1.add(r0)
            r9.d()
            ade r2 = r9.e
            r2.setOnKeyListener(r12)
            if (r4 != 0) goto L_0x014b
            boolean r0 = r12.y
            if (r0 == 0) goto L_0x014b
            java.lang.CharSequence r0 = r13.f
            if (r0 == 0) goto L_0x014b
            r0 = 2131034129(0x7f050011, float:1.7678767E38)
            r1 = 0
            android.view.View r0 = r7.inflate(r0, r2, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 0
            r0.setEnabled(r3)
            java.lang.CharSequence r3 = r13.f
            r1.setText(r3)
            r1 = 0
            r3 = 0
            r2.addHeaderView(r0, r1, r3)
            r9.d()
        L_0x014b:
            return
        L_0x014c:
            boolean r1 = r12.f()
            if (r1 == 0) goto L_0x001a
            boolean r1 = defpackage.zq.b(r13)
            r0.b = r1
            goto L_0x001a
        L_0x015a:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x006f
        L_0x015f:
            r1 = 0
            r6 = r1
            goto L_0x0082
        L_0x0163:
            ael r1 = r0.a
            ade r10 = r1.e
            android.widget.ListAdapter r1 = r10.getAdapter()
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L_0x0194
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r2 = r1.getHeadersCount()
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            zd r1 = (defpackage.zd) r1
            r3 = r2
            r2 = r1
        L_0x017d:
            r5 = -1
            r4 = 0
            int r11 = r2.getCount()
        L_0x0183:
            if (r4 >= r11) goto L_0x0236
            java.lang.Object r1 = r2.getItem(r4)
            zi r1 = (defpackage.zi) r1
            if (r6 != r1) goto L_0x019a
            r1 = r4
        L_0x018e:
            r2 = -1
            if (r1 != r2) goto L_0x019d
            r1 = 0
            goto L_0x0085
        L_0x0194:
            r2 = 0
            zd r1 = (defpackage.zd) r1
            r3 = r2
            r2 = r1
            goto L_0x017d
        L_0x019a:
            int r4 = r4 + 1
            goto L_0x0183
        L_0x019d:
            int r1 = r1 + r3
            int r2 = r10.getFirstVisiblePosition()
            int r1 = r1 - r2
            if (r1 < 0) goto L_0x01ab
            int r2 = r10.getChildCount()
            if (r1 < r2) goto L_0x01ae
        L_0x01ab:
            r1 = 0
            goto L_0x0085
        L_0x01ae:
            android.view.View r1 = r10.getChildAt(r1)
            goto L_0x0085
        L_0x01b4:
            r0 = 0
            r1 = 0
            r3 = r1
            r4 = r0
            goto L_0x0087
        L_0x01ba:
            r0 = 0
            r0 = r1[r0]
            int r0 = r0 - r8
            if (r0 >= 0) goto L_0x01c4
            r0 = 1
            r1 = r0
            goto L_0x00e3
        L_0x01c4:
            r0 = 0
            r1 = r0
            goto L_0x00e3
        L_0x01c8:
            r0 = 0
            goto L_0x00e7
        L_0x01cb:
            r1 = 2
            int[] r1 = new int[r1]
            android.view.View r2 = r12.r
            r2.getLocationOnScreen(r1)
            r2 = 2
            int[] r5 = new int[r2]
            r3.getLocationOnScreen(r5)
            int r2 = r12.q
            r2 = r2 & 7
            r6 = 5
            if (r2 != r6) goto L_0x01f6
            r2 = 0
            r6 = r1[r2]
            android.view.View r10 = r12.r
            int r10 = r10.getWidth()
            int r6 = r6 + r10
            r1[r2] = r6
            r2 = 0
            r6 = r5[r2]
            int r10 = r3.getWidth()
            int r6 = r6 + r10
            r5[r2] = r6
        L_0x01f6:
            r2 = 0
            r2 = r5[r2]
            r6 = 0
            r6 = r1[r6]
            int r2 = r2 - r6
            r6 = 1
            r5 = r5[r6]
            r6 = 1
            r1 = r1[r6]
            int r1 = r5 - r1
            goto L_0x00f3
        L_0x0207:
            int r0 = r3.getWidth()
            int r0 = r2 - r0
            goto L_0x00fe
        L_0x020f:
            if (r0 == 0) goto L_0x0218
            int r0 = r3.getWidth()
            int r0 = r0 + r2
            goto L_0x00fe
        L_0x0218:
            int r0 = r2 - r8
            goto L_0x00fe
        L_0x021c:
            boolean r0 = r12.t
            if (r0 == 0) goto L_0x0224
            int r0 = r12.v
            r9.g = r0
        L_0x0224:
            boolean r0 = r12.u
            if (r0 == 0) goto L_0x022d
            int r0 = r12.w
            r9.a(r0)
        L_0x022d:
            android.graphics.Rect r0 = r12.g
            r9.p = r0
            goto L_0x0109
        L_0x0233:
            r0 = move-exception
            goto L_0x009f
        L_0x0236:
            r1 = r5
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.c(ze):void");
    }

    public final boolean f() {
        return this.b.size() > 0 && ((defpackage.za) this.b.get(0)).a.r.isShowing();
    }

    public final void onDismiss() {
        defpackage.za zaVar;
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                zaVar = null;
                break;
            }
            zaVar = (defpackage.za) this.b.get(i2);
            if (!zaVar.a.r.isShowing()) {
                break;
            }
            i2++;
        }
        if (zaVar != null) {
            zaVar.b.b(false);
        }
    }

    public final void a(boolean z2) {
        for (defpackage.za zaVar : this.b) {
            a(zaVar.a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    public final void a(defpackage.zu zuVar) {
        this.z = zuVar;
    }

    public final boolean a(defpackage.aad aad) {
        for (defpackage.za zaVar : this.b) {
            if (aad == zaVar.b) {
                zaVar.a.e.requestFocus();
                return true;
            }
        }
        if (!aad.hasVisibleItems()) {
            return false;
        }
        a((defpackage.ze) aad);
        if (this.z != null) {
            this.z.a(aad);
        }
        return true;
    }

    public final void a(defpackage.ze zeVar, boolean z2) {
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (zeVar == ((defpackage.za) this.b.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.b.size()) {
                ((defpackage.za) this.b.get(i3)).b.b(false);
            }
            defpackage.za zaVar = (defpackage.za) this.b.remove(i2);
            zaVar.b.b((defpackage.zt) this);
            if (this.f) {
                defpackage.ael ael = zaVar.a;
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    ael.r.setExitTransition(null);
                }
                zaVar.a.r.setAnimationStyle(0);
            }
            zaVar.a.e();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.s = ((defpackage.za) this.b.get(size2 - 1)).c;
            } else {
                this.s = i();
            }
            if (size2 == 0) {
                e();
                if (this.z != null) {
                    this.z.a(zeVar, true);
                }
                if (this.e != null) {
                    if (this.e.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.n);
                this.A.onDismiss();
            } else if (z2) {
                ((defpackage.za) this.b.get(0)).b.b(false);
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final android.os.Parcelable c() {
        return null;
    }

    public final void a(android.os.Parcelable parcelable) {
    }

    public final void a(int i2) {
        if (this.p != i2) {
            this.p = i2;
            this.q = defpackage.jd.a(i2, defpackage.sn.a.j(this.r));
        }
    }

    public final void a(android.view.View view) {
        if (this.r != view) {
            this.r = view;
            this.q = defpackage.jd.a(this.p, defpackage.sn.a.j(this.r));
        }
    }

    public final void a(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public final android.widget.ListView g() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((defpackage.za) this.b.get(this.b.size() - 1)).a.e;
    }

    public final void b(int i2) {
        this.t = true;
        this.v = i2;
    }

    public final void c(int i2) {
        this.u = true;
        this.w = i2;
    }

    public final void c(boolean z2) {
        this.y = z2;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return false;
    }
}
