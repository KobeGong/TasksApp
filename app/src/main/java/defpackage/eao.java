package defpackage;

/* renamed from: eao  reason: default package */
/* compiled from: PG */
public abstract class eao extends ean {
    eao() {
        super((byte) 0);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static eao a(String str, String str2, String str3) {
        cld.a(dtj.a(str) && str.length() <= 255, "Name should be a ASCII string with a length no greater than 255 characters.");
        return new eal(str, str2, str3);
    }
}
