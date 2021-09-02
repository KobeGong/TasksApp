package defpackage;

/* renamed from: abq reason: default package */
/* compiled from: PG */
public final class abq extends android.widget.EditText implements defpackage.sm {
    private final defpackage.abg a;
    private final defpackage.aci b;

    public abq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private abq(android.content.Context context, android.util.AttributeSet attributeSet, byte b2) {
        super(defpackage.agt.a(context), attributeSet, 2130772235);
        this.a = new defpackage.abg(this);
        this.a.a(attributeSet, 2130772235);
        this.b = defpackage.aci.a((android.widget.TextView) this);
        this.b.a(attributeSet, 2130772235);
        this.b.a();
    }

    public final android.text.Editable getText() {
        if (defpackage.jd.a()) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public final android.content.res.ColorStateList d_() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    public final void a(android.graphics.PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    public final android.graphics.PorterDuff.Mode b() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.d();
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return defpackage.aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, (android.view.View) this);
    }
}
