package defpackage;

import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: ctg  reason: default package */
/* compiled from: PG */
public final class ctg extends csv {
    private final transient Object a;
    private transient int b;

    ctg(Object obj) {
        this.a = cld.a(obj);
    }

    ctg(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int size() {
        return 1;
    }

    @Override // defpackage.csn
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.csn
    public final cth a() {
        return new csy(this.a);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csv
    public final csp e() {
        return csp.a(this.a);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.csv
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.a.hashCode();
        this.b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csv
    public final boolean d() {
        return this.b != 0;
    }

    public final String toString() {
        String obj = this.a.toString();
        return new StringBuilder(String.valueOf(obj).length() + 2).append('[').append(obj).append(']').toString();
    }

    @Override // java.util.AbstractCollection, defpackage.csv, java.util.Collection, java.util.Set, java.lang.Iterable, defpackage.csn
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
