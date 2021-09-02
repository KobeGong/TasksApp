package defpackage;

/* renamed from: cha reason: default package */
/* compiled from: PG */
public class cha {
    public static volatile defpackage.cha a;
    public final defpackage.chb b = new defpackage.chb();

    public static defpackage.cha a(android.app.Application application) {
        if (a == null) {
            synchronized (defpackage.cha.class) {
                if (a == null) {
                    defpackage.cha cha = new defpackage.cha();
                    defpackage.chb chb = cha.b;
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

    public final void a(defpackage.cgp cgp) {
        defpackage.chb chb = this.b;
        defpackage.cky.a((java.lang.Object) cgp);
        chb.a.a.add(cgp);
    }

    public final void b(defpackage.cgp cgp) {
        defpackage.chb chb = this.b;
        defpackage.cky.a((java.lang.Object) cgp);
        chb.a.a.remove(cgp);
    }
}
