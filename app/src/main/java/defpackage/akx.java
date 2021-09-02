package defpackage;

/* renamed from: akx reason: default package */
final /* synthetic */ class akx implements android.view.View.OnClickListener {
    private final defpackage.akv a;

    akx(defpackage.akv akv) {
        this.a = akv;
    }

    public final void onClick(android.view.View view) {
        defpackage.akv akv = this.a;
        if (akv.p != null) {
            defpackage.aky aky = akv.p;
            int d = akv.d();
            if (aky.a.b != null) {
                defpackage.akz akz = (defpackage.akz) aky.a.a.get(d);
                defpackage.aku aku = aky.a.b;
                java.lang.String str = akz.a().b;
                java.lang.String str2 = akz.b().d;
                FragmentActivity j = aku.a.getActivity();
                if (j instanceof defpackage.alh) {
                    ((defpackage.alh) j).a(str, str2);
                }
            }
        }
    }
}
