package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: arp  reason: default package */
/* compiled from: PG */
public class arp extends FrameLayout {
    public aro a;
    public arn b;

    public arp(Context context) {
        this(context, null);
    }

    public arp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ail.c);
        if (obtainStyledAttributes.hasValue(ail.d)) {
            sn.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(ail.d, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            aro aro = this.a;
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
        sn.a.g(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            arn arn = this.b;
            if (arr.a().d(arn.a.f)) {
                ard.a.post(new arj(arn));
            }
        }
    }
}
