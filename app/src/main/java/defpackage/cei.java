package defpackage;

/* renamed from: cei reason: default package */
/* compiled from: PG */
public final class cei implements android.content.ComponentCallbacks2 {
    public static final defpackage.ri a = new defpackage.ri();
    public final defpackage.cdf b;
    public final defpackage.cfu c;
    public long d;
    private final java.util.concurrent.Executor e;
    private final android.content.Context f;
    private boolean g;
    private long h;

    public cei(android.content.Context context, defpackage.cdf cdf, defpackage.cfu cfu, java.util.concurrent.Executor executor) {
        this.b = (defpackage.cdf) defpackage.cky.a((java.lang.Object) cdf);
        this.c = (defpackage.cfu) defpackage.cky.a((java.lang.Object) cfu);
        this.e = (java.util.concurrent.Executor) defpackage.cky.a((java.lang.Object) executor);
        this.f = ((android.content.Context) defpackage.cky.a((java.lang.Object) context)).getApplicationContext();
    }

    public final void a() {
        a("open");
        if (!this.g) {
            this.f.registerComponentCallbacks(this);
            this.h++;
            this.g = true;
        }
    }

    public final void b() {
        a("close");
        if (this.g) {
            this.d = this.h;
            this.g = false;
            this.f.unregisterComponentCallbacks(this);
        }
    }

    public final void a(android.widget.ImageView imageView, java.lang.Object obj, int i) {
        a("loadImageIntoView");
        defpackage.cky.b(this.g, (java.lang.Object) "open must be called before loading images");
        long j = this.h;
        this.h = 1 + j;
        defpackage.cel cel = new defpackage.cel(this, imageView, obj, i, j);
        a(imageView, cel);
        this.e.execute(new defpackage.cej(this, cel));
    }

    static void a(android.widget.ImageView imageView, defpackage.cel cel) {
        a("resetRequestForView");
        defpackage.cel cel2 = (defpackage.cel) imageView.getTag(2131755033);
        if (cel2 != null) {
            cel2.c = true;
        }
        imageView.setTag(2131755033, cel);
    }

    static void a(java.lang.String str) {
        defpackage.cky.b(android.os.Looper.getMainLooper() == android.os.Looper.myLooper(), (java.lang.Object) java.lang.String.valueOf(str).concat(" must be called on the UI thread"));
    }

    public final void onTrimMemory(int i) {
        a.clear();
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    public final void onLowMemory() {
    }
}
