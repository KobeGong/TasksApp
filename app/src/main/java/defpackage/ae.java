package defpackage;

/* renamed from: ae reason: default package */
/* compiled from: PG */
final class ae extends defpackage.af implements defpackage.t {
    private final LifecycleOwner d;
    private final /* synthetic */ defpackage.ac e;

    ae(defpackage.ac acVar, LifecycleOwner yVar, defpackage.ag agVar) {
        this.e = acVar;
        super(acVar, agVar);
        this.d = yVar;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        return this.d.getLifecycle().getCurrentState().a(State.STARTED);
    }

    public final void a(LifecycleOwner yVar, defpackage.v vVar) {
        if (this.d.getLifecycle().getCurrentState() == State.DESTROYED) {
            this.e.a(this.a);
        } else {
            a(a());
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(LifecycleOwner yVar) {
        return this.d == yVar;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.d.getLifecycle().removeObserver(this);
    }
}
