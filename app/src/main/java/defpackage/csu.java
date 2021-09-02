package defpackage;

/* renamed from: csu reason: default package */
/* compiled from: PG */
final class csu implements java.io.Serializable {
    public static final long serialVersionUID = 0;
    private final java.lang.Object[] a;
    private final java.lang.Object[] b;

    csu(defpackage.css css) {
        this.a = new java.lang.Object[css.size()];
        this.b = new java.lang.Object[css.size()];
        int i = 0;
        defpackage.cth cth = (defpackage.cth) ((defpackage.csv) css.entrySet()).iterator();
        while (true) {
            int i2 = i;
            if (cth.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) cth.next();
                this.a[i2] = entry.getKey();
                this.b[i2] = entry.getValue();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object readResolve() {
        defpackage.cst cst = new defpackage.cst(this.a.length);
        for (int i = 0; i < this.a.length; i++) {
            cst.a(this.a[i], this.b[i]);
        }
        return cst.a();
    }
}
