package android.support.design.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class Chip extends abi implements eq {
    public static final Rect a = new Rect();
    private static final int[] d = {16842913};
    public ep b;
    public View.OnClickListener c;
    private boolean e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final eo j;
    private final Rect k;
    private final RectF l;

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        fy fyVar;
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        this.f = Integer.MIN_VALUE;
        this.k = new Rect();
        this.l = new RectF();
        ep epVar = new ep(context);
        TypedArray a2 = fp.a(epVar.y, attributeSet, er.a, i2, 2132017761);
        ColorStateList a3 = gm.a(epVar.y, a2, er.e);
        if (epVar.a != a3) {
            epVar.a = a3;
            epVar.onStateChange(epVar.getState());
        }
        float dimension = a2.getDimension(er.k, 0.0f);
        if (epVar.b != dimension) {
            epVar.b = dimension;
            epVar.invalidateSelf();
            epVar.a();
        }
        float dimension2 = a2.getDimension(er.f, 0.0f);
        if (epVar.c != dimension2) {
            epVar.c = dimension2;
            epVar.invalidateSelf();
        }
        ColorStateList a4 = gm.a(epVar.y, a2, er.m);
        if (epVar.d != a4) {
            epVar.d = a4;
            epVar.onStateChange(epVar.getState());
        }
        float dimension3 = a2.getDimension(er.n, 0.0f);
        if (epVar.e != dimension3) {
            epVar.e = dimension3;
            epVar.z.setStrokeWidth(dimension3);
            epVar.invalidateSelf();
        }
        ColorStateList a5 = gm.a(epVar.y, a2, er.y);
        if (epVar.f != a5) {
            epVar.f = a5;
            epVar.g();
            epVar.onStateChange(epVar.getState());
        }
        epVar.a(a2.getText(er.o));
        Context context2 = epVar.y;
        if (!a2.hasValue(0) || (resourceId = a2.getResourceId(0, 0)) == 0) {
            fyVar = null;
        } else {
            fyVar = new fy(context2, resourceId);
        }
        epVar.a(fyVar);
        boolean z = a2.getBoolean(er.i, false);
        if (epVar.h != z) {
            boolean b2 = epVar.b();
            epVar.h = z;
            boolean b3 = epVar.b();
            if (b2 != b3) {
                if (b3) {
                    epVar.c(epVar.i);
                } else {
                    ep.b(epVar.i);
                }
                epVar.invalidateSelf();
                epVar.a();
            }
        }
        epVar.d(gm.b(epVar.y, a2, er.h));
        float dimension4 = a2.getDimension(er.j, 0.0f);
        if (epVar.j != dimension4) {
            float e2 = epVar.e();
            epVar.j = dimension4;
            float e3 = epVar.e();
            epVar.invalidateSelf();
            if (e2 != e3) {
                epVar.a();
            }
        }
        epVar.b(a2.getBoolean(er.q, false));
        Drawable b4 = gm.b(epVar.y, a2, er.p);
        if (epVar.k != null) {
            Drawable drawable3 = epVar.k;
            drawable = drawable3 instanceof AbstractC0001pg ? ((AbstractC0001pg) drawable3).a() : drawable3;
        } else {
            drawable = null;
        }
        if (drawable != b4) {
            float f2 = epVar.f();
            if (b4 != null) {
                drawable2 = jd.d(b4).mutate();
            } else {
                drawable2 = null;
            }
            epVar.k = drawable2;
            float f3 = epVar.f();
            ep.b(drawable);
            if (epVar.d()) {
                epVar.c(epVar.k);
            }
            epVar.invalidateSelf();
            if (f2 != f3) {
                epVar.a();
            }
        }
        ColorStateList a6 = gm.a(epVar.y, a2, er.u);
        if (epVar.l != a6) {
            epVar.l = a6;
            if (epVar.d()) {
                jd.a(epVar.k, a6);
            }
            epVar.onStateChange(epVar.getState());
        }
        float dimension5 = a2.getDimension(er.s, 0.0f);
        if (epVar.m != dimension5) {
            epVar.m = dimension5;
            epVar.invalidateSelf();
            if (epVar.d()) {
                epVar.a();
            }
        }
        boolean z2 = a2.getBoolean(er.b, false);
        if (epVar.n != z2) {
            epVar.n = z2;
            float e4 = epVar.e();
            if (!z2 && epVar.A) {
                epVar.A = false;
            }
            float e5 = epVar.e();
            epVar.invalidateSelf();
            if (e4 != e5) {
                epVar.a();
            }
        }
        boolean z3 = a2.getBoolean(er.d, false);
        if (epVar.o != z3) {
            boolean c2 = epVar.c();
            epVar.o = z3;
            boolean c3 = epVar.c();
            if (c2 != c3) {
                if (c3) {
                    epVar.c(epVar.p);
                } else {
                    ep.b(epVar.p);
                }
                epVar.invalidateSelf();
                epVar.a();
            }
        }
        Drawable b5 = gm.b(epVar.y, a2, er.c);
        if (epVar.p != b5) {
            float e6 = epVar.e();
            epVar.p = b5;
            float e7 = epVar.e();
            ep.b(epVar.p);
            epVar.c(epVar.p);
            epVar.invalidateSelf();
            if (e6 != e7) {
                epVar.a();
            }
        }
        ct.a(epVar.y, a2, er.z);
        ct.a(epVar.y, a2, er.v);
        float dimension6 = a2.getDimension(er.l, 0.0f);
        if (epVar.q != dimension6) {
            epVar.q = dimension6;
            epVar.invalidateSelf();
            epVar.a();
        }
        float dimension7 = a2.getDimension(er.x, 0.0f);
        if (epVar.r != dimension7) {
            float e8 = epVar.e();
            epVar.r = dimension7;
            float e9 = epVar.e();
            epVar.invalidateSelf();
            if (e8 != e9) {
                epVar.a();
            }
        }
        float dimension8 = a2.getDimension(er.w, 0.0f);
        if (epVar.s != dimension8) {
            float e10 = epVar.e();
            epVar.s = dimension8;
            float e11 = epVar.e();
            epVar.invalidateSelf();
            if (e10 != e11) {
                epVar.a();
            }
        }
        float dimension9 = a2.getDimension(er.B, 0.0f);
        if (epVar.t != dimension9) {
            epVar.t = dimension9;
            epVar.invalidateSelf();
            epVar.a();
        }
        float dimension10 = a2.getDimension(er.A, 0.0f);
        if (epVar.u != dimension10) {
            epVar.u = dimension10;
            epVar.invalidateSelf();
            epVar.a();
        }
        float dimension11 = a2.getDimension(er.t, 0.0f);
        if (epVar.v != dimension11) {
            epVar.v = dimension11;
            epVar.invalidateSelf();
            if (epVar.d()) {
                epVar.a();
            }
        }
        float dimension12 = a2.getDimension(er.r, 0.0f);
        if (epVar.w != dimension12) {
            epVar.w = dimension12;
            epVar.invalidateSelf();
            if (epVar.d()) {
                epVar.a();
            }
        }
        float dimension13 = a2.getDimension(er.g, 0.0f);
        if (epVar.x != dimension13) {
            epVar.x = dimension13;
            epVar.invalidateSelf();
            epVar.a();
        }
        a2.recycle();
        if (this.b != epVar) {
            ep epVar2 = this.b;
            if (epVar2 != null) {
                epVar2.a((eq) null);
            }
            this.b = epVar;
            this.b.a(this);
            if (fz.a) {
                RippleDrawable rippleDrawable = new RippleDrawable(fz.a(this.b.f), this.b, null);
                this.b.a(false);
                sn.a(this, rippleDrawable);
            } else {
                this.b.a(true);
                sn.a(this, this.b);
            }
        }
        this.j = new eo(this, this);
        sn.a(this, this.j);
        sn.a((View) this, 1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new en(this));
        }
        setChecked(this.e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.eq
    public final void a() {
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setChecked(boolean z) {
        if (this.b == null) {
            this.e = z;
        } else if (this.b.n) {
            isChecked();
            super.setChecked(z);
        }
    }

    public final boolean b() {
        boolean z;
        playSoundEffect(0);
        if (this.c != null) {
            this.c.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.j.b(0, 1);
        return z;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = d().contains(motionEvent.getX(), motionEvent.getY());
        switch (actionMasked) {
            case 0:
                if (contains) {
                    b(true);
                    z = true;
                    break;
                }
                z = false;
                break;
            case 1:
                if (this.g) {
                    b();
                    z = true;
                    b(false);
                    break;
                }
                z = false;
                b(false);
            case 2:
                if (this.g) {
                    if (!contains) {
                        b(false);
                    }
                    z = true;
                    break;
                }
                z = false;
                break;
            case 3:
                z = false;
                b(false);
                break;
            default:
                z = false;
                break;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 7:
                c(d().contains(motionEvent.getX(), motionEvent.getY()));
                break;
            case 10:
                c(false);
                break;
        }
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        eo eoVar = this.j;
        if (eoVar.b.isEnabled() && eoVar.b.isTouchExplorationEnabled()) {
            switch (motionEvent.getAction()) {
                case 7:
                case 9:
                    int a2 = eoVar.a(motionEvent.getX(), motionEvent.getY());
                    eoVar.a(a2);
                    if (a2 == Integer.MIN_VALUE) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 8:
                default:
                    z = false;
                    break;
                case 10:
                    if (eoVar.d == Integer.MIN_VALUE) {
                        z = false;
                        break;
                    } else {
                        eoVar.a(Integer.MIN_VALUE);
                        z = true;
                        break;
                    }
            }
        } else {
            z = false;
        }
        return z || super.dispatchHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            c(-1);
        } else {
            c(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z, i2, rect);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    private final boolean a(boolean z) {
        if (this.f == Integer.MIN_VALUE) {
            c(-1);
        }
        if (z) {
            if (this.f == -1) {
                c(0);
                return true;
            }
        } else if (this.f == 0) {
            c(-1);
            return true;
        }
        return false;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f == 0) {
            rect.set(e());
        } else {
            super.getFocusedRect(rect);
        }
    }

    private final void c(int i2) {
        if (this.f != i2) {
            if (this.f == 0) {
                d(false);
            }
            this.f = i2;
            if (i2 == 0) {
                d(true);
            }
        }
    }

    private final void b(boolean z) {
        if (this.g != z) {
            this.g = z;
            refreshDrawableState();
        }
    }

    private final void c(boolean z) {
        if (this.h != z) {
            this.h = z;
            refreshDrawableState();
        }
    }

    private final void d(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int i2;
        int i3 = 1;
        boolean z = false;
        super.drawableStateChanged();
        if (this.b != null && ep.a(this.b.k)) {
            ep epVar = this.b;
            if (isEnabled()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.i) {
                i2++;
            }
            if (this.h) {
                i2++;
            }
            if (this.g) {
                i2++;
            }
            if (isChecked()) {
                i2++;
            }
            int[] iArr = new int[i2];
            if (isEnabled()) {
                iArr[0] = 16842910;
            } else {
                i3 = 0;
            }
            if (this.i) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.h) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.g) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            z = epVar.a(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean c() {
        return (this.b == null || this.b.k == null) ? false : true;
    }

    public final RectF d() {
        this.l.setEmpty();
        if (c()) {
            ep epVar = this.b;
            RectF rectF = this.l;
            Rect bounds = epVar.getBounds();
            rectF.setEmpty();
            if (epVar.d()) {
                float f2 = epVar.x + epVar.w + epVar.m + epVar.v + epVar.u;
                if (jd.e(epVar) == 0) {
                    rectF.right = (float) bounds.right;
                    rectF.left = rectF.right - f2;
                } else {
                    rectF.left = (float) bounds.left;
                    rectF.right = ((float) bounds.left) + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.l;
    }

    public final Rect e() {
        RectF d2 = d();
        this.k.set((int) d2.left, (int) d2.top, (int) d2.right, (int) d2.bottom);
        return this.k;
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!d().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void a(CharSequence charSequence) {
        if (this.b != null) {
            this.b.a(charSequence);
        }
    }

    public final void a(int i2) {
        if (this.b != null) {
            ep epVar = this.b;
            epVar.a(new fy(epVar.y, i2));
        }
    }

    public final void b(int i2) {
        if (this.b != null) {
            ep epVar = this.b;
            epVar.d(xw.b(epVar.y, i2));
        }
    }
}
