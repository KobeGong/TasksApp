package defpackage;

/* renamed from: btm reason: default package */
/* compiled from: PG */
public final class btm {
    public java.lang.Throwable a;
    private defpackage.btn b;

    public final defpackage.btm a(defpackage.btn btn) {
        if (btn == null) {
            throw new java.lang.NullPointerException("Null code");
        }
        this.b = btn;
        return this;
    }

    public final defpackage.btl a() {
        java.lang.String str = "";
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" code");
        }
        if (str.isEmpty()) {
            return new defpackage.bti(this.b, this.a);
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    btm() {
    }
}
