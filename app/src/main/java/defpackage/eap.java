package defpackage;

/* renamed from: eap  reason: default package */
/* compiled from: PG */
public abstract class eap extends ean {
    eap() {
        super((byte) 0);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static eap a(String str, String str2, String str3) {
        cld.a(dtj.a(str) && str.length() <= 255, "Name should be a ASCII string with a length no greater than 255 characters.");
        return new eam(str, str2, str3);
    }
}
