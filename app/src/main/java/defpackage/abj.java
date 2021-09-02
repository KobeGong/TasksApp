package defpackage;

/* renamed from: abj reason: default package */
/* compiled from: PG */
public final class abj extends android.widget.CheckedTextView {
    private static final int[] a = {16843016};
    private final defpackage.aci b;

    public abj(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private abj(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        super(defpackage.agt.a(context), attributeSet, 16843720);
        this.b = defpackage.aci.a((android.widget.TextView) this);
        this.b.a(attributeSet, 16843720);
        this.b.a();
        defpackage.agw a2 = defpackage.agw.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a2.a(0));
        a2.b.recycle();
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(defpackage.xw.b(getContext(), i));
    }

    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.a();
        }
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return defpackage.aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, (android.view.View) this);
    }
}
