package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: PG */
public final class ViewStubCompat extends View {
    public LayoutInflater a;
    private int b;
    private int c;
    private WeakReference d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.dh, i, 0);
        this.c = obtainStyledAttributes.getResourceId(xu.dj, -1);
        this.b = obtainStyledAttributes.getResourceId(xu.dk, 0);
        setId(obtainStyledAttributes.getResourceId(xu.di, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void setVisibility(int i) {
        if (this.d != null) {
            View view = (View) this.d.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public final View a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.a != null) {
                from = this.a;
            } else {
                from = LayoutInflater.from(getContext());
            }
            View inflate = from.inflate(this.b, viewGroup, false);
            if (this.c != -1) {
                inflate.setId(this.c);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.d = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }
}
