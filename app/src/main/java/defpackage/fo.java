package defpackage;

/* renamed from: fo reason: default package */
/* compiled from: PG */
final class fo implements defpackage.sl {
    private final /* synthetic */ defpackage.fn a;

    fo(defpackage.fn fnVar) {
        this.a = fnVar;
    }

    public final defpackage.tk a(android.view.View view, defpackage.tk tkVar) {
        boolean z;
        boolean z2;
        if (this.a.b == null) {
            this.a.b = new android.graphics.Rect();
        }
        this.a.b.set(tkVar.a(), tkVar.b(), tkVar.c(), tkVar.d());
        this.a.a(tkVar);
        defpackage.fn fnVar = this.a;
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            z = ((android.view.WindowInsets) tkVar.a).hasSystemWindowInsets();
        } else {
            z = false;
        }
        if (!z || this.a.a == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fnVar.setWillNotDraw(z2);
        defpackage.sn.a.c(this.a);
        return tkVar.f();
    }
}
