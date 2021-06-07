package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: ym  reason: default package */
/* compiled from: PG */
public final class ym {
    public final ArrayList a = new ArrayList();
    public th b;
    public boolean c;
    private long d = -1;
    private Interpolator e;
    private final ti f = new yn(this);

    public final ym a(te teVar) {
        if (!this.c) {
            this.a.add(teVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                te teVar = (te) arrayList.get(i);
                if (this.d >= 0) {
                    teVar.a(this.d);
                }
                if (this.e != null) {
                    Interpolator interpolator = this.e;
                    View view = (View) teVar.a.get();
                    if (view != null) {
                        view.animate().setInterpolator(interpolator);
                    }
                }
                if (this.b != null) {
                    teVar.a(this.f);
                }
                View view2 = (View) teVar.a.get();
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
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((te) obj).a();
            }
            this.c = false;
        }
    }

    public final ym c() {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public final ym a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final ym a(th thVar) {
        if (!this.c) {
            this.b = thVar;
        }
        return this;
    }
}
