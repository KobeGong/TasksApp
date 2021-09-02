package defpackage;

/* renamed from: csk reason: default package */
/* compiled from: PG */
public abstract class csk extends defpackage.csl implements java.util.Collection {
    protected csk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract java.util.Collection c();

    public java.util.Iterator iterator() {
        return c().iterator();
    }

    public int size() {
        return c().size();
    }

    public boolean removeAll(java.util.Collection collection) {
        return c().removeAll(collection);
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public boolean contains(java.lang.Object obj) {
        return c().contains(obj);
    }

    public boolean add(java.lang.Object obj) {
        return c().add(obj);
    }

    public boolean remove(java.lang.Object obj) {
        return c().remove(obj);
    }

    public boolean containsAll(java.util.Collection collection) {
        return c().containsAll(collection);
    }

    public boolean addAll(java.util.Collection collection) {
        return c().addAll(collection);
    }

    public boolean retainAll(java.util.Collection collection) {
        return c().retainAll(collection);
    }

    public void clear() {
        c().clear();
    }

    public java.lang.Object[] toArray() {
        return c().toArray();
    }

    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return c().toArray(objArr);
    }
}
