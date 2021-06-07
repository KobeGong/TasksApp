package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dkp  reason: default package */
/* compiled from: PG */
final class dkp implements Iterator {
    dkp() {
    }

    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
