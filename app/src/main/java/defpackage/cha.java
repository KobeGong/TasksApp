package defpackage;

import android.app.Application;

/* renamed from: cha  reason: default package */
/* compiled from: PG */
public class cha {
    public static volatile cha a;
    public final chb b = new chb();

    public static cha a(Application application) {
        if (a == null) {
            synchronized (cha.class) {
                if (a == null) {
                    cha cha = new cha();
                    chb chb = cha.b;
                    application.registerActivityLifecycleCallbacks(chb.a);
                    application.registerComponentCallbacks(chb.a);
                    a = cha;
                }
            }
        }
        return a;
    }

    private cha() {
    }

    public final void a(cgp cgp) {
        chb chb = this.b;
        cky.a(cgp);
        chb.a.a.add(cgp);
    }

    public final void b(cgp cgp) {
        chb chb = this.b;
        cky.a(cgp);
        chb.a.a.remove(cgp);
    }
}
