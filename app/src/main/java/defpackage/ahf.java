package defpackage;

/* renamed from: ahf  reason: default package */
/* compiled from: PG */
final class ahf extends ti {
    private boolean a = false;
    private final /* synthetic */ int b;
    private final /* synthetic */ acr c;

    ahf(acr acr, int i) {
        this.c = acr;
        this.b = i;
    }

    @Override // defpackage.th, defpackage.ti
    public final void a() {
        this.c.a.setVisibility(0);
    }

    @Override // defpackage.th, defpackage.ti
    public final void b() {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    @Override // defpackage.th, defpackage.ti
    public final void c() {
        this.a = true;
    }
}
