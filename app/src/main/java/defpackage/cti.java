package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: cti  reason: default package */
/* compiled from: PG */
public final class cti extends cth implements ListIterator {
    private final int a;
    private int b;
    private final csp c;

    protected cti() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    private final Object a(int i) {
        return this.c.get(i);
    }

    private cti(int i, int i2) {
        this();
        cld.b(i2, i);
        this.a = i;
        this.b = i2;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
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

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    cti(csp csp, int i) {
        this(csp.size(), i);
        this.c = csp;
    }
}
