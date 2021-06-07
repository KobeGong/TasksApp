package defpackage;

import java.util.Map;

/* renamed from: ac  reason: default package */
/* compiled from: PG */
public class ac {
    public static final Object b = new Object();
    public final Object a;
    public int c;
    public volatile Object d;
    public volatile Object e;
    public final Runnable f;
    private g g;
    private int h;
    private boolean i;
    private boolean j;

    public ac() {
        this.a = new Object();
        this.g = new g();
        this.c = 0;
        this.d = b;
        this.e = b;
        this.h = -1;
        this.f = new ad(this);
    }

    private final void b(af afVar) {
        if (afVar.b) {
            if (!afVar.a()) {
                afVar.a(false);
            } else if (afVar.c < this.h) {
                afVar.c = this.h;
                afVar.a.a(this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(af afVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        do {
            this.j = false;
            if (afVar == null) {
                k a2 = this.g.a();
                while (a2.hasNext()) {
                    b((af) ((Map.Entry) a2.next()).getValue());
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

    public final void a(y yVar, ag agVar) {
        if (yVar.a().a() != w.DESTROYED) {
            ae aeVar = new ae(this, yVar, agVar);
            af afVar = (af) this.g.a(agVar, aeVar);
            if (afVar != null && !afVar.a(yVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (afVar == null) {
                yVar.a().a(aeVar);
            }
        }
    }

    public void a(ag agVar) {
        a("removeObserver");
        af afVar = (af) this.g.b(agVar);
        if (afVar != null) {
            afVar.b();
            afVar.a(false);
        }
    }

    public final void a(Object obj) {
        a("setValue");
        this.h++;
        this.d = obj;
        a((af) null);
    }

    public void a() {
    }

    public void b() {
    }

    private static void a(String str) {
        if (!a.a().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public ac(byte b2) {
        this();
    }
}
