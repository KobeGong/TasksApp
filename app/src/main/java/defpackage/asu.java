package defpackage;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: asu  reason: default package */
public final /* synthetic */ class asu implements View.OnClickListener {
    private final asi a;
    private final atb b;

    asu(asi asi, atb atb) {
        this.a = asi;
        this.b = atb;
    }

    public final void onClick(View view) {
        asi asi = this.a;
        atb atb = this.b;
        asi.b(atb);
        asi.a(atb);
        if (ajd.b(atb.d)) {
            any.a().c().a(asi.U, atb.d.d, (Object) null);
        } else {
            any.a().c().a(asi.U, atb.d.d, true);
        }
    }
}
