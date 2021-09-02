package defpackage;

/* renamed from: ly reason: default package */
/* compiled from: PG */
final class ly {
    public final android.view.animation.Animation a;
    public final android.animation.Animator b;

    ly(android.view.animation.Animation animation) {
        this.a = animation;
        this.b = null;
        if (animation == null) {
            throw new java.lang.IllegalStateException("Animation cannot be null");
        }
    }

    ly(android.animation.Animator animator) {
        this.a = null;
        this.b = animator;
        if (animator == null) {
            throw new java.lang.IllegalStateException("Animator cannot be null");
        }
    }
}
