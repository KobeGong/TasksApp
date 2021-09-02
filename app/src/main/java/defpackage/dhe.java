package defpackage;

/* renamed from: dhe reason: default package */
/* compiled from: PG */
public final class dhe implements java.util.Iterator {
    private int a = 0;
    private final int b = this.c.a();
    private final /* synthetic */ defpackage.dha c;

    dhe(defpackage.dha dha) {
        this.c = dha;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    private final byte a() {
        try {
            defpackage.dha dha = this.c;
            int i = this.a;
            this.a = i + 1;
            return dha.a(i);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final /* synthetic */ java.lang.Object next() {
        return java.lang.Byte.valueOf(a());
    }
}
