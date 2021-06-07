package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: csk  reason: default package */
/* compiled from: PG */
public abstract class csk extends csl implements Collection {
    protected csk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Collection c();

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return c().iterator();
    }

    public int size() {
        return c().size();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return c().removeAll(collection);
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public boolean contains(Object obj) {
        return c().contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        return c().add(obj);
    }

    public boolean remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return c().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return c().addAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return c().retainAll(collection);
    }

    public void clear() {
        c().clear();
    }

    public Object[] toArray() {
        return c().toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return c().toArray(objArr);
    }
}
