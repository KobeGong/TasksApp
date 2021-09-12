package defpackage;

/* renamed from: arp reason: default package */
/* compiled from: PG */
public class arp extends android.widget.FrameLayout {
    public defpackage.aro a;
    public defpackage.arn b;

    public arp(android.content.Context context) {
        this(context, null);
    }

    public arp(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ail.c);
        if (obtainStyledAttributes.hasValue(defpackage.ail.d)) {
            ViewCompat.setElevation((android.view.View) this, (float) obtainStyledAttributes.getDimensionPixelSize(defpackage.ail.d, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            defpackage.aro aro = this.a;
            aro.a.d.a = null;
            if (aro.a.e()) {
                aro.a.c();
            } else {
                aro.a.d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewCompat.a.g(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            defpackage.arn arn = this.b;
            if (defpackage.arr.a().d(arn.a.f)) {
                defpackage.ard.a.post(new defpackage.arj(arn));
            }
        }
    }
}
