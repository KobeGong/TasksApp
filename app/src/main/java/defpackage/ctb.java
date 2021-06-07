package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ctb  reason: default package */
/* compiled from: PG */
final class ctb extends csv {
    public final transient Object[] a;
    public final transient int b;
    private final transient css c;

    ctb(css css, Object[] objArr, int i) {
        this.c = css;
        this.a = objArr;
        this.b = i;
    }

    @Override // defpackage.csn
    public final cth a() {
        return (cth) b().iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final int a(Object[] objArr, int i) {
        return b().a(objArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csv
    public final csp e() {
        return new ctc(this);
    }

    @Override // defpackage.csn
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.c.get(key))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, defpackage.csv, java.util.Collection, java.util.Set, java.lang.Iterable, defpackage.csn
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
