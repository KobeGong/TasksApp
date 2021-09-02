package defpackage;

@java.lang.Deprecated
/* renamed from: go reason: default package */
/* compiled from: PG */
public class go extends android.widget.FrameLayout {
    public go(android.content.Context context) {
        this(context, (android.util.AttributeSet) null);
    }

    public go(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gp.a);
        if (obtainStyledAttributes.hasValue(defpackage.gp.c)) {
            defpackage.sn.a((android.view.View) this, (float) obtainStyledAttributes.getDimensionPixelSize(defpackage.gp.c, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.sn.a.g(this);
    }

    public go(android.content.Context context, byte b) {
        this(context);
    }

    public go(android.content.Context context, android.util.AttributeSet attributeSet, byte b) {
        this(context, attributeSet);
    }
}
