package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cfk  reason: default package */
/* compiled from: PG */
public final class cfk implements cgi {
    private boolean a;
    private final /* synthetic */ cff b;

    cfk(cff cff) {
        this.b = cff;
    }

    @Override // defpackage.cgi
    public final void a() {
    }

    @Override // defpackage.cgi
    public final void b() {
        this.b.a(0.0f);
        this.b.c();
        this.b.b();
    }

    @Override // defpackage.cgi
    public final void a(float f) {
        this.b.a(f);
        boolean z = f == 1.0f;
        if (this.a != z) {
            this.a = z;
            this.b.a(z);
        }
    }
}
