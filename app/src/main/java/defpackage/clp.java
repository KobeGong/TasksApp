package defpackage;

/* renamed from: clp reason: default package */
/* compiled from: PG */
public final class clp {
    public static final defpackage.clp a;
    public final boolean b = false;
    public final float c;
    public final int d;
    public final int e;

    private clp(float f, int i, int i2) {
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    static {
        defpackage.clq clq = new defpackage.clq();
        clq.a = 0.5f;
        clq.b = 5;
        clq.c = 1000;
        a = new defpackage.clp(clq.a, clq.b, clq.c);
    }
}
