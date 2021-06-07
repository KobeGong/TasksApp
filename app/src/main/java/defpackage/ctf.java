package defpackage;

import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: ctf  reason: default package */
/* compiled from: PG */
public final class ctf extends csv {
    public static final ctf a = new ctf(new Object[0], 0, null, 0, 0);
    private final transient Object[] b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    ctf(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    @Override // defpackage.csn
    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = cky.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = a2 & this.d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    public final int size() {
        return this.f;
    }

    @Override // defpackage.csn
    public final cth a() {
        return (cth) b().iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return this.f + i;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csv
    public final csp e() {
        return csp.b(this.b, this.f);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return false;
    }

    @Override // defpackage.csv
    public final int hashCode() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csv
    public final boolean d() {
        return true;
    }

    @Override // java.util.AbstractCollection, defpackage.csv, java.util.Collection, java.util.Set, java.lang.Iterable, defpackage.csn
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
