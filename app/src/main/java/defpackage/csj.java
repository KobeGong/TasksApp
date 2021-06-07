package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: csj  reason: default package */
/* compiled from: PG */
public final class csj implements Iterable {
    private final crv a;
    private final /* synthetic */ Iterable b;
    private final /* synthetic */ int c;

    protected csj() {
        this.a = crk.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object obj : (Iterable) this.a.a(this)) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(obj);
        }
        return sb.append(']').toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public csj(Iterable iterable, int i) {
        this();
        this.b = iterable;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.b instanceof List) {
            List list = (List) this.b;
            return list.subList(Math.min(list.size(), this.c), list.size()).iterator();
        }
        Iterator it = this.b.iterator();
        int i = this.c;
        cld.a(it);
        cld.a(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new csx(it);
    }
}
