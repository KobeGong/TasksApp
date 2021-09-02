package defpackage;

/* renamed from: dkz reason: default package */
/* compiled from: PG */
public final class dkz extends java.util.AbstractList implements defpackage.diz, java.util.RandomAccess {
    public final defpackage.diz a;

    public dkz(defpackage.diz diz) {
        this.a = diz;
    }

    public final java.lang.Object b(int i) {
        return this.a.b(i);
    }

    public final int size() {
        return this.a.size();
    }

    public final void a(defpackage.dha dha) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.dla(this, i);
    }

    public final java.util.Iterator iterator() {
        return new defpackage.dlb(this);
    }

    public final java.util.List d() {
        return this.a.d();
    }

    public final defpackage.diz e() {
        return this;
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.a.get(i);
    }
}
