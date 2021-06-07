package defpackage;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: aix  reason: default package */
public final /* synthetic */ class aix implements Runnable {
    private final cyu a;
    private final Context b;

    aix(cyu cyu, Context context) {
        this.a = cyu;
        this.b = context;
    }

    public final void run() {
        this.a.a(new aiw(this.b.getApplicationContext().getSharedPreferences("device-prefs", 0)));
    }
}
