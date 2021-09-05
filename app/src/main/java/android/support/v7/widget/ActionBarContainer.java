package android.support.v7.widget;

import defpackage.ViewCompat;

/* compiled from: PG */
public class ActionBarContainer extends android.widget.FrameLayout {
    public android.view.View a;
    public android.graphics.drawable.Drawable b;
    public android.graphics.drawable.Drawable c;
    public android.graphics.drawable.Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private android.view.View h;
    private android.view.View i;
    private int j;

    public ActionBarContainer(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.a((android.view.View) this, android.os.Build.VERSION.SDK_INT >= 21 ? new defpackage.aai(this) : new defpackage.aah(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.a);
        this.b = obtainStyledAttributes.getDrawable(defpackage.xu.d);
        this.c = obtainStyledAttributes.getDrawable(defpackage.xu.f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(defpackage.xu.l, -1);
        if (getId() == 2131755032) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(defpackage.xu.e);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.e ? this.d == null : this.b == null && this.c == null;
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(2131755207);
        this.i = findViewById(2131755208);
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.b != null) {
            this.b.setVisible(z, false);
        }
        if (this.c != null) {
            this.c.setVisible(z, false);
        }
        if (this.d != null) {
            this.d.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return (drawable == this.b && !this.e) || (drawable == this.c && this.f) || ((drawable == this.d && this.e) || super.verifyDrawable(drawable));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null && this.b.isStateful()) {
            this.b.setState(getDrawableState());
        }
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(getDrawableState());
        }
        if (this.d != null && this.d.isStateful()) {
            this.d.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.b != null) {
            this.b.jumpToCurrentState();
        }
        if (this.c != null) {
            this.c.jumpToCurrentState();
        }
        if (this.d != null) {
            this.d.jumpToCurrentState();
        }
    }

    public final void a(boolean z) {
        this.g = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    public android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void onMeasure(int i2, int i3) {
        if (this.h == null && android.view.View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && this.j >= 0) {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(this.j, android.view.View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.h != null) {
            android.view.View.MeasureSpec.getMode(i3);
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2 = true;
        super.onLayout(z, i2, i3, i4, i5);
        if (!this.e) {
            if (this.b == null) {
                z2 = false;
            } else if (this.h.getVisibility() == 0) {
                this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            } else if (this.i == null || this.i.getVisibility() != 0) {
                this.b.setBounds(0, 0, 0, 0);
            } else {
                this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            }
            this.f = false;
        } else if (this.d != null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }
}
