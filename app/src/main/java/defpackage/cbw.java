package defpackage;

/* renamed from: cbw reason: default package */
/* compiled from: PG */
public final class cbw {
    public defpackage.ccz a;
    public defpackage.bup b;

    public final void a() {
        defpackage.cky.c();
        for (defpackage.bul bul : this.b.a()) {
            defpackage.btk f = bul.f();
            if (f == defpackage.btk.REGISTERED || f == defpackage.btk.PENDING_REGISTRATION || f == defpackage.btk.FAILED_REGISTRATION) {
                this.a.a(bul.b());
            }
        }
    }
}
