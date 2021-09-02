package defpackage;

/* renamed from: mr reason: default package */
/* compiled from: PG */
final class mr extends android.transition.Transition.EpicenterCallback {
    private final /* synthetic */ android.graphics.Rect a;

    mr(android.graphics.Rect rect) {
        this.a = rect;
    }

    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        return this.a;
    }
}
