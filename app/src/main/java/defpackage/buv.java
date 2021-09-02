package defpackage;

/* renamed from: buv reason: default package */
/* compiled from: PG */
public abstract class buv {
    public static defpackage.buw m() {
        return new defpackage.buw().a(defpackage.dfn.q).a(defpackage.dge.READ_STATE_UNKNOWN).a(defpackage.dfu.COUNT_BEHAVIOR_UNSPECIFIED).a(defpackage.dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED).a(java.lang.Long.valueOf(0)).b(java.lang.Long.valueOf(0)).c(java.lang.Long.valueOf(0)).b("chime_default_group");
    }

    public abstract java.lang.String a();

    public abstract defpackage.dge b();

    public abstract defpackage.dfu c();

    public abstract defpackage.dgj d();

    public abstract java.lang.Long e();

    public abstract java.lang.Long f();

    public abstract defpackage.dfn g();

    public abstract java.util.List h();

    public abstract defpackage.dgu i();

    public abstract java.lang.String j();

    public abstract java.lang.String k();

    public abstract java.lang.Long l();

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<buv>, for r8v0, types: [java.util.List, java.util.List<buv>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List a(java.util.List<defpackage.buv> r8) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r8.iterator()
        L_0x0009:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r4.next()
            buv r0 = (defpackage.buv) r0
            dfj r1 = defpackage.dfj.d
            int r2 = defpackage.bg.ao
            java.lang.Object r1 = r1.a(r2)
            dii r1 = (defpackage.dii) r1
            java.lang.String r5 = r0.a()
            r1.b()
            dih r2 = r1.a
            dfj r2 = (defpackage.dfj) r2
            if (r5 != 0) goto L_0x0032
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x0032:
            int r6 = r2.a
            r6 = r6 | 1
            r2.a = r6
            r2.b = r5
            java.lang.Long r0 = r0.e()
            long r6 = r0.longValue()
            r1.b()
            dih r0 = r1.a
            dfj r0 = (defpackage.dfj) r0
            int r2 = r0.a
            r2 = r2 | 2
            r0.a = r2
            r0.c = r6
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x006b
            dih r0 = r1.a
        L_0x0057:
            dih r0 = (defpackage.dih) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = r1.booleanValue()
            boolean r1 = defpackage.dih.a(r0, r1)
            if (r1 != 0) goto L_0x007c
            dkw r0 = new dkw
            r0.<init>()
            throw r0
        L_0x006b:
            dih r0 = r1.a
            djz r2 = defpackage.djz.a
            dkh r2 = r2.a(r0)
            r2.c(r0)
            r0 = 1
            r1.b = r0
            dih r0 = r1.a
            goto L_0x0057
        L_0x007c:
            dih r0 = (defpackage.dih) r0
            dfj r0 = (defpackage.dfj) r0
            r3.add(r0)
            goto L_0x0009
        L_0x0084:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buv.a(java.util.List):java.util.List");
    }

    public static final defpackage.buv a(defpackage.dfy dfy) {
        defpackage.dgl dgl;
        defpackage.dgl dgl2;
        defpackage.dgl dgl3;
        defpackage.dfn dfn;
        defpackage.dgu dgu;
        defpackage.dfn dfn2;
        defpackage.dfn dfn3;
        defpackage.cld.a((java.lang.Object) dfy);
        defpackage.buw a = m().a(dfy.d);
        if (dfy.f == null) {
            dgl = defpackage.dgl.f;
        } else {
            dgl = dfy.f;
        }
        defpackage.dge a2 = defpackage.dge.a(dgl.b);
        if (a2 == null) {
            a2 = defpackage.dge.READ_STATE_UNKNOWN;
        }
        defpackage.buw a3 = a.a(a2);
        if (dfy.f == null) {
            dgl2 = defpackage.dgl.f;
        } else {
            dgl2 = dfy.f;
        }
        defpackage.dfu a4 = defpackage.dfu.a(dgl2.d);
        if (a4 == null) {
            a4 = defpackage.dfu.COUNT_BEHAVIOR_UNSPECIFIED;
        }
        defpackage.buw a5 = a3.a(a4);
        if (dfy.f == null) {
            dgl3 = defpackage.dgl.f;
        } else {
            dgl3 = dfy.f;
        }
        defpackage.dgj a6 = defpackage.dgj.a(dgl3.e);
        if (a6 == null) {
            a6 = defpackage.dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED;
        }
        defpackage.buw b = a5.a(a6).a(java.lang.Long.valueOf(dfy.h)).b(java.lang.Long.valueOf(dfy.i));
        if (dfy.b == 12) {
            dfn = (defpackage.dfn) dfy.c;
        } else {
            dfn = defpackage.dfn.q;
        }
        defpackage.buw a7 = b.a(dfn);
        a7.a = dfy.g;
        if (dfy.j == null) {
            dgu = defpackage.dgu.b;
        } else {
            dgu = dfy.j;
        }
        a7.b = dgu;
        a7.c = dfy.k;
        defpackage.buw c = a7.c(java.lang.Long.valueOf(dfy.l));
        if (dfy.b == 12) {
            dfn2 = (defpackage.dfn) dfy.c;
        } else {
            dfn2 = defpackage.dfn.q;
        }
        if (!android.text.TextUtils.isEmpty(dfn2.m)) {
            if (dfy.b == 12) {
                dfn3 = (defpackage.dfn) dfy.c;
            } else {
                dfn3 = defpackage.dfn.q;
            }
            c.b(dfn3.m);
        }
        return c.a();
    }

    buv() {
    }
}
