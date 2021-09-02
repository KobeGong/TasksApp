package defpackage;

/* renamed from: ahf reason: default package */
/* compiled from: PG */
final class ahf extends defpackage.ti {
    private boolean a = false;
    private final /* synthetic */ int b;
    private final /* synthetic */ defpackage.acr c;

    ahf(defpackage.acr acr, int i) {
        this.c = acr;
        this.b = i;
    }

    public final void a() {
        this.c.a.setVisibility(0);
    }

    public final void b() {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    public final void c() {
        this.a = true;
    }
}
