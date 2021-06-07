package defpackage;

/* renamed from: alm  reason: default package */
/* compiled from: PG */
public final class alm {
    private static alm a;

    private alm() {
    }

    public static synchronized alm a() {
        alm alm;
        synchronized (alm.class) {
            if (a == null) {
                a = new alm();
            }
            alm = a;
        }
        return alm;
    }
}
