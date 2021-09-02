package defpackage;

/* renamed from: cxb reason: default package */
/* compiled from: PG */
final class cxb {
    public static final defpackage.cxb a;
    public static final defpackage.cxb b;
    public final boolean c;
    public final java.lang.Throwable d;

    cxb(boolean z, java.lang.Throwable th) {
        this.c = z;
        this.d = th;
    }

    static {
        if (defpackage.cwz.a) {
            b = null;
            a = null;
            return;
        }
        b = new defpackage.cxb(false, null);
        a = new defpackage.cxb(true, null);
    }
}
