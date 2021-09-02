package defpackage;

/* renamed from: dmr reason: default package */
/* compiled from: PG */
public final class dmr implements defpackage.dml, defpackage.ecz {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile defpackage.ecz b;
    private volatile java.lang.Object c = a;

    private dmr(defpackage.ecz ecz) {
        this.b = ecz;
    }

    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.a();
                    java.lang.Object obj2 = this.c;
                    if (obj2 == a || obj2 == obj) {
                        this.c = obj;
                        this.b = null;
                    } else {
                        java.lang.String valueOf = java.lang.String.valueOf(obj2);
                        java.lang.String valueOf2 = java.lang.String.valueOf(obj);
                        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 118 + java.lang.String.valueOf(valueOf2).length()).append("Scoped provider was invoked recursively returning different results: ").append(valueOf).append(" & ").append(valueOf2).append(". This is likely due to a circular dependency.").toString());
                    }
                }
            }
        }
        return obj;
    }

    public static defpackage.ecz a(defpackage.ecz ecz) {
        defpackage.dgv.a((java.lang.Object) ecz);
        return ecz instanceof defpackage.dmr ? ecz : new defpackage.dmr(ecz);
    }

    public static defpackage.dml b(defpackage.ecz ecz) {
        if (ecz instanceof defpackage.dml) {
            return (defpackage.dml) ecz;
        }
        return new defpackage.dmr((defpackage.ecz) defpackage.dgv.a((java.lang.Object) ecz));
    }
}
