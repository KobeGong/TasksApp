package defpackage;

/* renamed from: adv reason: default package */
/* compiled from: PG */
public class adv extends android.view.ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public adv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.aJ);
        this.g = obtainStyledAttributes.getFloat(defpackage.xu.aL, 0.0f);
        this.h = obtainStyledAttributes.getInt(defpackage.xu.aK, -1);
        obtainStyledAttributes.recycle();
    }

    public adv(int i) {
        super(i, -2);
        this.h = -1;
        this.g = 0.0f;
    }

    public adv(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
