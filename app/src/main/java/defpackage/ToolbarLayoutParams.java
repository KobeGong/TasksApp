package defpackage;

/* renamed from: aha reason: default package */
/* compiled from: PG */
public final class ToolbarLayoutParams extends defpackage.wb {
    public int b;

    public ToolbarLayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public ToolbarLayoutParams() {
        this.b = 0;
        this.gravity = 8388627;
    }

    public ToolbarLayoutParams(ToolbarLayoutParams aha) {
        super((defpackage.wb) aha);
        this.b = 0;
        this.b = aha.b;
    }

    public ToolbarLayoutParams(defpackage.wb wbVar) {
        super(wbVar);
        this.b = 0;
    }

    public ToolbarLayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public ToolbarLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }
}
