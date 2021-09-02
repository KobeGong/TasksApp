package defpackage;

/* renamed from: qt reason: default package */
/* compiled from: PG */
public final class qt implements java.util.Collection, java.util.Set {
    private static final int[] c = new int[0];
    private static final java.lang.Object[] d = new java.lang.Object[0];
    private static java.lang.Object[] e;
    private static int f;
    private static java.lang.Object[] g;
    private static int h;
    public java.lang.Object[] a;
    public int b;
    private int[] i;
    private defpackage.qz j;

    private final int a(java.lang.Object obj, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int a2 = defpackage.qv.a(this.i, i3, i2);
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
        int a2 = defpackage.qv.a(this.i, i2, 0);
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
            synchronized (defpackage.qt.class) {
                if (g != null) {
                    java.lang.Object[] objArr = g;
                    this.a = objArr;
                    g = (java.lang.Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (defpackage.qt.class) {
                if (e != null) {
                    java.lang.Object[] objArr2 = e;
                    this.a = objArr2;
                    e = (java.lang.Object[]) objArr2[0];
                    this.i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i2];
        this.a = new java.lang.Object[i2];
    }

    private static void a(int[] iArr, java.lang.Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (defpackage.qt.class) {
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
            synchronized (defpackage.qt.class) {
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
        this(0);
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

    public final boolean contains(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    public final int a(java.lang.Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final boolean add(java.lang.Object obj) {
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
            java.lang.Object[] objArr = this.a;
            b(i2);
            if (this.i.length > 0) {
                java.lang.System.arraycopy(iArr, 0, this.i, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            a(iArr, objArr, this.b);
        }
        if (i3 < this.b) {
            java.lang.System.arraycopy(this.i, i3, this.i, i3 + 1, this.b - i3);
            java.lang.System.arraycopy(this.a, i3, this.a, i3 + 1, this.b - i3);
        }
        this.i[i3] = hashCode;
        this.a[i3] = obj;
        this.b++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        a(a2);
        return true;
    }

    public final java.lang.Object a(int i2) {
        int i3 = 8;
        java.lang.Object obj = this.a[i2];
        if (this.b <= 1) {
            a(this.i, this.a, this.b);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else if (this.i.length <= 8 || this.b >= this.i.length / 3) {
            this.b--;
            if (i2 < this.b) {
                java.lang.System.arraycopy(this.i, i2 + 1, this.i, i2, this.b - i2);
                java.lang.System.arraycopy(this.a, i2 + 1, this.a, i2, this.b - i2);
            }
            this.a[this.b] = null;
        } else {
            if (this.b > 8) {
                i3 = this.b + (this.b >> 1);
            }
            int[] iArr = this.i;
            java.lang.Object[] objArr = this.a;
            b(i3);
            this.b--;
            if (i2 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.i, 0, i2);
                java.lang.System.arraycopy(objArr, 0, this.a, 0, i2);
            }
            if (i2 < this.b) {
                java.lang.System.arraycopy(iArr, i2 + 1, this.i, i2, this.b - i2);
                java.lang.System.arraycopy(objArr, i2 + 1, this.a, i2, this.b - i2);
            }
        }
        return obj;
    }

    public final int size() {
        return this.b;
    }

    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = new java.lang.Object[this.b];
        java.lang.System.arraycopy(this.a, 0, objArr, 0, this.b);
        return objArr;
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        if (objArr.length < this.b) {
            objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), this.b);
        } else {
            objArr2 = objArr;
        }
        java.lang.System.arraycopy(this.a, 0, objArr2, 0, this.b);
        if (objArr2.length > this.b) {
            objArr2[this.b] = null;
        }
        return objArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i2 = 0;
        while (i2 < this.b) {
            try {
                if (!set.contains(this.a[i2])) {
                    return false;
                }
                i2++;
            } catch (java.lang.NullPointerException e2) {
                return false;
            } catch (java.lang.ClassCastException e3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.a[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final java.util.Iterator iterator() {
        if (this.j == null) {
            this.j = new defpackage.qu(this);
        }
        return this.j.d().iterator();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r3v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection<java.lang.Object> r3) {
        /*
            r2 = this;
            java.util.Iterator r0 = r3.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0004
            r0 = 0
        L_0x0015:
            return r0
        L_0x0016:
            r0 = 1
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.containsAll(java.util.Collection):boolean");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r6v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addAll(java.util.Collection<java.lang.Object> r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r5.b
            int r2 = r6.size()
            int r1 = r1 + r2
            int[] r2 = r5.i
            int r2 = r2.length
            if (r2 >= r1) goto L_0x002b
            int[] r2 = r5.i
            java.lang.Object[] r3 = r5.a
            r5.b(r1)
            int r1 = r5.b
            if (r1 <= 0) goto L_0x0026
            int[] r1 = r5.i
            int r4 = r5.b
            java.lang.System.arraycopy(r2, r0, r1, r0, r4)
            java.lang.Object[] r1 = r5.a
            int r4 = r5.b
            java.lang.System.arraycopy(r3, r0, r1, r0, r4)
        L_0x0026:
            int r1 = r5.b
            a(r2, r3, r1)
        L_0x002b:
            java.util.Iterator r1 = r6.iterator()
        L_0x002f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r1.next()
            boolean r2 = r5.add(r2)
            r0 = r0 | r2
            goto L_0x002f
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.addAll(java.util.Collection):boolean");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r4v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<java.lang.Object> r4) {
        /*
            r3 = this;
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        L_0x0005:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0015
            java.lang.Object r2 = r1.next()
            boolean r2 = r3.remove(r2)
            r0 = r0 | r2
            goto L_0x0005
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt.removeAll(java.util.Collection):boolean");
    }

    public final boolean retainAll(java.util.Collection collection) {
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
