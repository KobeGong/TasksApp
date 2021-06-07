package defpackage;

/* renamed from: aag  reason: default package */
/* compiled from: PG */
public final class aag implements th {
    private boolean a = false;
    private int b;
    private final /* synthetic */ aaf c;

    protected aag(aaf aaf) {
        this.c = aaf;
    }

    public final aag a(te teVar, int i) {
        this.c.e = teVar;
        this.b = i;
        return this;
    }

    @Override // defpackage.th
    public final void a() {
        aaf.a(this.c);
        this.a = false;
    }

    @Override // defpackage.th
    public final void b() {
        if (!this.a) {
            this.c.e = null;
            aaf.a(this.c, this.b);
        }
    }

    @Override // defpackage.th
    public final void c() {
        this.a = true;
    }
}
