package defpackage;

/* renamed from: cpo reason: default package */
/* compiled from: PG */
public final class cpo {
    public static final java.util.Set a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public static int b = -1;

    static void a(defpackage.cpn cpn) {
        if (defpackage.cky.a()) {
            a.add(cpn);
            if (b != -1) {
                cpn.a(b);
                return;
            }
            return;
        }
        defpackage.cky.a((java.lang.Runnable) new defpackage.cpp(cpn));
    }
}
