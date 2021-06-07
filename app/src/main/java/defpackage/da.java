package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

@Deprecated
/* renamed from: da  reason: default package */
/* compiled from: PG */
public final class da extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;

    public da(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dh.b);
        this.a = obtainStyledAttributes.getInt(dh.c, 0);
        if (obtainStyledAttributes.hasValue(dh.d)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(dh.d, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public da() {
        super(-1, -2);
        this.a = 1;
    }

    public da(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public da(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public da(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public da(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet);
    }

    public da(byte b2) {
        this();
    }

    public da(ViewGroup.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }

    public da(ViewGroup.MarginLayoutParams marginLayoutParams, byte b2) {
        this(marginLayoutParams);
    }

    public da(LinearLayout.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }
}
