package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: aub  reason: default package */
public final /* synthetic */ class aub implements View.OnTouchListener {
    private final atx a;

    aub(atx atx) {
        this.a = atx;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        atx atx = this.a;
        atx.B = motionEvent.getX();
        atx.C = motionEvent.getY();
        return false;
    }
}
