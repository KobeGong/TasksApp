package defpackage;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* renamed from: de  reason: default package */
/* compiled from: PG */
public class de extends di {
    private Runnable a;
    private boolean b;
    public OverScroller c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public de() {
    }

    public de(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.gx
    public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.b) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.b = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (b() && coordinatorLayout.a(view, x, y)) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    d();
                    break;
                }
            case 1:
            case 3:
                this.b = false;
                this.d = -1;
                if (this.g != null) {
                    this.g.recycle();
                    this.g = null;
                    break;
                }
                break;
            case 2:
                int i = this.d;
                if (!(i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1)) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    if (Math.abs(y2 - this.e) > this.f) {
                        this.b = true;
                        this.e = y2;
                        break;
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.b;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    @Override // defpackage.gx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.support.design.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final int a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        return a(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int a2;
        int c2 = c();
        if (i2 == 0 || c2 < i2 || c2 > i3 || c2 == (a2 = gm.a(i, i2, i3))) {
            return 0;
        }
        a_(a2);
        return c2 - a2;
    }

    public int a() {
        return c();
    }

    public final int b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return a(coordinatorLayout, view, a() - i, i2, i3);
    }

    public void a(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean b() {
        return false;
    }

    public int b(View view) {
        return -view.getHeight();
    }

    public int a(View view) {
        return view.getHeight();
    }

    private final void d() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }
}
