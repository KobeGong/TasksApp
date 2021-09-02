package defpackage;

/* renamed from: ra reason: default package */
/* compiled from: PG */
final class ra implements java.util.Iterator {
    private final int a;
    private int b;
    private int c;
    private boolean d = false;
    private final /* synthetic */ defpackage.qz e;

    ra(defpackage.qz qzVar, int i) {
        this.e = qzVar;
        this.a = i;
        this.b = qzVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object a2 = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a2;
    }

    public final void remove() {
        if (!this.d) {
            throw new java.lang.IllegalStateException();
        }
        this.c--;
        this.b--;
        this.d = false;
        this.e.a(this.c);
    }
}
