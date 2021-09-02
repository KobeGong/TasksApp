package android.support.design.behavior;

/* compiled from: PG */
public class SwipeDismissBehavior extends defpackage.gx {
    public defpackage.vv a;
    public defpackage.dn b;
    public int c = 2;
    public float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private boolean g;
    private final defpackage.vy h = new defpackage.dm(this);

    public final void a() {
        this.e = a(0.1f);
    }

    public final void b() {
        this.f = a(0.6f);
    }

    public boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z = this.g;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.g = coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.g;
                break;
            case 1:
            case 3:
                this.g = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = defpackage.vv.a((android.view.ViewGroup) coordinatorLayout, this.h);
        }
        return this.a.a(motionEvent);
    }

    public final boolean b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        this.a.b(motionEvent);
        return true;
    }

    public boolean b(android.view.View view) {
        return true;
    }

    public static float a(float f2) {
        return java.lang.Math.min(java.lang.Math.max(0.0f, f2), 1.0f);
    }
}
