package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ago  reason: default package */
/* compiled from: PG */
public final class ago extends TouchDelegate {
    private final View a;
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final int e;
    private boolean f;

    public ago(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(Rect rect, Rect rect2) {
        this.b.set(rect);
        this.d.set(rect);
        this.d.inset(-this.e, -this.e);
        this.c.set(rect2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                    break;
                }
                z = false;
                break;
            case 1:
            case 2:
                z = this.f;
                if (z && !this.d.contains(x, y)) {
                    z2 = false;
                    break;
                }
            case 3:
                z = this.f;
                this.f = false;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (!z2 || this.c.contains(x, y)) {
            motionEvent.setLocation((float) (x - this.c.left), (float) (y - this.c.top));
        } else {
            motionEvent.setLocation((float) (this.a.getWidth() / 2), (float) (this.a.getHeight() / 2));
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
