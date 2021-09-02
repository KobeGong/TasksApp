package defpackage;

/* renamed from: csv reason: default package */
/* compiled from: PG */
public abstract class csv extends defpackage.csn implements java.util.Set {
    private transient defpackage.csp a;

    public static defpackage.csv a(java.lang.Object obj) {
        return new defpackage.ctg(obj);
    }

    public static defpackage.csv a(int i, java.lang.Object... objArr) {
        java.lang.Object[] objArr2;
        while (true) {
            switch (i) {
                case 0:
                    return defpackage.ctf.a;
                case 1:
                    return a(objArr[0]);
                default:
                    int a2 = a(i);
                    java.lang.Object[] objArr3 = new java.lang.Object[a2];
                    int i2 = a2 - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        java.lang.Object b = defpackage.cky.b(objArr[i5], i5);
                        int hashCode = b.hashCode();
                        int a3 = defpackage.cky.a(hashCode);
                        while (true) {
                            int i6 = a3 & i2;
                            java.lang.Object obj = objArr3[i6];
                            if (obj == null) {
                                int i7 = i3 + 1;
                                objArr[i3] = b;
                                objArr3[i6] = b;
                                i4 += hashCode;
                                i3 = i7;
                            } else if (!obj.equals(b)) {
                                a3++;
                            }
                        }
                    }
                    java.util.Arrays.fill(objArr, i3, i, null);
                    if (i3 == 1) {
                        return new defpackage.ctg(objArr[0], i4);
                    }
                    if (a(i3) < a2 / 2) {
                        i = i3;
                    } else {
                        int length = objArr.length;
                        if (i3 < (length >> 2) + (length >> 1)) {
                            objArr2 = java.util.Arrays.copyOf(objArr, i3);
                        } else {
                            objArr2 = objArr;
                        }
                        return new defpackage.ctf(objArr2, i4, objArr3, i2, i3);
                    }
            }
        }
    }

    static int a(int i) {
        int max = java.lang.Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = java.lang.Integer.highestOneBit(max - 1);
            while (true) {
                highestOneBit <<= 1;
                if (((double) highestOneBit) * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
            }
        } else {
            defpackage.cld.a(max < 1073741824, (java.lang.Object) "collection too large");
            return 1073741824;
        }
    }

    public static defpackage.csv a(java.lang.Object[] objArr) {
        switch (objArr.length) {
            case 0:
                return defpackage.ctf.a;
            case 1:
                return a(objArr[0]);
            default:
                return a(objArr.length, (java.lang.Object[]) objArr.clone());
        }
    }

    csv() {
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.csv) || !d() || !((defpackage.csv) obj).d() || hashCode() == obj.hashCode()) {
            return defpackage.cky.a((java.util.Set) this, obj);
        }
        return false;
    }

    public int hashCode() {
        return defpackage.cky.a((java.util.Set) this);
    }

    public defpackage.csp b() {
        defpackage.csp csp = this.a;
        if (csp != null) {
            return csp;
        }
        defpackage.csp e = e();
        this.a = e;
        return e;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.csp e() {
        return defpackage.csp.b(toArray());
    }

    /* access modifiers changed from: 0000 */
    public java.lang.Object writeReplace() {
        return new defpackage.csw(toArray());
    }

    public /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
