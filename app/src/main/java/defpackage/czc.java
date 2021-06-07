package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: czc  reason: default package */
/* compiled from: PG */
public final class czc {
    private final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 10);
    private final ReferenceQueue b = new ReferenceQueue();

    czc() {
    }

    public final List a(Throwable th, boolean z) {
        Reference poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        List list = (List) this.a.get(new czd(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.a.putIfAbsent(new czd(th, this.b), vector);
        return list2 == null ? vector : list2;
    }
}