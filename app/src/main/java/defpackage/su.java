package defpackage;

/* renamed from: su reason: default package */
/* compiled from: PG */
final class su implements android.view.View.OnApplyWindowInsetsListener {
    private final /* synthetic */ defpackage.sl a;

    su(defpackage.sl slVar) {
        this.a = slVar;
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        return (android.view.WindowInsets) defpackage.tk.a(this.a.a(view, defpackage.tk.a((java.lang.Object) windowInsets)));
    }
}
