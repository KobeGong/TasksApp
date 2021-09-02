package defpackage;

/* renamed from: qz reason: default package */
/* compiled from: PG */
public abstract class qz {
    public defpackage.rb a;
    public defpackage.re b;
    private defpackage.rc c;

    qz() {
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(java.lang.Object obj);

    /* access modifiers changed from: protected */
    public abstract java.lang.Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract java.lang.Object a(int i, java.lang.Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(java.lang.Object obj, java.lang.Object obj2);

    /* access modifiers changed from: protected */
    public abstract int b(java.lang.Object obj);

    /* access modifiers changed from: protected */
    public abstract java.util.Map b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public static boolean a(java.util.Map map, java.util.Collection collection) {
        int size = map.size();
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final java.lang.Object[] b(int i) {
        int a2 = a();
        java.lang.Object[] objArr = new java.lang.Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final java.lang.Object[] a(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2;
        int a2 = a();
        if (objArr.length < a2) {
            objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), a2);
        } else {
            objArr2 = objArr;
        }
        for (int i2 = 0; i2 < a2; i2++) {
            objArr2[i2] = a(i2, i);
        }
        if (objArr2.length > a2) {
            objArr2[a2] = null;
        }
        return objArr2;
    }

    public static boolean a(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (java.lang.NullPointerException e) {
            return false;
        } catch (java.lang.ClassCastException e2) {
            return false;
        }
    }

    public final java.util.Set d() {
        if (this.c == null) {
            this.c = new defpackage.rc(this);
        }
        return this.c;
    }
}
