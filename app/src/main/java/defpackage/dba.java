package defpackage;

/* renamed from: dba reason: default package */
/* compiled from: PG */
public final class dba extends defpackage.dih implements defpackage.djq {
    public static final defpackage.dba d = new defpackage.dba();
    private static volatile defpackage.djx e;
    public int a;
    public defpackage.diq b = defpackage.dka.b;
    public java.lang.String c = "";

    private dba() {
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
                java.lang.Object[] objArr = {"a", "b", defpackage.dbp.class, "c"};
                return new defpackage.dkb(d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", objArr);
            case 3:
                return new defpackage.dba();
            case 4:
                return new defpackage.dii((byte[][][][][][]) null);
            case 5:
                return d;
            case 6:
                defpackage.djx djx2 = e;
                if (djx2 != null) {
                    return djx2;
                }
                synchronized (defpackage.dba.class) {
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
        defpackage.dba dba = d;
        defpackage.dih.t.put(defpackage.dba.class, dba);
    }
}
