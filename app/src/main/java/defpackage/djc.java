package defpackage;

/* renamed from: djc reason: default package */
/* compiled from: PG */
final class djc extends defpackage.dja {
    djc() {
    }

    /* access modifiers changed from: 0000 */
    public final java.util.List a(java.lang.Object obj, long j) {
        defpackage.diq c = c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        defpackage.diq a = c.a(size == 0 ? 10 : size << 1);
        defpackage.dlc.a(obj, j, (java.lang.Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final void b(java.lang.Object obj, long j) {
        c(obj, j).b();
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj, java.lang.Object obj2, long j) {
        defpackage.diq c = c(obj, j);
        defpackage.diq c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size <= 0) {
            c = c2;
        }
        defpackage.dlc.a(obj, j, (java.lang.Object) c);
    }

    private static defpackage.diq c(java.lang.Object obj, long j) {
        return (defpackage.diq) defpackage.dlc.f(obj, j);
    }
}
