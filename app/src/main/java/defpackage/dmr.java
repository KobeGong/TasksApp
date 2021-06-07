package defpackage;

/* renamed from: dmr  reason: default package */
/* compiled from: PG */
public final class dmr implements dml, ecz {
    private static final Object a = new Object();
    private volatile ecz b;
    private volatile Object c = a;

    private dmr(ecz ecz) {
        this.b = ecz;
    }

    @Override // defpackage.dml, defpackage.ecz
    public final Object a() {
        Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.a();
                    Object obj2 = this.c;
                    if (obj2 == a || obj2 == obj) {
                        this.c = obj;
                        this.b = null;
                    } else {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(obj);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length()).append("Scoped provider was invoked recursively returning different results: ").append(valueOf).append(" & ").append(valueOf2).append(". This is likely due to a circular dependency.").toString());
                    }
                }
            }
        }
        return obj;
    }

    public static ecz a(ecz ecz) {
        dgv.a(ecz);
        return ecz instanceof dmr ? ecz : new dmr(ecz);
    }

    public static dml b(ecz ecz) {
        if (ecz instanceof dml) {
            return (dml) ecz;
        }
        return new dmr((ecz) dgv.a(ecz));
    }
}
