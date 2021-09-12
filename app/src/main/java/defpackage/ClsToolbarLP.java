package defpackage;

@java.lang.Deprecated
/* renamed from: da reason: default package */
/* compiled from: PG */
public final class ClsToolbarLP extends android.widget.LinearLayout.LayoutParams {
    public int scrollFlags;
    public android.view.animation.Interpolator b;

    public ClsToolbarLP(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollFlags = 1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dh.b);
        this.scrollFlags = obtainStyledAttributes.getInt(defpackage.dh.c, 0);
        if (obtainStyledAttributes.hasValue(defpackage.dh.d)) {
            this.b = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(defpackage.dh.d, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public ClsToolbarLP() {
        super(-1, -2);
        this.scrollFlags = 1;
    }

    public ClsToolbarLP(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.scrollFlags = 1;
    }

    public ClsToolbarLP(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.scrollFlags = 1;
    }

    public ClsToolbarLP(android.widget.LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.scrollFlags = 1;
    }

    public ClsToolbarLP(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        this(context, attributeSet);
    }

    public ClsToolbarLP(byte b2) {
        this();
    }

    public ClsToolbarLP(android.view.ViewGroup.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }

    public ClsToolbarLP(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, byte b2) {
        this(marginLayoutParams);
    }

    public ClsToolbarLP(android.widget.LinearLayout.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }
}
