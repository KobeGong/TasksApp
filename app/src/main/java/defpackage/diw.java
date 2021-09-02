package defpackage;

/* renamed from: diw reason: default package */
/* compiled from: PG */
final class diw implements java.util.Iterator {
    private java.util.Iterator a;

    public diw(java.util.Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }

    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.a.next();
        if (entry.getValue() instanceof defpackage.diu) {
            return new defpackage.div(entry);
        }
        return entry;
    }
}
