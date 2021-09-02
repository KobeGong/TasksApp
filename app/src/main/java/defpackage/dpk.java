package defpackage;

/* renamed from: dpk reason: default package */
/* compiled from: PG */
final class dpk implements java.lang.Iterable {
    dpk() {
    }

    public final java.util.Iterator iterator() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            arrayList.add(java.lang.Class.forName("dut"));
        } catch (java.lang.ClassNotFoundException e) {
        }
        return arrayList.iterator();
    }
}
