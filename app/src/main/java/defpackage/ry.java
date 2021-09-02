package defpackage;

/* renamed from: ry reason: default package */
/* compiled from: PG */
final class ry implements defpackage.rv {
    private final android.view.GestureDetector a;

    ry(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this.a = new android.view.GestureDetector(context, onGestureListener, null);
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
