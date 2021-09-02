package defpackage;

@java.lang.Deprecated
/* renamed from: da reason: default package */
/* compiled from: PG */
public final class da extends android.widget.LinearLayout.LayoutParams {
    public int a;
    public android.view.animation.Interpolator b;

    public da(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dh.b);
        this.a = obtainStyledAttributes.getInt(defpackage.dh.c, 0);
        if (obtainStyledAttributes.hasValue(defpackage.dh.d)) {
            this.b = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(defpackage.dh.d, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public da() {
        super(-1, -2);
        this.a = 1;
    }

    public da(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public da(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public da(android.widget.LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public da(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        this(context, attributeSet);
    }

    public da(byte b2) {
        this();
    }

    public da(android.view.ViewGroup.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }

    public da(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, byte b2) {
        this(marginLayoutParams);
    }

    public da(android.widget.LinearLayout.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }
}
