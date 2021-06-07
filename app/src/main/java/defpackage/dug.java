package defpackage;

import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dug  reason: default package */
/* compiled from: PG */
public final class dug implements dzq {
    public final dzq a;
    public volatile boolean b;
    public List c = new ArrayList();

    public dug(dzq dzq) {
        this.a = dzq;
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.dzq
    public final void a(dzr dzr) {
        if (this.b) {
            this.a.a(dzr);
        } else {
            a(new duh(this, dzr));
        }
    }

    @Override // defpackage.dzq
    public final void a() {
        if (this.b) {
            this.a.a();
        } else {
            a(new dui(this));
        }
    }

    @Override // defpackage.dzq
    public final void a(dor dor) {
        a(new duj(this, dor));
    }

    @Override // defpackage.dzq
    public final void b(dpw dpw, dor dor) {
        a(new duk(this, dpw, dor));
    }

    @Override // defpackage.dzq
    public final void a(dpw dpw, int i, dor dor) {
        a(new dul(this, dpw, i, dor));
    }
}
