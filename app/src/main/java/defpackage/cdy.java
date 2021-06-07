package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: cdy  reason: default package */
public final /* synthetic */ class cdy implements brd {
    private final cdw a;

    cdy(cdw cdw) {
        this.a = cdw;
    }

    @Override // defpackage.brd
    public final void a(brc brc) {
        boolean z;
        boolean z2 = false;
        cdl cdl = this.a.a;
        List a2 = cdw.a((bsd) brc);
        String.format("setAvailableAccounts() %d -> %d.", Integer.valueOf(cdl.a()), Integer.valueOf(a2.size()));
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
            ArrayList arrayList = new ArrayList(cdl.c);
            cdl.c.clear();
            cdl.c.addAll(a2);
            List list = cdl.c;
            Iterator it = cdl.b.iterator();
            while (it.hasNext()) {
                ((cdm) it.next()).a(arrayList, list);
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
            Iterator it2 = cdl.b.iterator();
            while (it2.hasNext()) {
                ((cdm) it2.next()).h_();
            }
        }
    }
}
