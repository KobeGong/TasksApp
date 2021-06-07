package android.support.design.behavior;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
public class SwipeDismissBehavior extends gx {
    public vv a;
    public dn b;
    public int c = 2;
    public float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    private boolean g;
    private final vy h = new dm(this);

    public final void a() {
        this.e = a(0.1f);
    }

    public final void b() {
        this.f = a(0.6f);
    }

    @Override // defpackage.gx
    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
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
            this.a = vv.a(coordinatorLayout, this.h);
        }
        return this.a.a(motionEvent);
    }

    @Override // defpackage.gx
    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        this.a.b(motionEvent);
        return true;
    }

    public boolean b(View view) {
        return true;
    }

    public static float a(float f2) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }
}
