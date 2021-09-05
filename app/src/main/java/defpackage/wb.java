package defpackage;

/* renamed from: wb reason: default package */
/* compiled from: PG */
public class wb extends android.view.ViewGroup.MarginLayoutParams {
    public int gravity;

    public wb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.b);
        this.gravity = obtainStyledAttributes.getInt(defpackage.xu.c, 0);
        obtainStyledAttributes.recycle();
    }

    public wb() {
        super(-2, -2);
        this.gravity = 0;
        this.gravity = 8388627;
    }

    public wb(defpackage.wb wbVar) {
        super(wbVar);
        this.gravity = 0;
        this.gravity = wbVar.gravity;
    }

    public wb(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 0;
    }
}
