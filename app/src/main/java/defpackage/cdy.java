package defpackage;

import java.util.ArrayList;
import java.util.List;

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
        List<DeviceOwner> deviceOwnerList = defpackage.cdw.a(bsd);
        java.lang.String.format("setAvailableAccounts() %d -> %d.", cdl.getSize(), deviceOwnerList.size());
        if (!cdl.availableAccounts.equals(deviceOwnerList)) {
            if (cdl.f() && !deviceOwnerList.contains(cdl.g())) {
                cdl.d.remove(2);
                z2 = true;
            }
            if (cdl.d() && !deviceOwnerList.contains(cdl.e())) {
                cdl.d.remove(1);
                z2 = true;
            }
            if (!cdl.b() || deviceOwnerList.contains(cdl.c())) {
                z = z2;
            } else {
                cdl.d.clear();
                z = true;
            }
            ArrayList arrayList = new ArrayList<>(cdl.availableAccounts);
            cdl.availableAccounts.clear();
            cdl.availableAccounts.addAll(deviceOwnerList);
            java.util.List list = cdl.availableAccounts;
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
