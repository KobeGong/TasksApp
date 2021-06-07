package defpackage;

import android.animation.Animator;
import android.view.animation.Animation;

/* access modifiers changed from: package-private */
/* renamed from: ly  reason: default package */
/* compiled from: PG */
public final class ly {
    public final Animation a;
    public final Animator b;

    ly(Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    ly(Animator animator) {
        this.a = null;
        this.b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
