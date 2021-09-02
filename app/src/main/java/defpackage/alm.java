package defpackage;

/* renamed from: alm reason: default package */
/* compiled from: PG */
public final class alm {
    private static defpackage.alm a;

    private alm() {
    }

    public static synchronized defpackage.alm a() {
        defpackage.alm alm;
        synchronized (defpackage.alm.class) {
            if (a == null) {
                a = new defpackage.alm();
            }
            alm = a;
        }
        return alm;
    }
}
