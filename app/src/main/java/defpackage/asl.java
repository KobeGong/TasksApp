package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: asl  reason: default package */
public final /* synthetic */ class asl implements View.OnFocusChangeListener {
    private final asi a;
    private final atb b;

    asl(asi asi, atb atb) {
        this.a = asi;
        this.b = atb;
    }

    public final void onFocusChange(View view, boolean z) {
        asi asi = this.a;
        atb atb = this.b;
        if (!z) {
            asi.b(atb);
        }
    }
}
