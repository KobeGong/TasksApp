package defpackage;

/* renamed from: a  reason: default package */
/* compiled from: PG */
public class a extends e {
    private static volatile a a;
    private e b = this.c;
    private e c = new d();

    private a() {
    }

    public static a a() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    @Override // defpackage.e
    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }

    @Override // defpackage.e
    public final void b(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // defpackage.e
    public final boolean b() {
        return this.b.b();
    }

    static {
        new b();
        new c();
    }
}
