package defpackage;

import android.view.View;

/* renamed from: cec  reason: default package */
final /* synthetic */ class cec implements cdg {
    private final cdv a;

    cec(cdv cdv) {
        this.a = cdv;
    }

    @Override // defpackage.cdg
    public final void a(View view, Object obj) {
        cdv cdv = this.a;
        cdu cdu = (cdu) obj;
        if (cdu != null) {
            cdv.a(czk.MENU_MY_ACCOUNT, cdu, cdm.a(view.getContext()));
        }
    }
}
