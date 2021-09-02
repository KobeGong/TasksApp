package defpackage;

/* renamed from: aix reason: default package */
final /* synthetic */ class aix implements java.lang.Runnable {
    private final defpackage.cyu a;
    private final android.content.Context b;

    aix(defpackage.cyu cyu, android.content.Context context) {
        this.a = cyu;
        this.b = context;
    }

    public final void run() {
        this.a.a((java.lang.Object) new defpackage.aiw(this.b.getApplicationContext().getSharedPreferences("device-prefs", 0)));
    }
}
