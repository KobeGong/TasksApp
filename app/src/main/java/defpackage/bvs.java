package defpackage;

/* renamed from: bvs  reason: default package */
/* compiled from: PG */
public final class bvs {
    private final bup a;
    private final buu b;
    private final cda c;

    bvs(bup bup, buu buu, cda cda) {
        this.a = bup;
        this.b = buu;
        this.c = cda;
    }

    public final synchronized void a(bul bul) {
        String b2 = bul.b();
        bty.a("AccountCleanupUtil", "Account deleted: %s", b2);
        this.c.a.a(bul);
        this.b.a(b2);
        this.a.b(b2);
    }
}
