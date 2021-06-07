package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.apps.tasks.R;

/* renamed from: abq  reason: default package */
/* compiled from: PG */
public final class abq extends EditText implements sm {
    private final abg a;
    private final aci b;

    public abq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private abq(Context context, AttributeSet attributeSet, byte b2) {
        super(agt.a(context), attributeSet, R.attr.editTextStyle);
        this.a = new abg(this);
        this.a.a(attributeSet, R.attr.editTextStyle);
        this.b = aci.a(this);
        this.b.a(attributeSet, R.attr.editTextStyle);
        this.b.a();
    }

    @Override // android.widget.EditText, android.widget.EditText
    public final Editable getText() {
        if (jd.a()) {
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

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // defpackage.sm
    public final void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    @Override // defpackage.sm
    public final ColorStateList d_() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    @Override // defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    @Override // defpackage.sm
    public final PorterDuff.Mode b() {
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
