package defpackage;

/* renamed from: dnp reason: default package */
/* compiled from: PG */
public final class dnp {
    public static final defpackage.dnp a = new defpackage.dnp(new defpackage.dnn(), defpackage.dno.a);
    public final java.util.concurrent.ConcurrentMap b = new java.util.concurrent.ConcurrentHashMap();

    private dnp(defpackage.doa... doaArr) {
        for (defpackage.doa doa : doaArr) {
            this.b.put(doa.a(), doa);
        }
    }
}
