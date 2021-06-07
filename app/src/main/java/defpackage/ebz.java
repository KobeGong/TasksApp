package defpackage;

@Deprecated
/* renamed from: ebz  reason: default package */
/* compiled from: PG */
public abstract class ebz extends ehw {
    public static eca a(ecb ecb, long j) {
        eca eca = new eca((byte) 0);
        ecb ecb2 = (ecb) cld.a(ecb, "type");
        if (ecb2 == null) {
            throw new NullPointerException("Null type");
        }
        eca.a = ecb2;
        eca.b = Long.valueOf(j);
        return eca.a(0).b(0);
    }

    public abstract eaj a();

    public abstract ecb b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    ebz() {
    }
}
