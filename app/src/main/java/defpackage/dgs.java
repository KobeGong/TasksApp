package defpackage;

/* renamed from: dgs reason: default package */
/* compiled from: PG */
abstract class dgs extends java.util.AbstractList implements defpackage.diq {
    public boolean a = true;

    dgs() {
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(java.lang.Object obj) {
        c();
        return super.add(obj);
    }

    public void add(int i, java.lang.Object obj) {
        c();
        super.add(i, obj);
    }

    public boolean addAll(java.util.Collection collection) {
        c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, java.util.Collection collection) {
        c();
        return super.addAll(i, collection);
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean a() {
        return this.a;
    }

    public final void b() {
        this.a = false;
    }

    public java.lang.Object remove(int i) {
        c();
        return super.remove(i);
    }

    public boolean remove(java.lang.Object obj) {
        c();
        return super.remove(obj);
    }

    public boolean removeAll(java.util.Collection collection) {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(java.util.Collection collection) {
        c();
        return super.retainAll(collection);
    }

    public java.lang.Object set(int i, java.lang.Object obj) {
        c();
        return super.set(i, obj);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.a) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
