package defpackage;

/* renamed from: r reason: default package */
/* compiled from: PG */
final class r implements defpackage.t {
    private final defpackage.q a;

    r(defpackage.q qVar) {
        this.a = qVar;
    }

    public final void a(LifecycleOwner yVar, defpackage.v vVar) {
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
                throw new java.lang.IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
