package defpackage;

/* renamed from: ate reason: default package */
final /* synthetic */ class ate implements android.view.View.OnClickListener {
    private final defpackage.atd a;
    private final defpackage.dcb b;

    ate(defpackage.atd atd, defpackage.dcb dcb) {
        this.a = atd;
        this.b = dcb;
    }

    public final void onClick(android.view.View view) {
        defpackage.atd atd = this.a;
        defpackage.dcb dcb = this.b;
        FragmentActivity j = atd.getActivity();
        if (j instanceof defpackage.atf) {
            ((defpackage.atf) j).a(dcb);
        }
        atd.a(false);
    }
}
