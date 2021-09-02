package defpackage;

/* renamed from: diy reason: default package */
/* compiled from: PG */
public final class diy extends defpackage.dgs implements defpackage.diz, java.util.RandomAccess {
    private final java.util.List b;

    public diy() {
        this(10);
    }

    public diy(int i) {
        this(new java.util.ArrayList(i));
    }

    private diy(java.util.ArrayList arrayList) {
        this.b = arrayList;
    }

    public final int size() {
        return this.b.size();
    }

    public final boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, java.util.Collection collection) {
        c();
        if (collection instanceof defpackage.diz) {
            collection = ((defpackage.diz) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        c();
        this.b.clear();
        this.modCount++;
    }

    public final void a(defpackage.dha dha) {
        c();
        this.b.add(dha);
        this.modCount++;
    }

    public final java.lang.Object b(int i) {
        return this.b.get(i);
    }

    private static java.lang.String a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof defpackage.dha) {
            return ((defpackage.dha) obj).c();
        }
        return defpackage.dim.b((byte[]) obj);
    }

    public final java.util.List d() {
        return java.util.Collections.unmodifiableList(this.b);
    }

    public final defpackage.diz e() {
        if (a()) {
            return new defpackage.dkz(this);
        }
        return this;
    }

    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        c();
        return a(this.b.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        java.lang.Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        c();
        this.b.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.b);
        return new defpackage.diy(arrayList);
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.b.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof defpackage.dha) {
            defpackage.dha dha = (defpackage.dha) obj;
            java.lang.String c = dha.c();
            if (dha.d()) {
                this.b.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String b2 = defpackage.dim.b(bArr);
        if (defpackage.dim.a(bArr)) {
            this.b.set(i, b2);
        }
        return b2;
    }

    static {
        new defpackage.diy().a = false;
    }
}
