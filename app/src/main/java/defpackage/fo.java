package defpackage;

/* renamed from: fo reason: default package */
/* compiled from: PG */
final class fo implements OnApplyWindowInsetsListener {
    private final /* synthetic */ ScrimInsetsFrameLayout a;

    fo(ScrimInsetsFrameLayout fnVar) {
        this.a = fnVar;
    }

    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat tkVar) {
        boolean z;
        boolean z2;
        if (this.a.insets == null) {
            this.a.insets = new android.graphics.Rect();
        }
        this.a.insets.set(tkVar.a(), tkVar.b(), tkVar.c(), tkVar.d());
        this.a.a(tkVar);
        ScrimInsetsFrameLayout fnVar = this.a;
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            z = ((android.view.WindowInsets) tkVar.a).hasSystemWindowInsets();
        } else {
            z = false;
        }
        if (!z || this.a.insetForeground == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fnVar.setWillNotDraw(z2);
        ViewCompat.a.c(this.a);
        return tkVar.f();
    }
}
