package defpackage;

/* renamed from: bcu reason: default package */
/* compiled from: PG */
public final class bcu implements java.util.Iterator {
    private final defpackage.bcr a;
    private int b = -1;

    public bcu(defpackage.bcr bcr) {
        this.a = (defpackage.bcr) defpackage.azb.b((java.lang.Object) bcr);
    }

    public final boolean hasNext() {
        return this.b < this.a.b() + -1;
    }

    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.b);
        }
        defpackage.bcr bcr = this.a;
        int i = this.b + 1;
        this.b = i;
        return bcr.a(i);
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
