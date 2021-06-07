package android.support.design.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
public class BaseTransientBottomBar {
    public final gs a;

    public static void a() {
        throw new NoSuchMethodError();
    }

    public static void b() {
        throw new NoSuchMethodError();
    }

    public static void c() {
        throw new NoSuchMethodError();
    }

    /* compiled from: PG */
    public class Behavior extends SwipeDismissBehavior {
        private final ba g = new ba(this);

        @Override // android.support.design.behavior.SwipeDismissBehavior
        public final boolean b(View view) {
            return view instanceof go;
        }

        @Override // defpackage.gx, android.support.design.behavior.SwipeDismissBehavior
        public final boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        gq.a().b();
                        break;
                    }
                    break;
                case 1:
                case 3:
                    gq.a().c();
                    break;
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    static {
        new Handler(Looper.getMainLooper(), new gj());
    }
}
