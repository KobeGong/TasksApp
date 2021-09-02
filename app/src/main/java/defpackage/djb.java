package defpackage;

/* renamed from: djb reason: default package */
/* compiled from: PG */
final class djb extends defpackage.dja {
    private static final java.lang.Class c = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    djb() {
    }

    /* access modifiers changed from: 0000 */
    public final java.util.List a(java.lang.Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    public final void b(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) defpackage.dlc.f(obj, j);
        if (list instanceof defpackage.diz) {
            unmodifiableList = ((defpackage.diz) list).e();
        } else if (!c.isAssignableFrom(list.getClass())) {
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        } else {
            return;
        }
        defpackage.dlc.a(obj, j, unmodifiableList);
    }

    private static java.util.List a(java.lang.Object obj, long j, int i) {
        java.util.List arrayList;
        java.util.List c2 = c(obj, j);
        if (c2.isEmpty()) {
            if (c2 instanceof defpackage.diz) {
                arrayList = new defpackage.diy(i);
            } else {
                arrayList = new java.util.ArrayList(i);
            }
            defpackage.dlc.a(obj, j, (java.lang.Object) arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(c2.getClass())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(c2.size() + i);
            arrayList2.addAll(c2);
            defpackage.dlc.a(obj, j, (java.lang.Object) arrayList2);
            return arrayList2;
        } else if (!(c2 instanceof defpackage.dkz)) {
            return c2;
        } else {
            defpackage.diy diy = new defpackage.diy(c2.size() + i);
            diy.addAll((defpackage.dkz) c2);
            defpackage.dlc.a(obj, j, (java.lang.Object) diy);
            return diy;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List c2 = c(obj2, j);
        java.util.List a = a(obj, j, c2.size());
        int size = a.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c2);
        }
        if (size <= 0) {
            a = c2;
        }
        defpackage.dlc.a(obj, j, (java.lang.Object) a);
    }

    private static java.util.List c(java.lang.Object obj, long j) {
        return (java.util.List) defpackage.dlc.f(obj, j);
    }
}
