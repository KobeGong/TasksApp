package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: csp  reason: default package */
/* compiled from: PG */
public abstract class csp extends csn implements List, RandomAccess {
    private static final cti a = new cti(csz.a, 0);

    public static csp d() {
        return csz.a;
    }

    public static csp a(Object obj) {
        Object[] a2 = cky.a(obj);
        return b(a2, a2.length);
    }

    public static csp a(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] a2 = cky.a(obj, obj2, obj3, obj4);
        return b(a2, a2.length);
    }

    public static csp a(Iterable iterable) {
        cld.a(iterable);
        return a((Collection) iterable);
    }

    public static csp a(Collection collection) {
        if (collection instanceof csn) {
            csp b = ((csn) collection).b();
            if (!b.c()) {
                return b;
            }
            Object[] array = b.toArray();
            return b(array, array.length);
        }
        Object[] a2 = cky.a(collection.toArray());
        return b(a2, a2.length);
    }

    public static csp a(Object[] objArr) {
        if (objArr.length == 0) {
            return csz.a;
        }
        Object[] a2 = cky.a((Object[]) objArr.clone());
        return b(a2, a2.length);
    }

    static csp b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static csp b(Object[] objArr, int i) {
        if (i == 0) {
            return csz.a;
        }
        return new csz(objArr, i);
    }

    csp() {
    }

    @Override // defpackage.csn
    public final cth a() {
        return (cti) listIterator();
    }

    public int indexOf(Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (cru.d(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (cru.d(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        } else if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
            return -1;
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
            return -1;
        }
    }

    @Override // defpackage.csn
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    public csp subList(int i, int i2) {
        cld.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return csz.a;
        }
        return new csr(this, i, i2 - i);
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.csn
    public final csp b() {
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        if (obj == cld.a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    csp csp = this;
                    int size2 = csp.size();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj2 = csp.get(i);
                            i++;
                            if (!cru.d(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (cru.d(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public Object writeReplace() {
        return new csq(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable, defpackage.csn
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        cld.b(i, size());
        if (isEmpty()) {
            return a;
        }
        return new cti(this, i);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (cti) listIterator(0);
    }
}
