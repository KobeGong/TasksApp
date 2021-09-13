package defpackage;

/* renamed from: als reason: default package */
final /* synthetic */ class als implements java.lang.Runnable {
    private final defpackage.alq a;
    private final java.lang.String b;

    als(defpackage.alq alq, java.lang.String str) {
        this.a = alq;
        this.b = str;
    }

    public final void run() {
        defpackage.alq alq = this.a;
        if (defpackage.cru.equals(this.b, alq.accountName)) {
            java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) alq.a);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = a2.get(i);
                i++;
                ((defpackage.alu) obj).b();
            }
        }
    }
}
