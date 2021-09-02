package defpackage;

/* renamed from: rb reason: default package */
/* compiled from: PG */
final class rb implements java.util.Set {
    private final /* synthetic */ defpackage.qz a;

    rb(defpackage.qz qzVar) {
        this.a = qzVar;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.util.Map$Entry>, for r6v0, types: [java.util.Collection<java.util.Map$Entry>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addAll(java.util.Collection<java.util.Map.Entry> r6) {
        /*
            r5 = this;
            qz r0 = r5.a
            int r1 = r0.a()
            java.util.Iterator r2 = r6.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            qz r3 = r5.a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.a(r4, r0)
            goto L_0x000a
        L_0x0024:
            qz r0 = r5.a
            int r0 = r0.a()
            if (r1 == r0) goto L_0x002e
            r0 = 1
        L_0x002d:
            return r0
        L_0x002e:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb.addAll(java.util.Collection):boolean");
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int a2 = this.a.a(entry.getKey());
        if (a2 >= 0) {
            return defpackage.qv.a(this.a.a(a2, 1), entry.getValue());
        }
        return false;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final java.util.Iterator iterator() {
        return new defpackage.rd(this.a);
    }

    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final int size() {
        return this.a.a();
    }

    public final java.lang.Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean equals(java.lang.Object obj) {
        return defpackage.qz.a((java.util.Set) this, obj);
    }

    public final int hashCode() {
        int a2 = this.a.a() - 1;
        int i = 0;
        while (a2 >= 0) {
            java.lang.Object a3 = this.a.a(a2, 0);
            java.lang.Object a4 = this.a.a(a2, 1);
            a2--;
            i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
        }
        return i;
    }

    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
