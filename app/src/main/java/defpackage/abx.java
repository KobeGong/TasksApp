package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.apps.tasks.R;

/* renamed from: abx  reason: default package */
/* compiled from: PG */
public final class abx extends RadioButton implements vt {
    private final abk a;
    private final aci b;

    public abx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private abx(Context context, AttributeSet attributeSet, byte b2) {
        super(agt.a(context), attributeSet, R.attr.radioButtonStyle);
        this.a = new abk(this);
        this.a.a(attributeSet, R.attr.radioButtonStyle);
        this.b = new aci(this);
        this.b.a(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(xw.b(getContext(), i));
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.a != null ? this.a.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // defpackage.vt
    public final void a(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    @Override // defpackage.vt
    public final void a(PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }
}
