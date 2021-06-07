package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bcu  reason: default package */
/* compiled from: PG */
public final class bcu implements Iterator {
    private final bcr a;
    private int b = -1;

    public bcu(bcr bcr) {
        this.a = (bcr) azb.b(bcr);
    }

    public final boolean hasNext() {
        return this.b < this.a.b() + -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.b).toString());
        }
        bcr bcr = this.a;
        int i = this.b + 1;
        this.b = i;
        return bcr.a(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
