package defpackage;

/* renamed from: cjz reason: default package */
/* compiled from: PG */
public final class cjz {
    private static final java.lang.Object d = new java.lang.Object();
    private static volatile defpackage.cjz e;
    public defpackage.ckz a;
    public final java.lang.Object b = new java.lang.Object();
    public volatile defpackage.ehy c;

    private static defpackage.cjz a() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new defpackage.cjz();
                }
            }
        }
        return e;
    }

    private cjz() {
    }

    public static void a(defpackage.eht eht) {
        defpackage.cky.a((java.lang.Object) eht);
        defpackage.cjz a2 = a();
        defpackage.cjg a3 = defpackage.cjg.a();
        a3.a.a((java.lang.Runnable) new defpackage.cka(a2, eht));
    }
}
