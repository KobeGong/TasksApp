package defpackage;

/* renamed from: cec reason: default package */
final /* synthetic */ class cec implements defpackage.cdg {
    private final defpackage.cdv a;

    cec(defpackage.cdv cdv) {
        this.a = cdv;
    }

    public final void a(android.view.View view, java.lang.Object obj) {
        defpackage.cdv cdv = this.a;
        AbsDeviceOwner cdu = (AbsDeviceOwner) obj;
        if (cdu != null) {
            cdv.a(defpackage.czk.MENU_MY_ACCOUNT, cdu, defpackage.cdm.retrieveActivity(view.getContext()));
        }
    }
}
