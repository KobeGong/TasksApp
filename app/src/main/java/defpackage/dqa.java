package defpackage;

/* renamed from: dqa  reason: default package */
/* compiled from: PG */
public final class dqa extends Exception {
    public static final long serialVersionUID = -660954903976144640L;
    public final dpw a;

    public dqa(dpw dpw) {
        this(dpw, (byte) 0);
    }

    private dqa(dpw dpw, byte b) {
        super(dpw.a(dpw), dpw.n);
        this.a = dpw;
    }
}
