package defpackage;

/* renamed from: eao reason: default package */
/* compiled from: PG */
public abstract class eao extends defpackage.ean {
    eao() {
        super(0);
    }

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public static defpackage.eao a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.cld.a(defpackage.dtj.a(str) && str.length() <= 255, (java.lang.Object) "Name should be a ASCII string with a length no greater than 255 characters.");
        return new defpackage.eal(str, str2, str3);
    }
}
