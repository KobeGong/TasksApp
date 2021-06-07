package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: aha  reason: default package */
/* compiled from: PG */
public final class aha extends wb {
    public int b = 0;

    public aha(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public aha() {
        this.a = 8388627;
    }

    public aha(aha aha) {
        super((wb) aha);
        this.b = aha.b;
    }

    public aha(wb wbVar) {
        super(wbVar);
    }

    public aha(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public aha(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
