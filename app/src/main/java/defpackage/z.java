package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: z  reason: default package */
/* compiled from: PG */
public final class z extends u {
    private f a = new f();
    private w b;
    private final WeakReference c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList g = new ArrayList();

    public z(y yVar) {
        this.c = new WeakReference(yVar);
        this.b = w.INITIALIZED;
    }

    public final void a(v vVar) {
        a(b(vVar));
    }

    public final void a(w wVar) {
        if (this.b != wVar) {
            this.b = wVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            c();
            this.e = false;
        }
    }

    private final w c(x xVar) {
        j jVar;
        w wVar;
        w wVar2;
        f fVar = this.a;
        if (fVar.c(xVar)) {
            jVar = ((j) fVar.a.get(xVar)).d;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            wVar = ((et) jVar.getValue()).a;
        } else {
            wVar = null;
        }
        if (!this.g.isEmpty()) {
            wVar2 = (w) this.g.get(this.g.size() - 1);
        } else {
            wVar2 = null;
        }
        return a(a(this.b, wVar), wVar2);
    }

    @Override // defpackage.u
    public final void a(x xVar) {
        y yVar;
        et etVar = new et(xVar, this.b == w.DESTROYED ? w.DESTROYED : w.INITIALIZED);
        if (((et) this.a.a(xVar, etVar)) == null && (yVar = (y) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            w c2 = c(xVar);
            this.d++;
            while (etVar.a.compareTo((Enum) c2) < 0 && this.a.c(xVar)) {
                b(etVar.a);
                etVar.a(yVar, c(etVar.a));
                b();
                c2 = c(xVar);
            }
            if (!z) {
                c();
            }
            this.d--;
        }
    }

    private final void b() {
        this.g.remove(this.g.size() - 1);
    }

    private final void b(w wVar) {
        this.g.add(wVar);
    }

    @Override // defpackage.u
    public final void b(x xVar) {
        this.a.b(xVar);
    }

    @Override // defpackage.u
    public final w a() {
        return this.b;
    }

    public static w b(v vVar) {
        switch (vVar.ordinal()) {
            case 0:
            case 4:
                return w.CREATED;
            case 1:
            case 3:
                return w.STARTED;
            case 2:
                return w.RESUMED;
            case 5:
                return w.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + vVar);
        }
    }

    private static v c(w wVar) {
        switch (wVar.ordinal()) {
            case 0:
            case 1:
                return v.ON_CREATE;
            case 2:
                return v.ON_START;
            case 3:
                return v.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + wVar);
        }
    }

    private final void c() {
        boolean z;
        v vVar;
        y yVar = (y) this.c.get();
        if (yVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            if (this.a.e == 0) {
                z = true;
            } else {
                w wVar = ((et) this.a.b.getValue()).a;
                w wVar2 = ((et) this.a.c.getValue()).a;
                z = wVar == wVar2 && this.b == wVar2;
            }
            if (!z) {
                this.f = false;
                if (this.b.compareTo((Enum) ((et) this.a.b.getValue()).a) < 0) {
                    f fVar = this.a;
                    i iVar = new i(fVar.c, fVar.b);
                    fVar.d.put(iVar, false);
                    while (iVar.hasNext() && !this.f) {
                        Map.Entry entry = (Map.Entry) iVar.next();
                        et etVar = (et) entry.getValue();
                        while (etVar.a.compareTo((Enum) this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                            w wVar3 = etVar.a;
                            switch (wVar3.ordinal()) {
                                case 0:
                                    throw new IllegalArgumentException();
                                case 1:
                                    throw new IllegalArgumentException();
                                case 2:
                                    vVar = v.ON_DESTROY;
                                    break;
                                case 3:
                                    vVar = v.ON_STOP;
                                    break;
                                case 4:
                                    vVar = v.ON_PAUSE;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Unexpected state value " + wVar3);
                            }
                            b(b(vVar));
                            etVar.a(yVar, vVar);
                            b();
                        }
                    }
                }
                j jVar = this.a.c;
                if (!this.f && jVar != null && this.b.compareTo((Enum) ((et) jVar.getValue()).a) > 0) {
                    k a2 = this.a.a();
                    while (a2.hasNext() && !this.f) {
                        Map.Entry entry2 = (Map.Entry) a2.next();
                        et etVar2 = (et) entry2.getValue();
                        while (etVar2.a.compareTo((Enum) this.b) < 0 && !this.f && this.a.c(entry2.getKey())) {
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

    public static w a(w wVar, w wVar2) {
        return (wVar2 == null || wVar2.compareTo(wVar) >= 0) ? wVar : wVar2;
    }
}
