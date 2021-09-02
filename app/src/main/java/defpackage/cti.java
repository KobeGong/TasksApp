package defpackage;

/* renamed from: cti reason: default package */
/* compiled from: PG */
public final class cti extends defpackage.cth implements java.util.ListIterator {
    private final int a;
    private int b;
    private final defpackage.csp c;

    protected cti() {
    }

    @java.lang.Deprecated
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.lang.Object a(int i) {
        return this.c.get(i);
    }

    private cti(int i, int i2) {
        this();
        defpackage.cld.b(i2, i);
        this.a = i;
        this.b = i2;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    public final int nextIndex() {
        return this.b;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    cti(defpackage.csp csp, int i) {
        this(csp.size(), i);
        this.c = csp;
    }
}
