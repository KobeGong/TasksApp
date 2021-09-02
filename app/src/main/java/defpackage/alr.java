package defpackage;

/* renamed from: alr reason: default package */
final /* synthetic */ class alr implements java.lang.Runnable {
    private final defpackage.alq a;
    private final java.lang.String b;

    alr(defpackage.alq alq, java.lang.String str) {
        this.a = alq;
        this.b = str;
    }

    public final void run() {
        defpackage.alq alq = this.a;
        if (defpackage.cru.d(this.b, alq.c)) {
            java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) alq.a);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = a2.get(i);
                i++;
                ((defpackage.alu) obj).a();
            }
        }
    }
}
