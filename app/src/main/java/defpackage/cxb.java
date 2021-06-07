package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cxb  reason: default package */
/* compiled from: PG */
public final class cxb {
    public static final cxb a;
    public static final cxb b;
    public final boolean c;
    public final Throwable d;

    cxb(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }

    static {
        if (cwz.a) {
            b = null;
            a = null;
            return;
        }
        b = new cxb(false, null);
        a = new cxb(true, null);
    }
}
