package defpackage;

/* renamed from: cln  reason: default package */
/* compiled from: PG */
public final class cln {
    public static final cln a = new cln(false);
    private static final cky f = new cky();
    public final boolean b;
    public final boolean c;
    public final int d;
    public final cky e;

    @Deprecated
    public cln() {
        this(false);
    }

    public cln(boolean z) {
        this(z, (byte) 0);
    }

    private cln(boolean z, byte b2) {
        this(z, (char) 0);
    }

    private cln(boolean z, char c2) {
        this(z, 10, f);
    }

    private cln(boolean z, int i, cky cky) {
        this.b = z;
        this.d = 10;
        this.c = false;
        this.e = cky == null ? f : cky;
    }
}
