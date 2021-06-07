package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: djz  reason: default package */
/* compiled from: PG */
public final class djz {
    public static final djz a = new djz();
    private final dki b;
    private final ConcurrentMap c = new ConcurrentHashMap();

    public final dkh a(Class cls) {
        dim.a((Object) cls, "messageType");
        dkh dkh = (dkh) this.c.get(cls);
        if (dkh != null) {
            return dkh;
        }
        dkh a2 = this.b.a(cls);
        dim.a((Object) cls, "messageType");
        dim.a((Object) a2, "schema");
        dkh dkh2 = (dkh) this.c.putIfAbsent(cls, a2);
        return dkh2 != null ? dkh2 : a2;
    }

    public final dkh a(Object obj) {
        return a((Class) obj.getClass());
    }

    private djz() {
        dki dki = null;
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        for (int i = 0; i <= 0; i++) {
            dki = a(strArr[0]);
            if (dki != null) {
                break;
            }
        }
        this.b = dki == null ? new dje() : dki;
    }

    private static dki a(String str) {
        try {
            return (dki) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }
}
