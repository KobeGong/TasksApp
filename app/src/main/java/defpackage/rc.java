package defpackage;

/* renamed from: rc reason: default package */
/* compiled from: PG */
final class rc implements java.util.Set {
    private final /* synthetic */ defpackage.qz a;

    rc(defpackage.qz qzVar) {
        this.a = qzVar;
    }

    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.a(obj) >= 0;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r4v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection<java.lang.Object> r4) {
        /*
            r3 = this;
            qz r0 = r3.a
            java.util.Map r0 = r0.b()
            java.util.Iterator r1 = r4.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x001c
            java.lang.Object r2 = r1.next()
            boolean r2 = r0.containsKey(r2)
            if (r2 != 0) goto L_0x000a
            r0 = 0
        L_0x001b:
            return r0
        L_0x001c:
            r0 = 1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final java.util.Iterator iterator() {
        return new defpackage.ra(this.a, 0);
    }

    public final boolean remove(java.lang.Object obj) {
        int a2 = this.a.a(obj);
        if (a2 < 0) {
            return false;
        }
        this.a.a(a2);
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r5v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<java.lang.Object> r5) {
        /*
            r4 = this;
            qz r0 = r4.a
            java.util.Map r0 = r0.b()
            int r1 = r0.size()
            java.util.Iterator r2 = r5.iterator()
        L_0x000e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x001c
            java.lang.Object r3 = r2.next()
            r0.remove(r3)
            goto L_0x000e
        L_0x001c:
            int r0 = r0.size()
            if (r1 == r0) goto L_0x0024
            r0 = 1
        L_0x0023:
            return r0
        L_0x0024:
            r0 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.removeAll(java.util.Collection):boolean");
    }

    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.qz.a(this.a.b(), collection);
    }

    public final int size() {
        return this.a.a();
    }

    public final java.lang.Object[] toArray() {
        return this.a.b(0);
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.a.a(objArr, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        return defpackage.qz.a((java.util.Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a2 = this.a.a() - 1; a2 >= 0; a2--) {
            java.lang.Object a3 = this.a.a(a2, 0);
            i += a3 == null ? 0 : a3.hashCode();
        }
        return i;
    }
}
