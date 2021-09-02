package defpackage;

/* renamed from: abk reason: default package */
/* compiled from: PG */
final class abk {
    private final android.widget.CompoundButton a;
    private android.content.res.ColorStateList b = null;
    private android.graphics.PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    abk(android.widget.CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, defpackage.xu.aE, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(defpackage.xu.aF)) {
                int resourceId = obtainStyledAttributes.getResourceId(defpackage.xu.aF, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(defpackage.xw.b(this.a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(defpackage.xu.aG)) {
                defpackage.ug.a.a(this.a, obtainStyledAttributes.getColorStateList(defpackage.xu.aG));
            }
            if (obtainStyledAttributes.hasValue(defpackage.xu.aH)) {
                defpackage.ug.a.a(this.a, defpackage.add.a(obtainStyledAttributes.getInt(defpackage.xu.aH, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.content.res.ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.graphics.PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private final void b() {
        android.graphics.drawable.Drawable a2 = defpackage.ug.a.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            android.graphics.drawable.Drawable mutate = defpackage.jd.d(a2).mutate();
            if (this.d) {
                defpackage.jd.a(mutate, this.b);
            }
            if (this.e) {
                defpackage.jd.a(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            return i;
        }
        android.graphics.drawable.Drawable a2 = defpackage.ug.a.a(this.a);
        if (a2 != null) {
            return i + a2.getIntrinsicWidth();
        }
        return i;
    }
}
