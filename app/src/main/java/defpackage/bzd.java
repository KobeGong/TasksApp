package defpackage;

/* renamed from: bzd reason: default package */
/* compiled from: PG */
public final class bzd {
    public static defpackage.dgm a(int i) {
        defpackage.dih dih;
        defpackage.dii dii = (defpackage.dii) defpackage.dgm.f.a(defpackage.bg.ao);
        if ((i & 1) > 0) {
            defpackage.dge dge = defpackage.dge.READ;
            dii.b();
            defpackage.dgm dgm = (defpackage.dgm) dii.a;
            if (dge == null) {
                throw new java.lang.NullPointerException();
            }
            dgm.a |= 1;
            dgm.b = dge.d;
        }
        if ((i & 2) > 0) {
            defpackage.dfw dfw = defpackage.dfw.DELETED;
            dii.b();
            defpackage.dgm dgm2 = (defpackage.dgm) dii.a;
            if (dfw == null) {
                throw new java.lang.NullPointerException();
            }
            dgm2.a |= 2;
            dgm2.c = dfw.d;
        }
        if ((i & 4) > 0) {
            defpackage.dfu dfu = defpackage.dfu.EXCLUDE_FROM_COUNTS;
            dii.b();
            defpackage.dgm dgm3 = (defpackage.dgm) dii.a;
            if (dfu == null) {
                throw new java.lang.NullPointerException();
            }
            dgm3.a |= 4;
            dgm3.d = dfu.d;
        }
        if ((i & 8) > 0) {
            defpackage.dgj dgj = defpackage.dgj.REMOVE_FROM_SYSTEM_TRAY;
            dii.b();
            defpackage.dgm dgm4 = (defpackage.dgm) dii.a;
            if (dgj == null) {
                throw new java.lang.NullPointerException();
            }
            dgm4.a |= 8;
            dgm4.e = dgj.d;
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dgm) dih3;
        }
        throw new defpackage.dkw();
    }

    public static int a(defpackage.dgm dgm) {
        int i;
        defpackage.dge a = defpackage.dge.a(dgm.b);
        if (a == null) {
            a = defpackage.dge.READ_STATE_UNKNOWN;
        }
        if (a == defpackage.dge.READ) {
            i = 1;
        } else {
            i = 0;
        }
        defpackage.dfw a2 = defpackage.dfw.a(dgm.c);
        if (a2 == null) {
            a2 = defpackage.dfw.DELETION_STATUS_UNKNOWN;
        }
        if (a2 == defpackage.dfw.DELETED) {
            i |= 2;
        }
        defpackage.dfu a3 = defpackage.dfu.a(dgm.d);
        if (a3 == null) {
            a3 = defpackage.dfu.COUNT_BEHAVIOR_UNSPECIFIED;
        }
        if (a3 == defpackage.dfu.EXCLUDE_FROM_COUNTS) {
            i |= 4;
        }
        defpackage.dgj a4 = defpackage.dgj.a(dgm.e);
        if (a4 == null) {
            a4 = defpackage.dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED;
        }
        if (a4 == defpackage.dgj.REMOVE_FROM_SYSTEM_TRAY) {
            return i | 8;
        }
        return i;
    }
}
