package defpackage;

/* renamed from: ckt reason: default package */
/* compiled from: PG */
public final class ckt {
    public static final defpackage.ckt a = new defpackage.ckt(false);
    private static final defpackage.cid g = new defpackage.cid();
    public final boolean b;
    public final int c;
    public final boolean d;
    public final defpackage.cid e;
    public final boolean f;

    @java.lang.Deprecated
    public ckt() {
        this(false);
    }

    public ckt(boolean z) {
        this(z, 0);
    }

    private ckt(boolean z, byte b2) {
        this(z, 0);
    }

    private ckt(boolean z, char c2) {
        this(z, 3, g);
    }

    private ckt(boolean z, int i, defpackage.cid cid) {
        this(z, 3, false, cid);
    }

    private ckt(boolean z, int i, boolean z2, defpackage.cid cid) {
        this.b = z;
        this.c = i;
        this.d = false;
        this.e = cid;
        this.f = false;
    }
}
