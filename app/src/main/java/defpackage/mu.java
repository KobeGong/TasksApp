package defpackage;

/* renamed from: mu reason: default package */
/* compiled from: PG */
final class mu extends android.transition.Transition.EpicenterCallback {
    private final /* synthetic */ android.graphics.Rect a;

    mu(android.graphics.Rect rect) {
        this.a = rect;
    }

    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        if (this.a == null || this.a.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
