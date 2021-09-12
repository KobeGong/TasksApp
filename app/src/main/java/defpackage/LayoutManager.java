package defpackage;

/* renamed from: afd reason: default package */
/* compiled from: PG */
public abstract class LayoutManager {
    public defpackage.acm a;
    public android.support.v7.widget.RecyclerView b;
    public defpackage.ahl c = new defpackage.ahl(this.n);
    public defpackage.ahl d = new defpackage.ahl(this.o);
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    private final defpackage.ahn n = new defpackage.afe(this);
    private final defpackage.ahn o = new defpackage.aff(this);

    public abstract defpackage.afh b();

    public final void a(android.support.v7.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.l = 0;
            this.m = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.g;
            this.l = recyclerView.getWidth();
            this.m = recyclerView.getHeight();
        }
        this.j = 1073741824;
        this.k = 1073741824;
    }

    public final void a(int i2, int i3) {
        this.l = android.view.View.MeasureSpec.getSize(i2);
        this.j = android.view.View.MeasureSpec.getMode(i2);
        if (this.j == 0 && !android.support.v7.widget.RecyclerView.b) {
            this.l = 0;
        }
        this.m = android.view.View.MeasureSpec.getSize(i3);
        this.k = android.view.View.MeasureSpec.getMode(i3);
        if (this.k == 0 && !android.support.v7.widget.RecyclerView.b) {
            this.m = 0;
        }
    }

    public final void b(int i2, int i3) {
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int k2 = k();
        if (k2 == 0) {
            this.b.c(i2, i3);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < k2; i8++) {
            android.view.View e2 = e(i8);
            android.graphics.Rect rect = this.b.i;
            android.support.v7.widget.RecyclerView.b(e2, rect);
            if (rect.left < i7) {
                i7 = rect.left;
            }
            if (rect.right > i6) {
                i6 = rect.right;
            }
            if (rect.top < i4) {
                i4 = rect.top;
            }
            if (rect.bottom > i5) {
                i5 = rect.bottom;
            }
        }
        this.b.i.set(i7, i4, i6, i5);
        android.graphics.Rect rect2 = this.b.i;
        int width = rect2.width() + l() + n();
        int height = rect2.height() + m() + o();
        this.b.setMeasuredDimension(a(i2, width, ViewCompat.a.e(this.b)), a(i3, height, ViewCompat.a.f(this.b)));
    }

    public final void h() {
        if (this.b != null) {
            this.b.requestLayout();
        }
    }

    public static int a(int i2, int i3, int i4) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return java.lang.Math.min(size, java.lang.Math.max(i3, i4));
            case 1073741824:
                return size;
            default:
                return java.lang.Math.max(i3, i4);
        }
    }

    public void a(java.lang.String str) {
        if (this.b != null) {
            this.b.a(str);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void a(int i2, int i3, defpackage.aft aft, defpackage.afg afg) {
    }

    public void a(int i2, defpackage.afg afg) {
    }

    public void i() {
    }

    public void j() {
    }

    public void a(defpackage.afn afn, defpackage.aft aft) {
        android.util.Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(defpackage.aft aft) {
    }

    public boolean a(defpackage.afh afh) {
        return afh != null;
    }

    public defpackage.afh a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.afh(context, attributeSet);
    }

    public int a(int i2, defpackage.afn afn, defpackage.aft aft) {
        return 0;
    }

    public int b(int i2, defpackage.afn afn, defpackage.aft aft) {
        return 0;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void b(int i2) {
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.view.View view, int i2, boolean z) {
        RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
        if (z || c2.isRemoved()) {
            this.b.h.b(c2);
        } else {
            this.b.h.c(c2);
        }
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        if (c2.g() || c2.isScrap()) {
            if (c2.isScrap()) {
                c2.f();
            } else {
                c2.h();
            }
            this.a.a(view, i2, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            int c3 = this.a.c(view);
            if (i2 == -1) {
                i2 = this.a.a();
            }
            if (c3 == -1) {
                throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.exceptionLabel());
            } else if (c3 != i2) {
                LayoutManager afd = this.b.mLayout;
                android.view.View e2 = afd.e(c3);
                if (e2 == null) {
                    throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + c3 + afd.b.toString());
                }
                afd.d(c3);
                defpackage.afh afh2 = (defpackage.afh) e2.getLayoutParams();
                RecyclerViewHolder c4 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(e2);
                if (c4.isRemoved()) {
                    afd.b.h.b(c4);
                } else {
                    afd.b.h.c(c4);
                }
                afd.a.a(e2, i2, afh2, c4.isRemoved());
            }
        } else {
            this.a.a(view, i2, false);
            afh.c = true;
        }
        if (afh.d) {
            c2.itemView.invalidate();
            afh.d = false;
        }
    }

    public final void c(int i2) {
        if (e(i2) != null) {
            defpackage.acm acm = this.a;
            int a2 = acm.a(i2);
            android.view.View b2 = acm.a.b(a2);
            if (b2 != null) {
                if (acm.b.d(a2)) {
                    acm.b(b2);
                }
                acm.a.a(a2);
            }
        }
    }

    public static int a(android.view.View view) {
        return ((defpackage.afh) view.getLayoutParams()).a.c();
    }

    public android.view.View a(int i2) {
        int k2 = k();
        for (int i3 = 0; i3 < k2; i3++) {
            android.view.View e2 = e(i3);
            RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(e2);
            if (c2 != null && c2.c() == i2 && !c2.shouldIgnore() && (this.b.D.g || !c2.isRemoved())) {
                return e2;
            }
        }
        return null;
    }

    public final void d(int i2) {
        e(i2);
        this.a.d(i2);
    }

    public final void a(int i2, defpackage.afn afn) {
        android.view.View e2 = e(i2);
        c(i2);
        afn.a(e2);
    }

    public final int k() {
        if (this.a != null) {
            return this.a.a();
        }
        return 0;
    }

    public final android.view.View e(int i2) {
        if (this.a != null) {
            return this.a.b(i2);
        }
        return null;
    }

    public final int l() {
        if (this.b != null) {
            return this.b.getPaddingLeft();
        }
        return 0;
    }

    public final int m() {
        if (this.b != null) {
            return this.b.getPaddingTop();
        }
        return 0;
    }

    public final int n() {
        if (this.b != null) {
            return this.b.getPaddingRight();
        }
        return 0;
    }

    public final int o() {
        if (this.b != null) {
            return this.b.getPaddingBottom();
        }
        return 0;
    }

    public final android.view.View p() {
        if (this.b == null) {
            return null;
        }
        android.view.View focusedChild = this.b.getFocusedChild();
        if (focusedChild == null || this.a.d(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void a(defpackage.afn afn) {
        int size = afn.a.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            android.view.View view = ((RecyclerViewHolder) afn.a.get(i2)).itemView;
            RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
            if (!c2.shouldIgnore()) {
                c2.a(false);
                if (c2.isTmpDetached()) {
                    this.b.removeDetachedView(view, false);
                }
                if (this.b.z != null) {
                    this.b.z.c(c2);
                }
                c2.a(true);
                afn.b(view);
            }
        }
        afn.a.clear();
        if (afn.mChangedScrap != null) {
            afn.mChangedScrap.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    static boolean b(int i2, int i3, int i4) {
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int size = android.view.View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size >= i2) {
                    return true;
                }
                return false;
            case 0:
                return true;
            case 1073741824:
                if (size == i2) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static int a(int i2, int i3, int i4, int i5, boolean z) {
        int i6 = 0;
        int max = java.lang.Math.max(0, i2 - i4);
        if (z) {
            if (i5 >= 0) {
                i6 = 1073741824;
                max = i5;
            } else if (i5 == -1) {
                switch (i3) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i6 = i3;
                        break;
                    default:
                        max = 0;
                        break;
                }
            } else {
                if (i5 == -2) {
                    max = 0;
                }
                max = 0;
            }
        } else if (i5 >= 0) {
            i6 = 1073741824;
            max = i5;
        } else if (i5 == -1) {
            i6 = i3;
        } else {
            if (i5 == -2) {
                if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                    i6 = Integer.MIN_VALUE;
                }
            }
            max = 0;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(max, i6);
    }

    public final void a(android.view.View view, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = ((defpackage.afh) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (this.b != null) {
            android.graphics.Matrix matrix = view.getMatrix();
            if (matrix != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.b.j;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor((double) rectF.left), (int) java.lang.Math.floor((double) rectF.top), (int) java.lang.Math.ceil((double) rectF.right), (int) java.lang.Math.ceil((double) rectF.bottom));
            }
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static int b(android.view.View view) {
        return view.getLeft() - ((defpackage.afh) view.getLayoutParams()).b.left;
    }

    public static int c(android.view.View view) {
        return view.getTop() - ((defpackage.afh) view.getLayoutParams()).b.top;
    }

    public static int d(android.view.View view) {
        return ((defpackage.afh) view.getLayoutParams()).b.right + view.getRight();
    }

    public static int e(android.view.View view) {
        return ((defpackage.afh) view.getLayoutParams()).b.bottom + view.getBottom();
    }

    public android.view.View c(int i2, defpackage.afn afn, defpackage.aft aft) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0087, code lost:
        if (r1 != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.support.v7.widget.RecyclerView r15, android.view.View r16, android.graphics.Rect r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            r1 = 2
            int[] r4 = new int[r1]
            int r5 = r14.l()
            int r6 = r14.m()
            int r1 = r14.l
            int r2 = r14.n()
            int r7 = r1 - r2
            int r1 = r14.m
            int r2 = r14.o()
            int r8 = r1 - r2
            int r1 = r16.getLeft()
            r0 = r17
            int r2 = r0.left
            int r1 = r1 + r2
            int r2 = r16.getScrollX()
            int r9 = r1 - r2
            int r1 = r16.getTop()
            r0 = r17
            int r2 = r0.top
            int r1 = r1 + r2
            int r2 = r16.getScrollY()
            int r10 = r1 - r2
            int r1 = r17.width()
            int r11 = r9 + r1
            int r1 = r17.height()
            int r12 = r10 + r1
            r1 = 0
            int r2 = r9 - r5
            int r2 = java.lang.Math.min(r1, r2)
            r1 = 0
            int r3 = r10 - r6
            int r3 = java.lang.Math.min(r1, r3)
            r1 = 0
            int r13 = r11 - r7
            int r1 = java.lang.Math.max(r1, r13)
            r13 = 0
            int r8 = r12 - r8
            int r8 = java.lang.Math.max(r13, r8)
            android.support.v7.widget.RecyclerView r12 = r14.b
            sw r13 = defpackage.sn.a
            int r12 = r13.j(r12)
            r13 = 1
            if (r12 != r13) goto L_0x009b
            if (r1 == 0) goto L_0x0094
        L_0x006e:
            r2 = r1
        L_0x006f:
            if (r3 == 0) goto L_0x00a7
            r1 = r3
        L_0x0072:
            r3 = 0
            r4[r3] = r2
            r2 = 1
            r4[r2] = r1
            r1 = 0
            r2 = r4[r1]
            r1 = 1
            r3 = r4[r1]
            if (r19 == 0) goto L_0x0089
            android.view.View r1 = r15.getFocusedChild()
            if (r1 != 0) goto L_0x00ae
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x00e7
        L_0x0089:
            if (r2 != 0) goto L_0x008d
            if (r3 == 0) goto L_0x00e7
        L_0x008d:
            if (r18 == 0) goto L_0x00e3
            r15.scrollBy(r2, r3)
        L_0x0092:
            r1 = 1
        L_0x0093:
            return r1
        L_0x0094:
            int r1 = r11 - r7
            int r1 = java.lang.Math.max(r2, r1)
            goto L_0x006e
        L_0x009b:
            if (r2 == 0) goto L_0x00a0
            r1 = r2
        L_0x009e:
            r2 = r1
            goto L_0x006f
        L_0x00a0:
            int r2 = r9 - r5
            int r1 = java.lang.Math.min(r2, r1)
            goto L_0x009e
        L_0x00a7:
            int r1 = r10 - r6
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x0072
        L_0x00ae:
            int r4 = r14.l()
            int r5 = r14.m()
            int r6 = r14.l
            int r7 = r14.n()
            int r6 = r6 - r7
            int r7 = r14.m
            int r8 = r14.o()
            int r7 = r7 - r8
            android.support.v7.widget.RecyclerView r8 = r14.b
            android.graphics.Rect r8 = r8.i
            android.support.v7.widget.RecyclerView.b(r1, r8)
            int r1 = r8.left
            int r1 = r1 - r2
            if (r1 >= r6) goto L_0x00df
            int r1 = r8.right
            int r1 = r1 - r2
            if (r1 <= r4) goto L_0x00df
            int r1 = r8.top
            int r1 = r1 - r3
            if (r1 >= r7) goto L_0x00df
            int r1 = r8.bottom
            int r1 = r1 - r3
            if (r1 > r5) goto L_0x00e1
        L_0x00df:
            r1 = 0
            goto L_0x0087
        L_0x00e1:
            r1 = 1
            goto L_0x0087
        L_0x00e3:
            r15.a(r2, r3)
            goto L_0x0092
        L_0x00e7:
            r1 = 0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afd.a(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
        t();
    }

    public void v() {
    }

    public int d(defpackage.aft aft) {
        return 0;
    }

    public int b(defpackage.aft aft) {
        return 0;
    }

    public int f(defpackage.aft aft) {
        return 0;
    }

    public int e(defpackage.aft aft) {
        return 0;
    }

    public int c(defpackage.aft aft) {
        return 0;
    }

    public int g(defpackage.aft aft) {
        return 0;
    }

    public final void c(int i2, int i3) {
        this.b.c(i2, i3);
    }

    public android.os.Parcelable c() {
        return null;
    }

    public void a(android.os.Parcelable parcelable) {
    }

    public final void b(defpackage.afn afn) {
        for (int k2 = k() - 1; k2 >= 0; k2--) {
            if (!android.support.v7.widget.RecyclerView.getChildViewHolderInt(e(k2)).shouldIgnore()) {
                a(k2, afn);
            }
        }
    }

    public void a(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        defpackage.afn afn = this.b.e;
        defpackage.aft aft = this.b.D;
        if (this.b != null && accessibilityEvent != null) {
            if (!this.b.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.b.adapter != null) {
                accessibilityEvent.setItemCount(this.b.adapter.getItemCount());
            }
        }
    }

    public final void b(android.support.v7.widget.RecyclerView recyclerView) {
        a(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean f() {
        return false;
    }
}
