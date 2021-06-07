package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: acj  reason: default package */
/* compiled from: PG */
public final class acj extends aci {
    private agu f;
    private agu g;

    acj(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.aci
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        abl a = abl.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xu.V, i, 0);
        if (obtainStyledAttributes.hasValue(xu.aa)) {
            this.f = a(context, a, obtainStyledAttributes.getResourceId(xu.aa, 0));
        }
        if (obtainStyledAttributes.hasValue(xu.X)) {
            this.g = a(context, a, obtainStyledAttributes.getResourceId(xu.X, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.aci
    public final void a() {
        super.a();
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }
}
