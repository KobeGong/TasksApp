package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.apps.tasks.R;

/* renamed from: abf  reason: default package */
/* compiled from: PG */
public class abf extends AutoCompleteTextView implements sm {
    private static final int[] a = {16843126};
    private final abg b;
    private final aci c;

    public abf(Context context) {
        this(context, null);
    }

    public abf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public abf(Context context, AttributeSet attributeSet, int i) {
        super(agt.a(context), attributeSet, i);
        agw a2 = agw.a(getContext(), attributeSet, a, i, 0);
        if (a2.f(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.b.recycle();
        this.b = new abg(this);
        this.b.a(attributeSet, i);
        this.c = aci.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(xw.b(getContext(), i));
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // defpackage.sm
    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Override // defpackage.sm
    public final ColorStateList d_() {
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // defpackage.sm
    public final void a(PorterDuff.Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    @Override // defpackage.sm
    public final PorterDuff.Mode b() {
        if (this.b != null) {
            return this.b.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
