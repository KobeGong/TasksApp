package android.support.design.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.floatingactionbutton.FloatingActionButton;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.tasks.R;

@gy(a = Behavior.class)
/* compiled from: PG */
public class BottomAppBar extends Toolbar {
    private final int E;
    private final dw F;
    public final gd a;
    public Animator b;
    public Animator c;
    public int d;
    public boolean e;
    public boolean f;

    /* compiled from: PG */
    public class Behavior extends HideBottomViewOnScrollBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void c(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.c(bottomAppBar);
            if (bottomAppBar.a() != null) {
                new Rect();
                throw new NoSuchMethodError();
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ void b(View view) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            super.b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.a();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.c()).setInterpolator(cs.c).setDuration(225);
            }
        }

        @Override // defpackage.gx, android.support.design.behavior.HideBottomViewOnScrollBehavior
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            FloatingActionButton a = bottomAppBar.a();
            if (a != null) {
                ((ha) a.getLayoutParams()).d = 17;
                throw new NoSuchMethodError();
            }
            if (!((bottomAppBar.b != null && bottomAppBar.b.isRunning()) || (bottomAppBar.c != null && bottomAppBar.c.isRunning()))) {
                bottomAppBar.e();
            }
            coordinatorLayout.a(bottomAppBar, i);
            return super.a(coordinatorLayout, bottomAppBar, i);
        }

        @Override // defpackage.gx
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.e && super.a(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new dt(this);
        TypedArray a2 = fp.a(context, attributeSet, dx.a, i, 2132017751);
        ColorStateList a3 = gm.a(context, a2, dx.b);
        this.f = a2.getBoolean(dx.d, true);
        this.d = a2.getInt(dx.c, 0);
        this.e = a2.getBoolean(dx.h, false);
        a2.recycle();
        this.E = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        this.F = new dw((float) a2.getDimensionPixelOffset(dx.e, 0), (float) a2.getDimensionPixelOffset(dx.f, 0), (float) a2.getDimensionPixelOffset(dx.g, 0));
        gi giVar = new gi();
        giVar.e = this.F;
        this.a = new gd(giVar);
        gd gdVar = this.a;
        gdVar.c = 1.0f;
        gdVar.invalidateSelf();
        gd gdVar2 = this.a;
        gdVar2.a = true;
        gdVar2.invalidateSelf();
        gd gdVar3 = this.a;
        gdVar3.d = Paint.Style.FILL;
        gdVar3.invalidateSelf();
        jd.a((Drawable) this.a, a3);
        sn.a(this, this.a);
    }

    public final FloatingActionButton a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).b(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    public final boolean b() {
        if (a() == null) {
            return false;
        }
        throw new NoSuchMethodError();
    }

    public final float c() {
        if (a() == null) {
            return 0.0f;
        }
        new Rect();
        throw new NoSuchMethodError();
    }

    private final float o() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = this.d;
        if (sn.a.j(this) == 1) {
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

    public final ActionMenuView d() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public final void a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = sn.a.j(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof aha) && (((aha) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar
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

    /* access modifiers changed from: package-private */
    public final void e() {
        this.F.a = o();
        FloatingActionButton a2 = a();
        gd gdVar = this.a;
        if (this.f) {
            b();
        }
        gdVar.a(0.0f);
        if (a2 != null) {
            a2.setTranslationY(c());
            a2.setTranslationX(o());
        }
        ActionMenuView d2 = d();
        if (d2 != null) {
            d2.setAlpha(1.0f);
            b();
            a(d2, 0, false);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void a(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void b(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        du duVar = new du(super.onSaveInstanceState());
        duVar.a = this.d;
        duVar.b = this.f;
        return duVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof du)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        du duVar = (du) parcelable;
        super.onRestoreInstanceState(duVar.e);
        this.d = duVar.a;
        this.f = duVar.b;
    }
}
