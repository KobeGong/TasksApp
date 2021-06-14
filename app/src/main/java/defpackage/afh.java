package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: afh  reason: default package */
/* compiled from: PG */
public final class afh extends ViewGroup.MarginLayoutParams {
    public ViewHolder a;
    public final Rect b = new Rect();
    public boolean c = true;
    public boolean d = false;

    public afh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public afh() {
        super(-2, -2);
    }

    public afh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public afh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public afh(afh afh) {
        super((ViewGroup.LayoutParams) afh);
    }
}
