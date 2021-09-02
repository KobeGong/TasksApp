package defpackage;

/* renamed from: csn reason: default package */
/* compiled from: PG */
public abstract class csn extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] a = new java.lang.Object[0];

    csn() {
    }

    /* renamed from: a */
    public abstract defpackage.cth iterator();

    /* access modifiers changed from: 0000 */
    public abstract boolean c();

    public abstract boolean contains(java.lang.Object obj);

    public final java.lang.Object[] toArray() {
        int size = size();
        if (size == 0) {
            return a;
        }
        java.lang.Object[] objArr = new java.lang.Object[size];
        a(objArr, 0);
        return objArr;
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.cld.a((java.lang.Object) objArr);
        int size = size();
        if (objArr.length < size) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public defpackage.csp b() {
        return isEmpty() ? defpackage.csp.d() : defpackage.csp.b(toArray());
    }

    /* access modifiers changed from: 0000 */
    public int a(java.lang.Object[] objArr, int i) {
        defpackage.cth cth = (defpackage.cth) iterator();
        while (cth.hasNext()) {
            int i2 = i + 1;
            objArr[i] = cth.next();
            i = i2;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public java.lang.Object writeReplace() {
        return new defpackage.csq(toArray());
    }
}
