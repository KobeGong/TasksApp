package defpackage;

/* renamed from: cdy reason: default package */
final /* synthetic */ class cdy implements defpackage.brd {
    private final defpackage.cdw a;

    cdy(defpackage.cdw cdw) {
        this.a = cdw;
    }

    public final void a(defpackage.brc brc) {
        boolean z;
        boolean z2 = false;
        defpackage.bsd bsd = (defpackage.bsd) brc;
        defpackage.cdl cdl = this.a.a;
        java.util.List a2 = defpackage.cdw.a(bsd);
        java.lang.String.format("setAvailableAccounts() %d -> %d.", new java.lang.Object[]{java.lang.Integer.valueOf(cdl.a()), java.lang.Integer.valueOf(a2.size())});
        if (!cdl.c.equals(a2)) {
            if (cdl.f() && !a2.contains(cdl.g())) {
                cdl.d.remove(2);
                z2 = true;
            }
            if (cdl.d() && !a2.contains(cdl.e())) {
                cdl.d.remove(1);
                z2 = true;
            }
            if (!cdl.b() || a2.contains(cdl.c())) {
                z = z2;
            } else {
                cdl.d.clear();
                z = true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(cdl.c);
            cdl.c.clear();
            cdl.c.addAll(a2);
            java.util.List list = cdl.c;
            java.util.Iterator it = cdl.b.iterator();
            while (it.hasNext()) {
                ((defpackage.cdm) it.next()).a((java.util.List) arrayList, list);
                if (z) {
                    cdl.h();
                }
            }
            if (z) {
                cdl.h();
            }
        }
        if (!cdl.a) {
            cdl.a = true;
            java.util.Iterator it2 = cdl.b.iterator();
            while (it2.hasNext()) {
                ((defpackage.cdm) it2.next()).h_();
            }
        }
    }
}
