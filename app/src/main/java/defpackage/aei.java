package defpackage;

/* renamed from: aei reason: default package */
/* compiled from: PG */
final class aei implements android.view.View.OnTouchListener {
    private final /* synthetic */ defpackage.aec a;

    aei(defpackage.aec aec) {
        this.a = aec;
    }

    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.a.r != null && this.a.r.isShowing() && x >= 0 && x < this.a.r.getWidth() && y >= 0 && y < this.a.r.getHeight()) {
            this.a.o.postDelayed(this.a.n, 250);
        } else if (action == 1) {
            this.a.o.removeCallbacks(this.a.n);
        }
        return false;
    }
}
