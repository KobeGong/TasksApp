package defpackage;

/* renamed from: cjz  reason: default package */
/* compiled from: PG */
public final class cjz {
    private static final Object d = new Object();
    private static volatile cjz e;
    public ckz a;
    public final Object b = new Object();
    public volatile ehy c;

    private static cjz a() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new cjz();
                }
            }
        }
        return e;
    }

    private cjz() {
    }

    public static void a(eht eht) {
        cky.a(eht);
        cjz a2 = a();
        cjg a3 = cjg.a();
        a3.a.a(new cka(a2, eht));
    }
}
