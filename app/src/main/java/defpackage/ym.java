package defpackage;

/* renamed from: ym reason: default package */
/* compiled from: PG */
public final class ym {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public defpackage.th b;
    public boolean c;
    private long d = -1;
    private android.view.animation.Interpolator e;
    private final defpackage.ti f = new defpackage.yn(this);

    public final defpackage.ym a(defpackage.te teVar) {
        if (!this.c) {
            this.a.add(teVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            java.util.ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                defpackage.te teVar = (defpackage.te) arrayList.get(i);
                if (this.d >= 0) {
                    teVar.a(this.d);
                }
                if (this.e != null) {
                    android.view.animation.Interpolator interpolator = this.e;
                    android.view.View view = (android.view.View) teVar.a.get();
                    if (view != null) {
                        view.animate().setInterpolator(interpolator);
                    }
                }
                if (this.b != null) {
                    teVar.a((defpackage.th) this.f);
                }
                android.view.View view2 = (android.view.View) teVar.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
                i = i2;
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            java.util.ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                ((defpackage.te) obj).a();
            }
            this.c = false;
        }
    }

    public final defpackage.ym c() {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public final defpackage.ym a(android.view.animation.Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final defpackage.ym a(defpackage.th thVar) {
        if (!this.c) {
            this.b = thVar;
        }
        return this;
    }
}
