package defpackage;

import java.util.Map;

/* renamed from: dhy  reason: default package */
/* compiled from: PG */
final class dhy {
    dhy() {
    }

    static dia a(Object obj) {
        dia dia = ((dij) obj).a;
        if (!dia.b) {
            return dia;
        }
        dia dia2 = (dia) dia.clone();
        ((dij) obj).a = dia2;
        return dia2;
    }

    static void b(Object obj) {
        ((dij) obj).a.a();
    }

    static int a(Map.Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    static void b(Map.Entry entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    dhy(byte b) {
        this();
    }
}
