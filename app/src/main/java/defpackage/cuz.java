package defpackage;

/* renamed from: cuz reason: default package */
/* compiled from: PG */
final class cuz implements java.util.Comparator {
    cuz() {
    }

    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cva a = defpackage.cva.a(obj);
        defpackage.cva a2 = defpackage.cva.a(obj2);
        return a == a2 ? a.a(obj, obj2) : a.compareTo(a2);
    }
}
