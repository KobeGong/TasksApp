package defpackage;

/* renamed from: clm  reason: default package */
/* compiled from: PG */
public final class clm {
    public static final clm a;
    public final boolean b = false;
    public final int c;

    private clm(boolean z, int i) {
        this.c = i;
    }

    static {
        cnk cnk = new cnk();
        cnk.a = 10;
        a = new clm(false, cnk.a);
    }
}
