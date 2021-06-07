package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: wb  reason: default package */
/* compiled from: PG */
public class wb extends ViewGroup.MarginLayoutParams {
    public int a;

    public wb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.b);
        this.a = obtainStyledAttributes.getInt(xu.c, 0);
        obtainStyledAttributes.recycle();
    }

    public wb() {
        super(-2, -2);
        this.a = 0;
        this.a = 8388627;
    }

    public wb(wb wbVar) {
        super((ViewGroup.MarginLayoutParams) wbVar);
        this.a = 0;
        this.a = wbVar.a;
    }

    public wb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
