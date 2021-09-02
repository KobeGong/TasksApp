package defpackage;

/* renamed from: cfd reason: default package */
/* compiled from: PG */
final class cfd extends defpackage.cdm {
    public final /* synthetic */ defpackage.cfc a;

    cfd(defpackage.cfc cfc) {
        this.a = cfc;
    }

    public final void a(java.util.List list, java.util.List list2) {
        defpackage.cfc.O();
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.cfc cfc = this.a;
        defpackage.cfe cfe = new defpackage.cfe(this);
        FragmentActivity j = cfc.getActivity();
        if (j != null) {
            j.runOnUiThread(cfe);
        }
    }
}
