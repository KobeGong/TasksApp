package defpackage;

/* renamed from: r  reason: default package */
/* compiled from: PG */
final class r implements t {
    private final q a;

    r(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.t
    public final void a(y yVar, v vVar) {
        switch (vVar.ordinal()) {
            case 0:
                this.a.a();
                return;
            case 1:
                this.a.b();
                return;
            case 2:
                this.a.c();
                return;
            case 3:
                this.a.d();
                return;
            case 4:
                this.a.e();
                return;
            case 5:
                this.a.f();
                return;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
