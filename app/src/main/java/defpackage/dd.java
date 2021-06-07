package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

@Deprecated
/* renamed from: dd  reason: default package */
/* compiled from: PG */
public final class dd extends FrameLayout.LayoutParams {
    public int a;
    public float b;

    public dd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dh.k);
        this.a = obtainStyledAttributes.getInt(dh.l, 0);
        this.b = obtainStyledAttributes.getFloat(dh.m, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public dd() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public dd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }

    public dd(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet);
    }

    public dd(byte b2) {
        this();
    }

    public dd(ViewGroup.LayoutParams layoutParams, byte b2) {
        this(layoutParams);
    }
}
