package defpackage;

/* renamed from: ebk reason: default package */
/* compiled from: PG */
public abstract class ebk {
    ebk() {
    }

    public abstract java.lang.String a();

    public static defpackage.ebk a(java.lang.String str) {
        defpackage.cld.a(!str.isEmpty() && str.length() <= 255 && defpackage.dtj.a(str));
        return new defpackage.eaz(str);
    }
}
