package defpackage;

import java.util.Iterator;

/* renamed from: dlb  reason: default package */
/* compiled from: PG */
final class dlb implements Iterator {
    private Iterator a = this.b.a.iterator();
    private final /* synthetic */ dkz b;

    dlb(dkz dkz) {
        this.b = dkz;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
