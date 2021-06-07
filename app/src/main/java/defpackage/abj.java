package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: abj  reason: default package */
/* compiled from: PG */
public final class abj extends CheckedTextView {
    private static final int[] a = {16843016};
    private final aci b;

    public abj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private abj(Context context, AttributeSet attributeSet, byte b2) {
        super(agt.a(context), attributeSet, 16843720);
        this.b = aci.a(this);
        this.b.a(attributeSet, 16843720);
        this.b.a();
        agw a2 = agw.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a2.a(0));
        a2.b.recycle();
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(xw.b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
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

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
