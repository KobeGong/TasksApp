package android.support.v7.widget;

/* compiled from: PG */
public class RecyclerView extends android.view.ViewGroup implements defpackage.sg {
    public static final android.view.animation.Interpolator M = new defpackage.aes();
    private static final int[] N = {16843830};
    private static final int[] O = {16842987};
    private static final java.lang.Class[] P = {android.content.Context.class, android.util.AttributeSet.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE};
    public static final boolean a = (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20);
    public static final boolean b;
    public static final boolean c = true;
    public static final boolean d;
    public int A;
    public defpackage.adr B;
    public defpackage.afg C;
    public final defpackage.aft D;
    public java.util.List E;
    public boolean F;
    public boolean G;
    public defpackage.afa H;
    public boolean I;
    public defpackage.afw J;
    public final int[] K;
    public final int[] L;
    private final defpackage.afp Q;
    private defpackage.afq R;
    private boolean S;
    private final android.graphics.Rect T;
    private final java.util.ArrayList U;
    private defpackage.afj V;
    private boolean W;
    private java.lang.Runnable aA;
    private final defpackage.ahq aB;
    private int aa;
    private boolean ab;
    private int ac;
    private final android.view.accessibility.AccessibilityManager ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;
    private android.view.VelocityTracker ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private final int ao;
    private final int ap;
    private float aq;
    private float ar;
    private boolean as;
    private final defpackage.afu at;
    private defpackage.aew au;
    private final int[] av;
    private defpackage.sh aw;
    private final int[] ax;
    private final int[] ay;
    private final java.util.List az;
    public final defpackage.afn e;
    public defpackage.aeo f;
    public defpackage.acm g;
    public final defpackage.aho h;
    public final android.graphics.Rect i;
    public final android.graphics.RectF j;
    public defpackage.aet k;
    public defpackage.afd l;
    public defpackage.afo m;
    public final java.util.ArrayList n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public java.util.List t;
    public boolean u;
    public android.widget.EdgeEffect v;
    public android.widget.EdgeEffect w;
    public android.widget.EdgeEffect x;
    public android.widget.EdgeEffect y;
    public defpackage.aey z;

    public RecyclerView(android.content.Context context) {
        this(context, null);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        boolean z2;
        java.lang.String str;
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        super(context, attributeSet, i2);
        this.Q = new defpackage.afp(this);
        this.e = new defpackage.afn(this);
        this.h = new defpackage.aho();
        new defpackage.aeq(this);
        this.i = new android.graphics.Rect();
        this.T = new android.graphics.Rect();
        this.j = new android.graphics.RectF();
        this.n = new java.util.ArrayList();
        this.U = new java.util.ArrayList();
        this.aa = 0;
        this.u = false;
        this.ae = false;
        this.af = 0;
        this.ag = 0;
        new defpackage.aex();
        this.z = new defpackage.acs();
        this.A = 0;
        this.ah = -1;
        this.aq = Float.MIN_VALUE;
        this.ar = Float.MIN_VALUE;
        this.as = true;
        this.at = new defpackage.afu(this);
        this.C = d ? new defpackage.afg() : null;
        this.D = new defpackage.aft();
        this.F = false;
        this.G = false;
        this.H = new defpackage.afa(this);
        this.I = false;
        this.av = new int[2];
        this.ax = new int[2];
        this.K = new int[2];
        this.ay = new int[2];
        this.L = new int[2];
        this.az = new java.util.ArrayList();
        this.aA = new defpackage.aer(this);
        this.aB = new defpackage.ahq(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O, i2, 0);
            this.S = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.S = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.an = viewConfiguration.getScaledTouchSlop();
        this.aq = defpackage.sx.a(viewConfiguration, context);
        this.ar = defpackage.sx.b(viewConfiguration, context);
        this.ao = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ap = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.z.h = this.H;
        this.f = new defpackage.aeo(new defpackage.abd(this));
        this.g = new defpackage.acm(new defpackage.aco(this));
        if (defpackage.sn.a.d(this) == 0) {
            defpackage.sn.a((android.view.View) this, 1);
        }
        this.ad = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        a(new defpackage.afw(this));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.ya.a, i2, 0);
            java.lang.String string = obtainStyledAttributes2.getString(defpackage.ya.h);
            if (obtainStyledAttributes2.getInt(defpackage.ya.b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.W = obtainStyledAttributes2.getBoolean(defpackage.ya.c, false);
            if (this.W) {
                android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(defpackage.ya.f);
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes2.getDrawable(defpackage.ya.g);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(defpackage.ya.d);
                android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes2.getDrawable(defpackage.ya.e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + a());
                }
                android.content.res.Resources resources = getContext().getResources();
                new defpackage.adh(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131689714), resources.getDimensionPixelSize(2131689716), resources.getDimensionPixelOffset(2131689715));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                java.lang.String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        str = context.getPackageName() + trim;
                    } else if (trim.contains(".")) {
                        str = trim;
                    } else {
                        str = android.support.v7.widget.RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        java.lang.Class asSubclass = classLoader.loadClass(str).asSubclass(defpackage.afd.class);
                        try {
                            objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(0)};
                            constructor = asSubclass.getConstructor(P);
                        } catch (java.lang.NoSuchMethodException e2) {
                            constructor = asSubclass.getConstructor(new java.lang.Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        a((defpackage.afd) constructor.newInstance(objArr));
                    } catch (java.lang.NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                    } catch (java.lang.ClassNotFoundException e4) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                    } catch (java.lang.reflect.InvocationTargetException e5) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                    } catch (java.lang.InstantiationException e6) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                    } catch (java.lang.IllegalAccessException e7) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                    } catch (java.lang.ClassCastException e8) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e8);
                    }
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, N, i2, 0);
                z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
            z2 = true;
        } else {
            setDescendantFocusability(262144);
            z2 = true;
        }
        setNestedScrollingEnabled(z2);
    }

    public final java.lang.String a() {
        return " " + super.toString() + ", adapter:" + this.k + ", layout:" + this.l + ", context:" + getContext();
    }

    public final void a(defpackage.afw afw) {
        this.J = afw;
        defpackage.sn.a((android.view.View) this, (defpackage.rn) this.J);
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.S) {
            r();
        }
        this.S = z2;
        super.setClipToPadding(z2);
        if (this.q) {
            requestLayout();
        }
    }

    public boolean getClipToPadding() {
        return this.S;
    }

    public final void a(defpackage.aet aet) {
        if (this.k != null) {
            defpackage.aet aet2 = this.k;
            aet2.d.unregisterObserver(this.Q);
        }
        b();
        this.f.a();
        defpackage.aet aet3 = this.k;
        this.k = aet;
        if (aet != null) {
            aet.d.registerObserver(this.Q);
        }
        if (this.l != null) {
            this.l.q();
        }
        defpackage.afn afn = this.e;
        defpackage.aet aet4 = this.k;
        afn.a();
        defpackage.afl d2 = afn.d();
        if (aet3 != null) {
            d2.b--;
        }
        if (d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                ((defpackage.afm) d2.a.valueAt(i2)).a.clear();
            }
        }
        if (aet4 != null) {
            d2.b++;
        }
        this.D.f = true;
        c(false);
        requestLayout();
    }

    public final void b() {
        if (this.z != null) {
            this.z.d();
        }
        if (this.l != null) {
            this.l.b(this.e);
            this.l.a(this.e);
        }
        this.e.a();
    }

    public int getBaseline() {
        if (this.l != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final void a(defpackage.afd afd) {
        if (afd != this.l) {
            q();
            if (this.l != null) {
                if (this.z != null) {
                    this.z.d();
                }
                this.l.b(this.e);
                this.l.a(this.e);
                this.e.a();
                if (this.o) {
                    this.l.j();
                }
                this.l.a((android.support.v7.widget.RecyclerView) null);
                this.l = null;
            } else {
                this.e.a();
            }
            defpackage.acm acm = this.g;
            defpackage.acn acn = acm.b;
            while (true) {
                acn.a = 0;
                if (acn.b == null) {
                    break;
                }
                acn = acn.b;
            }
            for (int size = acm.c.size() - 1; size >= 0; size--) {
                acm.a.b((android.view.View) acm.c.get(size));
                acm.c.remove(size);
            }
            defpackage.aco aco = acm.a;
            int childCount = aco.a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View b2 = aco.b(i2);
                aco.a.g(b2);
                b2.clearAnimation();
            }
            aco.a.removeAllViews();
            this.l = afd;
            if (afd != null) {
                if (afd.b != null) {
                    throw new java.lang.IllegalArgumentException("LayoutManager " + afd + " is already attached to a RecyclerView:" + afd.b.a());
                }
                this.l.a(this);
                if (this.o) {
                    this.l.i();
                }
            }
            this.e.b();
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.afq afq = new defpackage.afq(super.onSaveInstanceState());
        if (this.R != null) {
            afq.a = this.R.a;
        } else if (this.l != null) {
            afq.a = this.l.c();
        } else {
            afq.a = null;
        }
        return afq;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.afq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.R = (defpackage.afq) parcelable;
        super.onRestoreInstanceState(this.R.e);
        if (this.l != null && this.R.a != null) {
            this.l.a(this.R.a);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void a(defpackage.afv afv) {
        android.view.View view = afv.a;
        boolean z2 = view.getParent() == this;
        this.e.b(a(view));
        if (afv.n()) {
            this.g.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.g.a(view, -1, true);
        } else {
            defpackage.acm acm = this.g;
            int a2 = acm.a.a(view);
            if (a2 < 0) {
                throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            acm.b.a(a2);
            acm.a(view);
        }
    }

    public final void b(int i2) {
        if (i2 != this.A) {
            this.A = i2;
            if (i2 != 2) {
                this.at.b();
            }
            if (this.E != null) {
                for (int size = this.E.size() - 1; size >= 0; size--) {
                    this.E.get(size);
                }
            }
        }
    }

    public final void a(defpackage.afc afc) {
        if (this.l != null) {
            this.l.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.n.isEmpty()) {
            setWillNotDraw(false);
        }
        this.n.add(afc);
        l();
        requestLayout();
    }

    public final void b(defpackage.afc afc) {
        if (this.l != null) {
            this.l.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.n.remove(afc);
        if (this.n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        l();
        requestLayout();
    }

    public final void a(defpackage.aew aew) {
        if (aew != this.au) {
            this.au = aew;
            setChildrenDrawingOrderEnabled(this.au != null);
        }
    }

    public final void a(defpackage.afk afk) {
        if (this.E == null) {
            this.E = new java.util.ArrayList();
        }
        this.E.add(afk);
    }

    public final void c(int i2) {
        q();
        if (this.l == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        this.l.b(i2);
        awakenScrollBars();
    }

    public void scrollTo(int i2, int i3) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i2, int i3) {
        if (this.l == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        boolean d2 = this.l.d();
        boolean e2 = this.l.e();
        if (d2 || e2) {
            if (!d2) {
                i2 = 0;
            }
            if (!e2) {
                i3 = 0;
            }
            a(i2, i3, (android.view.MotionEvent) null);
        }
    }

    public final void a(int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        d();
        i();
        defpackage.jd.c("RV Scroll");
        z();
        if (i2 != 0) {
            i4 = this.l.a(i2, this.e, this.D);
        } else {
            i4 = 0;
        }
        if (i3 != 0) {
            i5 = this.l.b(i3, this.e, this.D);
        } else {
            i5 = 0;
        }
        defpackage.jd.b();
        int a2 = this.g.a();
        for (int i6 = 0; i6 < a2; i6++) {
            android.view.View b2 = this.g.b(i6);
            defpackage.afv a3 = a(b2);
            if (!(a3 == null || a3.i == null)) {
                android.view.View view = a3.i.a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        b(true);
        a(false);
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i5;
        }
    }

    public final void c() {
        boolean z2 = false;
        if (!this.q || this.u) {
            defpackage.jd.c("RV FullInvalidate");
            x();
            defpackage.jd.b();
        } else if (!this.f.d()) {
        } else {
            if (this.f.a(4) && !this.f.a(11)) {
                defpackage.jd.c("RV PartialInvalidate");
                d();
                i();
                this.f.b();
                if (!this.ab) {
                    int a2 = this.g.a();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= a2) {
                            break;
                        }
                        defpackage.afv c2 = c(this.g.b(i2));
                        if (c2 != null && !c2.b() && c2.s()) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    if (z2) {
                        x();
                    } else {
                        this.f.c();
                    }
                }
                a(true);
                b(true);
                defpackage.jd.b();
            } else if (this.f.d()) {
                defpackage.jd.c("RV FullInvalidate");
                x();
                defpackage.jd.b();
            }
        }
    }

    private final boolean a(int i2, int i3, android.view.MotionEvent motionEvent) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        c();
        if (this.k != null) {
            a(i2, i3, this.L);
            i6 = this.L[0];
            i7 = this.L[1];
            i4 = i2 - i6;
            i5 = i3 - i7;
        }
        if (!this.n.isEmpty()) {
            invalidate();
        }
        if (a(i6, i7, i4, i5, this.ax, 0)) {
            this.al -= this.ax[0];
            this.am -= this.ax[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.ax[0], (float) this.ax[1]);
            }
            int[] iArr = this.ay;
            iArr[0] = iArr[0] + this.ax[0];
            int[] iArr2 = this.ay;
            iArr2[1] = iArr2[1] + this.ax[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x2 = motionEvent.getX();
                    float f2 = (float) i4;
                    float y2 = motionEvent.getY();
                    float f3 = (float) i5;
                    boolean z2 = false;
                    if (f2 < 0.0f) {
                        e();
                        defpackage.um.a(this.v, (-f2) / ((float) getWidth()), 1.0f - (y2 / ((float) getHeight())));
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        f();
                        defpackage.um.a(this.x, f2 / ((float) getWidth()), y2 / ((float) getHeight()));
                        z2 = true;
                    }
                    if (f3 < 0.0f) {
                        g();
                        defpackage.um.a(this.w, (-f3) / ((float) getHeight()), x2 / ((float) getWidth()));
                        z2 = true;
                    } else if (f3 > 0.0f) {
                        h();
                        defpackage.um.a(this.y, f3 / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
                        z2 = true;
                    }
                    if (!(!z2 && f2 == 0.0f && f3 == 0.0f)) {
                        defpackage.sn.a.c(this);
                    }
                }
            }
            b(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            m();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollOffset() {
        if (this.l != null && this.l.d()) {
            return this.l.b(this.D);
        }
        return 0;
    }

    public int computeHorizontalScrollExtent() {
        if (this.l != null && this.l.d()) {
            return this.l.d(this.D);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.l != null && this.l.d()) {
            return this.l.f(this.D);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.l != null && this.l.e()) {
            return this.l.c(this.D);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.l != null && this.l.e()) {
            return this.l.e(this.D);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.l != null && this.l.e()) {
            return this.l.g(this.D);
        }
        return 0;
    }

    public final void d() {
        this.aa++;
        if (this.aa == 1) {
            this.ab = false;
        }
    }

    public final void a(boolean z2) {
        if (this.aa <= 0) {
            this.aa = 1;
        }
        if (!z2) {
            this.ab = false;
        }
        if (this.aa == 1) {
            if (z2 && this.ab && this.l != null && this.k != null) {
                x();
            }
            this.ab = false;
        }
        this.aa--;
    }

    public final void a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.l == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.l.d()) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if (!this.l.e()) {
            i5 = 0;
        } else {
            i5 = i3;
        }
        if (i4 != 0 || i5 != 0) {
            defpackage.afu afu = this.at;
            int abs = java.lang.Math.abs(i4);
            int abs2 = java.lang.Math.abs(i5);
            boolean z2 = abs > abs2;
            int sqrt = (int) java.lang.Math.sqrt(0.0d);
            int sqrt2 = (int) java.lang.Math.sqrt((double) ((i4 * i4) + (i5 * i5)));
            int height = z2 ? afu.e.getWidth() : afu.e.getHeight();
            int i8 = height / 2;
            float sin = (((float) java.lang.Math.sin((double) ((java.lang.Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) height)) - 0.5f) * 0.47123894f))) * ((float) i8)) + ((float) i8);
            if (sqrt > 0) {
                i7 = java.lang.Math.round(1000.0f * java.lang.Math.abs(sin / ((float) sqrt))) * 4;
            } else {
                if (z2) {
                    i6 = abs;
                } else {
                    i6 = abs2;
                }
                i7 = (int) (((((float) i6) / ((float) height)) + 1.0f) * 300.0f);
            }
            int min = java.lang.Math.min(i7, 2000);
            android.view.animation.Interpolator interpolator = M;
            if (afu.d != interpolator) {
                afu.d = interpolator;
                afu.c = new android.widget.OverScroller(afu.e.getContext(), interpolator);
            }
            afu.e.b(2);
            afu.b = 0;
            afu.a = 0;
            afu.c.startScroll(0, 0, i4, i5, min);
            if (android.os.Build.VERSION.SDK_INT < 23) {
                afu.c.computeScrollOffset();
            }
            afu.a();
        }
    }

    private final void q() {
        b(0);
        this.at.b();
    }

    public final void b(int i2, int i3) {
        boolean z2 = false;
        if (this.v != null && !this.v.isFinished() && i2 > 0) {
            this.v.onRelease();
            z2 = this.v.isFinished();
        }
        if (this.x != null && !this.x.isFinished() && i2 < 0) {
            this.x.onRelease();
            z2 |= this.x.isFinished();
        }
        if (this.w != null && !this.w.isFinished() && i3 > 0) {
            this.w.onRelease();
            z2 |= this.w.isFinished();
        }
        if (this.y != null && !this.y.isFinished() && i3 < 0) {
            this.y.onRelease();
            z2 |= this.y.isFinished();
        }
        if (z2) {
            defpackage.sn.a.c(this);
        }
    }

    public final void e() {
        if (this.v == null) {
            this.v = defpackage.aex.a(this);
            if (this.S) {
                this.v.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.v.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void f() {
        if (this.x == null) {
            this.x = defpackage.aex.a(this);
            if (this.S) {
                this.x.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.x.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void g() {
        if (this.w == null) {
            this.w = defpackage.aex.a(this);
            if (this.S) {
                this.w.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.w.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void h() {
        if (this.y == null) {
            this.y = defpackage.aex.a(this);
            if (this.S) {
                this.y.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.y.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private final void r() {
        this.y = null;
        this.w = null;
        this.x = null;
        this.v = null;
    }

    public android.view.View focusSearch(android.view.View view, int i2) {
        android.view.View findNextFocus;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        char c2 = 65535;
        boolean z5 = false;
        boolean z6 = (this.k == null || this.l == null || u()) ? false : true;
        android.view.FocusFinder instance = android.view.FocusFinder.getInstance();
        if (!z6 || !(i2 == 2 || i2 == 1)) {
            findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus == null && z6) {
                c();
                if (h(view) == null) {
                    return null;
                }
                d();
                findNextFocus = this.l.c(i2, this.e, this.D);
                a(false);
            }
        } else {
            if (this.l.e()) {
                if (instance.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.l.d()) {
                if (defpackage.sn.a.j(this.l.b) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i2 == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (instance.findNextFocus(this, view, z4 ^ z3 ? 66 : 17) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                c();
                if (h(view) == null) {
                    return null;
                }
                d();
                this.l.c(i2, this.e, this.D);
                a(false);
            }
            findNextFocus = instance.findNextFocus(this, view, i2);
        }
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (!(findNextFocus == null || findNextFocus == this || h(findNextFocus) == null)) {
                if (view == null) {
                    z5 = true;
                } else if (h(view) == null) {
                    z5 = true;
                } else {
                    this.i.set(0, 0, view.getWidth(), view.getHeight());
                    this.T.set(0, 0, findNextFocus.getWidth(), findNextFocus.getHeight());
                    offsetDescendantRectToMyCoords(view, this.i);
                    offsetDescendantRectToMyCoords(findNextFocus, this.T);
                    int i4 = defpackage.sn.a.j(this.l.b) == 1 ? -1 : 1;
                    if ((this.i.left < this.T.left || this.i.right <= this.T.left) && this.i.right < this.T.right) {
                        i3 = 1;
                    } else if ((this.i.right > this.T.right || this.i.left >= this.T.right) && this.i.left > this.T.left) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    if ((this.i.top < this.T.top || this.i.bottom <= this.T.top) && this.i.bottom < this.T.bottom) {
                        c2 = 1;
                    } else if ((this.i.bottom <= this.T.bottom && this.i.top < this.T.bottom) || this.i.top <= this.T.top) {
                        c2 = 0;
                    }
                    switch (i2) {
                        case 1:
                            if (c2 < 0 || (c2 == 0 && i4 * i3 <= 0)) {
                                z5 = true;
                                break;
                            }
                        case 2:
                            if (c2 > 0 || (c2 == 0 && i4 * i3 >= 0)) {
                                z5 = true;
                                break;
                            }
                        case 17:
                            if (i3 < 0) {
                                z5 = true;
                                break;
                            }
                            break;
                        case 33:
                            if (c2 < 0) {
                                z5 = true;
                                break;
                            }
                            break;
                        case 66:
                            if (i3 > 0) {
                                z5 = true;
                                break;
                            }
                            break;
                        case 130:
                            if (c2 > 0) {
                                z5 = true;
                                break;
                            }
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid direction: " + i2 + a());
                    }
                }
            }
            if (z5) {
                return findNextFocus;
            }
            return super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            a(findNextFocus, (android.view.View) null);
            return view;
        }
    }

    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!(u()) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private final void a(android.view.View view, android.view.View view2) {
        boolean z2 = true;
        android.view.View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof defpackage.afh) {
            defpackage.afh afh = (defpackage.afh) layoutParams;
            if (!afh.c) {
                android.graphics.Rect rect = afh.b;
                this.i.left -= rect.left;
                this.i.right += rect.right;
                this.i.top -= rect.top;
                android.graphics.Rect rect2 = this.i;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        defpackage.afd afd = this.l;
        android.graphics.Rect rect3 = this.i;
        boolean z3 = !this.q;
        if (view2 != null) {
            z2 = false;
        }
        afd.a(this, view, rect3, z3, z2);
    }

    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z2) {
        return this.l.a(this, view, rect, z2, false);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, android.graphics.Rect rect) {
        if (u()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r0 >= 30.0f) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            super.onAttachedToWindow()
            r4.af = r1
            r4.o = r0
            boolean r2 = r4.q
            if (r2 == 0) goto L_0x006c
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x006c
        L_0x0013:
            r4.q = r0
            afd r0 = r4.l
            if (r0 == 0) goto L_0x001e
            afd r0 = r4.l
            r0.i()
        L_0x001e:
            r4.I = r1
            boolean r0 = d
            if (r0 == 0) goto L_0x006b
            java.lang.ThreadLocal r0 = defpackage.adr.a
            java.lang.Object r0 = r0.get()
            adr r0 = (defpackage.adr) r0
            r4.B = r0
            adr r0 = r4.B
            if (r0 != 0) goto L_0x0064
            adr r0 = new adr
            r0.<init>()
            r4.B = r0
            sw r0 = defpackage.sn.a
            android.view.Display r0 = r0.o(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x006e
            if (r0 == 0) goto L_0x006e
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x006e
        L_0x0053:
            adr r1 = r4.B
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r2 / r0
            long r2 = (long) r0
            r1.c = r2
            java.lang.ThreadLocal r0 = defpackage.adr.a
            adr r1 = r4.B
            r0.set(r1)
        L_0x0064:
            adr r0 = r4.B
            java.util.ArrayList r0 = r0.b
            r0.add(r4)
        L_0x006b:
            return
        L_0x006c:
            r0 = r1
            goto L_0x0013
        L_0x006e:
            r0 = r1
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.z != null) {
            this.z.d();
        }
        q();
        this.o = false;
        if (this.l != null) {
            this.l.j();
        }
        this.az.clear();
        removeCallbacks(this.aA);
        do {
        } while (defpackage.ahp.d.a() != null);
        if (d && this.B != null) {
            this.B.b.remove(this);
            this.B = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.o;
    }

    public final void a(java.lang.String str) {
        if (u()) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + a());
            }
            throw new java.lang.IllegalStateException(str);
        } else if (this.ag > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException(a()));
        }
    }

    public final void a(defpackage.afj afj) {
        this.U.add(afj);
    }

    public final void b(defpackage.afj afj) {
        this.U.remove(afj);
        if (this.V == afj) {
            this.V = null;
        }
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int i2;
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.V = null;
        }
        int size = this.U.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            defpackage.afj afj = (defpackage.afj) this.U.get(i3);
            if (afj.a(motionEvent) && action != 3) {
                this.V = afj;
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            t();
            return true;
        } else if (this.l == null) {
            return false;
        } else {
            boolean d2 = this.l.d();
            boolean e2 = this.l.e();
            if (this.ai == null) {
                this.ai = android.view.VelocityTracker.obtain();
            }
            this.ai.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    this.ah = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.al = x2;
                    this.aj = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.am = y2;
                    this.ak = y2;
                    if (this.A == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        b(1);
                    }
                    int[] iArr = this.ay;
                    this.ay[1] = 0;
                    iArr[0] = 0;
                    if (d2) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (e2) {
                        i2 |= 2;
                    }
                    d(i2, 0);
                    break;
                case 1:
                    this.ai.clear();
                    a(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.ah);
                    if (findPointerIndex >= 0) {
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.A != 1) {
                            int i4 = x3 - this.aj;
                            int i5 = y3 - this.ak;
                            if (!d2 || java.lang.Math.abs(i4) <= this.an) {
                                z3 = false;
                            } else {
                                this.al = x3;
                                z3 = true;
                            }
                            if (e2 && java.lang.Math.abs(i5) > this.an) {
                                this.am = y3;
                                z3 = true;
                            }
                            if (z3) {
                                b(1);
                                break;
                            }
                        }
                    } else {
                        android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    break;
                case 3:
                    t();
                    break;
                case 5:
                    this.ah = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.al = x4;
                    this.aj = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.am = y4;
                    this.ak = y4;
                    break;
                case 6:
                    a(motionEvent);
                    break;
            }
            if (this.A == 1) {
                return true;
            }
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.afj) this.U.get(i2)).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022a, code lost:
        if (r0 != false) goto L_0x0230;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r0 = r15.getAction()
            afj r1 = r14.V
            if (r1 == 0) goto L_0x000d
            if (r0 != 0) goto L_0x0031
            r1 = 0
            r14.V = r1
        L_0x000d:
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r0 = r14.U
            int r2 = r0.size()
            r0 = 0
            r1 = r0
        L_0x0017:
            if (r1 >= r2) goto L_0x0045
            java.util.ArrayList r0 = r14.U
            java.lang.Object r0 = r0.get(r1)
            afj r0 = (defpackage.afj) r0
            boolean r3 = r0.a(r15)
            if (r3 == 0) goto L_0x0041
            r14.V = r0
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x0047
            r14.t()
            r0 = 1
        L_0x0030:
            return r0
        L_0x0031:
            afj r1 = r14.V
            r1.b(r15)
            r1 = 3
            if (r0 == r1) goto L_0x003c
            r1 = 1
            if (r0 != r1) goto L_0x003f
        L_0x003c:
            r0 = 0
            r14.V = r0
        L_0x003f:
            r0 = 1
            goto L_0x002a
        L_0x0041:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0017
        L_0x0045:
            r0 = 0
            goto L_0x002a
        L_0x0047:
            afd r0 = r14.l
            if (r0 != 0) goto L_0x004d
            r0 = 0
            goto L_0x0030
        L_0x004d:
            afd r0 = r14.l
            boolean r7 = r0.d()
            afd r0 = r14.l
            boolean r8 = r0.e()
            android.view.VelocityTracker r0 = r14.ai
            if (r0 != 0) goto L_0x0063
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r14.ai = r0
        L_0x0063:
            r6 = 0
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r15)
            int r0 = r15.getActionMasked()
            int r1 = r15.getActionIndex()
            if (r0 != 0) goto L_0x007d
            int[] r2 = r14.ay
            r3 = 0
            int[] r4 = r14.ay
            r5 = 1
            r9 = 0
            r4[r5] = r9
            r2[r3] = r9
        L_0x007d:
            int[] r2 = r14.ay
            r3 = 0
            r2 = r2[r3]
            float r2 = (float) r2
            int[] r3 = r14.ay
            r4 = 1
            r3 = r3[r4]
            float r3 = (float) r3
            r10.offsetLocation(r2, r3)
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x01eb;
                case 2: goto L_0x00e9;
                case 3: goto L_0x02c3;
                case 4: goto L_0x008f;
                case 5: goto L_0x00c9;
                case 6: goto L_0x01e5;
                default: goto L_0x008f;
            }
        L_0x008f:
            r0 = r6
        L_0x0090:
            if (r0 != 0) goto L_0x0097
            android.view.VelocityTracker r0 = r14.ai
            r0.addMovement(r10)
        L_0x0097:
            r10.recycle()
            r0 = 1
            goto L_0x0030
        L_0x009c:
            r0 = 0
            int r0 = r15.getPointerId(r0)
            r14.ah = r0
            float r0 = r15.getX()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r14.al = r0
            r14.aj = r0
            float r0 = r15.getY()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r14.am = r0
            r14.ak = r0
            r0 = 0
            if (r7 == 0) goto L_0x00bf
            r0 = 1
        L_0x00bf:
            if (r8 == 0) goto L_0x00c3
            r0 = r0 | 2
        L_0x00c3:
            r1 = 0
            r14.d(r0, r1)
            r0 = r6
            goto L_0x0090
        L_0x00c9:
            int r0 = r15.getPointerId(r1)
            r14.ah = r0
            float r0 = r15.getX(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            r14.al = r0
            r14.aj = r0
            float r0 = r15.getY(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r14.am = r0
            r14.ak = r0
            r0 = r6
            goto L_0x0090
        L_0x00e9:
            int r0 = r14.ah
            int r0 = r15.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0110
            java.lang.String r0 = "RecyclerView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r14.ah
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x0030
        L_0x0110:
            float r1 = r15.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r9 = (int) r1
            float r0 = r15.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r11 = (int) r0
            int r0 = r14.al
            int r1 = r0 - r9
            int r0 = r14.am
            int r2 = r0 - r11
            int[] r3 = r14.K
            int[] r4 = r14.ax
            r5 = 0
            r0 = r14
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0169
            int[] r0 = r14.K
            r3 = 0
            r0 = r0[r3]
            int r1 = r1 - r0
            int[] r0 = r14.K
            r3 = 1
            r0 = r0[r3]
            int r2 = r2 - r0
            int[] r0 = r14.ax
            r3 = 0
            r0 = r0[r3]
            float r0 = (float) r0
            int[] r3 = r14.ax
            r4 = 1
            r3 = r3[r4]
            float r3 = (float) r3
            r10.offsetLocation(r0, r3)
            int[] r0 = r14.ay
            r3 = 0
            r4 = r0[r3]
            int[] r5 = r14.ax
            r12 = 0
            r5 = r5[r12]
            int r4 = r4 + r5
            r0[r3] = r4
            int[] r0 = r14.ay
            r3 = 1
            r4 = r0[r3]
            int[] r5 = r14.ax
            r12 = 1
            r5 = r5[r12]
            int r4 = r4 + r5
            r0[r3] = r4
        L_0x0169:
            int r0 = r14.A
            r3 = 1
            if (r0 == r3) goto L_0x019d
            r0 = 0
            if (r7 == 0) goto L_0x0183
            int r3 = java.lang.Math.abs(r1)
            int r4 = r14.an
            if (r3 <= r4) goto L_0x0183
            if (r1 <= 0) goto L_0x01d8
            int r0 = r14.an
            int r0 = r1 - r0
        L_0x017f:
            r1 = 1
            r13 = r1
            r1 = r0
            r0 = r13
        L_0x0183:
            if (r8 == 0) goto L_0x0197
            int r3 = java.lang.Math.abs(r2)
            int r4 = r14.an
            if (r3 <= r4) goto L_0x0197
            if (r2 <= 0) goto L_0x01dc
            int r0 = r14.an
            int r0 = r2 - r0
        L_0x0193:
            r2 = 1
            r13 = r2
            r2 = r0
            r0 = r13
        L_0x0197:
            if (r0 == 0) goto L_0x019d
            r0 = 1
            r14.b(r0)
        L_0x019d:
            int r0 = r14.A
            r3 = 1
            if (r0 != r3) goto L_0x01d5
            int[] r0 = r14.ax
            r3 = 0
            r0 = r0[r3]
            int r0 = r9 - r0
            r14.al = r0
            int[] r0 = r14.ax
            r3 = 1
            r0 = r0[r3]
            int r0 = r11 - r0
            r14.am = r0
            if (r7 == 0) goto L_0x01e0
            r3 = r1
        L_0x01b7:
            if (r8 == 0) goto L_0x01e3
            r0 = r2
        L_0x01ba:
            boolean r0 = r14.a(r3, r0, r10)
            if (r0 == 0) goto L_0x01c8
            android.view.ViewParent r0 = r14.getParent()
            r3 = 1
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x01c8:
            adr r0 = r14.B
            if (r0 == 0) goto L_0x01d5
            if (r1 != 0) goto L_0x01d0
            if (r2 == 0) goto L_0x01d5
        L_0x01d0:
            adr r0 = r14.B
            r0.a(r14, r1, r2)
        L_0x01d5:
            r0 = r6
            goto L_0x0090
        L_0x01d8:
            int r0 = r14.an
            int r0 = r0 + r1
            goto L_0x017f
        L_0x01dc:
            int r0 = r14.an
            int r0 = r0 + r2
            goto L_0x0193
        L_0x01e0:
            r0 = 0
            r3 = r0
            goto L_0x01b7
        L_0x01e3:
            r0 = 0
            goto L_0x01ba
        L_0x01e5:
            r14.a(r15)
            r0 = r6
            goto L_0x0090
        L_0x01eb:
            android.view.VelocityTracker r0 = r14.ai
            r0.addMovement(r10)
            r9 = 1
            android.view.VelocityTracker r0 = r14.ai
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r14.ap
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            if (r7 == 0) goto L_0x0236
            android.view.VelocityTracker r0 = r14.ai
            int r1 = r14.ah
            float r0 = r0.getXVelocity(r1)
            float r0 = -r0
            r1 = r0
        L_0x0207:
            if (r8 == 0) goto L_0x0239
            android.view.VelocityTracker r0 = r14.ai
            int r2 = r14.ah
            float r0 = r0.getYVelocity(r2)
            float r0 = -r0
        L_0x0212:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x021c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x022c
        L_0x021c:
            int r1 = (int) r1
            int r0 = (int) r0
            afd r2 = r14.l
            if (r2 != 0) goto L_0x023b
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
        L_0x0229:
            r0 = 0
        L_0x022a:
            if (r0 != 0) goto L_0x0230
        L_0x022c:
            r0 = 0
            r14.b(r0)
        L_0x0230:
            r14.s()
            r0 = r9
            goto L_0x0090
        L_0x0236:
            r0 = 0
            r1 = r0
            goto L_0x0207
        L_0x0239:
            r0 = 0
            goto L_0x0212
        L_0x023b:
            afd r2 = r14.l
            boolean r3 = r2.d()
            afd r2 = r14.l
            boolean r4 = r2.e()
            if (r3 == 0) goto L_0x0251
            int r2 = java.lang.Math.abs(r1)
            int r5 = r14.ao
            if (r2 >= r5) goto L_0x02ca
        L_0x0251:
            r1 = 0
            r2 = r1
        L_0x0253:
            if (r4 == 0) goto L_0x025d
            int r1 = java.lang.Math.abs(r0)
            int r5 = r14.ao
            if (r1 >= r5) goto L_0x02c8
        L_0x025d:
            r0 = 0
            r1 = r0
        L_0x025f:
            if (r2 != 0) goto L_0x0263
            if (r1 == 0) goto L_0x0229
        L_0x0263:
            float r0 = (float) r2
            float r5 = (float) r1
            boolean r0 = r14.dispatchNestedPreFling(r0, r5)
            if (r0 != 0) goto L_0x0229
            if (r3 != 0) goto L_0x026f
            if (r4 == 0) goto L_0x02c1
        L_0x026f:
            r0 = 1
        L_0x0270:
            float r5 = (float) r2
            float r6 = (float) r1
            r14.dispatchNestedFling(r5, r6, r0)
            if (r0 == 0) goto L_0x0229
            r0 = 0
            if (r3 == 0) goto L_0x027b
            r0 = 1
        L_0x027b:
            if (r4 == 0) goto L_0x027f
            r0 = r0 | 2
        L_0x027f:
            r3 = 1
            r14.d(r0, r3)
            int r0 = r14.ap
            int r0 = -r0
            int r3 = r14.ap
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = java.lang.Math.max(r0, r2)
            int r0 = r14.ap
            int r0 = -r0
            int r2 = r14.ap
            int r1 = java.lang.Math.min(r1, r2)
            int r4 = java.lang.Math.max(r0, r1)
            afu r11 = r14.at
            android.support.v7.widget.RecyclerView r0 = r11.e
            r1 = 2
            r0.b(r1)
            r0 = 0
            r11.b = r0
            r11.a = r0
            android.widget.OverScroller r0 = r11.c
            r1 = 0
            r2 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.a()
            r0 = 1
            goto L_0x022a
        L_0x02c1:
            r0 = 0
            goto L_0x0270
        L_0x02c3:
            r14.t()
            goto L_0x008f
        L_0x02c8:
            r1 = r0
            goto L_0x025f
        L_0x02ca:
            r2 = r1
            goto L_0x0253
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void s() {
        boolean z2 = false;
        if (this.ai != null) {
            this.ai.clear();
        }
        a(0);
        if (this.v != null) {
            this.v.onRelease();
            z2 = this.v.isFinished();
        }
        if (this.w != null) {
            this.w.onRelease();
            z2 |= this.w.isFinished();
        }
        if (this.x != null) {
            this.x.onRelease();
            z2 |= this.x.isFinished();
        }
        if (this.y != null) {
            this.y.onRelease();
            z2 |= this.y.isFinished();
        }
        if (z2) {
            defpackage.sn.a.c(this);
        }
    }

    private final void t() {
        s();
        b(0);
    }

    private final void a(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ah) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.ah = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.al = x2;
            this.aj = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.am = y2;
            this.ak = y2;
        }
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float f2;
        float f3;
        float f4;
        if (this.l != null && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.l.e()) {
                    f4 = -motionEvent.getAxisValue(9);
                } else {
                    f4 = 0.0f;
                }
                if (this.l.d()) {
                    f3 = f4;
                    f2 = motionEvent.getAxisValue(10);
                } else {
                    f3 = f4;
                    f2 = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f2 = motionEvent.getAxisValue(26);
                if (this.l.e()) {
                    f3 = -f2;
                    f2 = 0.0f;
                } else if (this.l.d()) {
                    f3 = 0.0f;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (!(f3 == 0.0f && f2 == 0.0f)) {
                a((int) (f2 * this.aq), (int) (this.ar * f3), motionEvent);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z2 = false;
        if (this.l == null) {
            c(i2, i3);
        } else if (this.l.a()) {
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int mode2 = android.view.View.MeasureSpec.getMode(i3);
            this.l.c(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.k != null) {
                if (this.D.d == 1) {
                    A();
                }
                this.l.a(i2, i3);
                this.D.i = true;
                B();
                this.l.b(i2, i3);
                if (this.l.f()) {
                    this.l.a(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.D.i = true;
                    B();
                    this.l.b(i2, i3);
                }
            }
        } else {
            if (this.s) {
                d();
                i();
                w();
                b(true);
                if (this.D.k) {
                    this.D.g = true;
                } else {
                    this.f.e();
                    this.D.g = false;
                }
                this.s = false;
                a(false);
            } else if (this.D.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.k != null) {
                this.D.e = this.k.a();
            } else {
                this.D.e = 0;
            }
            d();
            this.l.c(i2, i3);
            a(false);
            this.D.g = false;
        }
    }

    public final void c(int i2, int i3) {
        setMeasuredDimension(defpackage.afd.a(i2, getPaddingLeft() + getPaddingRight(), defpackage.sn.a.e(this)), defpackage.afd.a(i3, getPaddingTop() + getPaddingBottom(), defpackage.sn.a.f(this)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            r();
        }
    }

    public final void i() {
        this.af++;
    }

    public final void b(boolean z2) {
        this.af--;
        if (this.af <= 0) {
            this.af = 0;
            if (z2) {
                int i2 = this.ac;
                this.ac = 0;
                if (i2 != 0 && j()) {
                    android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    if (android.os.Build.VERSION.SDK_INT >= 19) {
                        obtain.setContentChangeTypes(i2);
                    }
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.az.size() - 1; size >= 0; size--) {
                    defpackage.afv afv = (defpackage.afv) this.az.get(size);
                    if (afv.a.getParent() == this && !afv.b()) {
                        int i3 = afv.n;
                        if (i3 != -1) {
                            defpackage.sn.a(afv.a, i3);
                            afv.n = -1;
                        }
                    }
                }
                this.az.clear();
            }
        }
    }

    public final boolean j() {
        return this.ad != null && this.ad.isEnabled();
    }

    private final boolean u() {
        return this.af > 0;
    }

    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        int i2;
        int i3 = 0;
        if (u()) {
            if (accessibilityEvent == null) {
                i2 = 0;
            } else if (android.os.Build.VERSION.SDK_INT >= 19) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i3 = i2;
            }
            this.ac |= i3;
            i3 = 1;
        }
        if (i3 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public final void k() {
        if (!this.I && this.o) {
            defpackage.sn.a((android.view.View) this, this.aA);
            this.I = true;
        }
    }

    private final boolean v() {
        return this.z != null && this.l.g();
    }

    private final void w() {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.u) {
            this.f.a();
        }
        if (v()) {
            this.f.b();
        } else {
            this.f.e();
        }
        if (this.F || this.G) {
            z2 = true;
        } else {
            z2 = false;
        }
        defpackage.aft aft = this.D;
        if (!this.q || this.z == null || ((!this.u && !z2 && !this.l.e) || (this.u && !this.k.e))) {
            z3 = false;
        } else {
            z3 = true;
        }
        aft.j = z3;
        defpackage.aft aft2 = this.D;
        if (!this.D.j || !z2 || this.u || !v()) {
            z4 = false;
        }
        aft2.k = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x032a, code lost:
        if (r10.g.d(getFocusedChild()) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03a9, code lost:
        if (r0.isFocusable() != false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0406, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x() {
        /*
            r10 = this;
            aet r0 = r10.k
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r0, r1)
        L_0x000b:
            return
        L_0x000c:
            afd r0 = r10.l
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r0, r1)
            goto L_0x000b
        L_0x0018:
            aft r0 = r10.D
            r1 = 0
            r0.i = r1
            aft r0 = r10.D
            int r0 = r0.d
            r1 = 1
            if (r0 != r1) goto L_0x0104
            r10.A()
            afd r0 = r10.l
            r0.b(r10)
            r10.B()
        L_0x002f:
            aft r0 = r10.D
            r1 = 4
            r0.a(r1)
            r10.d()
            r10.i()
            aft r0 = r10.D
            r1 = 1
            r0.d = r1
            aft r0 = r10.D
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0272
            acm r0 = r10.g
            int r0 = r0.a()
            int r0 = r0 + -1
            r2 = r0
        L_0x004f:
            if (r2 < 0) goto L_0x01c8
            acm r0 = r10.g
            android.view.View r0 = r0.b(r2)
            afv r3 = c(r0)
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x0191
            long r4 = r10.d(r3)
            afb r1 = new afb
            r1.<init>()
            android.view.View r0 = r3.a
            int r6 = r0.getLeft()
            r1.a = r6
            int r6 = r0.getTop()
            r1.b = r6
            r0.getRight()
            r0.getBottom()
            aho r0 = r10.h
            qx r0 = r0.b
            java.lang.Object r0 = r0.a(r4)
            afv r0 = (defpackage.afv) r0
            if (r0 == 0) goto L_0x01c2
            boolean r6 = r0.b()
            if (r6 != 0) goto L_0x01c2
            aho r6 = r10.h
            boolean r6 = r6.a(r0)
            aho r7 = r10.h
            boolean r7 = r7.a(r3)
            if (r6 == 0) goto L_0x00a0
            if (r0 == r3) goto L_0x01c2
        L_0x00a0:
            aho r8 = r10.h
            r9 = 4
            afb r8 = r8.a(r0, r9)
            aho r9 = r10.h
            r9.b(r3, r1)
            aho r1 = r10.h
            r9 = 8
            afb r1 = r1.a(r3, r9)
            if (r8 != 0) goto L_0x0196
            acm r1 = r10.g
            int r6 = r1.a()
            r1 = 0
        L_0x00bd:
            if (r1 >= r6) goto L_0x016b
            acm r7 = r10.g
            android.view.View r7 = r7.b(r1)
            afv r7 = c(r7)
            if (r7 == r3) goto L_0x0167
            long r8 = r10.d(r7)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0167
            aet r0 = r10.k
            if (r0 == 0) goto L_0x0140
            aet r0 = r10.k
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0140
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = r10.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0104:
            aeo r0 = r10.f
            java.util.ArrayList r1 = r0.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0137
            java.util.ArrayList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0137
            r0 = 1
        L_0x0117:
            if (r0 != 0) goto L_0x012d
            afd r0 = r10.l
            int r0 = r0.l
            int r1 = r10.getWidth()
            if (r0 != r1) goto L_0x012d
            afd r0 = r10.l
            int r0 = r0.m
            int r1 = r10.getHeight()
            if (r0 == r1) goto L_0x0139
        L_0x012d:
            afd r0 = r10.l
            r0.b(r10)
            r10.B()
            goto L_0x002f
        L_0x0137:
            r0 = 0
            goto L_0x0117
        L_0x0139:
            afd r0 = r10.l
            r0.b(r10)
            goto L_0x002f
        L_0x0140:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " \n View Holder 2:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = r10.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0167:
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x016b:
            java.lang.String r1 = "RecyclerView"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r4.<init>(r5)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = " cannot be found but it is necessary for "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = r10.a()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L_0x0191:
            int r0 = r2 + -1
            r2 = r0
            goto L_0x004f
        L_0x0196:
            r4 = 0
            r0.a(r4)
            if (r6 == 0) goto L_0x019f
            r10.a(r0)
        L_0x019f:
            if (r0 == r3) goto L_0x01b6
            if (r7 == 0) goto L_0x01a6
            r10.a(r3)
        L_0x01a6:
            r0.h = r3
            r10.a(r0)
            afn r4 = r10.e
            r4.b(r0)
            r4 = 0
            r3.a(r4)
            r3.i = r0
        L_0x01b6:
            aey r4 = r10.z
            boolean r0 = r4.a(r0, r3, r8, r1)
            if (r0 == 0) goto L_0x0191
            r10.k()
            goto L_0x0191
        L_0x01c2:
            aho r0 = r10.h
            r0.b(r3, r1)
            goto L_0x0191
        L_0x01c8:
            aho r3 = r10.h
            ahq r4 = r10.aB
            qr r0 = r3.a
            int r0 = r0.size()
            int r0 = r0 + -1
            r2 = r0
        L_0x01d5:
            if (r2 < 0) goto L_0x0272
            qr r0 = r3.a
            java.lang.Object r0 = r0.b(r2)
            afv r0 = (defpackage.afv) r0
            qr r1 = r3.a
            java.lang.Object r1 = r1.d(r2)
            ahp r1 = (defpackage.ahp) r1
            int r5 = r1.a
            r5 = r5 & 3
            r6 = 3
            if (r5 != r6) goto L_0x01f8
            r4.a(r0)
        L_0x01f1:
            defpackage.ahp.a(r1)
            int r0 = r2 + -1
            r2 = r0
            goto L_0x01d5
        L_0x01f8:
            int r5 = r1.a
            r5 = r5 & 1
            if (r5 == 0) goto L_0x020e
            afb r5 = r1.b
            if (r5 != 0) goto L_0x0206
            r4.a(r0)
            goto L_0x01f1
        L_0x0206:
            afb r5 = r1.b
            afb r6 = r1.c
            r4.a(r0, r5, r6)
            goto L_0x01f1
        L_0x020e:
            int r5 = r1.a
            r5 = r5 & 14
            r6 = 14
            if (r5 != r6) goto L_0x021e
            afb r5 = r1.b
            afb r6 = r1.c
            r4.b(r0, r5, r6)
            goto L_0x01f1
        L_0x021e:
            int r5 = r1.a
            r5 = r5 & 12
            r6 = 12
            if (r5 != r6) goto L_0x0254
            afb r5 = r1.b
            afb r6 = r1.c
            r7 = 0
            r0.a(r7)
            android.support.v7.widget.RecyclerView r7 = r4.a
            boolean r7 = r7.u
            if (r7 == 0) goto L_0x0244
            android.support.v7.widget.RecyclerView r7 = r4.a
            aey r7 = r7.z
            boolean r0 = r7.a(r0, r0, r5, r6)
            if (r0 == 0) goto L_0x01f1
            android.support.v7.widget.RecyclerView r0 = r4.a
            r0.k()
            goto L_0x01f1
        L_0x0244:
            android.support.v7.widget.RecyclerView r7 = r4.a
            aey r7 = r7.z
            boolean r0 = r7.c(r0, r5, r6)
            if (r0 == 0) goto L_0x01f1
            android.support.v7.widget.RecyclerView r0 = r4.a
            r0.k()
            goto L_0x01f1
        L_0x0254:
            int r5 = r1.a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0261
            afb r5 = r1.b
            r6 = 0
            r4.a(r0, r5, r6)
            goto L_0x01f1
        L_0x0261:
            int r5 = r1.a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x026f
            afb r5 = r1.b
            afb r6 = r1.c
            r4.b(r0, r5, r6)
            goto L_0x01f1
        L_0x026f:
            int r0 = r1.a
            goto L_0x01f1
        L_0x0272:
            afd r0 = r10.l
            afn r1 = r10.e
            r0.a(r1)
            aft r0 = r10.D
            aft r1 = r10.D
            int r1 = r1.e
            r0.b = r1
            r0 = 0
            r10.u = r0
            r0 = 0
            r10.ae = r0
            aft r0 = r10.D
            r1 = 0
            r0.j = r1
            aft r0 = r10.D
            r1 = 0
            r0.k = r1
            afd r0 = r10.l
            r1 = 0
            r0.e = r1
            afn r0 = r10.e
            java.util.ArrayList r0 = r0.b
            if (r0 == 0) goto L_0x02a3
            afn r0 = r10.e
            java.util.ArrayList r0 = r0.b
            r0.clear()
        L_0x02a3:
            afd r0 = r10.l
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x02b8
            afd r0 = r10.l
            r1 = 0
            r0.h = r1
            afd r0 = r10.l
            r1 = 0
            r0.i = r1
            afn r0 = r10.e
            r0.b()
        L_0x02b8:
            afd r0 = r10.l
            aft r1 = r10.D
            r0.a(r1)
            r0 = 1
            r10.b(r0)
            r0 = 0
            r10.a(r0)
            aho r0 = r10.h
            r0.a()
            int[] r0 = r10.av
            r1 = 0
            r0 = r0[r1]
            int[] r1 = r10.av
            r2 = 1
            r1 = r1[r2]
            int[] r2 = r10.av
            r10.a(r2)
            int[] r2 = r10.av
            r3 = 0
            r2 = r2[r3]
            if (r2 != r0) goto L_0x02e9
            int[] r0 = r10.av
            r2 = 1
            r0 = r0[r2]
            if (r0 == r1) goto L_0x0318
        L_0x02e9:
            r0 = 1
        L_0x02ea:
            if (r0 == 0) goto L_0x02ef
            r10.m()
        L_0x02ef:
            boolean r0 = r10.as
            if (r0 == 0) goto L_0x0313
            aet r0 = r10.k
            if (r0 == 0) goto L_0x0313
            boolean r0 = r10.hasFocus()
            if (r0 == 0) goto L_0x0313
            int r0 = r10.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x0313
            int r0 = r10.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x031a
            boolean r0 = r10.isFocused()
            if (r0 == 0) goto L_0x031a
        L_0x0313:
            r10.y()
            goto L_0x000b
        L_0x0318:
            r0 = 0
            goto L_0x02ea
        L_0x031a:
            boolean r0 = r10.isFocused()
            if (r0 != 0) goto L_0x032c
            android.view.View r0 = r10.getFocusedChild()
            acm r1 = r10.g
            boolean r0 = r1.d(r0)
            if (r0 == 0) goto L_0x0313
        L_0x032c:
            r0 = 0
            aft r1 = r10.D
            long r2 = r1.m
            r4 = -1
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x034c
            aet r1 = r10.k
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x034c
            aft r0 = r10.D
            long r4 = r0.m
            aet r0 = r10.k
            if (r0 == 0) goto L_0x034b
            aet r0 = r10.k
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x03b0
        L_0x034b:
            r0 = 0
        L_0x034c:
            r1 = 0
            if (r0 == 0) goto L_0x0361
            acm r2 = r10.g
            android.view.View r3 = r0.a
            boolean r2 = r2.d(r3)
            if (r2 != 0) goto L_0x0361
            android.view.View r2 = r0.a
            boolean r2 = r2.hasFocusable()
            if (r2 != 0) goto L_0x0408
        L_0x0361:
            acm r0 = r10.g
            int r0 = r0.a()
            if (r0 <= 0) goto L_0x038e
            aft r0 = r10.D
            int r0 = r0.l
            r1 = -1
            if (r0 == r1) goto L_0x03e5
            aft r0 = r10.D
            int r0 = r0.l
        L_0x0374:
            aft r1 = r10.D
            int r2 = r1.a()
            r1 = r0
        L_0x037b:
            if (r1 >= r2) goto L_0x03ea
            afv r3 = r10.d(r1)
            if (r3 == 0) goto L_0x03ea
            android.view.View r4 = r3.a
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L_0x03e7
            android.view.View r0 = r3.a
        L_0x038d:
            r1 = r0
        L_0x038e:
            if (r1 == 0) goto L_0x0313
            aft r0 = r10.D
            int r0 = r0.n
            long r2 = (long) r0
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x040b
            aft r0 = r10.D
            int r0 = r0.n
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x040b
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L_0x040b
        L_0x03ab:
            r0.requestFocus()
            goto L_0x0313
        L_0x03b0:
            acm r0 = r10.g
            int r3 = r0.b()
            r1 = 0
            r0 = 0
            r2 = r0
        L_0x03b9:
            if (r2 >= r3) goto L_0x03e2
            acm r0 = r10.g
            android.view.View r0 = r0.c(r2)
            afv r0 = c(r0)
            if (r0 == 0) goto L_0x040d
            boolean r6 = r0.m()
            if (r6 != 0) goto L_0x040d
            long r6 = r0.e
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x040d
            acm r1 = r10.g
            android.view.View r6 = r0.a
            boolean r1 = r1.d(r6)
            if (r1 == 0) goto L_0x034c
        L_0x03dd:
            int r1 = r2 + 1
            r2 = r1
            r1 = r0
            goto L_0x03b9
        L_0x03e2:
            r0 = r1
            goto L_0x034c
        L_0x03e5:
            r0 = 0
            goto L_0x0374
        L_0x03e7:
            int r1 = r1 + 1
            goto L_0x037b
        L_0x03ea:
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + -1
        L_0x03f0:
            if (r0 < 0) goto L_0x0406
            afv r1 = r10.d(r0)
            if (r1 == 0) goto L_0x0406
            android.view.View r2 = r1.a
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x0403
            android.view.View r0 = r1.a
            goto L_0x038d
        L_0x0403:
            int r0 = r0 + -1
            goto L_0x03f0
        L_0x0406:
            r0 = 0
            goto L_0x038d
        L_0x0408:
            android.view.View r1 = r0.a
            goto L_0x038e
        L_0x040b:
            r0 = r1
            goto L_0x03ab
        L_0x040d:
            r0 = r1
            goto L_0x03dd
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.x():void");
    }

    private final void y() {
        this.D.m = -1;
        this.D.l = -1;
        this.D.n = -1;
    }

    private final void z() {
        if (this.A == 2) {
            android.widget.OverScroller overScroller = this.at.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    private final void A() {
        android.view.View view;
        long j2;
        int d2;
        int i2;
        boolean z2;
        this.D.a(1);
        z();
        this.D.i = false;
        d();
        this.h.a();
        i();
        w();
        if (!this.as || !hasFocus() || this.k == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        defpackage.afv b2 = view == null ? null : b(view);
        if (b2 == null) {
            y();
        } else {
            defpackage.aft aft = this.D;
            if (this.k.e) {
                j2 = b2.e;
            } else {
                j2 = -1;
            }
            aft.m = j2;
            defpackage.aft aft2 = this.D;
            if (this.u) {
                d2 = -1;
            } else if (b2.m()) {
                d2 = b2.d;
            } else {
                d2 = b2.d();
            }
            aft2.l = d2;
            defpackage.aft aft3 = this.D;
            android.view.View view2 = b2.a;
            android.view.View view3 = view2;
            int id = view2.getId();
            while (!view3.isFocused() && (view3 instanceof android.view.ViewGroup) && view3.hasFocus()) {
                android.view.View focusedChild = ((android.view.ViewGroup) view3).getFocusedChild();
                if (focusedChild.getId() != -1) {
                    i2 = focusedChild.getId();
                } else {
                    i2 = id;
                }
                id = i2;
                view3 = focusedChild;
            }
            aft3.n = id;
        }
        defpackage.aft aft4 = this.D;
        if (!this.D.j || !this.G) {
            z2 = false;
        } else {
            z2 = true;
        }
        aft4.h = z2;
        this.G = false;
        this.F = false;
        this.D.g = this.D.k;
        this.D.e = this.k.a();
        a(this.av);
        if (this.D.j) {
            int a2 = this.g.a();
            for (int i3 = 0; i3 < a2; i3++) {
                defpackage.afv c2 = c(this.g.b(i3));
                if (!c2.b() && (!c2.j() || this.k.e)) {
                    defpackage.aey.d(c2);
                    c2.p();
                    defpackage.afb afb = new defpackage.afb();
                    android.view.View view4 = c2.a;
                    afb.a = view4.getLeft();
                    afb.b = view4.getTop();
                    view4.getRight();
                    view4.getBottom();
                    this.h.a(c2, afb);
                    if (this.D.h && c2.s() && !c2.m() && !c2.b() && !c2.j()) {
                        this.h.a(d(c2), c2);
                    }
                }
            }
        }
        if (this.D.k) {
            int b3 = this.g.b();
            for (int i4 = 0; i4 < b3; i4++) {
                defpackage.afv c3 = c(this.g.c(i4));
                if (!c3.b() && c3.d == -1) {
                    c3.d = c3.c;
                }
            }
            boolean z3 = this.D.f;
            this.D.f = false;
            this.l.a(this.e, this.D);
            this.D.f = z3;
            for (int i5 = 0; i5 < this.g.a(); i5++) {
                defpackage.afv c4 = c(this.g.b(i5));
                if (!c4.b()) {
                    defpackage.ahp ahp = (defpackage.ahp) this.h.a.get(c4);
                    if (!((ahp == null || (ahp.a & 4) == 0) ? false : true)) {
                        defpackage.aey.d(c4);
                        boolean a3 = c4.a(8192);
                        c4.p();
                        defpackage.afb afb2 = new defpackage.afb();
                        android.view.View view5 = c4.a;
                        afb2.a = view5.getLeft();
                        afb2.b = view5.getTop();
                        view5.getRight();
                        view5.getBottom();
                        if (a3) {
                            a(c4, afb2);
                        } else {
                            defpackage.aho aho = this.h;
                            defpackage.ahp ahp2 = (defpackage.ahp) aho.a.get(c4);
                            if (ahp2 == null) {
                                ahp2 = defpackage.ahp.a();
                                aho.a.put(c4, ahp2);
                            }
                            ahp2.a |= 2;
                            ahp2.b = afb2;
                        }
                    }
                }
            }
            C();
        } else {
            C();
        }
        b(true);
        a(false);
        this.D.d = 2;
    }

    private final void B() {
        d();
        i();
        this.D.a(6);
        this.f.e();
        this.D.e = this.k.a();
        this.D.c = 0;
        this.D.g = false;
        this.l.a(this.e, this.D);
        this.D.f = false;
        this.R = null;
        this.D.j = this.D.j && this.z != null;
        this.D.d = 4;
        b(true);
        a(false);
    }

    public final void a(defpackage.afv afv, defpackage.afb afb) {
        afv.a(0, 8192);
        if (this.D.h && afv.s() && !afv.m() && !afv.b()) {
            this.h.a(d(afv), afv);
        }
        this.h.a(afv, afb);
    }

    private final void a(int[] iArr) {
        int i2;
        int a2 = this.g.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        while (i5 < a2) {
            defpackage.afv c2 = c(this.g.b(i5));
            if (!c2.b()) {
                i2 = c2.c();
                if (i2 < i3) {
                    i3 = i2;
                }
                if (i2 > i4) {
                    i5++;
                    i3 = i3;
                    i4 = i2;
                }
            }
            i2 = i4;
            i5++;
            i3 = i3;
            i4 = i2;
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public void removeDetachedView(android.view.View view, boolean z2) {
        defpackage.afv c2 = c(view);
        if (c2 != null) {
            if (c2.n()) {
                c2.i();
            } else if (!c2.b()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c2 + a());
            }
        }
        view.clearAnimation();
        g(view);
        super.removeDetachedView(view, z2);
    }

    private final long d(defpackage.afv afv) {
        if (this.k.e) {
            return afv.e;
        }
        return (long) afv.c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        defpackage.jd.c("RV OnLayout");
        x();
        defpackage.jd.b();
        this.q = true;
    }

    public void requestLayout() {
        if (this.aa == 0) {
            super.requestLayout();
        } else {
            this.ab = true;
        }
    }

    public final void l() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((defpackage.afh) this.g.c(i2).getLayoutParams()).c = true;
        }
        defpackage.afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.afh afh = (defpackage.afh) ((defpackage.afv) afn.c.get(i3)).a.getLayoutParams();
            if (afh != null) {
                afh.c = true;
            }
        }
    }

    public void draw(android.graphics.Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        super.draw(canvas);
        int size = this.n.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.afc) this.n.get(i3)).a(canvas, this);
        }
        if (this.v == null || this.v.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int i4 = this.S ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (i4 + (-getHeight())), 0.0f);
            if (this.v == null || !this.v.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            canvas.restoreToCount(save);
        }
        if (this.w != null && !this.w.isFinished()) {
            int save2 = canvas.save();
            if (this.S) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.w == null || !this.w.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        if (this.x != null && !this.x.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.S) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            if (this.x == null || !this.x.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        if (this.y != null && !this.y.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.S) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.y != null && this.y.draw(canvas)) {
                z6 = true;
            }
            z2 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.z == null || this.n.size() <= 0 || !this.z.b()) {
            z5 = z2;
        }
        if (z5) {
            defpackage.sn.a.c(this);
        }
    }

    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.afc) this.n.get(i2)).b(canvas, this);
        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.afh) && this.l.a((defpackage.afh) layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.l != null) {
            return this.l.b();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        if (this.l != null) {
            return this.l.a(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.l == null) {
            throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + a());
        } else if (layoutParams instanceof defpackage.afh) {
            return new defpackage.afh((defpackage.afh) layoutParams);
        } else {
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new defpackage.afh((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new defpackage.afh(layoutParams);
        }
    }

    private final void C() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            defpackage.afv c2 = c(this.g.c(i2));
            if (!c2.b()) {
                c2.a();
            }
        }
        defpackage.afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.afv) afn.c.get(i3)).a();
        }
        int size2 = afn.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((defpackage.afv) afn.a.get(i4)).a();
        }
        if (afn.b != null) {
            int size3 = afn.b.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((defpackage.afv) afn.b.get(i5)).a();
            }
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.g.b();
        for (int i5 = 0; i5 < b2; i5++) {
            defpackage.afv c2 = c(this.g.c(i5));
            if (c2 != null && !c2.b()) {
                if (c2.c >= i4) {
                    c2.a(-i3, z2);
                    this.D.f = true;
                } else if (c2.c >= i2) {
                    int i6 = i2 - 1;
                    int i7 = -i3;
                    c2.b(8);
                    c2.a(i7, z2);
                    c2.c = i6;
                    this.D.f = true;
                }
            }
        }
        defpackage.afn afn = this.e;
        int i8 = i2 + i3;
        for (int size = afn.c.size() - 1; size >= 0; size--) {
            defpackage.afv afv = (defpackage.afv) afn.c.get(size);
            if (afv != null) {
                if (afv.c >= i8) {
                    afv.a(-i3, z2);
                } else if (afv.c >= i2) {
                    afv.b(8);
                    afn.a(size);
                }
            }
        }
        requestLayout();
    }

    public final void c(boolean z2) {
        this.ae |= z2;
        this.u = true;
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            defpackage.afv c2 = c(this.g.c(i2));
            if (c2 != null && !c2.b()) {
                c2.b(6);
            }
        }
        l();
        defpackage.afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.afv afv = (defpackage.afv) afn.c.get(i3);
            if (afv != null) {
                afv.b(6);
                afv.a((java.lang.Object) null);
            }
        }
        if (afn.e.k == null || !afn.e.k.e) {
            afn.c();
        }
    }

    public final defpackage.afv a(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return c(view);
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    private final android.view.View h(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.View view2 = view;
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            android.view.View view3 = (android.view.View) parent;
            view2 = view3;
            parent = view3.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    public final defpackage.afv b(android.view.View view) {
        android.view.View h2 = h(view);
        if (h2 == null) {
            return null;
        }
        return a(h2);
    }

    public static defpackage.afv c(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((defpackage.afh) view.getLayoutParams()).a;
    }

    public static int d(android.view.View view) {
        defpackage.afv c2 = c(view);
        if (c2 != null) {
            return c2.d();
        }
        return -1;
    }

    private final defpackage.afv d(int i2) {
        if (this.u) {
            return null;
        }
        int b2 = this.g.b();
        int i3 = 0;
        defpackage.afv afv = null;
        while (i3 < b2) {
            defpackage.afv c2 = c(this.g.c(i3));
            if (c2 == null || c2.m() || c(c2) != i2) {
                c2 = afv;
            } else if (!this.g.d(c2.a)) {
                return c2;
            }
            i3++;
            afv = c2;
        }
        return afv;
    }

    public static void a(android.view.View view, android.graphics.Rect rect) {
        b(view, rect);
    }

    public static void b(android.view.View view, android.graphics.Rect rect) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        android.graphics.Rect rect2 = afh.b;
        rect.set((view.getLeft() - rect2.left) - afh.leftMargin, (view.getTop() - rect2.top) - afh.topMargin, view.getRight() + rect2.right + afh.rightMargin, afh.bottomMargin + rect2.bottom + view.getBottom());
    }

    public final android.graphics.Rect e(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        if (!afh.c) {
            return afh.b;
        }
        if (this.D.g && (afh.a.s() || afh.a.j())) {
            return afh.b;
        }
        android.graphics.Rect rect = afh.b;
        rect.set(0, 0, 0, 0);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.set(0, 0, 0, 0);
            ((defpackage.afc) this.n.get(i2)).a(this.i, view, this);
            rect.left += this.i.left;
            rect.top += this.i.top;
            rect.right += this.i.right;
            rect.bottom += this.i.bottom;
        }
        afh.c = false;
        return rect;
    }

    public final void m() {
        this.ag++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.E != null) {
            for (int size = this.E.size() - 1; size >= 0; size--) {
                ((defpackage.afk) this.E.get(size)).a(this);
            }
        }
        this.ag--;
    }

    public final boolean n() {
        return !this.q || this.u || this.f.d();
    }

    public static android.support.v7.widget.RecyclerView f(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof android.support.v7.widget.RecyclerView) {
            return (android.support.v7.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.support.v7.widget.RecyclerView f2 = f(viewGroup.getChildAt(i2));
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    public static void b(defpackage.afv afv) {
        if (afv.b != null) {
            android.view.View view = (android.view.View) afv.b.get();
            while (view != null) {
                if (view != afv.a) {
                    android.view.ViewParent parent = view.getParent();
                    view = parent instanceof android.view.View ? (android.view.View) parent : null;
                } else {
                    return;
                }
            }
            afv.b = null;
        }
    }

    public static long o() {
        if (d) {
            return java.lang.System.nanoTime();
        }
        return 0;
    }

    public final void g(android.view.View view) {
        defpackage.afv c2 = c(view);
        if (!(this.k == null || c2 == null)) {
            this.k.b(c2);
        }
        if (this.t != null) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                ((defpackage.afi) this.t.get(size)).a(view);
            }
        }
    }

    public final boolean a(defpackage.afv afv, int i2) {
        if (u()) {
            afv.n = i2;
            this.az.add(afv);
            return false;
        }
        defpackage.sn.a(afv.a, i2);
        return true;
    }

    public final int c(defpackage.afv afv) {
        if (afv.a(524) || !afv.l()) {
            return -1;
        }
        defpackage.aeo aeo = this.f;
        int i2 = afv.c;
        int size = aeo.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.abe abe = (defpackage.abe) aeo.a.get(i3);
            switch (abe.a) {
                case 1:
                    if (abe.b > i2) {
                        break;
                    } else {
                        i2 += abe.d;
                        break;
                    }
                case 2:
                    if (abe.b <= i2) {
                        if (abe.b + abe.d <= i2) {
                            i2 -= abe.d;
                            break;
                        } else {
                            return -1;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (abe.b != i2) {
                        if (abe.b < i2) {
                            i2--;
                        }
                        if (abe.d > i2) {
                            break;
                        } else {
                            i2++;
                            break;
                        }
                    } else {
                        i2 = abe.d;
                        break;
                    }
            }
        }
        return i2;
    }

    public void setNestedScrollingEnabled(boolean z2) {
        p().a(z2);
    }

    public boolean isNestedScrollingEnabled() {
        return p().a;
    }

    public boolean startNestedScroll(int i2) {
        return p().a(i2, 0);
    }

    private final boolean d(int i2, int i3) {
        return p().a(i2, i3);
    }

    public void stopNestedScroll() {
        p().b(0);
    }

    public final void a(int i2) {
        p().b(i2);
    }

    public boolean hasNestedScrollingParent() {
        return p().a(0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return p().a(i2, i3, i4, i5, iArr);
    }

    public final boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return p().a(i2, i3, i4, i5, iArr, i6);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return p().a(i2, i3, iArr, iArr2);
    }

    public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return p().a(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return p().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return p().a(f2, f3);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.au == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        defpackage.aew aew = this.au;
        if (aew.a.t == null) {
            return i3;
        }
        int i4 = aew.a.u;
        if (i4 == -1) {
            i4 = aew.a.o.indexOfChild(aew.a.t);
            aew.a.u = i4;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        if (i3 >= i4) {
            return i3 + 1;
        }
        return i3;
    }

    public final defpackage.sh p() {
        if (this.aw == null) {
            this.aw = new defpackage.sh(this);
        }
        return this.aw;
    }

    static {
        boolean z2;
        boolean z3;
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        b = z2;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            z3 = true;
        } else {
            z3 = false;
        }
        d = z3;
    }
}
