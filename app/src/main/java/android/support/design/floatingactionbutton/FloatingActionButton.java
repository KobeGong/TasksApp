package android.support.design.floatingactionbutton;

@defpackage.gy(a = android.support.design.floatingactionbutton.FloatingActionButton.Behavior.class)
/* compiled from: PG */
public class FloatingActionButton extends defpackage.fq implements defpackage.sm, defpackage.vu {

    /* compiled from: PG */
    public class BaseBehavior extends defpackage.gx {
        private boolean a;

        public BaseBehavior() {
            this.a = true;
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eu.a);
            this.a = obtainStyledAttributes.getBoolean(defpackage.eu.b, true);
            obtainStyledAttributes.recycle();
        }

        public final void a(defpackage.ha haVar) {
            if (haVar.h == 0) {
                haVar.h = 80;
            }
        }

        private static boolean b(android.view.View view) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof defpackage.ha) {
                return ((defpackage.ha) layoutParams).a instanceof android.support.design.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        private final boolean a(android.view.View view, android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton) {
            defpackage.ha haVar = (defpackage.ha) floatingActionButton.getLayoutParams();
            if (!this.a || haVar.f != view.getId()) {
                return false;
            }
            throw new java.lang.NoSuchMethodError();
        }

        private final boolean a(android.support.design.appbar.AppBarLayout appBarLayout, android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton) {
            a((android.view.View) appBarLayout, floatingActionButton);
            return false;
        }

        private final boolean b(android.view.View view, android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton) {
            a(view, floatingActionButton);
            return false;
        }

        /* access modifiers changed from: private */
        public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton, int i) {
            java.util.List a2 = coordinatorLayout.a((android.view.View) floatingActionButton);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.view.View view = (android.view.View) a2.get(i2);
                if (view instanceof android.support.design.appbar.AppBarLayout) {
                    a((android.support.design.appbar.AppBarLayout) view, floatingActionButton);
                } else if (b(view)) {
                    b(view, floatingActionButton);
                }
            }
            coordinatorLayout.a((android.view.View) floatingActionButton, i);
            return true;
        }

        public final /* synthetic */ boolean a(android.view.View view, android.graphics.Rect rect) {
            android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton = (android.support.design.floatingactionbutton.FloatingActionButton) view;
            rect.set(floatingActionButton.getLeft() + null.left, floatingActionButton.getTop() + null.top, floatingActionButton.getRight() - null.right, floatingActionButton.getBottom() - null.bottom);
            return true;
        }

        public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            android.support.design.floatingactionbutton.FloatingActionButton floatingActionButton = (android.support.design.floatingactionbutton.FloatingActionButton) view;
            if (view2 instanceof android.support.design.appbar.AppBarLayout) {
                a((android.support.design.appbar.AppBarLayout) view2, floatingActionButton);
            } else if (b(view2)) {
                b(view2, floatingActionButton);
            }
            return false;
        }
    }

    /* compiled from: PG */
    public class Behavior extends android.support.design.floatingactionbutton.FloatingActionButton.BaseBehavior {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        throw new java.lang.NoSuchMethodError();
    }

    public android.content.res.ColorStateList getBackgroundTintList() {
        throw new java.lang.NoSuchMethodError();
    }

    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        throw new java.lang.NoSuchMethodError();
    }

    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        throw new java.lang.NoSuchMethodError();
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        throw new java.lang.NoSuchMethodError();
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        throw new java.lang.NoSuchMethodError();
    }

    public final android.content.res.ColorStateList d_() {
        throw new java.lang.NoSuchMethodError();
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        throw new java.lang.NoSuchMethodError();
    }

    public final android.graphics.PorterDuff.Mode b() {
        throw new java.lang.NoSuchMethodError();
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        throw new java.lang.NoSuchMethodError();
    }

    public final android.content.res.ColorStateList c() {
        throw new java.lang.NoSuchMethodError();
    }

    public final void b(android.graphics.PorterDuff.Mode mode) {
        throw new java.lang.NoSuchMethodError();
    }

    public final android.graphics.PorterDuff.Mode d() {
        throw new java.lang.NoSuchMethodError();
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.NoSuchMethodError();
    }

    public void setBackgroundResource(int i) {
        throw new java.lang.NoSuchMethodError();
    }

    public void setBackgroundColor(int i) {
        throw new java.lang.NoSuchMethodError();
    }

    public void setImageResource(int i) {
        throw new java.lang.NoSuchMethodError();
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        throw new java.lang.NoSuchMethodError();
    }

    public void jumpDrawablesToCurrentState() {
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        throw new java.lang.NoSuchMethodError();
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        throw new java.lang.NoSuchMethodError();
    }
}
