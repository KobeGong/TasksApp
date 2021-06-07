package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bsl  reason: default package */
/* compiled from: PG */
public final class bsl implements Iterator {
    private final bsk a;
    private int b;

    public bsl(bsk bsk) {
        if (bsk == null) {
            throw new IllegalArgumentException("null dataBuffer");
        }
        this.a = bsk;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a.b() + -1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.b).toString());
        }
        bsk bsk = this.a;
        int i = this.b + 1;
        this.b = i;
        return bsk.a(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
