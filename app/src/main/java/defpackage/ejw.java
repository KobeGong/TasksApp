package defpackage;

/* renamed from: ejw  reason: default package */
/* compiled from: PG */
public final class ejw {
    public ech a;
    private Boolean b;

    public final ejw a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final ebw a() {
        String str = "";
        if (this.b == null) {
            str = String.valueOf(str).concat(" sampleToLocalSpanStore");
        }
        if (str.isEmpty()) {
            return new ebs(this.b.booleanValue(), this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public ejw() {
    }

    public ejw(byte b2) {
        this();
    }
}
