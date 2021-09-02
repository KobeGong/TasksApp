package defpackage;

/* renamed from: abx reason: default package */
/* compiled from: PG */
public final class abx extends android.widget.RadioButton implements defpackage.vt {
    private final defpackage.abk a;
    private final defpackage.aci b;

    public abx(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private abx(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        super(defpackage.agt.a(context), attributeSet, 2130772236);
        this.a = new defpackage.abk(this);
        this.a.a(attributeSet, 2130772236);
        this.b = new defpackage.aci(this);
        this.b.a(attributeSet, 2130772236);
    }

    public final void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(defpackage.xw.b(getContext(), i));
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.a != null ? this.a.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }
}
