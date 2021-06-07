package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@Deprecated
/* renamed from: go  reason: default package */
/* compiled from: PG */
public class go extends FrameLayout {
    public go(Context context) {
        this(context, (AttributeSet) null);
    }

    public go(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gp.a);
        if (obtainStyledAttributes.hasValue(gp.c)) {
            sn.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(gp.c, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sn.a.g(this);
    }

    public go(Context context, byte b) {
        this(context);
    }

    public go(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet);
    }
}
