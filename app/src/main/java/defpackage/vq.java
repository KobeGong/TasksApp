package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: vq  reason: default package */
/* compiled from: PG */
class vq extends vp {
    vq() {
    }

    @Override // defpackage.vp, defpackage.vs
    public final void a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // defpackage.vp, defpackage.vs
    public final void b(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // defpackage.vp, defpackage.vs
    public final void a(TextView textView, int i) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }
}
