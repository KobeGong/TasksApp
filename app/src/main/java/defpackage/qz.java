package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: qz  reason: default package */
/* compiled from: PG */
public abstract class qz {
    public rb a;
    public re b;
    private rc c;

    qz() {
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public static boolean a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final Object[] a(Object[] objArr, int i) {
        Object[] objArr2;
        int a2 = a();
        if (objArr.length < a2) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a2);
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

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public final Set d() {
        if (this.c == null) {
            this.c = new rc(this);
        }
        return this.c;
    }
}
