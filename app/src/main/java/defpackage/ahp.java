package defpackage;

/* renamed from: ahp  reason: default package */
/* compiled from: PG */
public final class ahp {
    public static rg d = new rg(20);
    public int a;
    public afb b;
    public afb c;

    private ahp() {
    }

    public static ahp a() {
        ahp ahp = (ahp) d.a();
        return ahp == null ? new ahp() : ahp;
    }

    public static void a(ahp ahp) {
        ahp.a = 0;
        ahp.b = null;
        ahp.c = null;
        d.a(ahp);
    }
}
