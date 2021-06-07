package defpackage;

import android.content.Context;

/* renamed from: bqx  reason: default package */
/* compiled from: PG */
public final class bqx {
    public ayq a;
    public brr b;
    private final Context c;

    public final bqw a() {
        return new brs(this.a.a(), this.b, (byte) 0);
    }

    private bqx(Context context) {
        this(context, new brr());
    }

    private bqx(Context context, brr brr) {
        this.c = context;
        this.a = new ayq(context);
        this.b = brr;
    }

    public bqx(Context context, byte b2) {
        this(context);
    }
}
