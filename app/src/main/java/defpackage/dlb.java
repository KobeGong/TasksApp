package defpackage;

/* renamed from: dlb reason: default package */
/* compiled from: PG */
final class dlb implements java.util.Iterator {
    private java.util.Iterator a = this.b.a.iterator();
    private final /* synthetic */ defpackage.dkz b;

    dlb(defpackage.dkz dkz) {
        this.b = dkz;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.a.next();
    }
}
