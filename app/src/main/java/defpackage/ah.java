package defpackage;

/* renamed from: ah reason: default package */
/* compiled from: PG */
final class ah implements defpackage.t {
    private final java.lang.Object a;
    private final defpackage.cr b = defpackage.n.a.b(this.a.getClass());

    ah(java.lang.Object obj) {
        this.a = obj;
    }

    public final void a(LifecycleOwner yVar, defpackage.v vVar) {
        defpackage.cr crVar = this.b;
        java.lang.Object obj = this.a;
        defpackage.cr.a((java.util.List) crVar.a.get(vVar), yVar, vVar, obj);
        defpackage.cr.a((java.util.List) crVar.a.get(defpackage.v.ON_ANY), yVar, vVar, obj);
    }
}
