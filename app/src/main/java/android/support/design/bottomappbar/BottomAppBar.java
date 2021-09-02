package android.support.design.bottomappbar;

@defpackage.gy(a = android.support.design.bottomappbar.BottomAppBar.Behavior.class)
/* compiled from: PG */
public class BottomAppBar extends android.support.v7.widget.Toolbar {
    private final int E;
    private final defpackage.dw F;
    public final defpackage.gd a;
    public android.animation.Animator b;
    public android.animation.Animator c;
    public int d;
    public boolean e;
    public boolean f;

    /* compiled from: PG */
    public class Behavior extends android.support.design.behavior.HideBottomViewOnScrollBehavior {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void c(android.view.View view) {
            android.support.design.bottomappbar.BottomAppBar bottomAppBar = (android.support.design.bottomappbar.BottomAppBar) view;
            super.c(bottomAppBar);
            if (bottomAppBar.a() != null) {
                new android.graphics.Rect();
                throw new java.lang.NoSuchMethodError();
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void b(android.view.View view) {
            android.support.design.bottomappbar.BottomAppBar bottomAppBar = (android.support.design.bottomappbar.BottomAppBar) view;
            super.b(bottomAppBar);
            android.support.design.floatingactionbutton.FloatingActionButton a = bottomAppBar.a();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.c()).setInterpolator(defpackage.cs.c).setDuration(225);
            }
        }

        public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
            android.support.design.bottomappbar.BottomAppBar bottomAppBar = (android.support.design.bottomappbar.BottomAppBar) view;
            android.support.design.floatingactionbutton.FloatingActionButton a = bottomAppBar.a();
            if (a != null) {
                ((defpackage.ha) a.getLayoutParams()).d = 17;
                throw new java.lang.NoSuchMethodError();
            }
            if (!((bottomAppBar.b != null && bottomAppBar.b.isRunning()) || (bottomAppBar.c != null && bottomAppBar.c.isRunning()))) {
                bottomAppBar.e();
            }
            coordinatorLayout.a((android.view.View) bottomAppBar, i);
            return super.a(coordinatorLayout, bottomAppBar, i);
        }

        public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
            android.support.design.bottomappbar.BottomAppBar bottomAppBar = (android.support.design.bottomappbar.BottomAppBar) view;
            return bottomAppBar.e && super.a(coordinatorLayout, (android.view.View) bottomAppBar, view2, view3, i, i2);
        }
    }

    public BottomAppBar(android.content.Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130771968);
    }

    public BottomAppBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new defpackage.dt(this);
        android.content.res.TypedArray a2 = defpackage.fp.a(context, attributeSet, defpackage.dx.a, i, 2132017751);
        android.content.res.ColorStateList a3 = defpackage.gm.a(context, a2, defpackage.dx.b);
        float dimensionPixelOffset = (float) a2.getDimensionPixelOffset(defpackage.dx.e, 0);
        float dimensionPixelOffset2 = (float) a2.getDimensionPixelOffset(defpackage.dx.f, 0);
        float dimensionPixelOffset3 = (float) a2.getDimensionPixelOffset(defpackage.dx.g, 0);
        this.f = a2.getBoolean(defpackage.dx.d, true);
        this.d = a2.getInt(defpackage.dx.c, 0);
        this.e = a2.getBoolean(defpackage.dx.h, false);
        a2.recycle();
        this.E = getResources().getDimensionPixelOffset(2131689767);
        this.F = new defpackage.dw(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        defpackage.gi giVar = new defpackage.gi();
        giVar.e = this.F;
        this.a = new defpackage.gd(giVar);
        defpackage.gd gdVar = this.a;
        gdVar.c = 1.0f;
        gdVar.invalidateSelf();
        defpackage.gd gdVar2 = this.a;
        gdVar2.a = true;
        gdVar2.invalidateSelf();
        defpackage.gd gdVar3 = this.a;
        gdVar3.d = android.graphics.Paint.Style.FILL;
        gdVar3.invalidateSelf();
        defpackage.jd.a((android.graphics.drawable.Drawable) this.a, a3);
        defpackage.sn.a((android.view.View) this, (android.graphics.drawable.Drawable) this.a);
    }

    public final android.support.design.floatingactionbutton.FloatingActionButton a() {
        if (!(getParent() instanceof android.support.design.widget.CoordinatorLayout)) {
            return null;
        }
        for (android.view.View view : ((android.support.design.widget.CoordinatorLayout) getParent()).b((android.view.View) this)) {
            if (view instanceof android.support.design.floatingactionbutton.FloatingActionButton) {
                return (android.support.design.floatingactionbutton.FloatingActionButton) view;
            }
        }
        return null;
    }

    public final boolean b() {
        if (a() == null) {
            return false;
        }
        throw new java.lang.NoSuchMethodError();
    }

    public final float c() {
        if (a() == null) {
            return 0.0f;
        }
        new android.graphics.Rect();
        throw new java.lang.NoSuchMethodError();
    }

    private final float o() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = this.d;
        if (defpackage.sn.a.j(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) - this.E;
            if (z) {
                i2 = -1;
            }
            i = i2 * measuredWidth;
        } else {
            i = 0;
        }
        return (float) i;
    }

    public final android.support.v7.widget.ActionMenuView d() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return null;
            }
            android.view.View childAt = getChildAt(i2);
            if (childAt instanceof android.support.v7.widget.ActionMenuView) {
                return (android.support.v7.widget.ActionMenuView) childAt;
            }
            i = i2 + 1;
        }
    }

    public final void a(android.support.v7.widget.ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2;
        boolean z3 = defpackage.sn.a.j(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            android.view.View childAt = getChildAt(i3);
            if (!(childAt.getLayoutParams() instanceof defpackage.aha) || (((defpackage.aha) childAt.getLayoutParams()).a & 8388615) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i2 = java.lang.Math.max(i2, z3 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z3 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b != null) {
            this.b.cancel();
        }
        if (this.c != null) {
            this.c.cancel();
        }
        e();
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        this.F.a = o();
        android.support.design.floatingactionbutton.FloatingActionButton a2 = a();
        defpackage.gd gdVar = this.a;
        if (this.f) {
            b();
        }
        gdVar.a(0.0f);
        if (a2 != null) {
            a2.setTranslationY(c());
            a2.setTranslationX(o());
        }
        android.support.v7.widget.ActionMenuView d2 = d();
        if (d2 != null) {
            d2.setAlpha(1.0f);
            b();
            a(d2, 0, false);
        }
    }

    public final void a(java.lang.CharSequence charSequence) {
    }

    public final void b(java.lang.CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.du duVar = new defpackage.du(super.onSaveInstanceState());
        duVar.a = this.d;
        duVar.b = this.f;
        return duVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.du)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.du duVar = (defpackage.du) parcelable;
        super.onRestoreInstanceState(duVar.e);
        this.d = duVar.a;
        this.f = duVar.b;
    }
}
