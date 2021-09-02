package defpackage;

/* renamed from: dkm reason: default package */
/* compiled from: PG */
final class dkm implements java.util.Iterator {
    private int a = this.c.a.size();
    private java.util.Iterator b;
    private final /* synthetic */ defpackage.dkk c;

    dkm(defpackage.dkk dkk) {
        this.c = dkk;
    }

    public final boolean hasNext() {
        return (this.a > 0 && this.a <= this.c.a.size()) || a().hasNext();
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator a() {
        if (this.b == null) {
            this.b = this.c.d.entrySet().iterator();
        }
        return this.b;
    }

    public final /* synthetic */ java.lang.Object next() {
        if (a().hasNext()) {
            return (java.util.Map.Entry) a().next();
        }
        java.util.List list = this.c.a;
        int i = this.a - 1;
        this.a = i;
        return (java.util.Map.Entry) list.get(i);
    }
}
