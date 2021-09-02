package defpackage;

/* renamed from: eaj reason: default package */
/* compiled from: PG */
public abstract class eaj implements java.lang.Comparable {
    private static final defpackage.eaj a = new defpackage.eai();

    eaj() {
    }

    public abstract long a();

    public abstract int b();

    public static defpackage.eaj c() {
        if (0 < -315576000000L || 0 > 315576000000L) {
            return a;
        }
        return new defpackage.eai();
    }

    public /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.eaj eaj = (defpackage.eaj) obj;
        int a2 = defpackage.cub.a(a(), eaj.a());
        if (a2 != 0) {
            return a2;
        }
        return defpackage.cub.a((long) b(), (long) eaj.b());
    }
}
