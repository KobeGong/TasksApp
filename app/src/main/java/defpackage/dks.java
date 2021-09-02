package defpackage;

/* renamed from: dks reason: default package */
/* compiled from: PG */
final class dks implements java.util.Iterator {
    private int a = -1;
    private boolean b;
    private java.util.Iterator c;
    private final /* synthetic */ defpackage.dkk d;

    dks(defpackage.dkk dkk) {
        this.d = dkk;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.a.size() || (!this.d.b.isEmpty() && a().hasNext());
    }

    public final void remove() {
        if (!this.b) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.e();
        if (this.a < this.d.a.size()) {
            defpackage.dkk dkk = this.d;
            int i = this.a;
            this.a = i - 1;
            dkk.c(i);
            return;
        }
        a().remove();
    }

    private final java.util.Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    public final /* synthetic */ java.lang.Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.a.size()) {
            return (java.util.Map.Entry) this.d.a.get(this.a);
        }
        return (java.util.Map.Entry) a().next();
    }
}
