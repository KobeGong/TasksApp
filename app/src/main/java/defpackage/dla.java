package defpackage;

import java.util.ListIterator;

/* renamed from: dla  reason: default package */
/* compiled from: PG */
final class dla implements ListIterator {
    private ListIterator a = this.c.a.listIterator(this.b);
    private final /* synthetic */ int b;
    private final /* synthetic */ dkz c;

    dla(dkz dkz, int i) {
        this.c = dkz;
        this.b = i;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final int previousIndex() {
        return this.a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.a.previous();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
