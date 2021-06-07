package defpackage;

/* renamed from: eaj  reason: default package */
/* compiled from: PG */
public abstract class eaj implements Comparable {
    private static final eaj a = new eai();

    eaj() {
    }

    public abstract long a();

    public abstract int b();

    public static eaj c() {
        if (0 < -315576000000L || 0 > 315576000000L) {
            return a;
        }
        return new eai();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        eaj eaj = (eaj) obj;
        int a2 = cub.a(a(), eaj.a());
        if (a2 != 0) {
            return a2;
        }
        return cub.a((long) b(), (long) eaj.b());
    }
}
