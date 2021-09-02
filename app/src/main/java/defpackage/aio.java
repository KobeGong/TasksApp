package defpackage;

/* renamed from: aio reason: default package */
final /* synthetic */ class aio implements java.lang.Runnable {
    private final defpackage.cyu a;
    private final android.content.Context b;
    private final java.lang.String c;

    aio(defpackage.cyu cyu, android.content.Context context, java.lang.String str) {
        this.a = cyu;
        this.b = context;
        this.c = str;
    }

    public final void run() {
        this.a.a((java.lang.Object) new defpackage.ain(this.b.getApplicationContext().getSharedPreferences(this.c, 0)));
    }
}
