package defpackage;

/* renamed from: dnb reason: default package */
/* compiled from: PG */
public final class dnb {
    public final java.lang.Object a = null;
    private final java.lang.String b;

    private dnb(java.lang.String str) {
        this.b = str;
    }

    public final java.lang.String toString() {
        return this.b;
    }

    public static defpackage.dnb a(java.lang.String str) {
        defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "name");
        return new defpackage.dnb(str);
    }
}
