package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: aoh  reason: default package */
/* compiled from: PG */
public final class aoh implements aoe, Runnable {
    public final aoj b;
    private final cyu c;
    private final aoe d;

    public aoh(aoj aoj) {
        this(new aok(), aoj);
    }

    public aoh(aoe aoe, aoj aoj) {
        this.d = aoe;
        this.c = new cyu();
        this.b = aoj;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new aoi(this));
        cyd.c(this.c);
    }

    @Override // defpackage.aoe
    public final String a(Context context) {
        return this.d.a(context);
    }

    @Override // defpackage.aoe
    public final void a(String str) {
        this.d.a(str);
        this.c.a((Object) null);
    }

    @Override // defpackage.aoe
    public final aof a(Context context, String str) {
        aof a = this.d.a(context, str);
        this.c.a((Object) null);
        return a;
    }
}
