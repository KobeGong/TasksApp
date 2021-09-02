package defpackage;

/* renamed from: abh reason: default package */
/* compiled from: PG */
public class abh extends android.widget.Button implements defpackage.sm, defpackage.tz {
    private final defpackage.abg a;
    private final defpackage.aci c;

    public abh(android.content.Context context) {
        this(context, null);
    }

    public abh(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772231);
    }

    public abh(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(defpackage.agt.a(context), attributeSet, i);
        this.a = new defpackage.abg(this);
        this.a.a(attributeSet, i);
        this.c = defpackage.aci.a((android.widget.TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.a != null) {
            this.a.a();
        }
    }

    public void a(android.content.res.ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.a(colorStateList);
        }
    }

    public android.content.res.ColorStateList d_() {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }

    public void a(android.graphics.PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.a(mode);
        }
    }

    public android.graphics.PorterDuff.Mode b() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
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

    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

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
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
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
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        } else if (this.c != null) {
            return this.c.b.a;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (b) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.c != null) {
            return java.lang.Math.round(this.c.b.c);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.c != null) {
            return java.lang.Math.round(this.c.b.d);
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.c != null) {
            return java.lang.Math.round(this.c.b.e);
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
}
