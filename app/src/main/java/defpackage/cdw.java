package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cdw  reason: default package */
/* compiled from: PG */
public class cdw implements q {
    private static final String b = cdw.class.getSimpleName();
    public final cdl a;
    private final bqw c;
    private final cql d;
    private final bse e;
    private final brz f;
    private final bsf g = new bso(new cdx(this));

    public cdw(bqw bqw, bse bse, brz brz, cdl cdl) {
        this.c = (bqw) cky.a(bqw);
        this.d = bsh.a(bqw);
        this.e = (bse) cky.a(bse);
        this.f = (brz) cky.a(brz);
        this.a = (cdl) cky.a(cdl);
    }

    @Override // defpackage.q
    public final void a() {
    }

    @Override // defpackage.q
    public final void c() {
    }

    @Override // defpackage.q
    public final void d() {
    }

    @Override // defpackage.q
    public final void f() {
    }

    @Override // defpackage.q
    public final void b() {
        this.e.a(this.d, this.g);
        this.d.c();
        g();
    }

    @Override // defpackage.q
    public final void e() {
        this.e.b(this.d, this.g);
        this.d.d();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        brz brz = this.f;
        bqw bqw = this.c;
        bsc bsc = new bsc();
        bsc.a = 1;
        brz.a(bqw, bsc).a(new cdy(this));
    }

    static List a(bsd bsd) {
        ArrayList arrayList = new ArrayList();
        if (!bsd.a().b()) {
            String str = b;
            String valueOf = String.valueOf(bsd.a());
            Log.e(str, new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to load owners: ").append(valueOf).toString());
            return arrayList;
        }
        bsk b2 = bsd.b();
        for (int i = 0; i < b2.b(); i++) {
            try {
                bsm bsm = (bsm) b2.a(i);
                if (bsm.a()) {
                    arrayList.add(new cdr(bsm.a != null ? bsm.a.c() : null, bsm.a != null ? bsm.a.b() : null, bsm.a != null ? bsm.a.d() : 0));
                }
            } finally {
                b2.a();
            }
        }
        return arrayList;
    }
}
