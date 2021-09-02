package defpackage;

/* renamed from: ebi reason: default package */
/* compiled from: PG */
public abstract class ebi {
    /* access modifiers changed from: protected */
    public abstract java.util.Iterator a();

    public java.lang.String toString() {
        return "TagContext";
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r5.remove(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            r2 = 0
            boolean r0 = r8 instanceof defpackage.ebi
            if (r0 != 0) goto L_0x0008
            r0 = r2
        L_0x0007:
            return r0
        L_0x0008:
            ebi r8 = (defpackage.ebi) r8
            java.util.Iterator r3 = r7.a()
            java.util.Iterator r4 = r8.a()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0017:
            if (r3 == 0) goto L_0x005c
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r3.next()
            ebh r0 = (defpackage.ebh) r0
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
            goto L_0x0017
        L_0x003f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r5.put(r0, r1)
            goto L_0x0017
        L_0x0047:
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= r6) goto L_0x0072
            int r1 = r1 + -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
        L_0x005c:
            if (r4 == 0) goto L_0x0076
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r4.next()
            ebh r0 = (defpackage.ebh) r0
            boolean r1 = r5.containsKey(r0)
            if (r1 != 0) goto L_0x0047
            r0 = r2
            goto L_0x0007
        L_0x0072:
            r5.remove(r0)
            goto L_0x005c
        L_0x0076:
            boolean r0 = r5.isEmpty()
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        java.util.Iterator a = a();
        if (a == null) {
            return 0;
        }
        while (true) {
            int i2 = i;
            if (!a.hasNext()) {
                return i2;
            }
            defpackage.ebh ebh = (defpackage.ebh) a.next();
            if (ebh != null) {
                i = ebh.hashCode() + i2;
            } else {
                i = i2;
            }
        }
    }
}
