package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.apps.tasks.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class RecyclerView extends ViewGroup implements sg {
    public static final Interpolator M = new aes();
    private static final int[] N = {16843830};
    private static final int[] O = {16842987};
    private static final Class[] P = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    public static final boolean a = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);
    public static final boolean b;
    public static final boolean c = true;
    public static final boolean d;
    public int A;
    public adr B;
    public afg C;
    public final aft D;
    public List E;
    public boolean F;
    public boolean G;
    public afa H;
    public boolean I;
    public afw J;
    public final int[] K;
    public final int[] L;
    private final afp Q;
    private afq R;
    private boolean S;
    private final Rect T;
    private final ArrayList U;
    private afj V;
    private boolean W;
    private Runnable aA;
    private final ahq aB;
    private int aa;
    private boolean ab;
    private int ac;
    private final AccessibilityManager ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;
    private VelocityTracker ai;
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
    private final afu at;
    private aew au;
    private final int[] av;
    private sh aw;
    private final int[] ax;
    private final int[] ay;
    private final List az;
    public final afn e;
    public aeo f;
    public acm g;
    public final aho h;
    public final Rect i;
    public final RectF j;
    public aet k;
    public afd l;
    public afo m;
    public final ArrayList n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public List t;
    public boolean u;
    public EdgeEffect v;
    public EdgeEffect w;
    public EdgeEffect x;
    public EdgeEffect y;
    public aey z;

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        boolean z2;
        String str;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        Object[] objArr;
        this.Q = new afp(this);
        this.e = new afn(this);
        this.h = new aho();
        new aeq(this);
        this.i = new Rect();
        this.T = new Rect();
        this.j = new RectF();
        this.n = new ArrayList();
        this.U = new ArrayList();
        this.aa = 0;
        this.u = false;
        this.ae = false;
        this.af = 0;
        this.ag = 0;
        new aex();
        this.z = new acs();
        this.A = 0;
        this.ah = -1;
        this.aq = Float.MIN_VALUE;
        this.ar = Float.MIN_VALUE;
        this.as = true;
        this.at = new afu(this);
        this.C = d ? new afg() : null;
        this.D = new aft();
        this.F = false;
        this.G = false;
        this.H = new afa(this);
        this.I = false;
        this.av = new int[2];
        this.ax = new int[2];
        this.K = new int[2];
        this.ay = new int[2];
        this.L = new int[2];
        this.az = new ArrayList();
        this.aA = new aer(this);
        this.aB = new ahq(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O, i2, 0);
            this.S = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.S = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.an = viewConfiguration.getScaledTouchSlop();
        this.aq = sx.a(viewConfiguration, context);
        this.ar = sx.b(viewConfiguration, context);
        this.ao = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ap = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.z.h = this.H;
        this.f = new aeo(new abd(this));
        this.g = new acm(new aco(this));
        if (sn.a.d(this) == 0) {
            sn.a((View) this, 1);
        }
        this.ad = (AccessibilityManager) getContext().getSystemService("accessibility");
        a(new afw(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ya.a, i2, 0);
            String string = obtainStyledAttributes2.getString(ya.h);
            if (obtainStyledAttributes2.getInt(ya.b, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.W = obtainStyledAttributes2.getBoolean(ya.c, false);
            if (this.W) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(ya.f);
                Drawable drawable = obtainStyledAttributes2.getDrawable(ya.g);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(ya.d);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(ya.e);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + a());
                }
                Resources resources = getContext().getResources();
                new adh(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        str = context.getPackageName() + trim;
                    } else if (trim.contains(".")) {
                        str = trim;
                    } else {
                        str = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(str).asSubclass(afd.class);
                        try {
                            Constructor<? extends U> constructor2 = asSubclass.getConstructor(P);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), 0};
                            constructor = constructor2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        a((afd) constructor.newInstance(objArr));
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                    } catch (InvocationTargetException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                    } catch (ClassCastException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e8);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, N, i2, 0);
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

    public final String a() {
        return " " + super.toString() + ", adapter:" + this.k + ", layout:" + this.l + ", context:" + getContext();
    }

    public final void a(afw afw) {
        this.J = afw;
        sn.a(this, this.J);
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

    public final void a(aet aet) {
        if (this.k != null) {
            this.k.d.unregisterObserver(this.Q);
        }
        b();
        this.f.a();
        aet aet2 = this.k;
        this.k = aet;
        if (aet != null) {
            aet.d.registerObserver(this.Q);
        }
        if (this.l != null) {
            this.l.q();
        }
        afn afn = this.e;
        aet aet3 = this.k;
        afn.a();
        afl d2 = afn.d();
        if (aet2 != null) {
            d2.b--;
        }
        if (d2.b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                ((afm) d2.a.valueAt(i2)).a.clear();
            }
        }
        if (aet3 != null) {
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

    public final void a(afd afd) {
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
                this.l.a((RecyclerView) null);
                this.l = null;
            } else {
                this.e.a();
            }
            acm acm = this.g;
            acn acn = acm.b;
            while (true) {
                acn.a = 0;
                if (acn.b == null) {
                    break;
                }
                acn = acn.b;
            }
            for (int size = acm.c.size() - 1; size >= 0; size--) {
                acm.a.b((View) acm.c.get(size));
                acm.c.remove(size);
            }
            aco aco = acm.a;
            int childCount = aco.a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View b2 = aco.b(i2);
                aco.a.g(b2);
                b2.clearAnimation();
            }
            aco.a.removeAllViews();
            this.l = afd;
            if (afd != null) {
                if (afd.b != null) {
                    throw new IllegalArgumentException("LayoutManager " + afd + " is already attached to a RecyclerView:" + afd.b.a());
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
    public Parcelable onSaveInstanceState() {
        afq afq = new afq(super.onSaveInstanceState());
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof afq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.R = (afq) parcelable;
        super.onRestoreInstanceState(this.R.e);
        if (this.l != null && this.R.a != null) {
            this.l.a(this.R.a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void a(afv afv) {
        View view = afv.a;
        boolean z2 = view.getParent() == this;
        this.e.b(a(view));
        if (afv.n()) {
            this.g.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.g.a(view, -1, true);
        } else {
            acm acm = this.g;
            int a2 = acm.a.a(view);
            if (a2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
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

    public final void a(afc afc) {
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

    public final void b(afc afc) {
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

    public final void a(aew aew) {
        if (aew != this.au) {
            this.au = aew;
            setChildrenDrawingOrderEnabled(this.au != null);
        }
    }

    public final void a(afk afk) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(afk);
    }

    public final void c(int i2) {
        q();
        if (this.l == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        this.l.b(i2);
        awakenScrollBars();
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollBy(int i2, int i3) {
        if (this.l == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
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
            a(i2, i3, (MotionEvent) null);
        }
    }

    public final void a(int i2, int i3, int[] iArr) {
        d();
        i();
        jd.c("RV Scroll");
        z();
        int a2 = i2 != 0 ? this.l.a(i2, this.e, this.D) : 0;
        int b2 = i3 != 0 ? this.l.b(i3, this.e, this.D) : 0;
        jd.b();
        int a3 = this.g.a();
        for (int i4 = 0; i4 < a3; i4++) {
            View b3 = this.g.b(i4);
            afv a4 = a(b3);
            if (!(a4 == null || a4.i == null)) {
                View view = a4.i.a;
                int left = b3.getLeft();
                int top = b3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        b(true);
        a(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    public final void c() {
        boolean z2 = false;
        if (!this.q || this.u) {
            jd.c("RV FullInvalidate");
            x();
            jd.b();
        } else if (!this.f.d()) {
        } else {
            if (this.f.a(4) && !this.f.a(11)) {
                jd.c("RV PartialInvalidate");
                d();
                i();
                this.f.b();
                if (!this.ab) {
                    int a2 = this.g.a();
                    int i2 = 0;
                    while (true) {
                        if (i2 < a2) {
                            afv c2 = c(this.g.b(i2));
                            if (c2 != null && !c2.b() && c2.s()) {
                                z2 = true;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        x();
                    } else {
                        this.f.c();
                    }
                }
                a(true);
                b(true);
                jd.b();
            } else if (this.f.d()) {
                jd.c("RV FullInvalidate");
                x();
                jd.b();
            }
        }
    }

    private final boolean a(int i2, int i3, MotionEvent motionEvent) {
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
                        um.a(this.v, (-f2) / ((float) getWidth()), 1.0f - (y2 / ((float) getHeight())));
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        f();
                        um.a(this.x, f2 / ((float) getWidth()), y2 / ((float) getHeight()));
                        z2 = true;
                    }
                    if (f3 < 0.0f) {
                        g();
                        um.a(this.w, (-f3) / ((float) getHeight()), x2 / ((float) getWidth()));
                        z2 = true;
                    } else if (f3 > 0.0f) {
                        h();
                        um.a(this.y, f3 / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
                        z2 = true;
                    }
                    if (!(!z2 && f2 == 0.0f && f3 == 0.0f)) {
                        sn.a.c(this);
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
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
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
            afu afu = this.at;
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i4 * i4) + (i5 * i5)));
            int width = z2 ? afu.e.getWidth() : afu.e.getHeight();
            int i8 = width / 2;
            float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i8)) + ((float) i8);
            if (sqrt > 0) {
                i7 = Math.round(1000.0f * Math.abs(sin / ((float) sqrt))) * 4;
            } else {
                if (z2) {
                    i6 = abs;
                } else {
                    i6 = abs2;
                }
                i7 = (int) (((((float) i6) / ((float) width)) + 1.0f) * 300.0f);
            }
            int min = Math.min(i7, 2000);
            Interpolator interpolator = M;
            if (afu.d != interpolator) {
                afu.d = interpolator;
                afu.c = new OverScroller(afu.e.getContext(), interpolator);
            }
            afu.e.b(2);
            afu.b = 0;
            afu.a = 0;
            afu.c.startScroll(0, 0, i4, i5, min);
            if (Build.VERSION.SDK_INT < 23) {
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
            sn.a.c(this);
        }
    }

    public final void e() {
        if (this.v == null) {
            this.v = aex.a(this);
            if (this.S) {
                this.v.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.v.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void f() {
        if (this.x == null) {
            this.x = aex.a(this);
            if (this.S) {
                this.x.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.x.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void g() {
        if (this.w == null) {
            this.w = aex.a(this);
            if (this.S) {
                this.w.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.w.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void h() {
        if (this.y == null) {
            this.y = aex.a(this);
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

    public View focusSearch(View view, int i2) {
        View findNextFocus;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        char c2 = 65535;
        boolean z5 = false;
        boolean z6 = (this.k == null || this.l == null || u()) ? false : true;
        FocusFinder instance = FocusFinder.getInstance();
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
                if (sn.a.j(this.l.b) == 1) {
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
                    int i4 = sn.a.j(this.l.b) == 1 ? -1 : 1;
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
                            throw new IllegalArgumentException("Invalid direction: " + i2 + a());
                    }
                }
            }
            return z5 ? findNextFocus : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            a(findNextFocus, (View) null);
            return view;
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!(u()) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private final void a(View view, View view2) {
        boolean z2 = true;
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof afh) {
            afh afh = (afh) layoutParams;
            if (!afh.c) {
                Rect rect = afh.b;
                this.i.left -= rect.left;
                this.i.right += rect.right;
                this.i.top -= rect.top;
                Rect rect2 = this.i;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        afd afd = this.l;
        Rect rect3 = this.i;
        boolean z3 = !this.q;
        if (view2 != null) {
            z2 = false;
        }
        afd.a(this, view, rect3, z3, z2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.l.a(this, view, rect, z2, false);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
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
        // Method dump skipped, instructions count: 112
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
        } while (ahp.d.a() != null);
        if (d && this.B != null) {
            this.B.b.remove(this);
            this.B = null;
        }
    }

    public boolean isAttachedToWindow() {
        return this.o;
    }

    public final void a(String str) {
        if (u()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + a());
            }
            throw new IllegalStateException(str);
        } else if (this.ag > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a()));
        }
    }

    public final void a(afj afj) {
        this.U.add(afj);
    }

    public final void b(afj afj) {
        this.U.remove(afj);
        if (this.V == afj) {
            this.V = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
            afj afj = (afj) this.U.get(i3);
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
                this.ai = VelocityTracker.obtain();
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
                            if (!d2 || Math.abs(i4) <= this.an) {
                                z3 = false;
                            } else {
                                this.al = x3;
                                z3 = true;
                            }
                            if (e2 && Math.abs(i5) > this.an) {
                                this.am = y3;
                                z3 = true;
                            }
                            if (z3) {
                                b(1);
                                break;
                            }
                        }
                    } else {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
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
            return this.A == 1;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((afj) this.U.get(i2)).a(z2);
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
        // Method dump skipped, instructions count: 734
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
            sn.a.c(this);
        }
    }

    private final void t() {
        s();
        b(0);
    }

    private final void a(MotionEvent motionEvent) {
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

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
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
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
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
                    this.l.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
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
        setMeasuredDimension(afd.a(i2, getPaddingLeft() + getPaddingRight(), sn.a.e(this)), afd.a(i3, getPaddingTop() + getPaddingBottom(), sn.a.f(this)));
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
        int i2;
        this.af--;
        if (this.af <= 0) {
            this.af = 0;
            if (z2) {
                int i3 = this.ac;
                this.ac = 0;
                if (i3 != 0 && j()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    if (Build.VERSION.SDK_INT >= 19) {
                        obtain.setContentChangeTypes(i3);
                    }
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.az.size() - 1; size >= 0; size--) {
                    afv afv = (afv) this.az.get(size);
                    if (afv.a.getParent() == this && !afv.b() && (i2 = afv.n) != -1) {
                        sn.a(afv.a, i2);
                        afv.n = -1;
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

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        int i3 = 0;
        if (u()) {
            if (accessibilityEvent == null) {
                i2 = 0;
            } else if (Build.VERSION.SDK_INT >= 19) {
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
            sn.a(this, this.aA);
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
        aft aft = this.D;
        if (!this.q || this.z == null || ((!this.u && !z2 && !this.l.e) || (this.u && !this.k.e))) {
            z3 = false;
        } else {
            z3 = true;
        }
        aft.j = z3;
        aft aft2 = this.D;
        if (!this.D.j || !z2 || this.u || !v()) {
            z4 = false;
        }
        aft2.k = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x032a, code lost:
        if (r10.g.d(getFocusedChild()) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0406, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x() {
        /*
        // Method dump skipped, instructions count: 1039
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
            OverScroller overScroller = this.at.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
    }

    private final void A() {
        long j2;
        int d2;
        int i2;
        this.D.a(1);
        z();
        this.D.i = false;
        d();
        this.h.a();
        i();
        w();
        View focusedChild = (!this.as || !hasFocus() || this.k == null) ? null : getFocusedChild();
        afv b2 = focusedChild == null ? null : b(focusedChild);
        if (b2 == null) {
            y();
        } else {
            aft aft = this.D;
            if (this.k.e) {
                j2 = b2.e;
            } else {
                j2 = -1;
            }
            aft.m = j2;
            aft aft2 = this.D;
            if (this.u) {
                d2 = -1;
            } else if (b2.m()) {
                d2 = b2.d;
            } else {
                d2 = b2.d();
            }
            aft2.l = d2;
            aft aft3 = this.D;
            View view = b2.a;
            View view2 = view;
            int id = view.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                View focusedChild2 = ((ViewGroup) view2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    i2 = focusedChild2.getId();
                } else {
                    i2 = id;
                }
                id = i2;
                view2 = focusedChild2;
            }
            aft3.n = id;
        }
        aft aft4 = this.D;
        aft4.h = this.D.j && this.G;
        this.G = false;
        this.F = false;
        this.D.g = this.D.k;
        this.D.e = this.k.a();
        a(this.av);
        if (this.D.j) {
            int a2 = this.g.a();
            for (int i3 = 0; i3 < a2; i3++) {
                afv c2 = c(this.g.b(i3));
                if (!c2.b() && (!c2.j() || this.k.e)) {
                    aey.d(c2);
                    c2.p();
                    afb afb = new afb();
                    View view3 = c2.a;
                    afb.a = view3.getLeft();
                    afb.b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
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
                afv c3 = c(this.g.c(i4));
                if (!c3.b() && c3.d == -1) {
                    c3.d = c3.c;
                }
            }
            boolean z2 = this.D.f;
            this.D.f = false;
            this.l.a(this.e, this.D);
            this.D.f = z2;
            for (int i5 = 0; i5 < this.g.a(); i5++) {
                afv c4 = c(this.g.b(i5));
                if (!c4.b()) {
                    ahp ahp = (ahp) this.h.a.get(c4);
                    if (!((ahp == null || (ahp.a & 4) == 0) ? false : true)) {
                        aey.d(c4);
                        boolean a3 = c4.a(8192);
                        c4.p();
                        afb afb2 = new afb();
                        View view4 = c4.a;
                        afb2.a = view4.getLeft();
                        afb2.b = view4.getTop();
                        view4.getRight();
                        view4.getBottom();
                        if (a3) {
                            a(c4, afb2);
                        } else {
                            aho aho = this.h;
                            ahp ahp2 = (ahp) aho.a.get(c4);
                            if (ahp2 == null) {
                                ahp2 = ahp.a();
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

    public final void a(afv afv, afb afb) {
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
            afv c2 = c(this.g.b(i5));
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

    public void removeDetachedView(View view, boolean z2) {
        afv c2 = c(view);
        if (c2 != null) {
            if (c2.n()) {
                c2.i();
            } else if (!c2.b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c2 + a());
            }
        }
        view.clearAnimation();
        g(view);
        super.removeDetachedView(view, z2);
    }

    private final long d(afv afv) {
        if (this.k.e) {
            return afv.e;
        }
        return (long) afv.c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        jd.c("RV OnLayout");
        x();
        jd.b();
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
            ((afh) this.g.c(i2).getLayoutParams()).c = true;
        }
        afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            afh afh = (afh) ((afv) afn.c.get(i3)).a.getLayoutParams();
            if (afh != null) {
                afh.c = true;
            }
        }
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        super.draw(canvas);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((afc) this.n.get(i2)).a(canvas, this);
        }
        if (this.v == null || this.v.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.S ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (paddingBottom + (-getHeight())), 0.0f);
            z2 = this.v != null && this.v.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (this.w != null && !this.w.isFinished()) {
            int save2 = canvas.save();
            if (this.S) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            z2 |= this.w != null && this.w.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.x != null && !this.x.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.S ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            z2 |= this.x != null && this.x.draw(canvas);
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
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.z == null || this.n.size() <= 0 || !this.z.b()) {
            z3 = z2;
        }
        if (z3) {
            sn.a.c(this);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((afc) this.n.get(i2)).b(canvas, this);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof afh) && this.l.a((afh) layoutParams);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.l != null) {
            return this.l.b();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.l != null) {
            return this.l.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.l == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
        } else if (layoutParams instanceof afh) {
            return new afh((afh) layoutParams);
        } else {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new afh((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new afh(layoutParams);
        }
    }

    private final void C() {
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            afv c2 = c(this.g.c(i2));
            if (!c2.b()) {
                c2.a();
            }
        }
        afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((afv) afn.c.get(i3)).a();
        }
        int size2 = afn.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((afv) afn.a.get(i4)).a();
        }
        if (afn.b != null) {
            int size3 = afn.b.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((afv) afn.b.get(i5)).a();
            }
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.g.b();
        for (int i5 = 0; i5 < b2; i5++) {
            afv c2 = c(this.g.c(i5));
            if (c2 != null && !c2.b()) {
                if (c2.c >= i4) {
                    c2.a(-i3, z2);
                    this.D.f = true;
                } else if (c2.c >= i2) {
                    c2.b(8);
                    c2.a(-i3, z2);
                    c2.c = i2 - 1;
                    this.D.f = true;
                }
            }
        }
        afn afn = this.e;
        int i6 = i2 + i3;
        for (int size = afn.c.size() - 1; size >= 0; size--) {
            afv afv = (afv) afn.c.get(size);
            if (afv != null) {
                if (afv.c >= i6) {
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
            afv c2 = c(this.g.c(i2));
            if (c2 != null && !c2.b()) {
                c2.b(6);
            }
        }
        l();
        afn afn = this.e;
        int size = afn.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            afv afv = (afv) afn.c.get(i3);
            if (afv != null) {
                afv.b(6);
                afv.a((Object) null);
            }
        }
        if (afn.e.k == null || !afn.e.k.e) {
            afn.c();
        }
    }

    public final afv a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    private final View h(View view) {
        ViewParent parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = (View) parent;
            view2 = view3;
            parent = view3.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    public final afv b(View view) {
        View h2 = h(view);
        if (h2 == null) {
            return null;
        }
        return a(h2);
    }

    public static afv c(View view) {
        if (view == null) {
            return null;
        }
        return ((afh) view.getLayoutParams()).a;
    }

    public static int d(View view) {
        afv c2 = c(view);
        if (c2 != null) {
            return c2.d();
        }
        return -1;
    }

    private final afv d(int i2) {
        if (this.u) {
            return null;
        }
        int b2 = this.g.b();
        int i3 = 0;
        afv afv = null;
        while (i3 < b2) {
            afv c2 = c(this.g.c(i3));
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

    public static void a(View view, Rect rect) {
        b(view, rect);
    }

    public static void b(View view, Rect rect) {
        afh afh = (afh) view.getLayoutParams();
        Rect rect2 = afh.b;
        int left = (view.getLeft() - rect2.left) - afh.leftMargin;
        int top = (view.getTop() - rect2.top) - afh.topMargin;
        int right = view.getRight() + rect2.right + afh.rightMargin;
        int bottom = view.getBottom();
        rect.set(left, top, right, afh.bottomMargin + rect2.bottom + bottom);
    }

    public final Rect e(View view) {
        afh afh = (afh) view.getLayoutParams();
        if (!afh.c) {
            return afh.b;
        }
        if (this.D.g && (afh.a.s() || afh.a.j())) {
            return afh.b;
        }
        Rect rect = afh.b;
        rect.set(0, 0, 0, 0);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.set(0, 0, 0, 0);
            ((afc) this.n.get(i2)).a(this.i, view, this);
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
                ((afk) this.E.get(size)).a(this);
            }
        }
        this.ag--;
    }

    public final boolean n() {
        return !this.q || this.u || this.f.d();
    }

    public static RecyclerView f(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView f2 = f(viewGroup.getChildAt(i2));
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    public static void b(afv afv) {
        if (afv.b != null) {
            View view = (View) afv.b.get();
            while (view != null) {
                if (view != afv.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            afv.b = null;
        }
    }

    public static long o() {
        if (d) {
            return System.nanoTime();
        }
        return 0;
    }

    public final void g(View view) {
        afv c2 = c(view);
        if (!(this.k == null || c2 == null)) {
            this.k.b(c2);
        }
        if (this.t != null) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                ((afi) this.t.get(size)).a(view);
            }
        }
    }

    public final boolean a(afv afv, int i2) {
        if (u()) {
            afv.n = i2;
            this.az.add(afv);
            return false;
        }
        sn.a(afv.a, i2);
        return true;
    }

    public final int c(afv afv) {
        if (afv.a(524) || !afv.l()) {
            return -1;
        }
        aeo aeo = this.f;
        int i2 = afv.c;
        int size = aeo.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            abe abe = (abe) aeo.a.get(i3);
            switch (abe.a) {
                case 1:
                    if (abe.b <= i2) {
                        i2 += abe.d;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (abe.b > i2) {
                        continue;
                    } else if (abe.b + abe.d <= i2) {
                        i2 -= abe.d;
                        break;
                    } else {
                        return -1;
                    }
                case 8:
                    if (abe.b == i2) {
                        i2 = abe.d;
                        break;
                    } else {
                        if (abe.b < i2) {
                            i2--;
                        }
                        if (abe.d <= i2) {
                            i2++;
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
        return i2;
    }

    public void setNestedScrollingEnabled(boolean z2) {
        p().a(z2);
    }

    @Override // defpackage.sf
    public boolean isNestedScrollingEnabled() {
        return p().a;
    }

    public boolean startNestedScroll(int i2) {
        return p().a(i2, 0);
    }

    private final boolean d(int i2, int i3) {
        return p().a(i2, i3);
    }

    @Override // defpackage.sf
    public void stopNestedScroll() {
        p().b(0);
    }

    @Override // defpackage.sg
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
        aew aew = this.au;
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

    public final sh p() {
        if (this.aw == null) {
            this.aw = new sh(this);
        }
        return this.aw;
    }

    static {
        boolean z2;
        boolean z3;
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        b = z2;
        if (Build.VERSION.SDK_INT >= 21) {
            z3 = true;
        } else {
            z3 = false;
        }
        d = z3;
    }
}
