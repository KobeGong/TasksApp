package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cdl reason: default package */
/* compiled from: PG */
public final class cdl {
    public boolean a;
    public final CopyOnWriteArrayList<defpackage.cdm> b = new java.util.concurrent.CopyOnWriteArrayList<>();
    public final java.util.List<DeviceOwner> availableAccounts = new java.util.ArrayList<>();
    public final java.util.List d = new java.util.ArrayList();

    public final void a(java.lang.Object obj) {
        defpackage.cky.a(obj);
        if (!defpackage.cky.a(c(), obj)) {
            defpackage.cky.a(this.availableAccounts.contains(obj), "Selected account must be an available account");
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

    public final int getSize() {
        return this.availableAccounts.size();
    }

    public final java.lang.Object a(int i) {
        defpackage.cky.a(i, this.availableAccounts.size());
        return this.availableAccounts.get(i);
    }

    public final boolean b() {
        return !this.d.isEmpty();
    }

    public final java.lang.Object c() {
        if (b()) {
            return this.d.get(0);
        }
        return null;
    }

    public final boolean d() {
        return this.d.size() > 1;
    }

    public final java.lang.Object e() {
        if (d()) {
            return this.d.get(1);
        }
        return null;
    }

    public final boolean f() {
        return this.d.size() > 2;
    }

    public final java.lang.Object g() {
        if (f()) {
            return this.d.get(2);
        }
        return null;
    }

    public final void a(defpackage.cdm cdm) {
        this.b.add(cdm);
    }

    public final void b(defpackage.cdm cdm) {
        this.b.remove(cdm);
    }

    public final void h() {
        java.lang.Object c2 = c();
        java.lang.Object e = e();
        java.lang.Object g = g();
        for (defpackage.cdm cdm : this.b) {
            cdm.a(c2, e, g);
        }
    }

    static {
        defpackage.cdl.class.getSimpleName();
    }
}
