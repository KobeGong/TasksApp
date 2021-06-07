package defpackage;

import java.util.Iterator;

/* renamed from: ctd  reason: default package */
/* compiled from: PG */
final class ctd extends csv {
    private final transient css a;
    private final transient csp b;

    ctd(css css, csp csp) {
        this.a = css;
        this.b = csp;
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

    @Override // defpackage.csv, defpackage.csn
    public final csp b() {
        return this.b;
    }

    @Override // defpackage.csn
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.csn
    public final boolean c() {
        return true;
    }

    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, defpackage.csv, java.util.Collection, java.util.Set, java.lang.Iterable, defpackage.csn
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
