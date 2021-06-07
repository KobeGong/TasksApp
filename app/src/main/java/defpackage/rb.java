package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: rb  reason: default package */
/* compiled from: PG */
final class rb implements Set {
    private final /* synthetic */ qz a;

    rb(qz qzVar) {
        this.a = qzVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int a2 = this.a.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a2 != this.a.a();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int a2 = this.a.a(entry.getKey());
        if (a2 >= 0) {
            return qv.a(this.a.a(a2, 1), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator iterator() {
        return new rd(this.a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        return qz.a((Set) this, obj);
    }

    public final int hashCode() {
        int a2 = this.a.a() - 1;
        int i = 0;
        while (a2 >= 0) {
            Object a3 = this.a.a(a2, 0);
            Object a4 = this.a.a(a2, 1);
            a2--;
            i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
        }
        return i;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
