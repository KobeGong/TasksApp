package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aud  reason: default package */
public final /* synthetic */ class aud implements View.OnClickListener {
    private final atx a;

    aud(atx atx) {
        this.a = atx;
    }

    public final void onClick(View view) {
        atx atx = this.a;
        if (atx.v != null) {
            atx.v.a(atx.d(), -1, true);
        }
    }
}
