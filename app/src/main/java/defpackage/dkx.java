package defpackage;

/* renamed from: dkx reason: default package */
/* compiled from: PG */
final class dkx {
    dkx() {
    }

    static /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.dky dky = ((defpackage.dih) obj).s;
        if (dky != defpackage.dky.a) {
            return dky;
        }
        defpackage.dky dky2 = new defpackage.dky();
        a(obj, dky2);
        return dky2;
    }

    static void b(java.lang.Object obj) {
        ((defpackage.dih) obj).s.f = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r8, defpackage.dkc r9) {
        /*
            r7 = this;
            r2 = 0
            r1 = 1
            int r0 = r9.b()
            int r3 = r0 >>> 3
            r0 = r0 & 7
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x002e;
                case 2: goto L_0x0041;
                case 3: goto L_0x004a;
                case 4: goto L_0x007e;
                case 5: goto L_0x001b;
                default: goto L_0x000d;
            }
        L_0x000d:
            dis r0 = defpackage.dir.f()
            throw r0
        L_0x0012:
            long r4 = r9.g()
            ((defpackage.dky) r8).a(r3 << 3, (java.lang.Object) java.lang.Long.valueOf(r4))
            r0 = r1
        L_0x001a:
            return r0
        L_0x001b:
            int r0 = r9.j()
            dky r8 = (defpackage.dky) r8
            int r2 = r3 << 3
            r2 = r2 | 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.a(r2, r0)
            r0 = r1
            goto L_0x001a
        L_0x002e:
            long r4 = r9.i()
            dky r8 = (defpackage.dky) r8
            int r0 = r3 << 3
            r0 = r0 | 1
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r8.a(r0, r2)
            r0 = r1
            goto L_0x001a
        L_0x0041:
            dha r0 = r9.n()
            ((defpackage.dky) r8).a((r3 << 3) | 2, (java.lang.Object) r0)
            r0 = r1
            goto L_0x001a
        L_0x004a:
            dky r0 = new dky
            r0.<init>()
            int r4 = r3 << 3
            r4 = r4 | 4
        L_0x0053:
            int r5 = r9.a()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L_0x0062
            boolean r5 = r7.a(r0, r9)
            if (r5 != 0) goto L_0x0053
        L_0x0062:
            int r5 = r9.b()
            if (r4 == r5) goto L_0x006d
            dir r0 = defpackage.dir.e()
            throw r0
        L_0x006d:
            dky r0 = (defpackage.dky) r0
            r0.f = r2
            dky r8 = (defpackage.dky) r8
            dky r0 = (defpackage.dky) r0
            int r2 = r3 << 3
            r2 = r2 | 3
            r8.a(r2, r0)
            r0 = r1
            goto L_0x001a
        L_0x007e:
            r0 = r2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkx.a(java.lang.Object, dkc):boolean");
    }

    dkx(byte b) {
        this();
    }

    /* access modifiers changed from: 0000 */
    public static void a(java.lang.Object obj, defpackage.dky dky) {
        ((defpackage.dih) obj).s = dky;
    }
}
