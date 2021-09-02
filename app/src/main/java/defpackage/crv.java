package defpackage;

/* renamed from: crv reason: default package */
/* compiled from: PG */
public abstract class crv implements java.io.Serializable {
    public static final long serialVersionUID = 0;

    public static defpackage.crv b(java.lang.Object obj) {
        return new defpackage.cry(defpackage.cld.a(obj));
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    public abstract boolean a();

    public abstract java.lang.Object b();

    public abstract java.lang.Object c();

    public static defpackage.crv c(java.lang.Object obj) {
        if (obj == null) {
            return defpackage.crk.a;
        }
        return new defpackage.cry(obj);
    }

    crv() {
    }
}
