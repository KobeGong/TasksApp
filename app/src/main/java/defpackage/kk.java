package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: kk  reason: default package */
/* compiled from: PG */
final class kk extends AnimatorListenerAdapter {
    private final /* synthetic */ ju a;
    private final /* synthetic */ View b;

    kk(ju juVar, View view) {
        this.a = juVar;
        this.b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }
}
