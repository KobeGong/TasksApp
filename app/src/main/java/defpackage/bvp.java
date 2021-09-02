package defpackage;

/* renamed from: bvp reason: default package */
/* compiled from: PG */
final class bvp {
    public java.lang.Long a;
    private java.lang.Long b;

    public final defpackage.bvp a(long j) {
        this.b = java.lang.Long.valueOf(j);
        return this;
    }

    public final defpackage.bvo a() {
        java.lang.String str = "";
        if (this.b == null) {
            str = java.lang.String.valueOf(str).concat(" startTime");
        }
        if (str.isEmpty()) {
            return new defpackage.bvj(this.a, this.b.longValue());
        }
        java.lang.String str2 = "Missing required properties:";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    bvp() {
    }
}
