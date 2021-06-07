package defpackage;

/* renamed from: ae  reason: default package */
/* compiled from: PG */
final class ae extends af implements t {
    private final y d;
    private final /* synthetic */ ac e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ae(ac acVar, y yVar, ag agVar) {
        super(acVar, agVar);
        this.e = acVar;
        this.d = yVar;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.af
    public final boolean a() {
        return this.d.a().a().a(w.STARTED);
    }

    @Override // defpackage.t
    public final void a(y yVar, v vVar) {
        if (this.d.a().a() == w.DESTROYED) {
            this.e.a(this.a);
        } else {
            a(a());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.af
    public final boolean a(y yVar) {
        return this.d == yVar;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.af
    public final void b() {
        this.d.a().b(this);
    }
}
