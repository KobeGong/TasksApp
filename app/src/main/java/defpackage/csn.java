package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: csn  reason: default package */
/* compiled from: PG */
public abstract class csn extends AbstractCollection implements Serializable {
    private static final Object[] a = new Object[0];

    csn() {
    }

    /* renamed from: a */
    public abstract cth iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    public abstract boolean contains(Object obj);

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        cld.a(objArr);
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public csp b() {
        return isEmpty() ? csp.d() : csp.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        cth cth = (cth) iterator();
        while (cth.hasNext()) {
            objArr[i] = cth.next();
            i++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new csq(toArray());
    }
}
