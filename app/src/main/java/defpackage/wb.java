package defpackage;

/* renamed from: wb reason: default package */
/* compiled from: PG */
public class wb extends android.view.ViewGroup.MarginLayoutParams {
    public int a;

    public wb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.b);
        this.a = obtainStyledAttributes.getInt(defpackage.xu.c, 0);
        obtainStyledAttributes.recycle();
    }

    public wb() {
        super(-2, -2);
        this.a = 0;
        this.a = 8388627;
    }

    public wb(defpackage.wb wbVar) {
        super(wbVar);
        this.a = 0;
        this.a = wbVar.a;
    }

    public wb(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
