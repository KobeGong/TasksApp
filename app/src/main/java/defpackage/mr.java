package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: mr  reason: default package */
/* compiled from: PG */
final class mr extends Transition.EpicenterCallback {
    private final /* synthetic */ Rect a;

    mr(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
