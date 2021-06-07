package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: rc  reason: default package */
/* compiled from: PG */
public final class rc implements Set {
    private final /* synthetic */ qz a;

    rc(qz qzVar) {
        this.a = qzVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Map b = this.a.b();
        for (Object obj : collection) {
            if (!b.containsKey(obj)) {
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
        return new ra(this.a, 0);
    }

    public final boolean remove(Object obj) {
        int a2 = this.a.a(obj);
        if (a2 < 0) {
            return false;
        }
        this.a.a(a2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Map b = this.a.b();
        int size = b.size();
        for (Object obj : collection) {
            b.remove(obj);
        }
        return size != b.size();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        return qz.a(this.a.b(), collection);
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        return this.a.b(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }

    public final boolean equals(Object obj) {
        return qz.a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a2 = this.a.a() - 1; a2 >= 0; a2--) {
            Object a3 = this.a.a(a2, 0);
            i += a3 == null ? 0 : a3.hashCode();
        }
        return i;
    }
}
