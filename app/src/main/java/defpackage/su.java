package defpackage;

/* renamed from: su reason: default package */
/* compiled from: PG */
final class su implements android.view.View.OnApplyWindowInsetsListener {
    private final /* synthetic */ OnApplyWindowInsetsListener a;

    su(OnApplyWindowInsetsListener slVar) {
        this.a = slVar;
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        return (android.view.WindowInsets) WindowInsetsCompat.a(this.a.onApplyWindowInsets(view, WindowInsetsCompat.a((java.lang.Object) windowInsets)));
    }
}
