package defpackage;

import android.content.Context;

/* renamed from: bqp  reason: default package */
/* compiled from: PG */
public final class bqp implements bqm {
    public static final brt a = new bqq();
    private final awt b;

    private bqp(Context context, String str, String str2) {
        this.b = new awt(context, str, str2);
    }

    @Override // defpackage.bqm
    public final bql a(byte[] bArr) {
        return new bql(this.b, bArr, (byte) 0);
    }

    @Override // defpackage.bqm
    public final bql a(bqo bqo) {
        return new bql(this.b, new aww(bqo), (byte) 0);
    }

    public bqp(Context context, String str, String str2, byte b2) {
        this(context, str, str2);
    }
}
