package defpackage;

/* renamed from: csy reason: default package */
/* compiled from: PG */
public final class csy extends defpackage.cth {
    private boolean a;
    private final /* synthetic */ java.lang.Object b;

    public csy(java.lang.Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.a;
    }

    public final java.lang.Object next() {
        if (this.a) {
            throw new java.util.NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
