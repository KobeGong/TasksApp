package defpackage;

/* renamed from: ccs  reason: default package */
/* compiled from: PG */
public final class ccs {
    public djo a;
    public Throwable b;
    private Boolean c;

    public final ccs a(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final ccr a() {
        String str = "";
        if (this.c == null) {
            str = String.valueOf(str).concat(" isRetryableError");
        }
        if (str.isEmpty()) {
            return new ccp(this.a, this.b, this.c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    ccs() {
    }
}
