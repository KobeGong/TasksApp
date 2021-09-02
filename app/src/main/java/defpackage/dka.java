package defpackage;

/* renamed from: dka reason: default package */
/* compiled from: PG */
public final class dka extends defpackage.dgs {
    public static final defpackage.dka b;
    private final java.util.List c;

    dka() {
        this(new java.util.ArrayList(10));
    }

    private dka(java.util.List list) {
        this.c = list;
    }

    public final void add(int i, java.lang.Object obj) {
        c();
        this.c.add(i, obj);
        this.modCount++;
    }

    public final java.lang.Object get(int i) {
        return this.c.get(i);
    }

    public final java.lang.Object remove(int i) {
        c();
        java.lang.Object remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    public final java.lang.Object set(int i, java.lang.Object obj) {
        c();
        java.lang.Object obj2 = this.c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.c.size();
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.c);
        return new defpackage.dka(arrayList);
    }

    static {
        defpackage.dka dka = new defpackage.dka();
        b = dka;
        dka.a = false;
    }
}
