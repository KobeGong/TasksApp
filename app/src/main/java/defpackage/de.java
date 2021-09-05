package defpackage;

/* renamed from: de reason: default package */
/* compiled from: PG */
public class de extends defpackage.di {
    private java.lang.Runnable a;
    private boolean b;
    public android.widget.OverScroller c;
    private int d = -1;
    private int e;
    private int f = -1;
    private android.view.VelocityTracker g;

    public de() {
    }

    public de(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
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
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (java.lang.Math.abs(y2 - this.e) > this.f) {
                            this.b = true;
                            this.e = y2;
                            break;
                        }
                    }
                }
                break;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return this.b;
    }

    public final boolean b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.a(view, (int) motionEvent.getX(), y) && b()) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    d();
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                if (this.g != null) {
                    this.g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    float yVelocity = this.g.getYVelocity(this.d);
                    int i = -a(view);
                    if (this.a != null) {
                        view.removeCallbacks(this.a);
                        this.a = null;
                    }
                    if (this.c == null) {
                        this.c = new android.widget.OverScroller(view.getContext());
                    }
                    this.c.fling(0, c(), 0, java.lang.Math.round(yVelocity), 0, 0, i, 0);
                    if (!this.c.computeScrollOffset()) {
                        a(coordinatorLayout, view);
                        break;
                    } else {
                        this.a = new defpackage.df(this, coordinatorLayout, view);
                        ViewCompat.a(view, this.a);
                        break;
                    }
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.d);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.e - y2;
                    if (!this.b && java.lang.Math.abs(i2) > this.f) {
                        this.b = true;
                        i2 = i2 > 0 ? i2 - this.f : i2 + this.f;
                    }
                    if (this.b) {
                        this.e = y2;
                        b(coordinatorLayout, view, i2, b(view), 0);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 3:
                break;
        }
        this.b = false;
        this.d = -1;
        if (this.g != null) {
            this.g.recycle();
            this.g = null;
        }
        if (this.g != null) {
            this.g.addMovement(motionEvent);
        }
        return true;
    }

    public final int a_(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        return a(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        int c2 = c();
        if (i2 == 0 || c2 < i2 || c2 > i3) {
            return 0;
        }
        int a2 = defpackage.gm.a(i, i2, i3);
        if (c2 == a2) {
            return 0;
        }
        a_(a2);
        return c2 - a2;
    }

    public int a() {
        return c();
    }

    public final int b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        return a(coordinatorLayout, view, a() - i, i2, i3);
    }

    public void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
    }

    public boolean b() {
        return false;
    }

    public int b(android.view.View view) {
        return -view.getHeight();
    }

    public int a(android.view.View view) {
        return view.getHeight();
    }

    private final void d() {
        if (this.g == null) {
            this.g = android.view.VelocityTracker.obtain();
        }
    }
}
