package defpackage;

/* renamed from: ix reason: default package */
/* compiled from: PG */
final class ix implements defpackage.iz {
    ix() {
    }

    public final android.animation.ObjectAnimator a(java.lang.Object obj, android.util.Property property, android.graphics.Path path) {
        return android.animation.ObjectAnimator.ofFloat(obj, new defpackage.jb(property, path), new float[]{0.0f, 1.0f});
    }
}
