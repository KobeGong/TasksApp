package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
/* renamed from: dgs  reason: default package */
/* compiled from: PG */
public abstract class dgs extends AbstractList implements diq {
    public boolean a = true;

    dgs() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
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
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(Object obj) {
        c();
        return super.add(obj);
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, Object obj) {
        c();
        super.add(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection collection) {
        c();
        return super.addAll(i, collection);
    }

    public void clear() {
        c();
        super.clear();
    }

    @Override // defpackage.diq
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.diq
    public final void b() {
        this.a = false;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object remove(int i) {
        c();
        return super.remove(i);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public Object set(int i, Object obj) {
        c();
        return super.set(i, obj);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }
}
