package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: atc  reason: default package */
public final /* synthetic */ class atc implements View.OnFocusChangeListener {
    private final atb a;

    atc(atb atb) {
        this.a = atb;
    }

    public final void onFocusChange(View view, boolean z) {
        atb atb = this.a;
        atb.c.setVisibility(z ? 0 : 4);
        if (atb.e != null) {
            atb.e.onFocusChange(view, z);
        }
    }
}
