package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: is  reason: default package */
/* compiled from: PG */
final class is extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    is(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        if (sn.a.i(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        kb.a(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }
}
