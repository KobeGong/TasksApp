package defpackage;

/* renamed from: djk reason: default package */
/* compiled from: PG */
final class djk {
    public static boolean a(java.lang.Object obj) {
        return !((defpackage.djj) obj).a;
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.djj djj = (defpackage.djj) obj;
        defpackage.djj djj2 = (defpackage.djj) obj2;
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

    public static int a(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = 0;
        defpackage.djj djj = (defpackage.djj) obj;
        defpackage.djh djh = (defpackage.djh) obj2;
        if (djj.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = djj.entrySet().iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return i3;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            i2 = defpackage.dhn.r(defpackage.djh.a(djh.a, key, value)) + defpackage.dhn.m(i) + i3;
        }
    }

    djk() {
    }
}
