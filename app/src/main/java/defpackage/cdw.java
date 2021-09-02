package defpackage;

/* renamed from: cdw reason: default package */
/* compiled from: PG */
public class cdw implements defpackage.q {
    private static final java.lang.String b = defpackage.cdw.class.getSimpleName();
    public final defpackage.cdl a;
    private final defpackage.bqw c;
    private final defpackage.cql d;
    private final defpackage.bse e;
    private final defpackage.brz f;
    private final defpackage.bsf g = new defpackage.bso(new defpackage.cdx(this));

    public cdw(defpackage.bqw bqw, defpackage.bse bse, defpackage.brz brz, defpackage.cdl cdl) {
        this.c = (defpackage.bqw) defpackage.cky.a(bqw);
        this.d = defpackage.bsh.a(bqw);
        this.e = (defpackage.bse) defpackage.cky.a(bse);
        this.f = (defpackage.brz) defpackage.cky.a(brz);
        this.a = (defpackage.cdl) defpackage.cky.a(cdl);
    }

    public final void a() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void f() {
    }

    public final void b() {
        this.e.a(this.d, this.g);
        this.d.c();
        g();
    }

    public final void e() {
        this.e.b(this.d, this.g);
        this.d.d();
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        defpackage.brz brz = this.f;
        defpackage.bqw bqw = this.c;
        defpackage.bsc bsc = new defpackage.bsc();
        bsc.a = 1;
        brz.a(bqw, bsc).a(new defpackage.cdy(this));
    }

    /* JADX INFO: finally extract failed */
    static java.util.List a(defpackage.bsd bsd) {
        java.lang.String str;
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!bsd.a().b()) {
            java.lang.String str2 = b;
            java.lang.String valueOf = java.lang.String.valueOf(bsd.a());
            android.util.Log.e(str2, new java.lang.StringBuilder(valueOf.length() + 23).append("Failed to load owners: ").append(valueOf).toString());
            return arrayList;
        }
        defpackage.bsk b2 = bsd.b();
        int i2 = 0;
        while (i2 < b2.b()) {
            try {
                defpackage.bsm bsm = (defpackage.bsm) b2.a(i2);
                if (bsm.a()) {
                    java.lang.String str3 = bsm.a != null ? bsm.a.c() : null;
                    if (bsm.a != null) {
                        str = bsm.a.b();
                    } else {
                        str = null;
                    }
                    if (bsm.a != null) {
                        i = bsm.a.d();
                    } else {
                        i = 0;
                    }
                    arrayList.add(new defpackage.cdr(str3, str, i));
                }
                i2++;
            } catch (Throwable th) {
                b2.a();
                throw th;
            }
        }
        b2.a();
        return arrayList;
    }
}
