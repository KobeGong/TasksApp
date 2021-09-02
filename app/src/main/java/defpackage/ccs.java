package defpackage;

/* renamed from: ccs reason: default package */
/* compiled from: PG */
public final class ccs {
    public defpackage.djo a;
    public java.lang.Throwable b;
    private java.lang.Boolean c;

    public final defpackage.ccs a(boolean z) {
        this.c = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final defpackage.ccr a() {
        java.lang.String str = "";
        if (this.c == null) {
            str = java.lang.String.valueOf(str).concat(" isRetryableError");
        }
        if (str.isEmpty()) {
            return new defpackage.ccp(this.a, this.b, this.c.booleanValue());
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    ccs() {
    }
}
