package defpackage;

/* renamed from: alt reason: default package */
final /* synthetic */ class alt implements java.lang.Runnable {
    private final defpackage.alq a;
    private final java.lang.String b;
    private final java.lang.String c;

    alt(defpackage.alq alq, java.lang.String str, java.lang.String str2) {
        this.a = alq;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        defpackage.alq alq = this.a;
        java.lang.String str = this.b;
        java.lang.String str2 = this.c;
        if (defpackage.cru.d(str, alq.c)) {
            java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) alq.a);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = a2.get(i);
                i++;
                ((defpackage.alu) obj).a(str2);
            }
        }
    }
}
