package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dkm  reason: default package */
/* compiled from: PG */
final class dkm implements Iterator {
    private int a = this.c.a.size();
    private Iterator b;
    private final /* synthetic */ dkk c;

    dkm(dkk dkk) {
        this.c = dkk;
    }

    public final boolean hasNext() {
        return (this.a > 0 && this.a <= this.c.a.size()) || a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator a() {
        if (this.b == null) {
            this.b = this.c.d.entrySet().iterator();
        }
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.c.a;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }
}
