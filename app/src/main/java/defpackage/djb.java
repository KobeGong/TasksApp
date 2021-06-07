package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: djb  reason: default package */
/* compiled from: PG */
final class djb extends dja {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    djb() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final List a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) dlc.f(obj, j);
        if (list instanceof diz) {
            unmodifiableList = ((diz) list).e();
        } else if (!c.isAssignableFrom(list.getClass())) {
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        dlc.a(obj, j, unmodifiableList);
    }

    private static List a(Object obj, long j, int i) {
        List arrayList;
        List c2 = c(obj, j);
        if (c2.isEmpty()) {
            if (c2 instanceof diz) {
                arrayList = new diy(i);
            } else {
                arrayList = new ArrayList(i);
            }
            dlc.a(obj, j, arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList2 = new ArrayList(c2.size() + i);
            arrayList2.addAll(c2);
            dlc.a(obj, j, arrayList2);
            return arrayList2;
        } else if (!(c2 instanceof dkz)) {
            return c2;
        } else {
            diy diy = new diy(c2.size() + i);
            diy.addAll((dkz) c2);
            dlc.a(obj, j, diy);
            return diy;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dja
    public final void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a = a(obj, j, c2.size());
        int size = a.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c2);
        }
        if (size <= 0) {
            a = c2;
        }
        dlc.a(obj, j, a);
    }

    private static List c(Object obj, long j) {
        return (List) dlc.f(obj, j);
    }
}
