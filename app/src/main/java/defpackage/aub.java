package defpackage;

/* renamed from: aub reason: default package */
final /* synthetic */ class aub implements android.view.View.OnTouchListener {
    private final defpackage.atx a;

    aub(defpackage.atx atx) {
        this.a = atx;
    }

    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        defpackage.atx atx = this.a;
        atx.B = motionEvent.getX();
        atx.C = motionEvent.getY();
        return false;
    }
}
