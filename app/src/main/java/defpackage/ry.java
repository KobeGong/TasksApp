package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: ry  reason: default package */
/* compiled from: PG */
public final class ry implements rv {
    private final GestureDetector a;

    ry(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    @Override // defpackage.rv
    public final boolean a(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
