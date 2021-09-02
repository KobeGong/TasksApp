package defpackage;

/* renamed from: czc reason: default package */
/* compiled from: PG */
final class czc {
    private final java.util.concurrent.ConcurrentHashMap a = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue b = new java.lang.ref.ReferenceQueue();

    czc() {
    }

    public final java.util.List a(java.lang.Throwable th, boolean z) {
        java.lang.ref.Reference poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        java.util.List list = (java.util.List) this.a.get(new defpackage.czd(th, null));
        if (!z || list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List list2 = (java.util.List) this.a.putIfAbsent(new defpackage.czd(th, this.b), vector);
        return list2 == null ? vector : list2;
    }
}
