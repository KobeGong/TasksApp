package defpackage;

/* renamed from: wp reason: default package */
/* compiled from: PG */
public abstract class wp extends defpackage.wo {
    private static boolean n = true;
    private static final int[] o = {16842836};
    public final android.content.Context b;
    public final android.view.Window c;
    public final android.view.Window.Callback d = this.c.getCallback();
    public final defpackage.wn e;
    public defpackage.wa f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public java.lang.CharSequence l;
    public boolean m;
    private final android.view.Window.Callback p;
    private android.view.MenuInflater q;

    wp(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        this.b = context;
        this.c = window;
        this.e = wnVar;
        if (this.d instanceof defpackage.wr) {
            throw new java.lang.IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.p = a(this.d);
        this.c.setCallback(this.p);
        defpackage.agw a = defpackage.agw.a(context, (android.util.AttributeSet) null, o);
        android.graphics.drawable.Drawable b2 = a.b(0);
        if (b2 != null) {
            this.c.setBackgroundDrawable(b2);
        }
        a.b.recycle();
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.yc a(defpackage.yd ydVar);

    /* access modifiers changed from: 0000 */
    public abstract boolean a(int i2, android.view.KeyEvent keyEvent);

    /* access modifiers changed from: 0000 */
    public abstract boolean a(android.view.KeyEvent keyEvent);

    /* access modifiers changed from: 0000 */
    public abstract void b(java.lang.CharSequence charSequence);

    /* access modifiers changed from: 0000 */
    public abstract void d(int i2);

    /* access modifiers changed from: 0000 */
    public abstract boolean e(int i2);

    /* access modifiers changed from: 0000 */
    public abstract void l();

    /* access modifiers changed from: 0000 */
    public android.view.Window.Callback a(android.view.Window.Callback callback) {
        return new defpackage.wr(this, callback);
    }

    public final defpackage.wa a() {
        l();
        return this.f;
    }

    public final android.view.MenuInflater b() {
        if (this.q == null) {
            l();
            this.q = new SupportMenuInflater(this.f != null ? this.f.d() : this.b);
        }
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public final android.content.Context m() {
        android.content.Context context = null;
        defpackage.wa a = a();
        if (a != null) {
            context = a.d();
        }
        if (context == null) {
            return this.b;
        }
        return context;
    }

    public void e() {
    }

    public void f() {
    }

    public void i() {
        this.m = true;
    }

    public boolean n() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.l = charSequence;
        b(charSequence);
    }

    public void b(android.os.Bundle bundle) {
    }

    static {
        if (android.os.Build.VERSION.SDK_INT < 21 && !n) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.wq(java.lang.Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
}
