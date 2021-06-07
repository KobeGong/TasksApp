package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: afd  reason: default package */
/* compiled from: PG */
public abstract class afd {
    public acm a;
    public RecyclerView b;
    public ahl c = new ahl(this.n);
    public ahl d = new ahl(this.o);
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    private final ahn n = new afe(this);
    private final ahn o = new aff(this);

    public abstract afh b();

    public final void a(RecyclerView recyclerView) {
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
        this.l = View.MeasureSpec.getSize(i2);
        this.j = View.MeasureSpec.getMode(i2);
        if (this.j == 0 && !RecyclerView.b) {
            this.l = 0;
        }
        this.m = View.MeasureSpec.getSize(i3);
        this.k = View.MeasureSpec.getMode(i3);
        if (this.k == 0 && !RecyclerView.b) {
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
            View e2 = e(i8);
            Rect rect = this.b.i;
            RecyclerView.b(e2, rect);
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
        Rect rect2 = this.b.i;
        this.b.setMeasuredDimension(a(i2, rect2.width() + l() + n(), sn.a.e(this.b)), a(i3, rect2.height() + m() + o(), sn.a.f(this.b)));
    }

    public final void h() {
        if (this.b != null) {
            this.b.requestLayout();
        }
    }

    public static int a(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, Math.max(i3, i4));
            case 1073741824:
                return size;
            default:
                return Math.max(i3, i4);
        }
    }

    public void a(String str) {
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

    public void a(int i2, int i3, aft aft, afg afg) {
    }

    public void a(int i2, afg afg) {
    }

    public void i() {
    }

    public void j() {
    }

    public void a(afn afn, aft aft) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void a(aft aft) {
    }

    public boolean a(afh afh) {
        return afh != null;
    }

    public afh a(Context context, AttributeSet attributeSet) {
        return new afh(context, attributeSet);
    }

    public int a(int i2, afn afn, aft aft) {
        return 0;
    }

    public int b(int i2, afn afn, aft aft) {
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

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2, boolean z) {
        afv c2 = RecyclerView.c(view);
        if (z || c2.m()) {
            this.b.h.b(c2);
        } else {
            this.b.h.c(c2);
        }
        afh afh = (afh) view.getLayoutParams();
        if (c2.g() || c2.e()) {
            if (c2.e()) {
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
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.a());
            } else if (c3 != i2) {
                afd afd = this.b.l;
                View e2 = afd.e(c3);
                if (e2 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c3 + afd.b.toString());
                }
                afd.d(c3);
                afh afh2 = (afh) e2.getLayoutParams();
                afv c4 = RecyclerView.c(e2);
                if (c4.m()) {
                    afd.b.h.b(c4);
                } else {
                    afd.b.h.c(c4);
                }
                afd.a.a(e2, i2, afh2, c4.m());
            }
        } else {
            this.a.a(view, i2, false);
            afh.c = true;
        }
        if (afh.d) {
            c2.a.invalidate();
            afh.d = false;
        }
    }

    public final void c(int i2) {
        acm acm;
        int a2;
        View b2;
        if (e(i2) != null && (b2 = acm.a.b((a2 = (acm = this.a).a(i2)))) != null) {
            if (acm.b.d(a2)) {
                acm.b(b2);
            }
            acm.a.a(a2);
        }
    }

    public static int a(View view) {
        return ((afh) view.getLayoutParams()).a.c();
    }

    public View a(int i2) {
        int k2 = k();
        for (int i3 = 0; i3 < k2; i3++) {
            View e2 = e(i3);
            afv c2 = RecyclerView.c(e2);
            if (c2 != null && c2.c() == i2 && !c2.b() && (this.b.D.g || !c2.m())) {
                return e2;
            }
        }
        return null;
    }

    public final void d(int i2) {
        e(i2);
        this.a.d(i2);
    }

    public final void a(int i2, afn afn) {
        View e2 = e(i2);
        c(i2);
        afn.a(e2);
    }

    public final int k() {
        if (this.a != null) {
            return this.a.a();
        }
        return 0;
    }

    public final View e(int i2) {
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

    public final View p() {
        View focusedChild;
        if (this.b == null || (focusedChild = this.b.getFocusedChild()) == null || this.a.d(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void a(afn afn) {
        int size = afn.a.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view = ((afv) afn.a.get(i2)).a;
            afv c2 = RecyclerView.c(view);
            if (!c2.b()) {
                c2.a(false);
                if (c2.n()) {
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
        if (afn.b != null) {
            afn.b.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    static boolean b(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i2;
            case 0:
                return true;
            case 1073741824:
                return size == i2;
            default:
                return false;
        }
    }

    public static int a(int i2, int i3, int i4, int i5, boolean z) {
        int i6 = 0;
        int max = Math.max(0, i2 - i4);
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
                    case 0:
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
        return View.MeasureSpec.makeMeasureSpec(max, i6);
    }

    public final void a(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((afh) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
        if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.b.j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public static int b(View view) {
        return view.getLeft() - ((afh) view.getLayoutParams()).b.left;
    }

    public static int c(View view) {
        return view.getTop() - ((afh) view.getLayoutParams()).b.top;
    }

    public static int d(View view) {
        return ((afh) view.getLayoutParams()).b.right + view.getRight();
    }

    public static int e(View view) {
        return ((afh) view.getLayoutParams()).b.bottom + view.getBottom();
    }

    public View c(int i2, afn afn, aft aft) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0087, code lost:
        if (r1 != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.support.v7.widget.RecyclerView r15, android.view.View r16, android.graphics.Rect r17, boolean r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 233
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

    public int d(aft aft) {
        return 0;
    }

    public int b(aft aft) {
        return 0;
    }

    public int f(aft aft) {
        return 0;
    }

    public int e(aft aft) {
        return 0;
    }

    public int c(aft aft) {
        return 0;
    }

    public int g(aft aft) {
        return 0;
    }

    public final void c(int i2, int i3) {
        this.b.c(i2, i3);
    }

    public Parcelable c() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    public final void b(afn afn) {
        for (int k2 = k() - 1; k2 >= 0; k2--) {
            if (!RecyclerView.c(e(k2)).b()) {
                a(k2, afn);
            }
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        afn afn = this.b.e;
        aft aft = this.b.D;
        if (this.b != null && accessibilityEvent != null) {
            if (!this.b.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.b.k != null) {
                accessibilityEvent.setItemCount(this.b.k.a());
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        a(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean f() {
        return false;
    }
}
