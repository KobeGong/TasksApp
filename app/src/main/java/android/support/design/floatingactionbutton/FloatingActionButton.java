package android.support.design.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.design.appbar.AppBarLayout;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

@gy(a = Behavior.class)
/* compiled from: PG */
public class FloatingActionButton extends fq implements sm, vu {
    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ColorStateList getBackgroundTintList() {
        throw new NoSuchMethodError();
    }

    /* compiled from: PG */
    public class BaseBehavior extends gx {
        private boolean a;

        public BaseBehavior() {
            this.a = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu.a);
            this.a = obtainStyledAttributes.getBoolean(eu.b, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.gx
        public final void a(ha haVar) {
            if (haVar.h == 0) {
                haVar.h = 80;
            }
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ha) {
                return ((ha) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean a(View view, FloatingActionButton floatingActionButton) {
            ha haVar = (ha) floatingActionButton.getLayoutParams();
            if (!this.a || haVar.f != view.getId()) {
                return false;
            }
            throw new NoSuchMethodError();
        }

        private final boolean a(AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            a((View) appBarLayout, floatingActionButton);
            return false;
        }

        private final boolean b(View view, FloatingActionButton floatingActionButton) {
            a(view, floatingActionButton);
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List a2 = coordinatorLayout.a(floatingActionButton);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) a2.get(i2);
                if (view instanceof AppBarLayout) {
                    a((AppBarLayout) view, floatingActionButton);
                } else if (b(view)) {
                    b(view, floatingActionButton);
                }
            }
            coordinatorLayout.a(floatingActionButton, i);
            return true;
        }

        @Override // defpackage.gx
        public final /* synthetic */ boolean a(View view, Rect rect) {
            Rect rect2 = null;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.gx
        public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a((AppBarLayout) view2, floatingActionButton);
                return false;
            } else if (!b(view2)) {
                return false;
            } else {
                b(view2, floatingActionButton);
                return false;
            }
        }
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new NoSuchMethodError();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        throw new NoSuchMethodError();
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.sm
    public final void a(ColorStateList colorStateList) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.sm
    public final ColorStateList d_() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.sm
    public final PorterDuff.Mode b() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.vu
    public final void b(ColorStateList colorStateList) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.vu
    public final ColorStateList c() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.vu
    public final void b(PorterDuff.Mode mode) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.vu
    public final PorterDuff.Mode d() {
        throw new NoSuchMethodError();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        throw new NoSuchMethodError();
    }

    public void setBackgroundResource(int i) {
        throw new NoSuchMethodError();
    }

    public void setBackgroundColor(int i) {
        throw new NoSuchMethodError();
    }

    public void setImageResource(int i) {
        throw new NoSuchMethodError();
    }

    public void setImageDrawable(Drawable drawable) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        throw new NoSuchMethodError();
    }

    public void jumpDrawablesToCurrentState() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        throw new NoSuchMethodError();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw new NoSuchMethodError();
    }
}
