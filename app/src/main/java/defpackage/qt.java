package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: qt  reason: default package */
/* compiled from: PG */
public final class qt implements Collection, Set {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    public Object[] a;
    public int b;
    private int[] i;
    private qz j;

    private final int a(Object obj, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int a2 = qv.a(this.i, i3, i2);
        if (a2 < 0 || obj.equals(this.a[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.i[i4] == i2) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.i[i5] == i2) {
            if (obj.equals(this.a[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private final int a() {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a2 = qv.a(this.i, i2, 0);
        if (a2 < 0 || this.a[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.i[i3] == 0) {
            if (this.a[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.i[i4] == 0) {
            if (this.a[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private final void b(int i2) {
        if (i2 == 8) {
            synchronized (qt.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.a = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (qt.class) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.a = objArr2;
                    e = (Object[]) objArr2[0];
                    this.i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i2];
        this.a = new Object[i2];
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (qt.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (qt.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public qt() {
        this((byte) 0);
    }

    private qt(byte b2) {
        this.i = c;
        this.a = d;
        this.b = 0;
    }

    public final void clear() {
        if (this.b != 0) {
            a(this.i, this.a, this.b);
            this.i = c;
            this.a = d;
            this.b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int hashCode;
        int a2;
        int i2 = 8;
        if (obj == null) {
            a2 = a();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            a2 = a(obj, hashCode);
        }
        if (a2 >= 0) {
            return false;
        }
        int i3 = a2 ^ -1;
        if (this.b >= this.i.length) {
            if (this.b >= 8) {
                i2 = this.b + (this.b >> 1);
            } else if (this.b < 4) {
                i2 = 4;
            }
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(i2);
            if (this.i.length > 0) {
                System.arraycopy(iArr, 0, this.i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            a(iArr, objArr, this.b);
        }
        if (i3 < this.b) {
            System.arraycopy(this.i, i3, this.i, i3 + 1, this.b - i3);
            System.arraycopy(this.a, i3, this.a, i3 + 1, this.b - i3);
        }
        this.i[i3] = hashCode;
        this.a[i3] = obj;
        this.b++;
        return true;
    }

    public final boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        a(a2);
        return true;
    }

    public final Object a(int i2) {
        int i3 = 8;
        Object obj = this.a[i2];
        if (this.b <= 1) {
            a(this.i, this.a, this.b);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else if (this.i.length <= 8 || this.b >= this.i.length / 3) {
            this.b--;
            if (i2 < this.b) {
                System.arraycopy(this.i, i2 + 1, this.i, i2, this.b - i2);
                System.arraycopy(this.a, i2 + 1, this.a, i2, this.b - i2);
            }
            this.a[this.b] = null;
        } else {
            if (this.b > 8) {
                i3 = this.b + (this.b >> 1);
            }
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(i3);
            this.b--;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2);
            }
            if (i2 < this.b) {
                System.arraycopy(iArr, i2 + 1, this.i, i2, this.b - i2);
                System.arraycopy(objArr, i2 + 1, this.a, i2, this.b - i2);
            }
        }
        return obj;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.b];
        System.arraycopy(this.a, 0, objArr, 0, this.b);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        if (objArr.length < this.b) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.b);
        } else {
            objArr2 = objArr;
        }
        System.arraycopy(this.a, 0, objArr2, 0, this.b);
        if (objArr2.length > this.b) {
            objArr2[this.b] = null;
        }
        return objArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            try {
                if (!set.contains(this.a[i2])) {
                    return false;
                }
            } catch (NullPointerException e2) {
                return false;
            } catch (ClassCastException e3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.i;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.a[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator iterator() {
        if (this.j == null) {
            this.j = new qu(this);
        }
        return this.j.d().iterator();
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

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        boolean z = false;
        int size = this.b + collection.size();
        if (this.i.length < size) {
            int[] iArr = this.i;
            Object[] objArr = this.a;
            b(size);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.i, 0, this.b);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            a(iArr, objArr, this.b);
        }
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.a[i2])) {
                a(i2);
                z = true;
            }
        }
        return z;
    }
}
