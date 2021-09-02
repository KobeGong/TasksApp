package defpackage;

/* renamed from: djs reason: default package */
/* compiled from: PG */
final class djs implements defpackage.dkh {
    private final defpackage.djo a;
    private final defpackage.dkx b;
    private final boolean c;
    private final defpackage.dhy d;

    private djs(defpackage.dkx dkx, defpackage.dhy dhy, defpackage.djo djo) {
        this.b = dkx;
        this.c = djo instanceof defpackage.dij;
        this.d = dhy;
        this.a = djo;
    }

    static defpackage.djs a(defpackage.dkx dkx, defpackage.dhy dhy, defpackage.djo djo) {
        return new defpackage.djs(dkx, dhy, djo);
    }

    public final java.lang.Object a() {
        return this.a.h().c();
    }

    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (!((defpackage.dih) obj).s.equals(((defpackage.dih) obj2).s)) {
            return false;
        }
        if (this.c) {
            return ((defpackage.dij) obj).a.equals(((defpackage.dij) obj2).a);
        }
        return true;
    }

    public final int a(java.lang.Object obj) {
        int hashCode = ((defpackage.dih) obj).s.hashCode();
        if (this.c) {
            return (hashCode * 53) + ((defpackage.dij) obj).a.hashCode();
        }
        return hashCode;
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dkj.a(this.b, obj, obj2);
        if (this.c) {
            defpackage.dkj.a(this.d, obj, obj2);
        }
    }

    public final void a(java.lang.Object obj, defpackage.dlt dlt) {
        java.util.Iterator b2 = ((defpackage.dij) obj).a.b();
        if (b2.hasNext()) {
            ((java.util.Map.Entry) b2.next()).getKey();
            throw new java.lang.NoSuchMethodError();
        }
        defpackage.dky dky = ((defpackage.dih) obj).s;
        if (defpackage.bg.at == defpackage.bg.au) {
            for (int i = dky.b - 1; i >= 0; i--) {
                dlt.a(dky.c[i] >>> 3, dky.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < dky.b; i2++) {
            dlt.a(dky.c[i2] >>> 3, dky.d[i2]);
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r10, byte[] r11, int r12, int r13, defpackage.dgw r14) {
        /*
            r9 = this;
            r7 = 2
            r0 = r10
            dih r0 = (defpackage.dih) r0
            dky r4 = r0.s
            dky r0 = defpackage.dky.a
            if (r4 != r0) goto L_0x0013
            dky r4 = new dky
            r4.<init>()
            dih r10 = (defpackage.dih) r10
            r10.s = r4
        L_0x0013:
            if (r12 >= r13) goto L_0x0073
            int r2 = defpackage.dgv.a(r11, r12, r14)
            int r0 = r14.a
            r1 = 11
            if (r0 == r1) goto L_0x0030
            r1 = r0 & 7
            if (r1 != r7) goto L_0x002b
            r1 = r11
            r3 = r13
            r5 = r14
            int r12 = defpackage.dgv.a(r0, r1, r2, r3, r4, r5)
            goto L_0x0013
        L_0x002b:
            int r12 = defpackage.dgv.a(r0, r11, r2, r13, r14)
            goto L_0x0013
        L_0x0030:
            r1 = 0
            r0 = 0
            r8 = r0
            r0 = r2
            r2 = r1
            r1 = r8
        L_0x0036:
            if (r0 >= r13) goto L_0x0068
            int r0 = defpackage.dgv.a(r11, r0, r14)
            int r3 = r14.a
            int r5 = r3 >>> 3
            r6 = r3 & 7
            switch(r5) {
                case 2: goto L_0x004e;
                case 3: goto L_0x005a;
                default: goto L_0x0045;
            }
        L_0x0045:
            r5 = 12
            if (r3 == r5) goto L_0x0068
            int r0 = defpackage.dgv.a(r3, r11, r0, r13, r14)
            goto L_0x0036
        L_0x004e:
            if (r6 != 0) goto L_0x0045
            int r2 = defpackage.dgv.a(r11, r0, r14)
            int r0 = r14.a
            r8 = r0
            r0 = r2
            r2 = r8
            goto L_0x0036
        L_0x005a:
            if (r6 != r7) goto L_0x0045
            int r1 = defpackage.dgv.e(r11, r0, r14)
            java.lang.Object r0 = r14.c
            dha r0 = (defpackage.dha) r0
            r8 = r0
            r0 = r1
            r1 = r8
            goto L_0x0036
        L_0x0068:
            if (r1 == 0) goto L_0x0071
            int r2 = r2 << 3
            r2 = r2 | 2
            r4.a(r2, r1)
        L_0x0071:
            r12 = r0
            goto L_0x0013
        L_0x0073:
            if (r12 == r13) goto L_0x007a
            dir r0 = defpackage.dir.i()
            throw r0
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djs.a(java.lang.Object, byte[], int, int, dgw):void");
    }

    public final void a(java.lang.Object obj, defpackage.dkc dkc, defpackage.dhw dhw) {
        boolean z;
        defpackage.dkx dkx = this.b;
        java.lang.Object a2 = defpackage.dkx.a(obj);
        defpackage.dhy.a(obj);
        do {
            try {
                if (dkc.a() == Integer.MAX_VALUE) {
                    defpackage.dkx.a(obj, (defpackage.dky) a2);
                    return;
                }
                int b2 = dkc.b();
                if (b2 == 11) {
                    defpackage.dha dha = null;
                    int i = 0;
                    defpackage.dik dik = null;
                    while (dkc.a() != Integer.MAX_VALUE) {
                        int b3 = dkc.b();
                        if (b3 == 16) {
                            i = dkc.o();
                            dik = dhw.a(this.a, i);
                        } else if (b3 == 26) {
                            if (dik != null) {
                                throw new java.lang.NoSuchMethodError();
                            }
                            dha = dkc.n();
                        } else if (!dkc.c()) {
                            break;
                        }
                    }
                    if (dkc.b() != 12) {
                        throw defpackage.dir.e();
                    }
                    if (dha != null) {
                        if (dik != null) {
                            throw new java.lang.NoSuchMethodError();
                        }
                        ((defpackage.dky) a2).a((i << 3) | 2, (java.lang.Object) dha);
                    }
                    z = true;
                    continue;
                } else if ((b2 & 7) != 2) {
                    z = dkc.c();
                    continue;
                } else if (dhw.a(this.a, b2 >>> 3) != null) {
                    throw new java.lang.NoSuchMethodError();
                } else {
                    z = dkx.a(a2, dkc);
                    continue;
                }
            } finally {
                defpackage.dkx.a(obj, (defpackage.dky) a2);
            }
        } while (z);
    }

    public final void c(java.lang.Object obj) {
        defpackage.dkx.b(obj);
        defpackage.dhy.b(obj);
    }

    public final boolean d(java.lang.Object obj) {
        return ((defpackage.dij) obj).a.c();
    }

    public final int b(java.lang.Object obj) {
        defpackage.dky dky = ((defpackage.dih) obj).s;
        int i = dky.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < dky.b; i2++) {
                i += defpackage.dhn.d(dky.c[i2] >>> 3, (defpackage.dha) dky.d[i2]);
            }
            dky.e = i;
        }
        int i3 = i + 0;
        if (!this.c) {
            return i3;
        }
        defpackage.dia dia = ((defpackage.dij) obj).a;
        int i4 = 0;
        for (int i5 = 0; i5 < dia.a.b(); i5++) {
            i4 += defpackage.dia.b(dia.a.b(i5));
        }
        java.util.Iterator it = dia.a.c().iterator();
        while (true) {
            int i6 = i4;
            if (!it.hasNext()) {
                return i3 + i6;
            }
            i4 = defpackage.dia.b((java.util.Map.Entry) it.next()) + i6;
        }
    }
}
