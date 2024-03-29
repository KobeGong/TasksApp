package android.support.design.widget;

import defpackage.ClsToolbarLP;

@defpackage.gy(a = android.support.design.widget.AppBarLayout.Behavior.class)
@java.lang.Deprecated
/* compiled from: PG */
public class AppBarLayout extends android.support.design.appbar.AppBarLayout {

    @java.lang.Deprecated
    /* compiled from: PG */
    public class Behavior extends android.support.design.appbar.AppBarLayout.BaseBehavior {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @java.lang.Deprecated
    /* compiled from: PG */
    public class ScrollingViewBehavior extends android.support.design.appbar.AppBarLayout.ScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public AppBarLayout(android.content.Context context) {
        super(context);
    }

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static ClsToolbarLP b(android.view.ViewGroup.LayoutParams layoutParams) {
        if (android.os.Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new ClsToolbarLP((android.widget.LinearLayout.LayoutParams) layoutParams, 0);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new ClsToolbarLP((android.view.ViewGroup.MarginLayoutParams) layoutParams, 0);
        }
        return new ClsToolbarLP(layoutParams, 0);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ClsToolbarLP a(android.view.ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public final /* synthetic */ ClsToolbarLP a(android.util.AttributeSet attributeSet) {
        return (ClsToolbarLP) generateLayoutParams(attributeSet);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ClsToolbarLP b() {
        return new ClsToolbarLP(0);
    }
}
