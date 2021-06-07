package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
public final class ActivityChooserView extends ViewGroup {

    /* compiled from: PG */
    public class InnerLayout extends LinearLayout {
        private static final int[] a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            agw a2 = agw.a(context, attributeSet, a);
            setBackgroundDrawable(a2.a(0));
            a2.b.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }
}
