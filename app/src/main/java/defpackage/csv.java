package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: csv  reason: default package */
/* compiled from: PG */
public abstract class csv extends csn implements Set {
    private transient csp a;

    public static csv a(Object obj) {
        return new ctg(obj);
    }

    public static csv a(int i, Object... objArr) {
        Object[] objArr2;
        while (true) {
            switch (i) {
                case 0:
                    return ctf.a;
                case 1:
                    return a(objArr[0]);
                default:
                    int a2 = a(i);
                    Object[] objArr3 = new Object[a2];
                    int i2 = a2 - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object b = cky.b(objArr[i5], i5);
                        int hashCode = b.hashCode();
                        int a3 = cky.a(hashCode);
                        while (true) {
                            int i6 = a3 & i2;
                            Object obj = objArr3[i6];
                            if (obj == null) {
                                objArr[i3] = b;
                                objArr3[i6] = b;
                                i4 += hashCode;
                                i3++;
                            } else if (!obj.equals(b)) {
                                a3++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i3, i, (Object) null);
                    if (i3 == 1) {
                        return new ctg(objArr[0], i4);
                    }
                    if (a(i3) < a2 / 2) {
                        i = i3;
                    } else {
                        int length = objArr.length;
                        if (i3 < (length >> 2) + (length >> 1)) {
                            objArr2 = Arrays.copyOf(objArr, i3);
                        } else {
                            objArr2 = objArr;
                        }
                        return new ctf(objArr2, i4, objArr3, i2, i3);
                    }
            }
        }
    }

    static int a(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            while (true) {
                highestOneBit <<= 1;
                if (((double) highestOneBit) * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
            }
        } else {
            cld.a(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    public static csv a(Object[] objArr) {
        switch (objArr.length) {
            case 0:
                return ctf.a;
            case 1:
                return a(objArr[0]);
            default:
                return a(objArr.length, (Object[]) objArr.clone());
        }
    }

    csv() {
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csv) || !d() || !((csv) obj).d() || hashCode() == obj.hashCode()) {
            return cky.a((Set) this, obj);
        }
        return false;
    }

    public int hashCode() {
        return cky.a((Set) this);
    }

    @Override // defpackage.csn
    public csp b() {
        csp csp = this.a;
        if (csp != null) {
            return csp;
        }
        csp e = e();
        this.a = e;
        return e;
    }

    /* access modifiers changed from: package-private */
    public csp e() {
        return csp.b(toArray());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public Object writeReplace() {
        return new csw(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, defpackage.csn
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
