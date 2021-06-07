package defpackage;

import java.util.Set;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: cxn  reason: default package */
/* compiled from: PG */
public class cxn extends cxi {
    public static final Logger e = Logger.getLogger(cxn.class.getName());
    public cxo f;

    cxn() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cwz
    public final void c() {
        boolean isCancelled;
        super.c();
        cxo cxo = this.f;
        if (cxo != null) {
            this.f = null;
            csn csn = cxo.a;
            boolean b = b();
            if (b) {
                cxo.d();
            }
            if ((csn != null) && isCancelled()) {
                cth cth = (cth) csn.iterator();
                while (cth.hasNext()) {
                    ((cyi) cth.next()).cancel(b);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cwz
    public final String d() {
        csn csn;
        cxo cxo = this.f;
        if (cxo == null || (csn = cxo.a) == null) {
            return null;
        }
        String valueOf = String.valueOf(csn);
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append("futures=[").append(valueOf).append("]").toString();
    }

    static boolean a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
