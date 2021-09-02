package defpackage;

/* renamed from: dkw reason: default package */
/* compiled from: PG */
public final class dkw extends java.lang.RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public dkw() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.dir a() {
        return new defpackage.dir(getMessage());
    }
}
