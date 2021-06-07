package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aei  reason: default package */
/* compiled from: PG */
public final class aei implements View.OnTouchListener {
    private final /* synthetic */ aec a;

    aei(aec aec) {
        this.a = aec;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.a.r != null && this.a.r.isShowing() && x >= 0 && x < this.a.r.getWidth() && y >= 0 && y < this.a.r.getHeight()) {
            this.a.o.postDelayed(this.a.n, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.a.o.removeCallbacks(this.a.n);
            return false;
        }
    }
}
