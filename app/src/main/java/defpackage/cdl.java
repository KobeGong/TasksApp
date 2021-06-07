package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cdl  reason: default package */
/* compiled from: PG */
public final class cdl {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();

    public final void a(Object obj) {
        cky.a(obj);
        if (!cky.a(c(), obj)) {
            cky.a(this.c.contains(obj), "Selected account must be an available account");
            if (this.d.contains(obj)) {
                this.d.set(this.d.indexOf(obj), c());
                this.d.set(0, obj);
            } else {
                this.d.add(0, obj);
                if (this.d.size() > 3) {
                    this.d.remove(3);
                }
            }
            h();
        }
    }

    public final int a() {
        return this.c.size();
    }

    public final Object a(int i) {
        cky.a(i, this.c.size());
        return this.c.get(i);
    }

    public final boolean b() {
        return !this.d.isEmpty();
    }

    public final Object c() {
        if (b()) {
            return this.d.get(0);
        }
        return null;
    }

    public final boolean d() {
        return this.d.size() > 1;
    }

    public final Object e() {
        if (d()) {
            return this.d.get(1);
        }
        return null;
    }

    public final boolean f() {
        return this.d.size() > 2;
    }

    public final Object g() {
        if (f()) {
            return this.d.get(2);
        }
        return null;
    }

    public final void a(cdm cdm) {
        this.b.add(cdm);
    }

    public final void b(cdm cdm) {
        this.b.remove(cdm);
    }

    public final void h() {
        Object c2 = c();
        Object e = e();
        Object g = g();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((cdm) it.next()).a(c2, e, g);
        }
    }

    static {
        cdl.class.getSimpleName();
    }
}
