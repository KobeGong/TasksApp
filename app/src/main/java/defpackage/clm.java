package defpackage;

/* renamed from: clm reason: default package */
/* compiled from: PG */
public final class clm {
    public static final defpackage.clm a;
    public final boolean b = false;
    public final int c;

    private clm(boolean z, int i) {
        this.c = i;
    }

    static {
        defpackage.cnk cnk = new defpackage.cnk();
        cnk.a = 10;
        a = new defpackage.clm(false, cnk.a);
    }
}
