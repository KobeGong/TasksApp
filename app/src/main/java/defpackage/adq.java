package defpackage;

/* renamed from: adq reason: default package */
/* compiled from: PG */
final class adq implements java.lang.Runnable {
    private final /* synthetic */ defpackage.ado a;

    adq(defpackage.ado ado) {
        this.a = ado;
    }

    public final void run() {
        defpackage.ado ado = this.a;
        ado.d();
        android.view.View view = ado.a;
        if (view.isEnabled() && !view.isLongClickable() && ado.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            ado.b = true;
        }
    }
}
