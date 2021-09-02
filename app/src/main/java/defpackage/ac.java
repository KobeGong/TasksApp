package defpackage;

/* renamed from: ac reason: default package */
/* compiled from: PG */
public class ac {
    public static final java.lang.Object b = new java.lang.Object();
    public final java.lang.Object a;
    public int c;
    public volatile java.lang.Object d;
    public volatile java.lang.Object e;
    public final java.lang.Runnable f;
    private defpackage.g g;
    private int h;
    private boolean i;
    private boolean j;

    public ac() {
        this.a = new java.lang.Object();
        this.g = new defpackage.g();
        this.c = 0;
        this.d = b;
        this.e = b;
        this.h = -1;
        this.f = new defpackage.ad(this);
    }

    private final void b(defpackage.af afVar) {
        if (afVar.b) {
            if (!afVar.a()) {
                afVar.a(false);
            } else if (afVar.c < this.h) {
                afVar.c = this.h;
                afVar.a.a(this.d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.af afVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        do {
            this.j = false;
            if (afVar == null) {
                defpackage.k a2 = this.g.a();
                while (a2.hasNext()) {
                    b((defpackage.af) ((java.util.Map.Entry) a2.next()).getValue());
                    if (this.j) {
                        break;
                    }
                }
            } else {
                b(afVar);
                afVar = null;
            }
        } while (this.j);
        this.i = false;
    }

    public final void a(LifecycleOwner yVar, defpackage.ag agVar) {
        if (yVar.getLifecycle().getCurrentState() != State.DESTROYED) {
            defpackage.ae aeVar = new defpackage.ae(this, yVar, agVar);
            defpackage.af afVar = (defpackage.af) this.g.a(agVar, aeVar);
            if (afVar != null && !afVar.a(yVar)) {
                throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (afVar == null) {
                yVar.getLifecycle().addObserver(aeVar);
            }
        }
    }

    public void a(defpackage.ag agVar) {
        a("removeObserver");
        defpackage.af afVar = (defpackage.af) this.g.b(agVar);
        if (afVar != null) {
            afVar.b();
            afVar.a(false);
        }
    }

    public final void a(java.lang.Object obj) {
        a("setValue");
        this.h++;
        this.d = obj;
        a((defpackage.af) null);
    }

    public void a() {
    }

    public void b() {
    }

    private static void a(java.lang.String str) {
        if (!defpackage.a.a().b()) {
            throw new java.lang.IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public ac(byte b2) {
        this();
    }
}
