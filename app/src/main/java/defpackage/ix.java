package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/* renamed from: ix  reason: default package */
/* compiled from: PG */
final class ix implements iz {
    ix() {
    }

    @Override // defpackage.iz
    public final ObjectAnimator a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofFloat(obj, new jb(property, path), 0.0f, 1.0f);
    }
}
