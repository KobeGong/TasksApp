package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: uh  reason: default package */
/* compiled from: PG */
class uh extends uj {
    uh() {
    }

    @Override // defpackage.uj
    public final void a(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    @Override // defpackage.uj
    public final void a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
