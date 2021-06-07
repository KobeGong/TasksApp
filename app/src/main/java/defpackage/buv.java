package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: buv  reason: default package */
/* compiled from: PG */
public abstract class buv {
    public static buw m() {
        return new buw().a(dfn.q).a(dge.READ_STATE_UNKNOWN).a(dfu.COUNT_BEHAVIOR_UNSPECIFIED).a(dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED).a((Long) 0L).b((Long) 0L).c(0L).b("chime_default_group");
    }

    public abstract String a();

    public abstract dge b();

    public abstract dfu c();

    public abstract dgj d();

    public abstract Long e();

    public abstract Long f();

    public abstract dfn g();

    public abstract List h();

    public abstract dgu i();

    public abstract String j();

    public abstract String k();

    public abstract Long l();

    public static final List a(List list) {
        dih dih;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            buv buv = (buv) it.next();
            dii dii = (dii) dfj.d.a(bg.ao);
            String a = buv.a();
            dii.b();
            dfj dfj = (dfj) dii.a;
            if (a == null) {
                throw new NullPointerException();
            }
            dfj.a |= 1;
            dfj.b = a;
            long longValue = buv.e().longValue();
            dii.b();
            dfj dfj2 = (dfj) dii.a;
            dfj2.a |= 2;
            dfj2.c = longValue;
            if (dii.b) {
                dih = dii.a;
            } else {
                dih dih2 = dii.a;
                djz.a.a(dih2).c(dih2);
                dii.b = true;
                dih = dii.a;
            }
            dih dih3 = dih;
            if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            arrayList.add((dfj) dih3);
        }
        return arrayList;
    }

    public static final buv a(dfy dfy) {
        dgl dgl;
        dgl dgl2;
        dgl dgl3;
        dfn dfn;
        dgu dgu;
        dfn dfn2;
        dfn dfn3;
        cld.a(dfy);
        buw a = m().a(dfy.d);
        if (dfy.f == null) {
            dgl = dgl.f;
        } else {
            dgl = dfy.f;
        }
        dge a2 = dge.a(dgl.b);
        if (a2 == null) {
            a2 = dge.READ_STATE_UNKNOWN;
        }
        buw a3 = a.a(a2);
        if (dfy.f == null) {
            dgl2 = dgl.f;
        } else {
            dgl2 = dfy.f;
        }
        dfu a4 = dfu.a(dgl2.d);
        if (a4 == null) {
            a4 = dfu.COUNT_BEHAVIOR_UNSPECIFIED;
        }
        buw a5 = a3.a(a4);
        if (dfy.f == null) {
            dgl3 = dgl.f;
        } else {
            dgl3 = dfy.f;
        }
        dgj a6 = dgj.a(dgl3.e);
        if (a6 == null) {
            a6 = dgj.SYSTEM_TRAY_BEHAVIOR_UNSPECIFIED;
        }
        buw b = a5.a(a6).a(Long.valueOf(dfy.h)).b(Long.valueOf(dfy.i));
        if (dfy.b == 12) {
            dfn = (dfn) dfy.c;
        } else {
            dfn = dfn.q;
        }
        buw a7 = b.a(dfn);
        a7.a = dfy.g;
        if (dfy.j == null) {
            dgu = dgu.b;
        } else {
            dgu = dfy.j;
        }
        a7.b = dgu;
        a7.c = dfy.k;
        buw c = a7.c(Long.valueOf(dfy.l));
        if (dfy.b == 12) {
            dfn2 = (dfn) dfy.c;
        } else {
            dfn2 = dfn.q;
        }
        if (!TextUtils.isEmpty(dfn2.m)) {
            if (dfy.b == 12) {
                dfn3 = (dfn) dfy.c;
            } else {
                dfn3 = dfn.q;
            }
            c.b(dfn3.m);
        }
        return c.a();
    }

    buv() {
    }
}
