package defpackage;

/* renamed from: djj reason: default package */
/* compiled from: PG */
public final class djj extends java.util.LinkedHashMap {
    public static final defpackage.djj b;
    public boolean a = true;

    private djj() {
    }

    private djj(java.util.Map map) {
        super(map);
    }

    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        b();
        defpackage.dim.a(obj);
        defpackage.dim.a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(java.util.Map map) {
        b();
        for (java.lang.Object next : map.keySet()) {
            defpackage.dim.a(next);
            defpackage.dim.a(map.get(next));
        }
        super.putAll(map);
    }

    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r3 = 1
            r4 = 0
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x0062
            java.util.Map r7 = (java.util.Map) r7
            if (r6 == r7) goto L_0x0060
            int r0 = r6.size()
            int r1 = r7.size()
            if (r0 == r1) goto L_0x0019
            r0 = r4
        L_0x0015:
            if (r0 == 0) goto L_0x0062
            r0 = r3
        L_0x0018:
            return r0
        L_0x0019:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0021:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            boolean r1 = r7.containsKey(r1)
            if (r1 != 0) goto L_0x0039
            r0 = r4
            goto L_0x0015
        L_0x0039:
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r2 = r7.get(r0)
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L_0x005b
            r0 = r1
            byte[] r0 = (byte[]) r0
            r1 = r2
            byte[] r1 = (byte[]) r1
            boolean r0 = java.util.Arrays.equals(r0, r1)
        L_0x0057:
            if (r0 != 0) goto L_0x0021
            r0 = r4
            goto L_0x0015
        L_0x005b:
            boolean r0 = r1.equals(r2)
            goto L_0x0057
        L_0x0060:
            r0 = r3
            goto L_0x0015
        L_0x0062:
            r0 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djj.equals(java.lang.Object):boolean");
    }

    private static int a(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return defpackage.dim.c((byte[]) obj);
        }
        if (!(obj instanceof defpackage.din)) {
            return obj.hashCode();
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        java.util.Iterator it = entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            i = (a(entry.getValue()) ^ a(entry.getKey())) + i2;
        }
    }

    public final defpackage.djj a() {
        return isEmpty() ? new defpackage.djj() : new defpackage.djj(this);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (!this.a) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.djj djj = new defpackage.djj();
        b = djj;
        djj.a = false;
    }
}
