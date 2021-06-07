package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: ru  reason: default package */
/* compiled from: PG */
public final class ru {
    private final rv a;

    public ru(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private ru(Context context, GestureDetector.OnGestureListener onGestureListener, byte b) {
        if (Build.VERSION.SDK_INT > 17) {
            this.a = new ry(context, onGestureListener);
        } else {
            this.a = new rw(context, onGestureListener);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
