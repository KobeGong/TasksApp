package defpackage;

/* renamed from: abu reason: default package */
/* compiled from: PG */
public final class abu extends android.widget.MultiAutoCompleteTextView implements defpackage.sm {
    private static final int[] a = {16843126};
    private final defpackage.abg b;
    private final defpackage.aci c;

    public abu(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private abu(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        super(defpackage.agt.a(context), attributeSet, 2130772230);
        defpackage.agw a2 = defpackage.agw.a(getContext(), attributeSet, a, 2130772230, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.b.recycle();
        this.b = new defpackage.abg(this);
        this.b.a(attributeSet, 2130772230);
        this.c = defpackage.aci.a((android.widget.TextView) this);
        this.c.a(attributeSet, 2130772230);
        this.c.a();
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(defpackage.xw.b(getContext(), i));
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList d_() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode b() {
        if (this.b != null) {
            return this.b.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return defpackage.aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, (android.view.View) this);
    }
}
