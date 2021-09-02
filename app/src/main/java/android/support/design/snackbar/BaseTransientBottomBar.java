package android.support.design.snackbar;

/* compiled from: PG */
public class BaseTransientBottomBar {
    public final defpackage.gs a;

    /* compiled from: PG */
    public class Behavior extends android.support.design.behavior.SwipeDismissBehavior {
        private final defpackage.ba g = new defpackage.ba(this);

        public final boolean b(android.view.View view) {
            return view instanceof defpackage.go;
        }

        public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        defpackage.gq.a().b();
                        break;
                    }
                    break;
                case 1:
                case 3:
                    defpackage.gq.a().c();
                    break;
            }
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    public static void a() {
        throw new java.lang.NoSuchMethodError();
    }

    public static void b() {
        throw new java.lang.NoSuchMethodError();
    }

    public static void c() {
        throw new java.lang.NoSuchMethodError();
    }

    static {
        new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.gj());
    }
}
