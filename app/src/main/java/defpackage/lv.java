package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: lv  reason: default package */
/* compiled from: PG */
public final class lv extends lx {
    public View a;

    lv(View view, Animation.AnimationListener animationListener) {
        super(animationListener);
        this.a = view;
    }

    @Override // defpackage.lx
    public final void onAnimationEnd(Animation animation) {
        if (sn.a.s(this.a) || Build.VERSION.SDK_INT >= 24) {
            this.a.post(new lw(this));
        } else {
            this.a.setLayerType(0, null);
        }
        super.onAnimationEnd(animation);
    }
}
