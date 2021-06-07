package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: fo  reason: default package */
/* compiled from: PG */
final class fo implements sl {
    private final /* synthetic */ fn a;

    fo(fn fnVar) {
        this.a = fnVar;
    }

    @Override // defpackage.sl
    public final tk a(View view, tk tkVar) {
        boolean z;
        boolean z2;
        if (this.a.b == null) {
            this.a.b = new Rect();
        }
        this.a.b.set(tkVar.a(), tkVar.b(), tkVar.c(), tkVar.d());
        this.a.a(tkVar);
        fn fnVar = this.a;
        if (Build.VERSION.SDK_INT >= 20) {
            z = ((WindowInsets) tkVar.a).hasSystemWindowInsets();
        } else {
            z = false;
        }
        if (!z || this.a.a == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fnVar.setWillNotDraw(z2);
        sn.a.c(this.a);
        return tkVar.f();
    }
}
