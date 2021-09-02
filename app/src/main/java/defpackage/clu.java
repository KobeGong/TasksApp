package defpackage;

/* renamed from: clu reason: default package */
/* compiled from: PG */
public final class clu {
    public final long a;
    public long b;
    public int c;

    clu() {
        this(android.os.SystemClock.elapsedRealtime());
    }

    private clu(long j) {
        this.b = -1;
        this.c = defpackage.bg.ab;
        this.a = j;
    }

    clu(long j, long j2) {
        boolean z;
        this.b = -1;
        this.c = defpackage.bg.ab;
        if (j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        java.lang.String str = "End time %s is before start time %s.";
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j)};
        if (!z) {
            throw new java.lang.IllegalArgumentException(defpackage.cky.a(str, objArr));
        }
        this.a = j;
        this.b = j2;
    }

    static {
        new defpackage.clu();
    }
}
