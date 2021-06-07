package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dsv  reason: default package */
/* compiled from: PG */
public final class dsv extends dtk {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ dor b;
    private final /* synthetic */ dss c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dsv(dss dss, dpw dpw, dor dor) {
        super(dss.c.d);
        this.c = dss;
        this.a = dpw;
        this.b = dor;
    }

    @Override // defpackage.dtk
    public final void a() {
        if (!this.c.b) {
            this.c.a(this.a, this.b);
        }
    }
}
