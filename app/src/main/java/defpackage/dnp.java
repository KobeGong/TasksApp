package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dnp  reason: default package */
/* compiled from: PG */
public final class dnp {
    public static final dnp a = new dnp(new dnn(), dno.a);
    public final ConcurrentMap b = new ConcurrentHashMap();

    private dnp(doa... doaArr) {
        for (doa doa : doaArr) {
            this.b.put(doa.a(), doa);
        }
    }
}
