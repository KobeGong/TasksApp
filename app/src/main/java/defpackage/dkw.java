package defpackage;

/* renamed from: dkw  reason: default package */
/* compiled from: PG */
public final class dkw extends RuntimeException {
    public static final long serialVersionUID = -7466929953374883507L;

    public dkw() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final dir a() {
        return new dir(getMessage());
    }
}
