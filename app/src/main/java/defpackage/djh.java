package defpackage;

/* renamed from: djh reason: default package */
/* compiled from: PG */
public final class djh {
    public final defpackage.dji a;

    private djh(defpackage.dln dln, java.lang.Object obj, defpackage.dln dln2, java.lang.Object obj2) {
        this.a = new defpackage.dji(dln, obj, dln2, obj2);
    }

    public static defpackage.djh a(defpackage.dln dln, java.lang.Object obj, defpackage.dln dln2, java.lang.Object obj2) {
        return new defpackage.djh(dln, obj, dln2, obj2);
    }

    static void a(defpackage.dhn dhn, defpackage.dji dji, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dia.a(dhn, dji.a, 1, obj);
        defpackage.dia.a(dhn, dji.c, 2, obj2);
    }

    static int a(defpackage.dji dji, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.dia.a(dji.a, 1, obj) + defpackage.dia.a(dji.c, 2, obj2);
    }
}
