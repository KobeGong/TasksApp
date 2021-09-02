package defpackage;

/* renamed from: dfs reason: default package */
/* compiled from: PG */
public final class dfs extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dfs d = new defpackage.dfs();
    private static volatile defpackage.djx e;
    public int a;
    public boolean b;
    public boolean c;

    private dfs() {
    }

    /* access modifiers changed from: protected */
    public final java.lang.Object a(int i) {
        defpackage.djx djx;
        switch (i - 1) {
            case 0:
                return java.lang.Byte.valueOf(1);
            case 1:
                return null;
            case 2:
                java.lang.Object[] objArr = {"a", "b", "c"};
                return new defpackage.dkb(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0001\u0003\u0007\u0002", objArr);
            case 3:
                return new defpackage.dfs();
            case 4:
                return new defpackage.dii((boolean[][][][][][][][][][][][][][][][][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dfs.class) {
                    djx = e;
                    if (djx == null) {
                        djx = new defpackage.dgr(d);
                        e = djx;
                    }
                }
                return djx;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        defpackage.dfs dfs = d;
        defpackage.dih.t.put(defpackage.dfs.class, dfs);
    }
}
