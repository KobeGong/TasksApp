package defpackage;

/* renamed from: pv reason: default package */
/* compiled from: PG */
final class pv implements defpackage.qg {
    private final /* synthetic */ defpackage.op a;
    private final /* synthetic */ android.os.Handler b;

    pv(defpackage.op opVar, android.os.Handler handler) {
        this.a = opVar;
        this.b = handler;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        defpackage.qa qaVar = (defpackage.qa) obj;
        if (qaVar == null) {
            this.a.a(1, this.b);
        } else if (qaVar.b == 0) {
            this.a.a(qaVar.a, this.b);
        } else {
            this.a.a(qaVar.b, this.b);
        }
    }
}
