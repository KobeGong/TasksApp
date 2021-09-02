package defpackage;

@java.lang.Deprecated
/* renamed from: dd reason: default package */
/* compiled from: PG */
public final class dd extends android.widget.FrameLayout.LayoutParams {
    public int a;
    public float b;

    public dd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dh.k);
        this.a = obtainStyledAttributes.getInt(defpackage.dh.l, 0);
        this.b = obtainStyledAttributes.getFloat(defpackage.dh.m, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public dd() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public dd(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }

    public dd(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        this(context, attributeSet);
    }

    public dd(byte b2) {
        this();
    }

    public dd(android.view.ViewGroup.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }
}
