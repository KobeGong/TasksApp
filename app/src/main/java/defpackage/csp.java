package defpackage;

/* renamed from: csp reason: default package */
/* compiled from: PG */
public abstract class csp extends defpackage.csn implements java.util.List, java.util.RandomAccess {
    private static final defpackage.cti a = new defpackage.cti(defpackage.csz.a, 0);

    public static defpackage.csp d() {
        return defpackage.csz.a;
    }

    public static defpackage.csp a(java.lang.Object obj) {
        java.lang.Object[] a2 = defpackage.cky.a(obj);
        return b(a2, a2.length);
    }

    public static defpackage.csp a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.Object[] a2 = defpackage.cky.a(obj, obj2, obj3, obj4);
        return b(a2, a2.length);
    }

    public static defpackage.csp a(java.lang.Iterable iterable) {
        defpackage.cld.a((java.lang.Object) iterable);
        return a((java.util.Collection) iterable);
    }

    public static defpackage.csp a(java.util.Collection collection) {
        if (collection instanceof defpackage.csn) {
            defpackage.csp b = ((defpackage.csn) collection).b();
            if (!b.c()) {
                return b;
            }
            java.lang.Object[] array = b.toArray();
            return b(array, array.length);
        }
        java.lang.Object[] a2 = defpackage.cky.a(collection.toArray());
        return b(a2, a2.length);
    }

    public static defpackage.csp a(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return defpackage.csz.a;
        }
        java.lang.Object[] a2 = defpackage.cky.a((java.lang.Object[]) objArr.clone());
        return b(a2, a2.length);
    }

    static defpackage.csp b(java.lang.Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static defpackage.csp b(java.lang.Object[] objArr, int i) {
        if (i == 0) {
            return defpackage.csz.a;
        }
        return new defpackage.csz(objArr, i);
    }

    csp() {
    }

    public final defpackage.cth a() {
        return (defpackage.cti) listIterator();
    }

    public int indexOf(java.lang.Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof java.util.RandomAccess) {
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
        java.util.ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (defpackage.cru.equals(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof java.util.RandomAccess)) {
            java.util.ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (defpackage.cru.equals(obj, listIterator.previous())) {
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

    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    public defpackage.csp subList(int i, int i2) {
        defpackage.cld.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return defpackage.csz.a;
        }
        return new defpackage.csr(this, i, i2 - i);
    }

    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final defpackage.csp b() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public int a(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == defpackage.cld.a((java.lang.Object) this)) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof java.util.RandomAccess) || !(list instanceof java.util.RandomAccess)) {
                    defpackage.csp csp = this;
                    int size2 = csp.size();
                    java.util.Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object obj2 = csp.get(i);
                            i++;
                            if (!defpackage.cru.equals(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i2 < size) {
                        if (defpackage.cru.equals(get(i2), list.get(i2))) {
                            i2++;
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
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: 0000 */
    public java.lang.Object writeReplace() {
        return new defpackage.csq(toArray());
    }

    public /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ java.util.ListIterator listIterator(int i) {
        defpackage.cld.b(i, size());
        if (isEmpty()) {
            return a;
        }
        return new defpackage.cti(this, i);
    }

    public /* synthetic */ java.util.ListIterator listIterator() {
        return (defpackage.cti) listIterator(0);
    }
}
