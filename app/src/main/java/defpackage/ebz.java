package defpackage;

@java.lang.Deprecated
/* renamed from: ebz reason: default package */
/* compiled from: PG */
public abstract class ebz extends defpackage.ehw {
    public static defpackage.eca a(defpackage.ecb ecb, long j) {
        defpackage.eca eca = new defpackage.eca(0);
        defpackage.ecb ecb2 = (defpackage.ecb) defpackage.cld.a((java.lang.Object) ecb, (java.lang.Object) "type");
        if (ecb2 == null) {
            throw new java.lang.NullPointerException("Null type");
        }
        eca.a = ecb2;
        eca.b = java.lang.Long.valueOf(j);
        return eca.a(0).b(0);
    }

    public abstract defpackage.eaj a();

    public abstract defpackage.ecb b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    ebz() {
    }
}
