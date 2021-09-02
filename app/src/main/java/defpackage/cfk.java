package defpackage;

/* renamed from: cfk reason: default package */
/* compiled from: PG */
final class cfk implements defpackage.cgi {
    private boolean a;
    private final /* synthetic */ defpackage.cff b;

    cfk(defpackage.cff cff) {
        this.b = cff;
    }

    public final void a() {
    }

    public final void b() {
        this.b.a(0.0f);
        this.b.c();
        this.b.b();
    }

    public final void a(float f) {
        this.b.a(f);
        boolean z = f == 1.0f;
        if (this.a != z) {
            this.a = z;
            this.b.a(z);
        }
    }
}
