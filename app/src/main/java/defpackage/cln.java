package defpackage;

/* renamed from: cln reason: default package */
/* compiled from: PG */
public final class cln {
    public static final defpackage.cln a = new defpackage.cln(false);
    private static final defpackage.cky f = new defpackage.cky();
    public final boolean b;
    public final boolean c;
    public final int d;
    public final defpackage.cky e;

    @java.lang.Deprecated
    public cln() {
        this(false);
    }

    public cln(boolean z) {
        this(z, 0);
    }

    private cln(boolean z, byte b2) {
        this(z, 0);
    }

    private cln(boolean z, char c2) {
        this(z, 10, f);
    }

    private cln(boolean z, int i, defpackage.cky cky) {
        this.b = z;
        this.d = 10;
        this.c = false;
        if (cky == null) {
            cky = f;
        }
        this.e = cky;
    }
}
