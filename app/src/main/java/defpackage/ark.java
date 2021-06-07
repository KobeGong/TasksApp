package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: ark  reason: default package */
/* compiled from: PG */
public final class ark extends AnimatorListenerAdapter {
    private final /* synthetic */ ard a;

    ark(ard ard) {
        this.a = ard;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.d();
    }
}
