package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: re  reason: default package */
/* compiled from: PG */
public final class re implements Collection {
    private final /* synthetic */ qz a;

    re(qz qzVar) {
        this.a = qzVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        return this.a.b(obj) >= 0;
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ra(this.a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.a.b(obj);
        if (b < 0) {
            return false;
        }
        this.a.a(b);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        return this.a.b(1);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
