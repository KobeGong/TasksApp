package defpackage;

/* renamed from: a reason: default package */
/* compiled from: PG */
public class a extends defpackage.e {
    private static volatile defpackage.a a;
    private defpackage.e b = this.c;
    private defpackage.e c = new defpackage.d();

    private a() {
    }

    public static defpackage.a a() {
        if (a != null) {
            return a;
        }
        synchronized (defpackage.a.class) {
            if (a == null) {
                a = new defpackage.a();
            }
        }
        return a;
    }

    public final void a(java.lang.Runnable runnable) {
        this.b.a(runnable);
    }

    public final void b(java.lang.Runnable runnable) {
        this.b.b(runnable);
    }

    public final boolean b() {
        return this.b.b();
    }

    static {
        new defpackage.b();
        new defpackage.c();
    }
}
