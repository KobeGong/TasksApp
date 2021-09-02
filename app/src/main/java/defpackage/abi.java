package defpackage;

/* renamed from: abi reason: default package */
/* compiled from: PG */
public class abi extends android.widget.CheckBox implements defpackage.vt {
    private final defpackage.abk a;

    public abi(android.content.Context context) {
        this(context, null);
    }

    public abi(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772233);
    }

    public abi(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(defpackage.agt.a(context), attributeSet, i);
        this.a = new defpackage.abk(this);
        this.a.a(attributeSet, i);
    }

    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(defpackage.xw.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
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
