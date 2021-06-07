package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {
    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sn.a(this, Build.VERSION.SDK_INT >= 21 ? new aai(this) : new aah(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.a);
        this.b = obtainStyledAttributes.getDrawable(xu.d);
        this.c = obtainStyledAttributes.getDrawable(xu.f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(xu.l, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(xu.e);
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(this.e ? this.d == null : this.b == null && this.c == null);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.action_bar);
        this.i = findViewById(R.id.action_context_bar);
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
    public boolean verifyDrawable(Drawable drawable) {
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void onMeasure(int i2, int i3) {
        if (this.h == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && this.j >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.h != null) {
            View.MeasureSpec.getMode(i3);
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
