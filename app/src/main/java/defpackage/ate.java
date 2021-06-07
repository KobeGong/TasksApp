package defpackage;

import android.view.View;

/* renamed from: ate  reason: default package */
final /* synthetic */ class ate implements View.OnClickListener {
    private final atd a;
    private final dcb b;

    ate(atd atd, dcb dcb) {
        this.a = atd;
        this.b = dcb;
    }

    public final void onClick(View view) {
        atd atd = this.a;
        dcb dcb = this.b;
        lg j = atd.j();
        if (j instanceof atf) {
            ((atf) j).a(dcb);
        }
        atd.a(false);
    }
}
