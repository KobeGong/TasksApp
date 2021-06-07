package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aib  reason: default package */
/* compiled from: PG */
public final class aib extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    private final /* synthetic */ aht b;

    aib(aht aht) {
        this.b = aht;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        View a2;
        afv a3;
        if (this.a && (a2 = this.b.a(motionEvent)) != null && (a3 = this.b.o.a(a2)) != null) {
            if (((this.b.j.a(this.b.o, a3) & 16711680) != 0) && motionEvent.getPointerId(0) == this.b.i) {
                int findPointerIndex = motionEvent.findPointerIndex(this.b.i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                this.b.c = x;
                this.b.d = y;
                aht aht = this.b;
                this.b.f = 0.0f;
                aht.e = 0.0f;
                this.b.j.b();
                this.b.a(a3, 2);
            }
        }
    }
}
