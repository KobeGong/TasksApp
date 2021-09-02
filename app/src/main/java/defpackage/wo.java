package defpackage;

/* renamed from: wo reason: default package */
/* compiled from: PG */
public abstract class wo {
    public static int a = -1;

    static defpackage.wo a(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return new defpackage.ws(context, window, wnVar);
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return new defpackage.wx(context, window, wnVar);
        }
        return new defpackage.wu(context, window, wnVar);
    }

    public abstract android.view.View a(int i);

    public abstract defpackage.wa a();

    public abstract void a(android.os.Bundle bundle);

    public abstract void a(android.view.View view);

    public abstract void a(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void a(java.lang.CharSequence charSequence);

    public abstract android.view.MenuInflater b();

    public abstract void b(int i);

    public abstract void b(android.os.Bundle bundle);

    public abstract void b(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract boolean k();

    wo() {
    }
}
