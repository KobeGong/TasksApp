package defpackage;

/* renamed from: dhy reason: default package */
/* compiled from: PG */
final class dhy {
    dhy() {
    }

    static defpackage.dia a(java.lang.Object obj) {
        defpackage.dia dia = ((defpackage.dij) obj).a;
        if (!dia.b) {
            return dia;
        }
        defpackage.dia dia2 = (defpackage.dia) dia.clone();
        ((defpackage.dij) obj).a = dia2;
        return dia2;
    }

    static void b(java.lang.Object obj) {
        ((defpackage.dij) obj).a.a();
    }

    static int a(java.util.Map.Entry entry) {
        entry.getKey();
        throw new java.lang.NoSuchMethodError();
    }

    static void b(java.util.Map.Entry entry) {
        entry.getKey();
        throw new java.lang.NoSuchMethodError();
    }

    dhy(byte b) {
        this();
    }
}
