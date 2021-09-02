package defpackage;

/* renamed from: iw reason: default package */
/* compiled from: PG */
final class iw {
    private static final defpackage.iz a;

    static android.animation.ObjectAnimator a(java.lang.Object obj, android.util.Property property, android.graphics.Path path) {
        return a.a(obj, property, path);
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.iy();
        } else {
            a = new defpackage.ix();
        }
    }
}
