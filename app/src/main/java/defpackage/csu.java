package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: csu  reason: default package */
/* compiled from: PG */
final class csu implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    csu(css css) {
        this.a = new Object[css.size()];
        this.b = new Object[css.size()];
        int i = 0;
        cth cth = (cth) ((csv) css.entrySet()).iterator();
        while (cth.hasNext()) {
            Map.Entry entry = (Map.Entry) cth.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        cst cst = new cst(this.a.length);
        for (int i = 0; i < this.a.length; i++) {
            cst.a(this.a[i], this.b[i]);
        }
        return cst.a();
    }
}
