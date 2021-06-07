package defpackage;

/* renamed from: btm  reason: default package */
/* compiled from: PG */
public final class btm {
    public Throwable a;
    private btn b;

    public final btm a(btn btn) {
        if (btn == null) {
            throw new NullPointerException("Null code");
        }
        this.b = btn;
        return this;
    }

    public final btl a() {
        String str = "";
        if (this.b == null) {
            str = String.valueOf(str).concat(" code");
        }
        if (str.isEmpty()) {
            return new bti(this.b, this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    btm() {
    }
}
