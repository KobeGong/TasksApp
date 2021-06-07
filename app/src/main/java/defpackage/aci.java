package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: aci  reason: default package */
/* compiled from: PG */
public class aci {
    public final TextView a;
    public final acl b;
    public int c = 0;
    public Typeface d;
    public boolean e;
    private agu f;
    private agu g;
    private agu h;
    private agu i;

    static aci a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new acj(textView);
        }
        return new aci(textView);
    }

    aci(TextView textView) {
        this.a = textView;
        this.b = new acl(this.a);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        int resourceId;
        Context context = this.a.getContext();
        abl a2 = abl.a();
        agw a3 = agw.a(context, attributeSet, xu.V, i2, 0);
        int g2 = a3.g(xu.ac, -1);
        if (a3.f(xu.Y)) {
            this.f = a(context, a2, a3.g(xu.Y, 0));
        }
        if (a3.f(xu.ab)) {
            this.g = a(context, a2, a3.g(xu.ab, 0));
        }
        if (a3.f(xu.Z)) {
            this.h = a(context, a2, a3.g(xu.Z, 0));
        }
        if (a3.f(xu.W)) {
            this.i = a(context, a2, a3.g(xu.W, 0));
        }
        a3.b.recycle();
        boolean z = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z2 = false;
        boolean z3 = false;
        ColorStateList colorStateList3 = null;
        ColorStateList colorStateList4 = null;
        if (g2 != -1) {
            agw a4 = agw.a(context, g2, xu.cl);
            if (!z && a4.f(xu.cy)) {
                z3 = true;
                z2 = a4.a(xu.cy, false);
            }
            a(context, a4);
            if (Build.VERSION.SDK_INT < 23) {
                if (a4.f(xu.cr)) {
                    colorStateList3 = a4.e(xu.cr);
                }
                if (a4.f(xu.cs)) {
                    colorStateList4 = a4.e(xu.cs);
                }
                if (a4.f(xu.ct)) {
                    colorStateList = colorStateList3;
                    colorStateList2 = a4.e(xu.ct);
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
        agw a5 = agw.a(context, attributeSet, xu.cl, i2, 0);
        if (!z && a5.f(xu.cy)) {
            z3 = true;
            z2 = a5.a(xu.cy, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a5.f(xu.cr)) {
                colorStateList = a5.e(xu.cr);
            }
            if (a5.f(xu.cs)) {
                colorStateList4 = a5.e(xu.cs);
            }
            if (a5.f(xu.ct)) {
                colorStateList2 = a5.e(xu.ct);
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
        acl acl = this.b;
        float f2 = -1.0f;
        float f3 = -1.0f;
        float f4 = -1.0f;
        TypedArray obtainStyledAttributes = acl.h.obtainStyledAttributes(attributeSet, xu.ad, i2, 0);
        if (obtainStyledAttributes.hasValue(xu.ai)) {
            acl.a = obtainStyledAttributes.getInt(xu.ai, 0);
        }
        if (obtainStyledAttributes.hasValue(xu.ah)) {
            f4 = obtainStyledAttributes.getDimension(xu.ah, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(xu.af)) {
            f2 = obtainStyledAttributes.getDimension(xu.af, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(xu.ae)) {
            f3 = obtainStyledAttributes.getDimension(xu.ae, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(xu.ag) && (resourceId = obtainStyledAttributes.getResourceId(xu.ag, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                acl.f = acl.a(iArr);
                acl.a();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!acl.e()) {
            acl.a = 0;
        } else if (acl.a == 1) {
            if (!acl.g) {
                DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f4 == -1.0f) {
                    f4 = 1.0f;
                }
                acl.a(f2, f3, f4);
            }
            acl.b();
        }
        if (tz.b && this.b.a != 0) {
            int[] iArr2 = this.b.f;
            if (iArr2.length <= 0) {
                return;
            }
            if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                this.a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.b.d), Math.round(this.b.e), Math.round(this.b.c), 0);
            } else {
                this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
            }
        }
    }

    private final void a(Context context, agw agw) {
        String d2;
        Typeface a2;
        boolean z;
        this.c = agw.a(xu.cv, this.c);
        if (agw.f(xu.cm) || agw.f(xu.cx)) {
            this.d = null;
            int i2 = agw.f(xu.cx) ? xu.cx : xu.cm;
            if (!context.isRestricted()) {
                op opVar = new op(this, new WeakReference(this.a));
                try {
                    int i3 = this.c;
                    int resourceId = agw.b.getResourceId(i2, 0);
                    if (resourceId == 0) {
                        a2 = null;
                    } else {
                        if (agw.c == null) {
                            agw.c = new TypedValue();
                        }
                        Context context2 = agw.a;
                        TypedValue typedValue = agw.c;
                        if (context2.isRestricted()) {
                            a2 = null;
                        } else {
                            a2 = jd.a(context2, resourceId, typedValue, i3, opVar, true);
                        }
                    }
                    this.d = a2;
                    if (this.d == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.e = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e2) {
                }
            }
            if (this.d == null && (d2 = agw.d(i2)) != null) {
                this.d = Typeface.create(d2, this.c);
            }
        } else if (agw.f(xu.cw)) {
            this.e = false;
            switch (agw.a(xu.cw, 1)) {
                case 1:
                    this.d = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.d = Typeface.SERIF;
                    return;
                case 3:
                    this.d = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, int i2) {
        ColorStateList e2;
        agw a2 = agw.a(context, i2, xu.cl);
        if (a2.f(xu.cy)) {
            a(a2.a(xu.cy, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.f(xu.cr) && (e2 = a2.e(xu.cr)) != null) {
            this.a.setTextColor(e2);
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

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Drawable drawable, agu agu) {
        if (drawable != null && agu != null) {
            abl.a(drawable, agu, this.a.getDrawableState());
        }
    }

    protected static agu a(Context context, abl abl, int i2) {
        ColorStateList b2 = abl.b(context, i2);
        if (b2 == null) {
            return null;
        }
        agu agu = new agu();
        agu.d = true;
        agu.a = b2;
        return agu;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!tz.b) {
            this.b.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        if (!tz.b && !this.b.d()) {
            this.b.a(i2, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        acl acl = this.b;
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
                    DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                    acl.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (acl.b()) {
                        acl.c();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5) {
        acl acl = this.b;
        if (acl.e()) {
            DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
            acl.a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (acl.b()) {
                acl.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int[] iArr, int i2) {
        acl acl = this.b;
        if (acl.e()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = acl.h.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                acl.f = acl.a(iArr2);
                if (!acl.a()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
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
