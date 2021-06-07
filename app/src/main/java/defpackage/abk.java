package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: abk  reason: default package */
/* compiled from: PG */
final class abk {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    abk(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, xu.aE, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(xu.aF) && (resourceId = obtainStyledAttributes.getResourceId(xu.aF, 0)) != 0) {
                this.a.setButtonDrawable(xw.b(this.a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(xu.aG)) {
                ug.a.a(this.a, obtainStyledAttributes.getColorStateList(xu.aG));
            }
            if (obtainStyledAttributes.hasValue(xu.aH)) {
                ug.a.a(this.a, add.a(obtainStyledAttributes.getInt(xu.aH, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private final void b() {
        Drawable a2 = ug.a.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = jd.d(a2).mutate();
            if (this.d) {
                jd.a(mutate, this.b);
            }
            if (this.e) {
                jd.a(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        Drawable a2;
        if (Build.VERSION.SDK_INT >= 17 || (a2 = ug.a.a(this.a)) == null) {
            return i;
        }
        return i + a2.getIntrinsicWidth();
    }
}
