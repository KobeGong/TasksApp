package defpackage;

/* renamed from: bvs reason: default package */
/* compiled from: PG */
public final class bvs {
    private final defpackage.bup a;
    private final defpackage.buu b;
    private final defpackage.cda c;

    bvs(defpackage.bup bup, defpackage.buu buu, defpackage.cda cda) {
        this.a = bup;
        this.b = buu;
        this.c = cda;
    }

    public final synchronized void a(defpackage.bul bul) {
        java.lang.String b2 = bul.b();
        defpackage.bty.a("AccountCleanupUtil", "Account deleted: %s", b2);
        this.c.a.a(bul);
        this.b.a(b2);
        this.a.b(b2);
    }
}
