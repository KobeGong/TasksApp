package defpackage;

/* renamed from: dni  reason: default package */
/* compiled from: PG */
final class dni extends dpm {
    public final /* synthetic */ dpb a;
    public final /* synthetic */ dnh b;
    private final /* synthetic */ dnd c;

    dni(dnh dnh, dnd dnd, dpb dpb) {
        this.b = dnh;
        this.c = dnd;
        this.a = dpb;
    }

    @Override // defpackage.dnd
    public final void a(dne dne, dor dor) {
        this.c.a(new dnj(this, dne), dor);
    }

    @Override // defpackage.dnd
    public final void a(Object obj) {
        this.c.a(this.b.a.a(this.a.c.a(obj)));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dpm
    public final dnd b() {
        return this.c;
    }
}
