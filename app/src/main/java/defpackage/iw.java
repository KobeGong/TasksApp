package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* renamed from: iw  reason: default package */
/* compiled from: PG */
final class iw {
    private static final iz a;

    static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new iy();
        } else {
            a = new ix();
        }
    }
}
