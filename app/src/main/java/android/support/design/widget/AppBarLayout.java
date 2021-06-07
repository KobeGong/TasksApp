package android.support.design.widget;

import android.content.Context;
import android.os.Build;
import android.support.design.appbar.AppBarLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

@gy(a = Behavior.class)
@Deprecated
/* compiled from: PG */
public class AppBarLayout extends android.support.design.appbar.AppBarLayout {
    public AppBarLayout(Context context) {
        super(context);
    }

    @Deprecated
    /* compiled from: PG */
    public class Behavior extends AppBarLayout.BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Deprecated
    /* compiled from: PG */
    public class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static da b(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new da((LinearLayout.LayoutParams) layoutParams, (byte) 0);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new da((ViewGroup.MarginLayoutParams) layoutParams, (byte) 0);
        }
        return new da(layoutParams, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.appbar.AppBarLayout
    public final /* synthetic */ da a(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.support.design.appbar.AppBarLayout
    public final /* synthetic */ da a(AttributeSet attributeSet) {
        return (da) generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.appbar.AppBarLayout
    public final /* synthetic */ da b() {
        return new da((byte) 0);
    }
}
