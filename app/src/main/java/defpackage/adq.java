package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: adq  reason: default package */
/* compiled from: PG */
public final class adq implements Runnable {
    private final /* synthetic */ ado a;

    adq(ado ado) {
        this.a = ado;
    }

    public final void run() {
        ado ado = this.a;
        ado.d();
        View view = ado.a;
        if (view.isEnabled() && !view.isLongClickable() && ado.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            ado.b = true;
        }
    }
}
