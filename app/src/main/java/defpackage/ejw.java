package defpackage;

/* renamed from: ejw reason: default package */
/* compiled from: PG */
public final class ejw {
    public defpackage.ech a;
    private java.lang.Boolean b;

    public final defpackage.ejw a(boolean z) {
        this.b = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final defpackage.ebw a() {
        java.lang.String str = "";
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" sampleToLocalSpanStore");
        }
        if (str.isEmpty()) {
            return new defpackage.ebs(this.b.booleanValue(), this.a);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    public ejw() {
    }

    public ejw(byte b2) {
        this();
    }
}
