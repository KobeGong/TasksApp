package defpackage;

/* renamed from: dla reason: default package */
/* compiled from: PG */
final class dla implements java.util.ListIterator {
    private java.util.ListIterator a = this.c.a.listIterator(this.b);
    private final /* synthetic */ int b;
    private final /* synthetic */ defpackage.dkz c;

    dla(defpackage.dkz dkz, int i) {
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
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ java.lang.Object previous() {
        return (java.lang.String) this.a.previous();
    }

    public final /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.a.next();
    }
}
