package android.support.design.widget;

@java.lang.Deprecated
/* compiled from: PG */
public class CollapsingToolbarLayout extends defpackage.db {
    public CollapsingToolbarLayout(android.content.Context context) {
        super(context);
    }

    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CollapsingToolbarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.dd(getContext(), attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final android.widget.FrameLayout.LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.dd(layoutParams, 0);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ defpackage.dd a() {
        return new defpackage.dd(0);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }
}
