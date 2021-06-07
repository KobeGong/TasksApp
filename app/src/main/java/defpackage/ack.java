package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* renamed from: ack  reason: default package */
/* compiled from: PG */
public class ack extends TextView implements sm, tz {
    private final abg a;
    private final aci c;

    public ack(Context context) {
        this(context, null);
    }

    public ack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public ack(Context context, AttributeSet attributeSet, int i) {
        super(agt.a(context), attributeSet, i);
        this.a = new abg(this);
        this.a.a(attributeSet, i);
        this.c = aci.a(this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null) {
            this.a.d();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != null) {
            this.c.b();
        }
    }

    public void setTextSize(int i, float f) {
        if (b) {
            super.setTextSize(i, f);
        } else if (this.c != null) {
            this.c.a(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c != null && !b && this.c.b.d()) {
            this.c.b.c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.c != null) {
            this.c.a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.c != null) {
            this.c.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.c != null) {
            this.c.a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.c != null) {
            return this.c.b.a;
        }
        return 0;
    }

    public int getAutoSizeStepGranularity() {
        if (b) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.c != null) {
            return Math.round(this.c.b.c);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.c != null) {
            return Math.round(this.c.b.d);
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.c != null) {
            return Math.round(this.c.b.e);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.c != null) {
            return this.c.b.f;
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return aaz.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
