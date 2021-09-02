package defpackage;

/* renamed from: djz reason: default package */
/* compiled from: PG */
public final class djz {
    public static final defpackage.djz a = new defpackage.djz();
    private final defpackage.dki b;
    private final java.util.concurrent.ConcurrentMap c = new java.util.concurrent.ConcurrentHashMap();

    public final defpackage.dkh a(java.lang.Class cls) {
        defpackage.dim.a(cls, "messageType");
        defpackage.dkh dkh = (defpackage.dkh) this.c.get(cls);
        if (dkh != null) {
            return dkh;
        }
        defpackage.dkh a2 = this.b.a(cls);
        defpackage.dim.a(cls, "messageType");
        defpackage.dim.a(a2, "schema");
        defpackage.dkh dkh2 = (defpackage.dkh) this.c.putIfAbsent(cls, a2);
        return dkh2 != null ? dkh2 : a2;
    }

    public final defpackage.dkh a(java.lang.Object obj) {
        return a(obj.getClass());
    }

    private djz() {
        defpackage.dki dki = null;
        java.lang.String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            dki = a(strArr[0]);
            if (dki != null) {
                break;
            }
        }
        if (dki == null) {
            dki = new defpackage.dje();
        }
        this.b = dki;
    }

    private static defpackage.dki a(java.lang.String str) {
        try {
            return (defpackage.dki) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }
}
