package defpackage;

/* renamed from: aci reason: default package */
/* compiled from: PG */
public class aci {
    public final android.widget.TextView a;
    public final defpackage.acl b;
    public int c = 0;
    public android.graphics.Typeface d;
    public boolean e;
    private defpackage.agu f;
    private defpackage.agu g;
    private defpackage.agu h;
    private defpackage.agu i;

    static defpackage.aci a(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return new defpackage.acj(textView);
        }
        return new defpackage.aci(textView);
    }

    aci(android.widget.TextView textView) {
        this.a = textView;
        this.b = new defpackage.acl(this.a);
    }

    /* access modifiers changed from: 0000 */
    @android.annotation.SuppressLint({"NewApi"})
    public void a(android.util.AttributeSet attributeSet, int i2) {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.content.Context context = this.a.getContext();
        defpackage.abl a2 = defpackage.abl.a();
        defpackage.agw a3 = defpackage.agw.a(context, attributeSet, defpackage.xu.V, i2, 0);
        int g2 = a3.g(defpackage.xu.ac, -1);
        if (a3.f(defpackage.xu.Y)) {
            this.f = a(context, a2, a3.g(defpackage.xu.Y, 0));
        }
        if (a3.f(defpackage.xu.ab)) {
            this.g = a(context, a2, a3.g(defpackage.xu.ab, 0));
        }
        if (a3.f(defpackage.xu.Z)) {
            this.h = a(context, a2, a3.g(defpackage.xu.Z, 0));
        }
        if (a3.f(defpackage.xu.W)) {
            this.i = a(context, a2, a3.g(defpackage.xu.W, 0));
        }
        a3.b.recycle();
        boolean z = this.a.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        boolean z2 = false;
        boolean z3 = false;
        android.content.res.ColorStateList colorStateList3 = null;
        android.content.res.ColorStateList colorStateList4 = null;
        if (g2 != -1) {
            defpackage.agw a4 = defpackage.agw.a(context, g2, defpackage.xu.cl);
            if (!z && a4.f(defpackage.xu.cy)) {
                z3 = true;
                z2 = a4.a(defpackage.xu.cy, false);
            }
            a(context, a4);
            if (android.os.Build.VERSION.SDK_INT < 23) {
                if (a4.f(defpackage.xu.cr)) {
                    colorStateList3 = a4.e(defpackage.xu.cr);
                }
                if (a4.f(defpackage.xu.cs)) {
                    colorStateList4 = a4.e(defpackage.xu.cs);
                }
                if (a4.f(defpackage.xu.ct)) {
                    colorStateList = colorStateList3;
                    colorStateList2 = a4.e(defpackage.xu.ct);
                } else {
                    colorStateList = colorStateList3;
                    colorStateList2 = null;
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            a4.b.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
        }
        defpackage.agw a5 = defpackage.agw.a(context, attributeSet, defpackage.xu.cl, i2, 0);
        if (!z && a5.f(defpackage.xu.cy)) {
            z3 = true;
            z2 = a5.a(defpackage.xu.cy, false);
        }
        if (android.os.Build.VERSION.SDK_INT < 23) {
            if (a5.f(defpackage.xu.cr)) {
                colorStateList = a5.e(defpackage.xu.cr);
            }
            if (a5.f(defpackage.xu.cs)) {
                colorStateList4 = a5.e(defpackage.xu.cs);
            }
            if (a5.f(defpackage.xu.ct)) {
                colorStateList2 = a5.e(defpackage.xu.ct);
            }
        }
        a(context, a5);
        a5.b.recycle();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList4 != null) {
            this.a.setHintTextColor(colorStateList4);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!z && z3) {
            a(z2);
        }
        if (this.d != null) {
            this.a.setTypeface(this.d, this.c);
        }
        defpackage.acl acl = this.b;
        float f2 = -1.0f;
        float f3 = -1.0f;
        float f4 = -1.0f;
        android.content.res.TypedArray obtainStyledAttributes = acl.h.obtainStyledAttributes(attributeSet, defpackage.xu.ad, i2, 0);
        if (obtainStyledAttributes.hasValue(defpackage.xu.ai)) {
            acl.a = obtainStyledAttributes.getInt(defpackage.xu.ai, 0);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xu.ah)) {
            f4 = obtainStyledAttributes.getDimension(defpackage.xu.ah, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xu.af)) {
            f2 = obtainStyledAttributes.getDimension(defpackage.xu.af, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xu.ae)) {
            f3 = obtainStyledAttributes.getDimension(defpackage.xu.ae, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(defpackage.xu.ag)) {
            int resourceId = obtainStyledAttributes.getResourceId(defpackage.xu.ag, 0);
            if (resourceId > 0) {
                android.content.res.TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    }
                    acl.f = defpackage.acl.a(iArr);
                    acl.a();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!acl.e()) {
            acl.a = 0;
        } else if (acl.a == 1) {
            if (!acl.g) {
                android.util.DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f4 == -1.0f) {
                    f4 = 1.0f;
                }
                acl.a(f2, f3, f4);
            }
            acl.b();
        }
        if (defpackage.tz.b && this.b.a != 0) {
            int[] iArr2 = this.b.f;
            if (iArr2.length <= 0) {
                return;
            }
            if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                this.a.setAutoSizeTextTypeUniformWithConfiguration(java.lang.Math.round(this.b.d), java.lang.Math.round(this.b.e), java.lang.Math.round(this.b.c), 0);
            } else {
                this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
            }
        }
    }

    private final void a(android.content.Context context, defpackage.agw agw) {
        android.graphics.Typeface a2;
        boolean z;
        this.c = agw.a(defpackage.xu.cv, this.c);
        if (agw.f(defpackage.xu.cm) || agw.f(defpackage.xu.cx)) {
            this.d = null;
            int i2 = agw.f(defpackage.xu.cx) ? defpackage.xu.cx : defpackage.xu.cm;
            if (!context.isRestricted()) {
                defpackage.op opVar = new defpackage.op(this, new java.lang.ref.WeakReference(this.a));
                try {
                    int i3 = this.c;
                    int resourceId = agw.b.getResourceId(i2, 0);
                    if (resourceId == 0) {
                        a2 = null;
                    } else {
                        if (agw.c == null) {
                            agw.c = new android.util.TypedValue();
                        }
                        android.content.Context context2 = agw.a;
                        android.util.TypedValue typedValue = agw.c;
                        if (context2.isRestricted()) {
                            a2 = null;
                        } else {
                            a2 = defpackage.jd.a(context2, resourceId, typedValue, i3, opVar, true);
                        }
                    }
                    this.d = a2;
                    if (this.d == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.e = z;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException e2) {
                }
            }
            if (this.d == null) {
                java.lang.String d2 = agw.d(i2);
                if (d2 != null) {
                    this.d = android.graphics.Typeface.create(d2, this.c);
                }
            }
        } else if (agw.f(defpackage.xu.cw)) {
            this.e = false;
            switch (agw.a(defpackage.xu.cw, 1)) {
                case 1:
                    this.d = android.graphics.Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.d = android.graphics.Typeface.SERIF;
                    return;
                case 3:
                    this.d = android.graphics.Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.content.Context context, int i2) {
        defpackage.agw a2 = defpackage.agw.a(context, i2, defpackage.xu.cl);
        if (a2.f(defpackage.xu.cy)) {
            a(a2.a(defpackage.xu.cy, false));
        }
        if (android.os.Build.VERSION.SDK_INT < 23 && a2.f(defpackage.xu.cr)) {
            android.content.res.ColorStateList e2 = a2.e(defpackage.xu.cr);
            if (e2 != null) {
                this.a.setTextColor(e2);
            }
        }
        a(context, a2);
        a2.b.recycle();
        if (this.d != null) {
            this.a.setTypeface(this.d, this.c);
        }
    }

    private final void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.graphics.drawable.Drawable drawable, defpackage.agu agu) {
        if (drawable != null && agu != null) {
            defpackage.abl.a(drawable, agu, this.a.getDrawableState());
        }
    }

    protected static defpackage.agu a(android.content.Context context, defpackage.abl abl, int i2) {
        android.content.res.ColorStateList b2 = abl.b(context, i2);
        if (b2 == null) {
            return null;
        }
        defpackage.agu agu = new defpackage.agu();
        agu.d = true;
        agu.a = b2;
        return agu;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (!defpackage.tz.b) {
            this.b.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, float f2) {
        if (!defpackage.tz.b && !this.b.d()) {
            this.b.a(i2, f2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        defpackage.acl acl = this.b;
        if (acl.e()) {
            switch (i2) {
                case 0:
                    acl.a = 0;
                    acl.d = -1.0f;
                    acl.e = -1.0f;
                    acl.c = -1.0f;
                    acl.f = new int[0];
                    acl.b = false;
                    return;
                case 1:
                    android.util.DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                    acl.a(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (acl.b()) {
                        acl.c();
                        return;
                    }
                    return;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, int i3, int i4, int i5) {
        defpackage.acl acl = this.b;
        if (acl.e()) {
            android.util.DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
            acl.a(android.util.TypedValue.applyDimension(i5, (float) i2, displayMetrics), android.util.TypedValue.applyDimension(i5, (float) i3, displayMetrics), android.util.TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (acl.b()) {
                acl.c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int[] iArr, int i2) {
        defpackage.acl acl = this.b;
        if (acl.e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = java.lang.Math.round(android.util.TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                acl.f = defpackage.acl.a(iArr2);
                if (!acl.a()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                acl.g = false;
            }
            if (acl.b()) {
                acl.c();
            }
        }
    }
}
