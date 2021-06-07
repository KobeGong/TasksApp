package defpackage;

/* renamed from: dnb  reason: default package */
/* compiled from: PG */
public final class dnb {
    public final Object a = null;
    private final String b;

    private dnb(String str) {
        this.b = str;
    }

    public final String toString() {
        return this.b;
    }

    public static dnb a(String str) {
        cld.a(str, "name");
        return new dnb(str);
    }
}
