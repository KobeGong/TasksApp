package defpackage;

/* renamed from: ru reason: default package */
/* compiled from: PG */
public final class ru {
    private final defpackage.rv a;

    public ru(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, 0);
    }

    private ru(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener, byte b) {
        if (android.os.Build.VERSION.SDK_INT > 17) {
            this.a = new defpackage.ry(context, onGestureListener);
        } else {
            this.a = new defpackage.rw(context, onGestureListener);
        }
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
