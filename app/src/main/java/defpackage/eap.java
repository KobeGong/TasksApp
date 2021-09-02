package defpackage;

/* renamed from: eap reason: default package */
/* compiled from: PG */
public abstract class eap extends defpackage.ean {
    eap() {
        super(0);
    }

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public static defpackage.eap a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.cld.a(defpackage.dtj.a(str) && str.length() <= 255, (java.lang.Object) "Name should be a ASCII string with a length no greater than 255 characters.");
        return new defpackage.eam(str, str2, str3);
    }
}
