package defpackage;

/* renamed from: p reason: default package */
/* compiled from: PG */
public final class p implements defpackage.t {
    private final defpackage.s[] a;

    p(defpackage.s[] sVarArr) {
        this.a = sVarArr;
    }

    public final void a(LifecycleOwner yVar, defpackage.v vVar) {
        new defpackage.ga();
        for (defpackage.s a2 : this.a) {
            a2.a();
        }
        for (defpackage.s a3 : this.a) {
            a3.a();
        }
    }
}
