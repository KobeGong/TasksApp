package defpackage;

/* renamed from: avt reason: default package */
/* compiled from: PG */
public final class avt {
    public static defpackage.bjb a = new defpackage.bjb("GoogleSignInCommon", new java.lang.String[0]);

    public static void a(android.content.Context context) {
        defpackage.avy.a(context).a();
        for (defpackage.ayp d : defpackage.ayp.a()) {
            d.d();
        }
        synchronized (defpackage.baj.c) {
            if (defpackage.baj.d != null) {
                defpackage.baj baj = defpackage.baj.d;
                baj.f.incrementAndGet();
                baj.g.sendMessageAtFrontOfQueue(baj.g.obtainMessage(10));
            }
        }
    }
}
