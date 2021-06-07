package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: adv  reason: default package */
/* compiled from: PG */
public class adv extends ViewGroup.MarginLayoutParams {
    public float g;
    public int h;

    public adv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.aJ);
        this.g = obtainStyledAttributes.getFloat(xu.aL, 0.0f);
        this.h = obtainStyledAttributes.getInt(xu.aK, -1);
        obtainStyledAttributes.recycle();
    }

    public adv(int i) {
        super(i, -2);
        this.h = -1;
        this.g = 0.0f;
    }

    public adv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.h = -1;
    }
}
