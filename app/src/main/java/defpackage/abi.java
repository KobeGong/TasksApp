package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.tasks.R;

/* renamed from: abi  reason: default package */
/* compiled from: PG */
public class abi extends CheckBox implements vt {
    private final abk a;

    public abi(Context context) {
        this(context, null);
    }

    public abi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public abi(Context context, AttributeSet attributeSet, int i) {
        super(agt.a(context), attributeSet, i);
        this.a = new abk(this);
        this.a.a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(xw.b(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
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
