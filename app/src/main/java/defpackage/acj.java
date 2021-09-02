package defpackage;

/* renamed from: acj reason: default package */
/* compiled from: PG */
final class acj extends defpackage.aci {
    private defpackage.agu f;
    private defpackage.agu g;

    acj(android.widget.TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.util.AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        android.content.Context context = this.a.getContext();
        defpackage.abl a = defpackage.abl.a();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.V, i, 0);
        if (obtainStyledAttributes.hasValue(defpackage.xu.aa)) {
            this.f = a(context, a, obtainStyledAttributes.getResourceId(defpackage.xu.aa, 0));
        }
        if (obtainStyledAttributes.hasValue(defpackage.xu.X)) {
            this.g = a(context, a, obtainStyledAttributes.getResourceId(defpackage.xu.X, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        super.a();
        if (this.f != null || this.g != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }
}
