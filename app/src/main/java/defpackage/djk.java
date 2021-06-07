package defpackage;

import java.util.Map;

/* renamed from: djk  reason: default package */
/* compiled from: PG */
final class djk {
    public static boolean a(Object obj) {
        return !((djj) obj).a;
    }

    public static Object a(Object obj, Object obj2) {
        djj djj = (djj) obj;
        djj djj2 = (djj) obj2;
        if (!djj2.isEmpty()) {
            if (!djj.a) {
                djj = djj.a();
            }
            djj.b();
            if (!djj2.isEmpty()) {
                djj.putAll(djj2);
            }
        }
        return djj;
    }

    public static int a(int i, Object obj, Object obj2) {
        int i2 = 0;
        djj djj = (djj) obj;
        djh djh = (djh) obj2;
        if (djj.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : djj.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            i2 = dhn.r(djh.a(djh.a, key, value)) + dhn.m(i) + i2;
        }
        return i2;
    }

    djk() {
    }
}
