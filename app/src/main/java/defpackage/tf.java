package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: tf  reason: default package */
/* compiled from: PG */
public final class tf extends AnimatorListenerAdapter {
    private final /* synthetic */ th a;

    tf(th thVar, View view) {
        this.a = thVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
