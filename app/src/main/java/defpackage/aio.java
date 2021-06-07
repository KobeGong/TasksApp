package defpackage;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: aio  reason: default package */
public final /* synthetic */ class aio implements Runnable {
    private final cyu a;
    private final Context b;
    private final String c;

    aio(cyu cyu, Context context, String str) {
        this.a = cyu;
        this.b = context;
        this.c = str;
    }

    public final void run() {
        this.a.a((cyu) new ain(this.b.getApplicationContext().getSharedPreferences(this.c, 0)));
    }
}
