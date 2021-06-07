package defpackage;

/* renamed from: cbw  reason: default package */
/* compiled from: PG */
public final class cbw {
    public ccz a;
    public bup b;

    public final void a() {
        cky.c();
        for (bul bul : this.b.a()) {
            btk f = bul.f();
            if (f == btk.REGISTERED || f == btk.PENDING_REGISTRATION || f == btk.FAILED_REGISTRATION) {
                this.a.a(bul.b());
            }
        }
    }
}
