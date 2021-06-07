package defpackage;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: diw  reason: default package */
/* compiled from: PG */
public final class diw implements Iterator {
    private Iterator a;

    public diw(Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        if (entry.getValue() instanceof diu) {
            return new div(entry);
        }
        return entry;
    }
}
