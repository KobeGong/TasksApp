package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: vp  reason: default package */
/* compiled from: PG */
class vp extends vs {
    vp() {
        super((byte) 0);
    }

    @Override // defpackage.vs
    public void a(TextView textView, Drawable drawable) {
        Drawable drawable2;
        boolean z = textView.getLayoutDirection() == 1;
        if (z) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if (!z) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }

    @Override // defpackage.vs
    public void b(TextView textView, Drawable drawable) {
        Drawable drawable2;
        boolean z = textView.getLayoutDirection() == 1;
        if (z) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if (!z) {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
    }

    @Override // defpackage.vs
    public void a(TextView textView, int i) {
        boolean z;
        int i2;
        if (textView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = i;
        } else {
            i2 = 0;
        }
        if (z) {
            i = 0;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, i, 0);
    }
}
