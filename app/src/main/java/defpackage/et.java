package defpackage;

/* renamed from: et reason: default package */
/* compiled from: PG */
public final class et {
    public State a;
    private defpackage.t b;

    public et(LifecycleObserver xVar, State wVar) {
        this.b = defpackage.ab.a((java.lang.Object) xVar);
        this.a = wVar;
    }

    public final void a(LifecycleOwner yVar, defpackage.v vVar) {
        State b2 = defpackage.z.b(vVar);
        this.a = defpackage.z.a(this.a, b2);
        this.b.a(yVar, vVar);
        this.a = b2;
    }
}
