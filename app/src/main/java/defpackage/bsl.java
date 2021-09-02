package defpackage;

/* renamed from: bsl reason: default package */
/* compiled from: PG */
public final class bsl implements java.util.Iterator {
    private final defpackage.bsk a;
    private int b;

    public bsl(defpackage.bsk bsk) {
        if (bsk == null) {
            throw new java.lang.IllegalArgumentException("null dataBuffer");
        }
        this.a = bsk;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a.b() + -1;
    }

    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.b);
        }
        defpackage.bsk bsk = this.a;
        int i = this.b + 1;
        this.b = i;
        return bsk.a(i);
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
