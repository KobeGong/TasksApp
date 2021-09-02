package defpackage;

/* renamed from: xf reason: default package */
/* compiled from: PG */
final class xf extends android.support.v7.widget.ContentFrameLayout {
    private final /* synthetic */ defpackage.wz i;

    public xf(defpackage.wz wzVar, android.content.Context context) {
        this.i = wzVar;
        super(context);
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.i.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                defpackage.wz wzVar = this.i;
                wzVar.a(wzVar.g(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(defpackage.xw.b(getContext(), i2));
    }
}
