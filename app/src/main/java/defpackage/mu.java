package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: mu  reason: default package */
/* compiled from: PG */
final class mu extends Transition.EpicenterCallback {
    private final /* synthetic */ Rect a;

    mu(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        if (this.a == null || this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
