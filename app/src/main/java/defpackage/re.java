package defpackage;

/* renamed from: re reason: default package */
/* compiled from: PG */
final class re implements java.util.Collection {
    private final /* synthetic */ defpackage.qz a;

    re(defpackage.qz qzVar) {
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
        return this.a.b(obj) >= 0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final java.util.Iterator iterator() {
        return new defpackage.ra(this.a, 1);
    }

    public final boolean remove(java.lang.Object obj) {
        int b = this.a.b(obj);
        if (b < 0) {
            return false;
        }
        this.a.a(b);
        return true;
    }

    public final boolean removeAll(java.util.Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(java.util.Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.a.a();
    }

    public final java.lang.Object[] toArray() {
        return this.a.b(1);
    }

    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
