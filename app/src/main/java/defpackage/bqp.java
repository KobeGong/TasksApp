package defpackage;

/* renamed from: bqp reason: default package */
/* compiled from: PG */
public final class bqp implements defpackage.bqm {
    public static final defpackage.brt a = new defpackage.bqq();
    private final defpackage.awt b;

    private bqp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.b = new defpackage.awt(context, str, str2);
    }

    public final defpackage.bql a(byte[] bArr) {
        return new defpackage.bql(this.b, bArr, 0);
    }

    public final defpackage.bql a(defpackage.bqo bqo) {
        return new defpackage.bql(this.b, new defpackage.aww(bqo), 0);
    }

    public bqp(android.content.Context context, java.lang.String str, java.lang.String str2, byte b2) {
        this(context, str, str2);
    }
}
