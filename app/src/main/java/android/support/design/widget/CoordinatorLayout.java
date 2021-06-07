package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements sj {
    private static final String e;
    private static final Class[] f = {Context.class, AttributeSet.class};
    private static final ThreadLocal g = new ThreadLocal();
    private static final Comparator h;
    private static final rg i = new rh();
    public final ul a;
    public tk b;
    public boolean c;
    public ViewGroup.OnHierarchyChangeListener d;
    private final List j;
    private final List k;
    private final List l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private hb s;
    private boolean t;
    private Drawable u;
    private sl v;
    private final sk w;

    private static Rect a() {
        Rect rect = (Rect) i.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private static void a(Rect rect) {
        rect.setEmpty();
        i.a(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.j = new ArrayList();
        this.a = new ul();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new int[2];
        this.w = new sk();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co.a, 0, 2132017774);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co.a, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(co.j, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.p[i3] = (int) (((float) this.p[i3]) * f2);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(co.k);
        obtainStyledAttributes.recycle();
        b();
        super.setOnHierarchyChangeListener(new gz(this));
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.d = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.t) {
            if (this.s == null) {
                this.s = new hb(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.b == null && sn.a.h(this)) {
            sn.a.g(this);
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
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState) | false;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
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
            View childAt = getChildAt(i2);
            gx gxVar = ((ha) childAt.getLayoutParams()).a;
            if (gxVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    gxVar.a(this, childAt, obtain);
                } else {
                    gxVar.b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((ha) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.q = null;
        this.n = false;
    }

    private final boolean a(MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent2;
        int i3;
        boolean z4 = false;
        boolean z5 = false;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
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
            Collections.sort(list, h);
        }
        int size = list.size();
        int i5 = 0;
        MotionEvent motionEvent3 = null;
        while (true) {
            if (i5 < size) {
                View view = (View) list.get(i5);
                ha haVar = (ha) view.getLayoutParams();
                gx gxVar = haVar.a;
                if (!(z4 || z5) || actionMasked == 0) {
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
                        z3 = z7;
                        motionEvent2 = motionEvent3;
                    }
                } else if (gxVar != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    } else {
                        motionEvent2 = motionEvent3;
                    }
                    switch (i2) {
                        case 0:
                            gxVar.a(this, view, motionEvent2);
                            z3 = z5;
                            z = z4;
                            break;
                        case 1:
                            gxVar.b(this, view, motionEvent2);
                        default:
                            z3 = z5;
                            z = z4;
                            break;
                    }
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 >= 0 && i2 < this.p.length) {
            return this.p[i2];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        }
    }

    public static gx a(Context context, AttributeSet attributeSet, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(e)) {
            str = e + '.' + str;
        }
        try {
            Map map = (Map) g.get();
            if (map == null) {
                HashMap hashMap2 = new HashMap();
                g.set(hashMap2);
                hashMap = hashMap2;
            } else {
                hashMap = map;
            }
            Constructor<?> constructor = (Constructor) hashMap.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f);
                constructor.setAccessible(true);
                hashMap.put(str, constructor);
            }
            return (gx) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private static ha c(View view) {
        ha haVar = (ha) view.getLayoutParams();
        if (!haVar.b) {
            if (view instanceof gw) {
                gx a2 = ((gw) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                haVar.a(a2);
                haVar.b = true;
            } else {
                gy gyVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    gyVar = (gy) cls.getAnnotation(gy.class);
                    if (gyVar != null) {
                        break;
                    }
                }
                if (gyVar != null) {
                    try {
                        haVar.a((gx) gyVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        Log.e("CoordinatorLayout", "Default behavior class " + gyVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                    }
                }
                haVar.b = true;
            }
        }
        return haVar;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
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
        // Method dump skipped, instructions count: 997
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final void a(View view, int i2) {
        boolean z;
        int i3;
        int i4;
        ha haVar = (ha) view.getLayoutParams();
        if (haVar.k != null || haVar.f == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (haVar.k != null) {
            View view2 = haVar.k;
            Rect a2 = a();
            Rect a3 = a();
            try {
                vz.a(this, view2, a2);
                ha haVar2 = (ha) view.getLayoutParams();
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
            ha haVar3 = (ha) view.getLayoutParams();
            int a4 = jd.a(d(haVar3.c), i2);
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
            int max = Math.max(getPaddingLeft() + haVar3.leftMargin, Math.min(i3, ((width - getPaddingRight()) - measuredWidth2) - haVar3.rightMargin));
            int max2 = Math.max(getPaddingTop() + haVar3.topMargin, Math.min(i4, ((height - getPaddingBottom()) - measuredHeight2) - haVar3.bottomMargin));
            view.layout(max, max2, max + measuredWidth2, measuredHeight2 + max2);
        } else {
            ha haVar4 = (ha) view.getLayoutParams();
            Rect a5 = a();
            a5.set(getPaddingLeft() + haVar4.leftMargin, getPaddingTop() + haVar4.topMargin, (getWidth() - getPaddingRight()) - haVar4.rightMargin, (getHeight() - getPaddingBottom()) - haVar4.bottomMargin);
            if (this.b != null && sn.a.h(this) && !sn.a.h(view)) {
                a5.left += this.b.a();
                a5.top += this.b.b();
                a5.right -= this.b.c();
                a5.bottom -= this.b.d();
            }
            Rect a6 = a();
            jd.a(c(haVar4.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i2);
            view.layout(a6.left, a6.top, a6.right, a6.bottom);
            a(a5);
            a(a6);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        gx gxVar;
        int j2 = sn.a.j(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((gxVar = ((ha) view.getLayoutParams()).a) == null || !gxVar.a(this, view, j2))) {
                a(view, j2);
            }
        }
    }

    public void onDraw(Canvas canvas) {
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

    private final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            vz.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private static void a(int i2, Rect rect, Rect rect2, ha haVar, int i3, int i4) {
        int width;
        int height;
        int i5 = haVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int a2 = jd.a(i5, i2);
        int a3 = jd.a(c(haVar.d), i2);
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

    private final void a(ha haVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + haVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - haVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + haVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - haVar.bottomMargin));
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
    public boolean drawChild(Canvas canvas, View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    public final void a(int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int height;
        int i4;
        gx gxVar;
        int j2 = sn.a.j(this);
        int size = this.j.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.j.get(i5);
            ha haVar = (ha) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i6 = 0; i6 < i5; i6++) {
                    if (haVar.l == ((View) this.j.get(i6))) {
                        ha haVar2 = (ha) view.getLayoutParams();
                        if (haVar2.k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            vz.a(this, haVar2.k, a5);
                            a(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            a(j2, a5, a7, haVar2, measuredWidth, measuredHeight);
                            boolean z3 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            a(haVar2, a7, measuredWidth, measuredHeight);
                            int i7 = a7.left - a6.left;
                            int i8 = a7.top - a6.top;
                            if (i7 != 0) {
                                sn.c(view, i7);
                            }
                            if (i8 != 0) {
                                sn.b(view, i8);
                            }
                            if (z3 && (gxVar = haVar2.a) != null) {
                                gxVar.a(this, view, haVar2.k);
                            }
                            a(a5);
                            a(a6);
                            a(a7);
                        }
                    }
                }
                a(view, true, a3);
                if (haVar.g != 0 && !a3.isEmpty()) {
                    int a8 = jd.a(haVar.g, j2);
                    switch (a8 & 112) {
                        case 48:
                            a2.top = Math.max(a2.top, a3.bottom);
                            break;
                        case 80:
                            a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                            break;
                    }
                    switch (a8 & 7) {
                        case 3:
                            a2.left = Math.max(a2.left, a3.right);
                            break;
                        case 5:
                            a2.right = Math.max(a2.right, getWidth() - a3.left);
                            break;
                    }
                }
                if (haVar.h != 0 && view.getVisibility() == 0 && sn.a.r(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    ha haVar3 = (ha) view.getLayoutParams();
                    gx gxVar2 = haVar3.a;
                    Rect a9 = a();
                    Rect a10 = a();
                    a10.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (gxVar2 == null || !gxVar2.a(view, a9)) {
                        a9.set(a10);
                    } else if (!a10.contains(a9)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a9.toShortString() + " | Bounds:" + a10.toShortString());
                    }
                    a(a10);
                    if (!a9.isEmpty()) {
                        int a11 = jd.a(haVar3.h, j2);
                        boolean z4 = false;
                        if ((a11 & 48) == 48 && (i4 = (a9.top - haVar3.topMargin) - haVar3.j) < a2.top) {
                            e(view, a2.top - i4);
                            z4 = true;
                        }
                        if ((a11 & 80) == 80 && (height = ((getHeight() - a9.bottom) - haVar3.bottomMargin) + haVar3.j) < a2.bottom) {
                            e(view, height - a2.bottom);
                            z4 = true;
                        }
                        if (!z4) {
                            e(view, 0);
                        }
                        boolean z5 = false;
                        if ((a11 & 3) == 3 && (i3 = (a9.left - haVar3.leftMargin) - haVar3.i) < a2.left) {
                            d(view, a2.left - i3);
                            z5 = true;
                        }
                        if ((a11 & 5) != 5 || (width = haVar3.i + ((getWidth() - a9.right) - haVar3.rightMargin)) >= a2.right) {
                            z2 = z5;
                        } else {
                            d(view, width - a2.right);
                            z2 = true;
                        }
                        if (!z2) {
                            d(view, 0);
                        }
                    }
                    a(a9);
                }
                if (i2 != 2) {
                    a4.set(((ha) view.getLayoutParams()).o);
                    if (!a4.equals(a3)) {
                        ((ha) view.getLayoutParams()).o.set(a3);
                    }
                }
                for (int i9 = i5 + 1; i9 < size; i9++) {
                    View view2 = (View) this.j.get(i9);
                    ha haVar4 = (ha) view2.getLayoutParams();
                    gx gxVar3 = haVar4.a;
                    if (gxVar3 != null && gxVar3.a_(view)) {
                        if (i2 != 0 || !haVar4.n) {
                            switch (i2) {
                                case 2:
                                    z = true;
                                    break;
                                default:
                                    z = gxVar3.a(this, view2, view);
                                    break;
                            }
                            if (i2 == 1) {
                                haVar4.n = z;
                            }
                        } else {
                            haVar4.n = false;
                        }
                    }
                }
            }
        }
        a(a2);
        a(a3);
        a(a4);
    }

    private static void d(View view, int i2) {
        ha haVar = (ha) view.getLayoutParams();
        if (haVar.i != i2) {
            sn.c(view, i2 - haVar.i);
            haVar.i = i2;
        }
    }

    private static void e(View view, int i2) {
        ha haVar = (ha) view.getLayoutParams();
        if (haVar.j != i2) {
            sn.b(view, i2 - haVar.j);
            haVar.j = i2;
        }
    }

    public final List a(View view) {
        ArrayList arrayList;
        ul ulVar = this.a;
        ArrayList arrayList2 = null;
        int size = ulVar.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList3 = (ArrayList) ulVar.b.c(i2);
            if (arrayList3 != null && arrayList3.contains(view)) {
                if (arrayList2 == null) {
                    arrayList = new ArrayList();
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

    public final List b(View view) {
        List b2 = this.a.b(view);
        this.l.clear();
        if (b2 != null) {
            this.l.addAll(b2);
        }
        return this.l;
    }

    public final boolean a(View view, int i2, int i3) {
        Rect a2 = a();
        vz.a(this, view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a(a2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ha) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.si
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    @Override // defpackage.sj
    public final boolean a(View view, View view2, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ha haVar = (ha) childAt.getLayoutParams();
                gx gxVar = haVar.a;
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

    @Override // defpackage.si
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view2, i2);
    }

    @Override // defpackage.sj
    public final void b(View view, int i2) {
        this.w.a = i2;
        this.r = view;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    @Override // defpackage.si
    public void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // defpackage.sj
    public final void c(View view, int i2) {
        this.w.a = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ha haVar = (ha) childAt.getLayoutParams();
            if (haVar.a(i2)) {
                gx gxVar = haVar.a;
                if (gxVar != null) {
                    gxVar.a(this, childAt, view, i2);
                }
                haVar.a(i2, false);
                haVar.n = false;
            }
        }
        this.r = null;
    }

    @Override // defpackage.si
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    @Override // defpackage.sj
    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        gx gxVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ha haVar = (ha) childAt.getLayoutParams();
                if (haVar.a(i6) && (gxVar = haVar.a) != null) {
                    gxVar.a(this, childAt, view, i3, i5, i6);
                    z = true;
                    i7++;
                    z2 = z;
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

    @Override // defpackage.si
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // defpackage.sj
    public final void a(View view, int i2, int i3, int[] iArr, int i4) {
        boolean z;
        int i5;
        int i6;
        gx gxVar;
        int min;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ha haVar = (ha) childAt.getLayoutParams();
                if (haVar.a(i4) && (gxVar = haVar.a) != null) {
                    int[] iArr2 = this.m;
                    this.m[1] = 0;
                    iArr2[0] = 0;
                    gxVar.a(this, childAt, view, i3, this.m, i4);
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.m[0]);
                    } else {
                        i5 = Math.min(i7, this.m[0]);
                    }
                    if (i3 > 0) {
                        min = Math.max(i8, this.m[1]);
                    } else {
                        min = Math.min(i8, this.m[1]);
                    }
                    i6 = min;
                    z = true;
                    i9++;
                    i8 = i6;
                    i7 = i5;
                    z2 = z;
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

    @Override // defpackage.si
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    @Override // defpackage.si
    public boolean onNestedPreFling(View view, float f2, float f3) {
        boolean z;
        gx gxVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ha haVar = (ha) childAt.getLayoutParams();
                if (haVar.a(0) && (gxVar = haVar.a) != null) {
                    z = gxVar.a(this, childAt, view, f2, f3) | z2;
                    i2++;
                    z2 = z;
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof hc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hc hcVar = (hc) parcelable;
        super.onRestoreInstanceState(hcVar.e);
        SparseArray sparseArray = hcVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            gx gxVar = c(childAt).a;
            if (!(id == -1 || gxVar == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                gxVar.a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable b2;
        hc hcVar = new hc(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            gx gxVar = ((ha) childAt.getLayoutParams()).a;
            if (!(id == -1 || gxVar == null || (b2 = gxVar.b(this, childAt)) == null)) {
                sparseArray.append(id, b2);
            }
        }
        hcVar.a = sparseArray;
        return hcVar;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        gx gxVar = ((ha) view.getLayoutParams()).a;
        if (gxVar == null || !gxVar.a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private final void b() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (sn.a.h(this)) {
                if (this.v == null) {
                    this.v = new gv(this);
                }
                sn.a(this, this.v);
                setSystemUiVisibility(1280);
                return;
            }
            sn.a(this, (sl) null);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ha(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ha) {
            return new ha((ha) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ha((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ha(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ha(getContext(), attributeSet);
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        e = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            h = new he();
        } else {
            h = null;
        }
    }
}
