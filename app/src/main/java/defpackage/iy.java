package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: iy  reason: default package */
/* compiled from: PG */
final class iy implements iz {
    iy() {
    }

    @Override // defpackage.iz
    public final ObjectAnimator a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}
