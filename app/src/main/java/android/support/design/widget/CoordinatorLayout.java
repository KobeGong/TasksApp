package android.support.design.widget;

import defpackage.ViewCompat;
import defpackage.WindowInsetsCompat;

/* compiled from: PG */
public class CoordinatorLayout extends android.view.ViewGroup implements defpackage.sj {
    private static final java.lang.String e;
    private static final java.lang.Class[] f = {android.content.Context.class, android.util.AttributeSet.class};
    private static final java.lang.ThreadLocal g = new java.lang.ThreadLocal();
    private static final java.util.Comparator h;
    private static final defpackage.rg i = new defpackage.rh();
    public final defpackage.ul a;
    public WindowInsetsCompat b;
    public boolean c;
    public android.view.ViewGroup.OnHierarchyChangeListener d;
    private final java.util.List j;
    private final java.util.List k;
    private final java.util.List l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private android.view.View q;
    private android.view.View r;
    private defpackage.hb s;
    private boolean t;
    private android.graphics.drawable.Drawable u;
    private defpackage.OnApplyWindowInsetsListener v;
    private final defpackage.sk w;

    private static android.graphics.Rect a() {
        android.graphics.Rect rect = (android.graphics.Rect) i.a();
        if (rect == null) {
            return new android.graphics.Rect();
        }
        return rect;
    }

    private static void a(android.graphics.Rect rect) {
        rect.setEmpty();
        i.a(rect);
    }

    public CoordinatorLayout(android.content.Context context) {
        this(context, null);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772001);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        android.content.res.TypedArray obtainStyledAttributes;
        super(context, attributeSet, i2);
        this.j = new java.util.ArrayList();
        this.a = new defpackage.ul();
        this.k = new java.util.ArrayList();
        this.l = new java.util.ArrayList();
        this.m = new int[2];
        this.w = new defpackage.sk();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.co.a, 0, 2132017774);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.co.a, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(defpackage.co.j, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.p[i3] = (int) (((float) this.p[i3]) * f2);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(defpackage.co.k);
        obtainStyledAttributes.recycle();
        b();
        super.setOnHierarchyChangeListener(new defpackage.gz(this));
    }

    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.d = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new defpackage.hb(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.b == null && ViewCompat.a.h(this)) {
            ViewCompat.a.g(this);
        }
        this.o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        if (this.r != null) {
            onStopNestedScroll(this.r);
        }
        this.o = false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z = false;
        android.graphics.drawable.Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState) | false;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.u != null && this.u.isVisible() != z) {
            this.u.setVisible(z, false);
        }
    }

    private final void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            defpackage.gx gxVar = ((defpackage.ha) childAt.getLayoutParams()).a;
            if (gxVar != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    gxVar.a(this, childAt, obtain);
                } else {
                    gxVar.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((defpackage.ha) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.q = null;
        this.n = false;
    }

    private final boolean a(android.view.MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        android.view.MotionEvent motionEvent2;
        int i3;
        boolean z4 = false;
        boolean z5 = false;
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            if (isChildrenDrawingOrderEnabled) {
                i3 = getChildDrawingOrder(childCount, i4);
            } else {
                i3 = i4;
            }
            list.add(getChildAt(i3));
        }
        if (h != null) {
            java.util.Collections.sort(list, h);
        }
        int size = list.size();
        int i5 = 0;
        android.view.MotionEvent motionEvent3 = null;
        while (true) {
            if (i5 < size) {
                android.view.View view = (android.view.View) list.get(i5);
                defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
                defpackage.gx gxVar = haVar.a;
                if ((!z4 && !z5) || actionMasked == 0) {
                    if (!z4 && gxVar != null) {
                        switch (i2) {
                            case 0:
                                z4 = gxVar.a(this, view, motionEvent);
                                break;
                            case 1:
                                z4 = gxVar.b(this, view, motionEvent);
                                break;
                        }
                        if (z4) {
                            this.q = view;
                        }
                    }
                    z = z4;
                    if (haVar.a == null) {
                        haVar.m = false;
                    }
                    boolean z6 = haVar.m;
                    if (haVar.m) {
                        z2 = true;
                    } else {
                        z2 = haVar.m;
                        haVar.m = z2;
                    }
                    boolean z7 = z2 && !z6;
                    if (!z2 || z7) {
                        android.view.MotionEvent motionEvent4 = motionEvent3;
                        z3 = z7;
                        motionEvent2 = motionEvent4;
                    }
                } else if (gxVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        motionEvent2 = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        motionEvent2 = motionEvent3;
                    }
                    switch (i2) {
                        case 0:
                            gxVar.a(this, view, motionEvent2);
                            z3 = z5;
                            z = z4;
                            continue;
                        case 1:
                            gxVar.b(this, view, motionEvent2);
                            break;
                    }
                    z3 = z5;
                    z = z4;
                } else {
                    motionEvent2 = motionEvent3;
                    z = z4;
                    z3 = z5;
                }
                i5++;
                z5 = z3;
                z4 = z;
                motionEvent3 = motionEvent2;
            } else {
                z = z4;
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(true);
        }
        boolean a2 = a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            a(true);
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r4 = 3
            r10 = 1
            r5 = 0
            r7 = 0
            r2 = 0
            int r9 = r12.getActionMasked()
            android.view.View r0 = r11.q
            if (r0 != 0) goto L_0x0055
            boolean r0 = r11.a(r12, r10)
            if (r0 == 0) goto L_0x0052
            r1 = r0
        L_0x0014:
            android.view.View r0 = r11.q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            ha r0 = (defpackage.ha) r0
            gx r0 = r0.a
            if (r0 == 0) goto L_0x0050
            android.view.View r3 = r11.q
            boolean r0 = r0.b(r11, r3, r12)
            r8 = r0
        L_0x0027:
            android.view.View r0 = r11.q
            if (r0 != 0) goto L_0x003e
            boolean r0 = super.onTouchEvent(r12)
            r8 = r8 | r0
            r0 = r2
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.recycle()
        L_0x0036:
            if (r9 == r10) goto L_0x003a
            if (r9 != r4) goto L_0x003d
        L_0x003a:
            r11.a(r7)
        L_0x003d:
            return r8
        L_0x003e:
            if (r1 == 0) goto L_0x004e
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = r0
            r6 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            super.onTouchEvent(r0)
            goto L_0x0031
        L_0x004e:
            r0 = r2
            goto L_0x0031
        L_0x0050:
            r8 = r7
            goto L_0x0027
        L_0x0052:
            r1 = r0
            r8 = r7
            goto L_0x0027
        L_0x0055:
            r1 = r7
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.n) {
            a(false);
            this.n = true;
        }
    }

    private final int b(int i2) {
        if (this.p == null) {
            android.util.Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < this.p.length) {
            return this.p[i2];
        } else {
            android.util.Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public static defpackage.gx a(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str) {
        java.util.Map map;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !android.text.TextUtils.isEmpty(e)) {
            str = e + '.' + str;
        }
        try {
            java.util.Map map2 = (java.util.Map) g.get();
            if (map2 == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                g.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (defpackage.gx) constructor.newInstance(new java.lang.Object[]{context, attributeSet});
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private static defpackage.ha c(android.view.View view) {
        defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
        if (!haVar.b) {
            if (view instanceof defpackage.gw) {
                defpackage.gx a2 = ((defpackage.gw) view).a();
                if (a2 == null) {
                    android.util.Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                haVar.a(a2);
                haVar.b = true;
            } else {
                defpackage.gy gyVar = null;
                for (java.lang.Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    gyVar = (defpackage.gy) cls.getAnnotation(defpackage.gy.class);
                    if (gyVar != null) {
                        break;
                    }
                }
                defpackage.gy gyVar2 = gyVar;
                if (gyVar2 != null) {
                    try {
                        haVar.a((defpackage.gx) gyVar2.a().getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                    } catch (java.lang.Exception e2) {
                        android.util.Log.e("CoordinatorLayout", "Default behavior class " + gyVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                haVar.b = true;
            }
        }
        return haVar;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(android.view.View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (r1 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x01b6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            java.util.List r1 = r0.j
            r1.clear()
            r0 = r25
            ul r3 = r0.a
            r1 = 0
            ri r2 = r3.b
            int r4 = r2.size()
            r2 = r1
        L_0x0013:
            if (r2 >= r4) goto L_0x002b
            ri r1 = r3.b
            java.lang.Object r1 = r1.c(r2)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0027
            r1.clear()
            rg r5 = r3.a
            r5.a(r1)
        L_0x0027:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0013
        L_0x002b:
            ri r1 = r3.b
            r1.clear()
            r1 = 0
            int r4 = r25.getChildCount()
            r3 = r1
        L_0x0036:
            if (r3 >= r4) goto L_0x01c0
            r0 = r25
            android.view.View r5 = r0.getChildAt(r3)
            ha r6 = c(r5)
            int r1 = r6.f
            r2 = -1
            if (r1 != r2) goto L_0x00c3
            r1 = 0
            r6.l = r1
            r6.k = r1
        L_0x004c:
            r0 = r25
            ul r1 = r0.a
            r1.a(r5)
            r1 = 0
            r2 = r1
        L_0x0055:
            if (r2 >= r4) goto L_0x01bb
            if (r2 == r3) goto L_0x01b6
            r0 = r25
            android.view.View r7 = r0.getChildAt(r2)
            android.view.View r1 = r6.l
            if (r7 == r1) goto L_0x0091
            sw r1 = defpackage.sn.a
            r0 = r25
            int r8 = r1.j(r0)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            ha r1 = (defpackage.ha) r1
            int r1 = r1.g
            int r1 = defpackage.jd.a(r1, r8)
            if (r1 == 0) goto L_0x018f
            int r9 = r6.h
            int r8 = defpackage.jd.a(r9, r8)
            r8 = r8 & r1
            if (r8 != r1) goto L_0x018f
            r1 = 1
        L_0x0083:
            if (r1 != 0) goto L_0x0091
            gx r1 = r6.a
            if (r1 == 0) goto L_0x0192
            gx r1 = r6.a
            boolean r1 = r1.a_(r7)
            if (r1 == 0) goto L_0x0192
        L_0x0091:
            r1 = 1
        L_0x0092:
            if (r1 == 0) goto L_0x01b6
            r0 = r25
            ul r1 = r0.a
            ri r1 = r1.b
            boolean r1 = r1.containsKey(r7)
            if (r1 != 0) goto L_0x00a7
            r0 = r25
            ul r1 = r0.a
            r1.a(r7)
        L_0x00a7:
            r0 = r25
            ul r8 = r0.a
            ri r1 = r8.b
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L_0x00bb
            ri r1 = r8.b
            boolean r1 = r1.containsKey(r5)
            if (r1 != 0) goto L_0x0195
        L_0x00bb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "All nodes must be present in the graph before being added as an edge"
            r1.<init>(r2)
            throw r1
        L_0x00c3:
            android.view.View r1 = r6.k
            if (r1 == 0) goto L_0x00d4
            android.view.View r1 = r6.k
            int r1 = r1.getId()
            int r2 = r6.f
            if (r1 == r2) goto L_0x00f5
            r1 = 0
        L_0x00d2:
            if (r1 != 0) goto L_0x004c
        L_0x00d4:
            int r1 = r6.f
            r0 = r25
            android.view.View r1 = r0.findViewById(r1)
            r6.k = r1
            android.view.View r1 = r6.k
            if (r1 == 0) goto L_0x0159
            android.view.View r1 = r6.k
            r0 = r25
            if (r1 != r0) goto L_0x0124
            boolean r1 = r25.isInEditMode()
            if (r1 == 0) goto L_0x011c
            r1 = 0
            r6.l = r1
            r6.k = r1
            goto L_0x004c
        L_0x00f5:
            android.view.View r1 = r6.k
            android.view.View r2 = r6.k
            android.view.ViewParent r2 = r2.getParent()
        L_0x00fd:
            r0 = r25
            if (r2 == r0) goto L_0x0118
            if (r2 == 0) goto L_0x0105
            if (r2 != r5) goto L_0x010c
        L_0x0105:
            r1 = 0
            r6.l = r1
            r6.k = r1
            r1 = 0
            goto L_0x00d2
        L_0x010c:
            boolean r7 = r2 instanceof android.view.View
            if (r7 == 0) goto L_0x0113
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0113:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x00fd
        L_0x0118:
            r6.l = r1
            r1 = 1
            goto L_0x00d2
        L_0x011c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "View can not be anchored to the the parent CoordinatorLayout"
            r1.<init>(r2)
            throw r1
        L_0x0124:
            android.view.View r1 = r6.k
            android.view.View r2 = r6.k
            android.view.ViewParent r2 = r2.getParent()
        L_0x012c:
            r0 = r25
            if (r2 == r0) goto L_0x0155
            if (r2 == 0) goto L_0x0155
            if (r2 != r5) goto L_0x0149
            boolean r1 = r25.isInEditMode()
            if (r1 == 0) goto L_0x0141
            r1 = 0
            r6.l = r1
            r6.k = r1
            goto L_0x004c
        L_0x0141:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Anchor must not be a descendant of the anchored view"
            r1.<init>(r2)
            throw r1
        L_0x0149:
            boolean r7 = r2 instanceof android.view.View
            if (r7 == 0) goto L_0x0150
            r1 = r2
            android.view.View r1 = (android.view.View) r1
        L_0x0150:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x012c
        L_0x0155:
            r6.l = r1
            goto L_0x004c
        L_0x0159:
            boolean r1 = r25.isInEditMode()
            if (r1 == 0) goto L_0x0166
            r1 = 0
            r6.l = r1
            r6.k = r1
            goto L_0x004c
        L_0x0166:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find CoordinatorLayout descendant view with id "
            r2.<init>(r3)
            android.content.res.Resources r3 = r25.getResources()
            int r4 = r6.f
            java.lang.String r3 = r3.getResourceName(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " to anchor view "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x018f:
            r1 = 0
            goto L_0x0083
        L_0x0192:
            r1 = 0
            goto L_0x0092
        L_0x0195:
            ri r1 = r8.b
            java.lang.Object r1 = r1.get(r7)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L_0x01b3
            rg r1 = r8.a
            java.lang.Object r1 = r1.a()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L_0x01ae
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x01ae:
            ri r8 = r8.b
            r8.put(r7, r1)
        L_0x01b3:
            r1.add(r5)
        L_0x01b6:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0055
        L_0x01bb:
            int r1 = r3 + 1
            r3 = r1
            goto L_0x0036
        L_0x01c0:
            r0 = r25
            java.util.List r2 = r0.j
            r0 = r25
            ul r3 = r0.a
            java.util.ArrayList r1 = r3.c
            r1.clear()
            java.util.HashSet r1 = r3.d
            r1.clear()
            r1 = 0
            ri r4 = r3.b
            int r4 = r4.size()
        L_0x01d9:
            if (r1 >= r4) goto L_0x01eb
            ri r5 = r3.b
            java.lang.Object r5 = r5.b(r1)
            java.util.ArrayList r6 = r3.c
            java.util.HashSet r7 = r3.d
            r3.a(r5, r6, r7)
            int r1 = r1 + 1
            goto L_0x01d9
        L_0x01eb:
            java.util.ArrayList r1 = r3.c
            r2.addAll(r1)
            r0 = r25
            java.util.List r1 = r0.j
            java.util.Collections.reverse(r1)
            r2 = 0
            int r5 = r25.getChildCount()
            r1 = 0
            r3 = r1
        L_0x01fe:
            if (r3 >= r5) goto L_0x03e2
            r0 = r25
            android.view.View r6 = r0.getChildAt(r3)
            r0 = r25
            ul r7 = r0.a
            r1 = 0
            ri r4 = r7.b
            int r8 = r4.size()
            r4 = r1
        L_0x0212:
            if (r4 >= r8) goto L_0x0381
            ri r1 = r7.b
            java.lang.Object r1 = r1.c(r4)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x037c
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x037c
            r1 = 1
        L_0x0225:
            if (r1 == 0) goto L_0x0384
            r1 = 1
        L_0x0228:
            r0 = r25
            boolean r2 = r0.t
            if (r1 == r2) goto L_0x0257
            if (r1 == 0) goto L_0x0389
            r0 = r25
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x0252
            r0 = r25
            hb r1 = r0.s
            if (r1 != 0) goto L_0x0247
            hb r1 = new hb
            r0 = r25
            r1.<init>(r0)
            r0 = r25
            r0.s = r1
        L_0x0247:
            android.view.ViewTreeObserver r1 = r25.getViewTreeObserver()
            r0 = r25
            hb r2 = r0.s
            r1.addOnPreDrawListener(r2)
        L_0x0252:
            r1 = 1
            r0 = r25
            r0.t = r1
        L_0x0257:
            int r15 = r25.getPaddingLeft()
            int r2 = r25.getPaddingTop()
            int r16 = r25.getPaddingRight()
            int r3 = r25.getPaddingBottom()
            sw r1 = defpackage.sn.a
            r0 = r25
            int r17 = r1.j(r0)
            r1 = 1
            r0 = r17
            if (r0 != r1) goto L_0x03a7
            r1 = 1
            r9 = r1
        L_0x0276:
            int r18 = android.view.View.MeasureSpec.getMode(r26)
            int r19 = android.view.View.MeasureSpec.getSize(r26)
            int r20 = android.view.View.MeasureSpec.getMode(r27)
            int r21 = android.view.View.MeasureSpec.getSize(r27)
            int r22 = r15 + r16
            int r23 = r2 + r3
            int r13 = r25.getSuggestedMinimumWidth()
            int r12 = r25.getSuggestedMinimumHeight()
            r11 = 0
            r0 = r25
            tk r1 = r0.b
            if (r1 == 0) goto L_0x03ab
            sw r1 = defpackage.sn.a
            r0 = r25
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x03ab
            r1 = 1
            r10 = r1
        L_0x02a5:
            r0 = r25
            java.util.List r1 = r0.j
            int r24 = r1.size()
            r1 = 0
            r14 = r1
        L_0x02af:
            r0 = r24
            if (r14 >= r0) goto L_0x03c1
            r0 = r25
            java.util.List r1 = r0.j
            java.lang.Object r3 = r1.get(r14)
            android.view.View r3 = (android.view.View) r3
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x03de
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            r8 = r1
            ha r8 = (defpackage.ha) r8
            r5 = 0
            int r1 = r8.e
            if (r1 < 0) goto L_0x02fc
            if (r18 == 0) goto L_0x02fc
            int r1 = r8.e
            r0 = r25
            int r1 = r0.b(r1)
            int r2 = r8.c
            int r2 = d(r2)
            r0 = r17
            int r2 = defpackage.jd.a(r2, r0)
            r2 = r2 & 7
            r4 = 3
            if (r2 != r4) goto L_0x02ee
            if (r9 == 0) goto L_0x02f3
        L_0x02ee:
            r4 = 5
            if (r2 != r4) goto L_0x03af
            if (r9 == 0) goto L_0x03af
        L_0x02f3:
            r2 = 0
            int r4 = r19 - r16
            int r1 = r4 - r1
            int r5 = java.lang.Math.max(r2, r1)
        L_0x02fc:
            if (r10 == 0) goto L_0x03d8
            sw r1 = defpackage.sn.a
            boolean r1 = r1.h(r3)
            if (r1 != 0) goto L_0x03d8
            r0 = r25
            tk r1 = r0.b
            int r1 = r1.a()
            r0 = r25
            tk r2 = r0.b
            int r2 = r2.c()
            int r1 = r1 + r2
            r0 = r25
            tk r2 = r0.b
            int r2 = r2.b()
            r0 = r25
            tk r4 = r0.b
            int r4 = r4.d()
            int r2 = r2 + r4
            int r1 = r19 - r1
            r0 = r18
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r1 = r21 - r2
            r0 = r20
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
        L_0x0338:
            gx r1 = r8.a
            if (r1 == 0) goto L_0x0345
            r7 = 0
            r2 = r25
            boolean r1 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x034b
        L_0x0345:
            r7 = 0
            r2 = r25
            r2.a(r3, r4, r5, r6, r7)
        L_0x034b:
            int r1 = r3.getMeasuredWidth()
            int r1 = r1 + r22
            int r2 = r8.leftMargin
            int r1 = r1 + r2
            int r2 = r8.rightMargin
            int r1 = r1 + r2
            int r4 = java.lang.Math.max(r13, r1)
            int r1 = r3.getMeasuredHeight()
            int r1 = r1 + r23
            int r2 = r8.topMargin
            int r1 = r1 + r2
            int r2 = r8.bottomMargin
            int r1 = r1 + r2
            int r2 = java.lang.Math.max(r12, r1)
            int r1 = r3.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r11, r1)
            r3 = r4
        L_0x0374:
            int r4 = r14 + 1
            r14 = r4
            r11 = r1
            r12 = r2
            r13 = r3
            goto L_0x02af
        L_0x037c:
            int r1 = r4 + 1
            r4 = r1
            goto L_0x0212
        L_0x0381:
            r1 = 0
            goto L_0x0225
        L_0x0384:
            int r1 = r3 + 1
            r3 = r1
            goto L_0x01fe
        L_0x0389:
            r0 = r25
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x03a0
            r0 = r25
            hb r1 = r0.s
            if (r1 == 0) goto L_0x03a0
            android.view.ViewTreeObserver r1 = r25.getViewTreeObserver()
            r0 = r25
            hb r2 = r0.s
            r1.removeOnPreDrawListener(r2)
        L_0x03a0:
            r1 = 0
            r0 = r25
            r0.t = r1
            goto L_0x0257
        L_0x03a7:
            r1 = 0
            r9 = r1
            goto L_0x0276
        L_0x03ab:
            r1 = 0
            r10 = r1
            goto L_0x02a5
        L_0x03af:
            r4 = 5
            if (r2 != r4) goto L_0x03b4
            if (r9 == 0) goto L_0x03b9
        L_0x03b4:
            r4 = 3
            if (r2 != r4) goto L_0x02fc
            if (r9 == 0) goto L_0x02fc
        L_0x03b9:
            r2 = 0
            int r1 = r1 - r15
            int r5 = java.lang.Math.max(r2, r1)
            goto L_0x02fc
        L_0x03c1:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r11
            r0 = r26
            int r1 = android.view.View.resolveSizeAndState(r13, r0, r1)
            int r2 = r11 << 16
            r0 = r27
            int r2 = android.view.View.resolveSizeAndState(r12, r0, r2)
            r0 = r25
            r0.setMeasuredDimension(r1, r2)
            return
        L_0x03d8:
            r6 = r27
            r4 = r26
            goto L_0x0338
        L_0x03de:
            r1 = r11
            r2 = r12
            r3 = r13
            goto L_0x0374
        L_0x03e2:
            r1 = r2
            goto L_0x0228
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void a(android.view.View view, int i2) {
        boolean z;
        int i3;
        int i4;
        defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
        if (haVar.k != null || haVar.f == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (haVar.k != null) {
            android.view.View view2 = haVar.k;
            android.graphics.Rect a2 = a();
            android.graphics.Rect a3 = a();
            try {
                defpackage.vz.a((android.view.ViewGroup) this, view2, a2);
                defpackage.ha haVar2 = (defpackage.ha) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                a(i2, a2, a3, haVar2, measuredWidth, measuredHeight);
                a(haVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a(a2);
                a(a3);
            }
        } else if (haVar.e >= 0) {
            int i5 = haVar.e;
            defpackage.ha haVar3 = (defpackage.ha) view.getLayoutParams();
            int a4 = defpackage.jd.a(d(haVar3.c), i2);
            int i6 = a4 & 7;
            int i7 = a4 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i5 = width - i5;
            }
            int b2 = b(i5) - measuredWidth2;
            switch (i6) {
                case 1:
                    i3 = b2 + (measuredWidth2 / 2);
                    break;
                case 5:
                    i3 = b2 + measuredWidth2;
                    break;
                default:
                    i3 = b2;
                    break;
            }
            switch (i7) {
                case 16:
                    i4 = (measuredHeight2 / 2) + 0;
                    break;
                case 80:
                    i4 = measuredHeight2;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            int max = java.lang.Math.max(getPaddingLeft() + haVar3.leftMargin, java.lang.Math.min(i3, ((width - getPaddingRight()) - measuredWidth2) - haVar3.rightMargin));
            int max2 = java.lang.Math.max(getPaddingTop() + haVar3.topMargin, java.lang.Math.min(i4, ((height - getPaddingBottom()) - measuredHeight2) - haVar3.bottomMargin));
            view.layout(max, max2, max + measuredWidth2, measuredHeight2 + max2);
        } else {
            defpackage.ha haVar4 = (defpackage.ha) view.getLayoutParams();
            android.graphics.Rect a5 = a();
            a5.set(getPaddingLeft() + haVar4.leftMargin, getPaddingTop() + haVar4.topMargin, (getWidth() - getPaddingRight()) - haVar4.rightMargin, (getHeight() - getPaddingBottom()) - haVar4.bottomMargin);
            if (this.b != null && ViewCompat.a.h(this) && !ViewCompat.a.h(view)) {
                a5.left += this.b.a();
                a5.top += this.b.b();
                a5.right -= this.b.c();
                a5.bottom -= this.b.d();
            }
            android.graphics.Rect a6 = a();
            defpackage.jd.a(c(haVar4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i2);
            view.layout(a6.left, a6.top, a6.right, a6.bottom);
            a(a5);
            a(a6);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int j2 = ViewCompat.a.j(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view = (android.view.View) this.j.get(i6);
            if (view.getVisibility() != 8) {
                defpackage.gx gxVar = ((defpackage.ha) view.getLayoutParams()).a;
                if (gxVar == null || !gxVar.a(this, view, j2)) {
                    a(view, j2);
                }
            }
        }
    }

    public void onDraw(android.graphics.Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (this.c && this.u != null) {
            if (this.b != null) {
                i2 = this.b.b();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.u.setBounds(0, 0, getWidth(), i2);
                this.u.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        b();
    }

    private final void a(android.view.View view, boolean z, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            defpackage.vz.a((android.view.ViewGroup) this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i2, android.graphics.Rect rect, android.graphics.Rect rect2, defpackage.ha haVar, int i3, int i4) {
        int width;
        int height;
        int i5 = haVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int a2 = defpackage.jd.a(i5, i2);
        int a3 = defpackage.jd.a(c(haVar.d), i2);
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int i8 = a3 & 112;
        switch (a3 & 7) {
            case 1:
                width = (rect.width() / 2) + rect.left;
                break;
            case 5:
                width = rect.right;
                break;
            default:
                width = rect.left;
                break;
        }
        switch (i8) {
            case 16:
                height = rect.top + (rect.height() / 2);
                break;
            case 80:
                height = rect.bottom;
                break;
            default:
                height = rect.top;
                break;
        }
        switch (i6) {
            case 1:
                width -= i3 / 2;
                break;
            case 5:
                break;
            default:
                width -= i3;
                break;
        }
        switch (i7) {
            case 16:
                height -= i4 / 2;
                break;
            case 80:
                break;
            default:
                height -= i4;
                break;
        }
        rect2.set(width, height, width + i3, height + i4);
    }

    private final void a(defpackage.ha haVar, android.graphics.Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = java.lang.Math.max(getPaddingLeft() + haVar.leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i2) - haVar.rightMargin));
        int max2 = java.lang.Math.max(getPaddingTop() + haVar.topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i3) - haVar.bottomMargin));
        rect.set(max, max2, max + i2, max2 + i3);
    }

    private static int c(int i2) {
        int i3;
        if ((i2 & 7) == 0) {
            i3 = 8388611 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 112) == 0) {
            return i3 | 48;
        }
        return i3;
    }

    private static int d(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x027d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20) {
        /*
            r19 = this;
            sw r2 = defpackage.sn.a
            r0 = r19
            int r2 = r2.j(r0)
            r0 = r19
            java.util.List r3 = r0.j
            int r13 = r3.size()
            android.graphics.Rect r14 = a()
            android.graphics.Rect r15 = a()
            android.graphics.Rect r16 = a()
            r3 = 0
            r12 = r3
        L_0x001e:
            if (r12 >= r13) goto L_0x029f
            r0 = r19
            java.util.List r3 = r0.j
            java.lang.Object r3 = r3.get(r12)
            r8 = r3
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            r9 = r3
            ha r9 = (defpackage.ha) r9
            if (r20 != 0) goto L_0x003c
            int r3 = r8.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x029a
        L_0x003c:
            r3 = 0
            r11 = r3
        L_0x003e:
            if (r11 >= r12) goto L_0x00d4
            r0 = r19
            java.util.List r3 = r0.j
            java.lang.Object r3 = r3.get(r11)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r9.l
            if (r4 != r3) goto L_0x00cd
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            ha r5 = (defpackage.ha) r5
            android.view.View r3 = r5.k
            if (r3 == 0) goto L_0x00cd
            android.graphics.Rect r3 = a()
            android.graphics.Rect r17 = a()
            android.graphics.Rect r4 = a()
            android.view.View r6 = r5.k
            r0 = r19
            defpackage.vz.a(r0, r6, r3)
            r6 = 0
            r0 = r19
            r1 = r17
            r0.a(r8, r6, r1)
            int r6 = r8.getMeasuredWidth()
            int r7 = r8.getMeasuredHeight()
            a(r2, r3, r4, r5, r6, r7)
            int r10 = r4.left
            r0 = r17
            int r0 = r0.left
            r18 = r0
            r0 = r18
            if (r10 != r0) goto L_0x0096
            int r10 = r4.top
            r0 = r17
            int r0 = r0.top
            r18 = r0
            r0 = r18
            if (r10 == r0) goto L_0x00d2
        L_0x0096:
            r10 = 1
        L_0x0097:
            r0 = r19
            r0.a(r5, r4, r6, r7)
            int r6 = r4.left
            r0 = r17
            int r7 = r0.left
            int r6 = r6 - r7
            int r7 = r4.top
            r0 = r17
            int r0 = r0.top
            r18 = r0
            int r7 = r7 - r18
            if (r6 == 0) goto L_0x00b2
            defpackage.sn.c(r8, r6)
        L_0x00b2:
            if (r7 == 0) goto L_0x00b7
            defpackage.sn.b(r8, r7)
        L_0x00b7:
            if (r10 == 0) goto L_0x00c4
            gx r6 = r5.a
            if (r6 == 0) goto L_0x00c4
            android.view.View r5 = r5.k
            r0 = r19
            r6.a(r0, r8, r5)
        L_0x00c4:
            a(r3)
            a(r17)
            a(r4)
        L_0x00cd:
            int r3 = r11 + 1
            r11 = r3
            goto L_0x003e
        L_0x00d2:
            r10 = 0
            goto L_0x0097
        L_0x00d4:
            r3 = 1
            r0 = r19
            r0.a(r8, r3, r15)
            int r3 = r9.g
            if (r3 == 0) goto L_0x00f4
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto L_0x00f4
            int r3 = r9.g
            int r3 = defpackage.jd.a(r3, r2)
            r4 = r3 & 112(0x70, float:1.57E-43)
            switch(r4) {
                case 48: goto L_0x0163;
                case 80: goto L_0x016e;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            r3 = r3 & 7
            switch(r3) {
                case 3: goto L_0x017f;
                case 4: goto L_0x00f4;
                case 5: goto L_0x018b;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            int r3 = r9.h
            if (r3 == 0) goto L_0x0112
            int r3 = r8.getVisibility()
            if (r3 != 0) goto L_0x0112
            sw r3 = defpackage.sn.a
            boolean r3 = r3.r(r8)
            if (r3 == 0) goto L_0x0112
            int r3 = r8.getWidth()
            if (r3 <= 0) goto L_0x0112
            int r3 = r8.getHeight()
            if (r3 > 0) goto L_0x019c
        L_0x0112:
            r3 = 2
            r0 = r20
            if (r0 == r3) goto L_0x0137
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            ha r3 = (defpackage.ha) r3
            android.graphics.Rect r3 = r3.o
            r0 = r16
            r0.set(r3)
            r0 = r16
            boolean r3 = r0.equals(r15)
            if (r3 != 0) goto L_0x029a
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            ha r3 = (defpackage.ha) r3
            android.graphics.Rect r3 = r3.o
            r3.set(r15)
        L_0x0137:
            int r3 = r12 + 1
            r5 = r3
        L_0x013a:
            if (r5 >= r13) goto L_0x029a
            r0 = r19
            java.util.List r3 = r0.j
            java.lang.Object r3 = r3.get(r5)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            ha r4 = (defpackage.ha) r4
            gx r6 = r4.a
            if (r6 == 0) goto L_0x015f
            boolean r7 = r6.a_(r8)
            if (r7 == 0) goto L_0x015f
            if (r20 != 0) goto L_0x0286
            boolean r7 = r4.n
            if (r7 == 0) goto L_0x0286
            r3 = 0
            r4.n = r3
        L_0x015f:
            int r3 = r5 + 1
            r5 = r3
            goto L_0x013a
        L_0x0163:
            int r4 = r14.top
            int r5 = r15.bottom
            int r4 = java.lang.Math.max(r4, r5)
            r14.top = r4
            goto L_0x00ef
        L_0x016e:
            int r4 = r14.bottom
            int r5 = r19.getHeight()
            int r6 = r15.top
            int r5 = r5 - r6
            int r4 = java.lang.Math.max(r4, r5)
            r14.bottom = r4
            goto L_0x00ef
        L_0x017f:
            int r3 = r14.left
            int r4 = r15.right
            int r3 = java.lang.Math.max(r3, r4)
            r14.left = r3
            goto L_0x00f4
        L_0x018b:
            int r3 = r14.right
            int r4 = r19.getWidth()
            int r5 = r15.left
            int r4 = r4 - r5
            int r3 = java.lang.Math.max(r3, r4)
            r14.right = r3
            goto L_0x00f4
        L_0x019c:
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            ha r3 = (defpackage.ha) r3
            gx r4 = r3.a
            android.graphics.Rect r5 = a()
            android.graphics.Rect r6 = a()
            int r7 = r8.getLeft()
            int r9 = r8.getTop()
            int r10 = r8.getRight()
            int r11 = r8.getBottom()
            r6.set(r7, r9, r10, r11)
            if (r4 == 0) goto L_0x01f4
            boolean r4 = r4.a(r8, r5)
            if (r4 == 0) goto L_0x01f4
            boolean r4 = r6.contains(r5)
            if (r4 != 0) goto L_0x01f7
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Rect should be within the child's bounds. Rect:"
            r3.<init>(r4)
            java.lang.String r4 = r5.toShortString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " | Bounds:"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r6.toShortString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x01f4:
            r5.set(r6)
        L_0x01f7:
            a(r6)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0281
            int r4 = r3.h
            int r6 = defpackage.jd.a(r4, r2)
            r4 = 0
            r7 = r6 & 48
            r9 = 48
            if (r7 != r9) goto L_0x0220
            int r7 = r5.top
            int r9 = r3.topMargin
            int r7 = r7 - r9
            int r9 = r3.j
            int r7 = r7 - r9
            int r9 = r14.top
            if (r7 >= r9) goto L_0x0220
            int r4 = r14.top
            int r4 = r4 - r7
            e(r8, r4)
            r4 = 1
        L_0x0220:
            r7 = r6 & 80
            r9 = 80
            if (r7 != r9) goto L_0x023f
            int r7 = r19.getHeight()
            int r9 = r5.bottom
            int r7 = r7 - r9
            int r9 = r3.bottomMargin
            int r7 = r7 - r9
            int r9 = r3.j
            int r7 = r7 + r9
            int r9 = r14.bottom
            if (r7 >= r9) goto L_0x023f
            int r4 = r14.bottom
            int r4 = r7 - r4
            e(r8, r4)
            r4 = 1
        L_0x023f:
            if (r4 != 0) goto L_0x0245
            r4 = 0
            e(r8, r4)
        L_0x0245:
            r4 = 0
            r7 = r6 & 3
            r9 = 3
            if (r7 != r9) goto L_0x025e
            int r7 = r5.left
            int r9 = r3.leftMargin
            int r7 = r7 - r9
            int r9 = r3.i
            int r7 = r7 - r9
            int r9 = r14.left
            if (r7 >= r9) goto L_0x025e
            int r4 = r14.left
            int r4 = r4 - r7
            d(r8, r4)
            r4 = 1
        L_0x025e:
            r6 = r6 & 5
            r7 = 5
            if (r6 != r7) goto L_0x02a9
            int r6 = r19.getWidth()
            int r7 = r5.right
            int r6 = r6 - r7
            int r7 = r3.rightMargin
            int r6 = r6 - r7
            int r3 = r3.i
            int r3 = r3 + r6
            int r6 = r14.right
            if (r3 >= r6) goto L_0x02a9
            int r4 = r14.right
            int r3 = r3 - r4
            d(r8, r3)
            r3 = 1
        L_0x027b:
            if (r3 != 0) goto L_0x0281
            r3 = 0
            d(r8, r3)
        L_0x0281:
            a(r5)
            goto L_0x0112
        L_0x0286:
            switch(r20) {
                case 2: goto L_0x0298;
                default: goto L_0x0289;
            }
        L_0x0289:
            r0 = r19
            boolean r3 = r6.a(r0, r3, r8)
        L_0x028f:
            r6 = 1
            r0 = r20
            if (r0 != r6) goto L_0x015f
            r4.n = r3
            goto L_0x015f
        L_0x0298:
            r3 = 1
            goto L_0x028f
        L_0x029a:
            int r3 = r12 + 1
            r12 = r3
            goto L_0x001e
        L_0x029f:
            a(r14)
            a(r15)
            a(r16)
            return
        L_0x02a9:
            r3 = r4
            goto L_0x027b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.a(int):void");
    }

    private static void d(android.view.View view, int i2) {
        defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
        if (haVar.i != i2) {
            ViewCompat.c(view, i2 - haVar.i);
            haVar.i = i2;
        }
    }

    private static void e(android.view.View view, int i2) {
        defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
        if (haVar.j != i2) {
            ViewCompat.b(view, i2 - haVar.j);
            haVar.j = i2;
        }
    }

    public final java.util.List a(android.view.View view) {
        java.util.ArrayList arrayList;
        defpackage.ul ulVar = this.a;
        java.util.ArrayList arrayList2 = null;
        int size = ulVar.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) ulVar.b.c(i2);
            if (arrayList3 != null && arrayList3.contains(view)) {
                if (arrayList2 == null) {
                    arrayList = new java.util.ArrayList();
                } else {
                    arrayList = arrayList2;
                }
                arrayList.add(ulVar.b.b(i2));
                arrayList2 = arrayList;
            }
        }
        this.l.clear();
        if (arrayList2 != null) {
            this.l.addAll(arrayList2);
        }
        return this.l;
    }

    public final java.util.List b(android.view.View view) {
        java.util.List b2 = this.a.b(view);
        this.l.clear();
        if (b2 != null) {
            this.l.addAll(b2);
        }
        return this.l;
    }

    public final boolean a(android.view.View view, int i2, int i3) {
        android.graphics.Rect a2 = a();
        defpackage.vz.a((android.view.ViewGroup) this, view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.ha) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    public final boolean a(android.view.View view, android.view.View view2, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            android.view.View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                defpackage.ha haVar = (defpackage.ha) childAt.getLayoutParams();
                defpackage.gx gxVar = haVar.a;
                if (gxVar != null) {
                    boolean a2 = gxVar.a(this, childAt, view, view2, i2, i3);
                    z = z2 | a2;
                    haVar.a(i3, a2);
                    i4++;
                    z2 = z;
                } else {
                    haVar.a(i3, false);
                }
            }
            z = z2;
            i4++;
            z2 = z;
        }
        return z2;
    }

    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        b(view2, i2);
    }

    public final void b(android.view.View view, int i2) {
        this.w.a = i2;
        this.r = view;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    public void onStopNestedScroll(android.view.View view) {
        c(view, 0);
    }

    public final void c(android.view.View view, int i2) {
        this.w.a = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            defpackage.ha haVar = (defpackage.ha) childAt.getLayoutParams();
            if (haVar.a(i2)) {
                defpackage.gx gxVar = haVar.a;
                if (gxVar != null) {
                    gxVar.a(this, childAt, view, i2);
                }
                haVar.a(i2, false);
                haVar.n = false;
            }
        }
        this.r = null;
    }

    public void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    public final void a(android.view.View view, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        while (i7 < childCount) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                defpackage.ha haVar = (defpackage.ha) childAt.getLayoutParams();
                if (haVar.a(i6)) {
                    defpackage.gx gxVar = haVar.a;
                    if (gxVar != null) {
                        gxVar.a(this, childAt, view, i3, i5, i6);
                        z = true;
                        i7++;
                        z2 = z;
                    }
                }
            }
            z = z2;
            i7++;
            z2 = z;
        }
        if (z2) {
            a(1);
        }
    }

    public void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    public final void a(android.view.View view, int i2, int i3, int[] iArr, int i4) {
        boolean z;
        int i5;
        int i6;
        int min;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            android.view.View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                defpackage.ha haVar = (defpackage.ha) childAt.getLayoutParams();
                if (haVar.a(i4)) {
                    defpackage.gx gxVar = haVar.a;
                    if (gxVar != null) {
                        int[] iArr2 = this.m;
                        this.m[1] = 0;
                        iArr2[0] = 0;
                        gxVar.a(this, childAt, view, i3, this.m, i4);
                        if (i2 > 0) {
                            i5 = java.lang.Math.max(i7, this.m[0]);
                        } else {
                            i5 = java.lang.Math.min(i7, this.m[0]);
                        }
                        if (i3 > 0) {
                            min = java.lang.Math.max(i8, this.m[1]);
                        } else {
                            min = java.lang.Math.min(i8, this.m[1]);
                        }
                        i6 = min;
                        z = true;
                        i9++;
                        i8 = i6;
                        i7 = i5;
                        z2 = z;
                    }
                }
            }
            z = z2;
            i5 = i7;
            i6 = i8;
            i9++;
            i8 = i6;
            i7 = i5;
            z2 = z;
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            a(1);
        }
    }

    public boolean onNestedFling(android.view.View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(android.view.View view, float f2, float f3) {
        boolean z;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < childCount) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                defpackage.ha haVar = (defpackage.ha) childAt.getLayoutParams();
                if (haVar.a(0)) {
                    defpackage.gx gxVar = haVar.a;
                    if (gxVar != null) {
                        z = gxVar.a(this, childAt, view, f2, f3) | z2;
                        i2++;
                        z2 = z;
                    }
                }
            }
            z = z2;
            i2++;
            z2 = z;
        }
        return z2;
    }

    public int getNestedScrollAxes() {
        return this.w.a;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.hc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.hc hcVar = (defpackage.hc) parcelable;
        super.onRestoreInstanceState(hcVar.e);
        android.util.SparseArray sparseArray = hcVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            defpackage.gx gxVar = c(childAt).a;
            if (!(id == -1 || gxVar == null)) {
                android.os.Parcelable parcelable2 = (android.os.Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    gxVar.a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.hc hcVar = new defpackage.hc(super.onSaveInstanceState());
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            defpackage.gx gxVar = ((defpackage.ha) childAt.getLayoutParams()).a;
            if (!(id == -1 || gxVar == null)) {
                android.os.Parcelable b2 = gxVar.b(this, childAt);
                if (b2 != null) {
                    sparseArray.append(id, b2);
                }
            }
        }
        hcVar.a = sparseArray;
        return hcVar;
    }

    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        defpackage.gx gxVar = ((defpackage.ha) view.getLayoutParams()).a;
        if (gxVar == null || !gxVar.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private final void b() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.a.h(this)) {
                if (this.v == null) {
                    this.v = new defpackage.gv(this);
                }
                ViewCompat.setOnApplyWindowInsetsListener((android.view.View) this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            ViewCompat.setOnApplyWindowInsetsListener((android.view.View) this, (defpackage.OnApplyWindowInsetsListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.ha(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.ha) {
            return new defpackage.ha((defpackage.ha) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new defpackage.ha((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new defpackage.ha(layoutParams);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.ha(getContext(), attributeSet);
    }

    static {
        java.lang.Package packageR = android.support.design.widget.CoordinatorLayout.class.getPackage();
        e = packageR != null ? packageR.getName() : null;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            h = new defpackage.he();
        } else {
            h = null;
        }
    }
}
