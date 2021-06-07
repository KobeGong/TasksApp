package defpackage;

/* renamed from: bzd  reason: default package */
/* compiled from: PG */
public final class bzd {
    public static dgm a(int i) {
        dih dih;
        dii dii = (dii) dgm.f.a(bg.ao);
        if ((i & 1) > 0) {
            dge dge = dge.READ;
            dii.b();
            dgm dgm = (dgm) dii.a;
            if (dge == null) {
                throw new NullPointerException();
            }
            dgm.a |= 1;
            dgm.b = dge.d;
        }
        if ((i & 2) > 0) {
            dfw dfw = dfw.DELETED;
            dii.b();
            dgm dgm2 = (dgm) dii.a;
            if (dfw == null) {
                throw new NullPointerException();
            }
            dgm2.a |= 2;
            dgm2.c = dfw.d;
        }
        if ((i & 4) > 0) {
            dfu dfu = dfu.EXCLUDE_FROM_COUNTS;
            dii.b();
            dgm dgm3 = (dgm) dii.a;
            if (dfu == null) {
                throw new NullPointerException();
            }
            dgm3.a |= 4;
            dgm3.d = dfu.d;
        }
        if ((i & 8) > 0) {
            dgj dgj = dgj.REMOVE_FROM_SYSTEM_TRAY;
            dii.b();
            dgm dgm4 = (dgm) dii.a;
            if (dgj == null) {
                throw new NullPointerException();
            }
            dgm4.a |= 8;
            dgm4.e = dgj.d;
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (dgm) dih3;
        }
        throw new dkw();
    }

    public static int a(dgm dgm) {
        int i;
        dge a = dge.a(dgm.b);
        if (a == null) {
            a = dge.READ_STATE_UNKNOWN;
        }
        if (a == dge.READ) {
            i = 1;
        } else {
            i = 0;
        }
        dfw a2 = dfw.a(dgm.c);
        if (a2 == null) {
            a2 = dfw.DELETION_STATUS_UNKNOWN;
        }
        if (a2 == dfw.DELETED) {
            i |= 2;
        }
        dfu a3 = dfu.a(dgm.d);
        if (a3 == null) {
            a3 = dfu.COUNT_BEHAVIOR_UNSPECIFIED;
        }
        if (a3 == dfu.EXCLUDE_FROM_COUNTS) {
            i |= 4;
        }
        dgj a4 = dgj.a(dgm.e);
        if (a4 == null) {
            a4 = dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED;
        }
        if (a4 == dgj.REMOVE_FROM_SYSTEM_TRAY) {
            return i | 8;
        }
        return i;
    }
}
