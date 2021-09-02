package defpackage;

/* renamed from: ekp reason: default package */
/* compiled from: PG */
public final class ekp extends defpackage.eiy {
    private final int a;
    private final defpackage.eko b;

    public ekp(java.lang.String str, int i, int i2) {
        super(str);
        this.b = new defpackage.eko(str, 10, i);
        this.a = i2;
    }

    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.b.getMessage());
        sb.append(", QuicDetailedErrorCode=").append(this.a);
        return sb.toString();
    }

    public final int a() {
        return this.b.a();
    }

    public final int b() {
        return this.a;
    }
}
