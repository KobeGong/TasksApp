package defpackage;

/* renamed from: z reason: default package */
/* compiled from: PG */
public final class z extends Lifecycle {
    private final defpackage.f a = new defpackage.f();
    private State b;
    private final java.lang.ref.WeakReference c;
    private int mAddingObserverCounter = 0;
    private boolean e = false;
    private boolean f = false;
    private final java.util.ArrayList g = new java.util.ArrayList();

    public z(LifecycleOwner yVar) {
        this.c = new java.lang.ref.WeakReference(yVar);
        this.b = State.INITIALIZED;
    }

    public final void a(defpackage.v vVar) {
        a(b(vVar));
    }

    public final void a(State wVar) {
        if (this.b != wVar) {
            this.b = wVar;
            if (this.e || this.mAddingObserverCounter != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            c();
            this.e = false;
        }
    }

    private final State c(LifecycleObserver xVar) {
        defpackage.j jVar;
        State wVar;
        State wVar2;
        defpackage.f fVar = this.a;
        if (fVar.c(xVar)) {
            jVar = ((defpackage.j) fVar.a.get(xVar)).d;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            wVar = ((defpackage.et) jVar.getValue()).a;
        } else {
            wVar = null;
        }
        if (!this.g.isEmpty()) {
            wVar2 = (State) this.g.get(this.g.size() - 1);
        } else {
            wVar2 = null;
        }
        return a(a(this.b, wVar), wVar2);
    }

    public final void addObserver(LifecycleObserver observer) {
        defpackage.et etVar = new defpackage.et(observer, this.b == State.DESTROYED ? State.DESTROYED : State.INITIALIZED);
        if (this.a.a(observer, etVar) == null) {
            LifecycleOwner yVar = (LifecycleOwner) this.c.get();
            if (yVar != null) {
                boolean z = this.mAddingObserverCounter != 0 || this.e;
                State c2 = c(observer);
                this.mAddingObserverCounter++;
                while (etVar.a.compareTo(c2) < 0 && this.a.c(observer)) {
                    b(etVar.a);
                    etVar.a(yVar, c(etVar.a));
                    b();
                    c2 = c(observer);
                }
                if (!z) {
                    c();
                }
                this.mAddingObserverCounter--;
            }
        }
    }

    private final void b() {
        this.g.remove(this.g.size() - 1);
    }

    private final void b(State wVar) {
        this.g.add(wVar);
    }

    public final void removeObserver(LifecycleObserver xVar) {
        this.a.b(xVar);
    }

    public final State getCurrentState() {
        return this.b;
    }

    public static State b(defpackage.v vVar) {
        switch (vVar.ordinal()) {
            case 0:
            case 4:
                return State.CREATED;
            case 1:
            case 3:
                return State.STARTED;
            case 2:
                return State.RESUMED;
            case 5:
                return State.DESTROYED;
            default:
                throw new java.lang.IllegalArgumentException("Unexpected event value " + vVar);
        }
    }

    private static defpackage.v c(State wVar) {
        switch (wVar.ordinal()) {
            case 0:
            case 1:
                return defpackage.v.ON_CREATE;
            case 2:
                return defpackage.v.ON_START;
            case 3:
                return defpackage.v.ON_RESUME;
            case 4:
                throw new java.lang.IllegalArgumentException();
            default:
                throw new java.lang.IllegalArgumentException("Unexpected state value " + wVar);
        }
    }

    private final void c() {
        boolean z;
        defpackage.v vVar;
        LifecycleOwner yVar = (LifecycleOwner) this.c.get();
        if (yVar == null) {
            android.util.Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            if (this.a.e == 0) {
                z = true;
            } else {
                State wVar = ((defpackage.et) this.a.b.getValue()).a;
                State wVar2 = ((defpackage.et) this.a.c.getValue()).a;
                z = wVar == wVar2 && this.b == wVar2;
            }
            if (!z) {
                this.f = false;
                if (this.b.compareTo(((defpackage.et) this.a.b.getValue()).a) < 0) {
                    defpackage.f fVar = this.a;
                    defpackage.i iVar = new defpackage.i(fVar.c, fVar.b);
                    fVar.d.put(iVar, java.lang.Boolean.valueOf(false));
                    while (iVar.hasNext() && !this.f) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) iVar.next();
                        defpackage.et etVar = (defpackage.et) entry.getValue();
                        while (etVar.a.compareTo(this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                            State wVar3 = etVar.a;
                            switch (wVar3.ordinal()) {
                                case 0:
                                    throw new java.lang.IllegalArgumentException();
                                case 1:
                                    throw new java.lang.IllegalArgumentException();
                                case 2:
                                    vVar = defpackage.v.ON_DESTROY;
                                    break;
                                case 3:
                                    vVar = defpackage.v.ON_STOP;
                                    break;
                                case 4:
                                    vVar = defpackage.v.ON_PAUSE;
                                    break;
                                default:
                                    throw new java.lang.IllegalArgumentException("Unexpected state value " + wVar3);
                            }
                            b(b(vVar));
                            etVar.a(yVar, vVar);
                            b();
                        }
                    }
                }
                defpackage.j jVar = this.a.c;
                if (!this.f && jVar != null && this.b.compareTo(((defpackage.et) jVar.getValue()).a) > 0) {
                    defpackage.k a2 = this.a.a();
                    while (a2.hasNext() && !this.f) {
                        java.util.Map.Entry entry2 = (java.util.Map.Entry) a2.next();
                        defpackage.et etVar2 = (defpackage.et) entry2.getValue();
                        while (etVar2.a.compareTo(this.b) < 0 && !this.f && this.a.c(entry2.getKey())) {
                            b(etVar2.a);
                            etVar2.a(yVar, c(etVar2.a));
                            b();
                        }
                    }
                }
            } else {
                this.f = false;
                return;
            }
        }
    }

    public static State a(State wVar, State wVar2) {
        return (wVar2 == null || wVar2.compareTo(wVar) >= 0) ? wVar : wVar2;
    }
}
