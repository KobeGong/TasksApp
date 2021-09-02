package defpackage;

/* renamed from: csx reason: default package */
/* compiled from: PG */
final class csx implements java.util.Iterator {
    private boolean a = true;
    private final /* synthetic */ java.util.Iterator b;

    csx(java.util.Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final java.lang.Object next() {
        java.lang.Object next = this.b.next();
        this.a = false;
        return next;
    }

    public final void remove() {
        defpackage.cld.b(!this.a, (java.lang.Object) "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
