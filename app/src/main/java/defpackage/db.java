package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.appbar.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

/* renamed from: db  reason: default package */
/* compiled from: PG */
public class db extends FrameLayout {
    public int a;
    public int b;
    public final ew c;
    public Drawable d;
    public int e;
    public tk f;
    private boolean g;
    private int h;
    private Toolbar i;
    private View j;
    private View k;
    private int l;
    private int m;
    private final Rect n;
    private boolean o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private ValueAnimator t;
    private long u;
    private int v;
    private cz w;

    public db(Context context) {
        this(context, null);
    }

    public db(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public db(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Drawable drawable = null;
        this.g = true;
        this.n = new Rect();
        this.v = -1;
        this.c = new ew(this);
        ew ewVar = this.c;
        ewVar.w = cs.d;
        ewVar.c();
        TypedArray a2 = fp.a(context, attributeSet, dh.j, i2, 2132017717);
        ew ewVar2 = this.c;
        int i3 = a2.getInt(dh.q, 8388691);
        if (ewVar2.e != i3) {
            ewVar2.e = i3;
            ewVar2.c();
        }
        ew ewVar3 = this.c;
        int i4 = a2.getInt(dh.n, 8388627);
        if (ewVar3.f != i4) {
            ewVar3.f = i4;
            ewVar3.c();
        }
        int dimensionPixelSize = a2.getDimensionPixelSize(dh.r, 0);
        this.b = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.a = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (a2.hasValue(dh.u)) {
            this.l = a2.getDimensionPixelSize(dh.u, 0);
        }
        if (a2.hasValue(dh.t)) {
            this.m = a2.getDimensionPixelSize(dh.t, 0);
        }
        if (a2.hasValue(dh.v)) {
            this.a = a2.getDimensionPixelSize(dh.v, 0);
        }
        if (a2.hasValue(dh.s)) {
            this.b = a2.getDimensionPixelSize(dh.s, 0);
        }
        this.o = a2.getBoolean(dh.B, true);
        a(a2.getText(dh.A));
        this.c.b(2132017496);
        this.c.a(2132017470);
        if (a2.hasValue(dh.w)) {
            this.c.b(a2.getResourceId(dh.w, 0));
        }
        if (a2.hasValue(dh.o)) {
            this.c.a(a2.getResourceId(dh.o, 0));
        }
        this.v = a2.getDimensionPixelSize(dh.y, -1);
        this.u = (long) a2.getInt(dh.x, 600);
        Drawable drawable2 = a2.getDrawable(dh.p);
        if (this.q != drawable2) {
            if (this.q != null) {
                this.q.setCallback(null);
            }
            this.q = drawable2 != null ? drawable2.mutate() : null;
            if (this.q != null) {
                this.q.setBounds(0, 0, getWidth(), getHeight());
                this.q.setCallback(this);
                this.q.setAlpha(this.r);
            }
            sn.a.c(this);
        }
        Drawable drawable3 = a2.getDrawable(dh.z);
        if (this.d != drawable3) {
            if (this.d != null) {
                this.d.setCallback(null);
            }
            this.d = drawable3 != null ? drawable3.mutate() : drawable;
            if (this.d != null) {
                if (this.d.isStateful()) {
                    this.d.setState(getDrawableState());
                }
                jd.b(this.d, sn.a.j(this));
                this.d.setVisible(getVisibility() == 0, false);
                this.d.setCallback(this);
                this.d.setAlpha(this.r);
            }
            sn.a.c(this);
        }
        this.h = a2.getResourceId(dh.C, -1);
        a2.recycle();
        setWillNotDraw(false);
        sn.a(this, new gk(this));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            sn.b(this, sn.a.h((View) parent));
            if (this.w == null) {
                this.w = new cz(this);
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            cz czVar = this.w;
            if (appBarLayout.d == null) {
                appBarLayout.d = new ArrayList();
            }
            if (czVar != null && !appBarLayout.d.contains(czVar)) {
                appBarLayout.d.add(czVar);
            }
            sn.a.g(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.w != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            cz czVar = this.w;
            if (!(appBarLayout.d == null || czVar == null)) {
                appBarLayout.d.remove(czVar);
            }
        }
        super.onDetachedFromWindow();
    }

    public void draw(Canvas canvas) {
        int i2;
        float f2;
        super.draw(canvas);
        c();
        if (this.i == null && this.q != null && this.r > 0) {
            this.q.mutate().setAlpha(this.r);
            this.q.draw(canvas);
        }
        if (this.o && this.p) {
            ew ewVar = this.c;
            int save = canvas.save();
            if (ewVar.n != null && ewVar.a) {
                float f3 = ewVar.i;
                float f4 = ewVar.j;
                boolean z = ewVar.o && ewVar.p != null;
                if (z) {
                    f2 = ewVar.r * ewVar.s;
                } else {
                    ewVar.v.ascent();
                    f2 = 0.0f;
                    ewVar.v.descent();
                }
                if (z) {
                    f4 += f2;
                }
                if (ewVar.s != 1.0f) {
                    canvas.scale(ewVar.s, ewVar.s, f3, f4);
                }
                if (z) {
                    canvas.drawBitmap(ewVar.p, f3, f4, ewVar.q);
                } else {
                    canvas.drawText(ewVar.n, 0, ewVar.n.length(), f3, f4, ewVar.v);
                }
            }
            canvas.restoreToCount(save);
        }
        if (this.d != null && this.r > 0) {
            if (this.f != null) {
                i2 = this.f.b();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                this.d.setBounds(0, -this.e, getWidth(), i2 - this.e);
                this.d.mutate().setAlpha(this.r);
                this.d.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        boolean z2;
        if (this.q != null && this.r > 0) {
            if (this.j == null || this.j == this) {
                z2 = view == this.i;
            } else {
                z2 = view == this.j;
            }
            if (z2) {
                this.q.mutate().setAlpha(this.r);
                this.q.draw(canvas);
                z = true;
                return !super.drawChild(canvas, view, j2) || z;
            }
        }
        z = false;
        if (!super.drawChild(canvas, view, j2)) {
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.q != null) {
            this.q.setBounds(0, 0, i2, i3);
        }
    }

    private final void c() {
        Toolbar toolbar;
        if (this.g) {
            this.i = null;
            this.j = null;
            if (this.h != -1) {
                this.i = (Toolbar) findViewById(this.h);
                if (this.i != null) {
                    View view = this.i;
                    ViewParent parent = view.getParent();
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                    }
                    this.j = view;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        toolbar = null;
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.i = toolbar;
            }
            if (!this.o && this.k != null) {
                ViewParent parent2 = this.k.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(this.k);
                }
            }
            if (this.o && this.i != null) {
                if (this.k == null) {
                    this.k = new View(getContext());
                }
                if (this.k.getParent() == null) {
                    this.i.addView(this.k, -1, -1);
                }
            }
            this.g = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        c();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int b2 = this.f != null ? this.f.b() : 0;
        if (mode == 0 && b2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(b2 + getMeasuredHeight(), 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f != null) {
            int b2 = this.f.b();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!sn.a.h(childAt) && childAt.getTop() < b2) {
                    sn.b(childAt, b2);
                }
            }
        }
        if (this.o && this.k != null) {
            this.p = sn.a.s(this.k) && this.k.getVisibility() == 0;
            if (this.p) {
                boolean z2 = sn.a.j(this) == 1;
                int b3 = b(this.j != null ? this.j : this.i);
                ex.a(this, this.k, this.n);
                ew ewVar = this.c;
                int i9 = this.n.left;
                if (z2) {
                    i6 = this.i.t;
                } else {
                    i6 = this.i.s;
                }
                int i10 = i9 + i6;
                int i11 = this.i.u + this.n.top + b3;
                int i12 = this.n.right;
                if (z2) {
                    i7 = this.i.s;
                } else {
                    i7 = this.i.t;
                }
                int i13 = i7 + i12;
                int i14 = (b3 + this.n.bottom) - this.i.v;
                if (!ew.a(ewVar.d, i10, i11, i13, i14)) {
                    ewVar.d.set(i10, i11, i13, i14);
                    ewVar.u = true;
                    ewVar.a();
                }
                ew ewVar2 = this.c;
                int i15 = z2 ? this.m : this.l;
                int i16 = this.n.top + this.a;
                int i17 = (i4 - i2) - (z2 ? this.l : this.m);
                int i18 = (i5 - i3) - this.b;
                if (!ew.a(ewVar2.c, i15, i16, i17, i18)) {
                    ewVar2.c.set(i15, i16, i17, i18);
                    ewVar2.u = true;
                    ewVar2.a();
                }
                this.c.c();
            }
        }
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            a(getChildAt(i19)).a();
        }
        if (this.i != null) {
            if (this.o && TextUtils.isEmpty(this.c.m)) {
                this.c.a(this.i.x);
            }
            if (this.j == null || this.j == this) {
                setMinimumHeight(c(this.i));
            } else {
                setMinimumHeight(c(this.j));
            }
        }
        b();
    }

    private static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.bottomMargin + view.getHeight() + marginLayoutParams.topMargin;
    }

    public static dj a(View view) {
        dj djVar = (dj) view.getTag(R.id.view_offset_helper);
        if (djVar != null) {
            return djVar;
        }
        dj djVar2 = new dj(view);
        view.setTag(R.id.view_offset_helper, djVar2);
        return djVar2;
    }

    public final void a(CharSequence charSequence) {
        this.c.a(charSequence);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 != this.r) {
            if (!(this.q == null || this.i == null)) {
                sn.a.c(this.i);
            }
            this.r = i2;
            sn.a.c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        boolean z2 = false;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isStateful()) {
            z = false;
        } else {
            z = drawable.setState(drawableState) | false;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (this.c != null) {
            ew ewVar = this.c;
            ewVar.t = drawableState;
            if ((ewVar.h != null && ewVar.h.isStateful()) || (ewVar.g != null && ewVar.g.isStateful())) {
                ewVar.c();
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.d;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        if (!(this.d == null || this.d.isVisible() == z)) {
            this.d.setVisible(z, false);
        }
        if (this.q != null && this.q.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dd;
    }

    /* renamed from: a */
    public dd generateDefaultLayoutParams() {
        return new dd();
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dd(getContext(), attributeSet);
    }

    /* renamed from: a */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new dd(layoutParams);
    }

    public final void b() {
        int height;
        boolean z;
        boolean z2;
        int i2;
        TimeInterpolator timeInterpolator;
        int i3 = 255;
        if (this.q != null || this.d != null) {
            int height2 = this.e + getHeight();
            if (this.v >= 0) {
                height = this.v;
            } else {
                int b2 = this.f != null ? this.f.b() : 0;
                int f2 = sn.a.f(this);
                if (f2 > 0) {
                    height = Math.min(b2 + (f2 << 1), getHeight());
                } else {
                    height = getHeight() / 3;
                }
            }
            if (height2 < height) {
                z = true;
            } else {
                z = false;
            }
            if (!sn.a.r(this) || isInEditMode()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.s != z) {
                if (z2) {
                    if (z) {
                        i2 = 255;
                    } else {
                        i2 = 0;
                    }
                    c();
                    if (this.t == null) {
                        this.t = new ValueAnimator();
                        this.t.setDuration(this.u);
                        ValueAnimator valueAnimator = this.t;
                        if (i2 > this.r) {
                            timeInterpolator = cs.b;
                        } else {
                            timeInterpolator = cs.c;
                        }
                        valueAnimator.setInterpolator(timeInterpolator);
                        this.t.addUpdateListener(new dc(this));
                    } else if (this.t.isRunning()) {
                        this.t.cancel();
                    }
                    this.t.setIntValues(this.r, i2);
                    this.t.start();
                } else {
                    if (!z) {
                        i3 = 0;
                    }
                    a(i3);
                }
                this.s = z;
            }
        }
    }

    public final int b(View view) {
        return ((getHeight() - a(view).a) - view.getHeight()) - ((dd) view.getLayoutParams()).bottomMargin;
    }
}
