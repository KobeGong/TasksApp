package defpackage;

/* renamed from: aib reason: default package */
/* compiled from: PG */
final class aib extends android.view.GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    private final /* synthetic */ defpackage.aht b;

    aib(defpackage.aht aht) {
        this.b = aht;
    }

    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(android.view.MotionEvent motionEvent) {
        if (this.a) {
            android.view.View a2 = this.b.a(motionEvent);
            if (a2 != null) {
                RecyclerViewHolder a3 = this.b.o.a(a2);
                if (a3 != null) {
                    if (((this.b.j.a(this.b.o, a3) & 16711680) != 0) && motionEvent.getPointerId(0) == this.b.i) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.b.i);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        this.b.c = x;
                        this.b.d = y;
                        defpackage.aht aht = this.b;
                        this.b.f = 0.0f;
                        aht.e = 0.0f;
                        this.b.j.b();
                        this.b.a(a3, 2);
                    }
                }
            }
        }
    }
}
