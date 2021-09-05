package defpackage;

/* renamed from: xt reason: default package */
/* compiled from: PG */
public final class xt implements OnApplyWindowInsetsListener {
    private final /* synthetic */ defpackage.wz a;

    public xt(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat tkVar) {
        WindowInsetsCompat tkVar2;
        int b = tkVar.b();
        int i = this.a.i(b);
        if (b != i) {
            tkVar2 = android.os.Build.VERSION.SDK_INT >= 20 ? new WindowInsetsCompat(((android.view.WindowInsets) tkVar.a).replaceSystemWindowInsets(tkVar.a(), i, tkVar.c(), tkVar.d())) : null;
        } else {
            tkVar2 = tkVar;
        }
        return ViewCompat.a.a(view, tkVar2);
    }
}
