package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: xt  reason: default package */
/* compiled from: PG */
public final class xt implements sl {
    private final /* synthetic */ wz a;

    public xt(wz wzVar) {
        this.a = wzVar;
    }

    @Override // defpackage.sl
    public final tk a(View view, tk tkVar) {
        tk tkVar2;
        int b = tkVar.b();
        int i = this.a.i(b);
        if (b != i) {
            tkVar2 = Build.VERSION.SDK_INT >= 20 ? new tk(((WindowInsets) tkVar.a).replaceSystemWindowInsets(tkVar.a(), i, tkVar.c(), tkVar.d())) : null;
        } else {
            tkVar2 = tkVar;
        }
        return sn.a.a(view, tkVar2);
    }
}
