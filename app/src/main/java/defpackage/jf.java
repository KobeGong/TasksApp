package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: jf  reason: default package */
/* compiled from: PG */
public final class jf extends AnimatorListenerAdapter {
    private final /* synthetic */ qr a;
    private final /* synthetic */ je b;

    jf(je jeVar, qr qrVar) {
        this.b = jeVar;
        this.a = qrVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.k.add(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.k.remove(animator);
    }
}
