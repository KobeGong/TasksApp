package defpackage;

/* renamed from: ty reason: default package */
/* compiled from: PG */
final class ty implements java.lang.Runnable {
    private final /* synthetic */ defpackage.tw a;

    ty(defpackage.tw twVar) {
        this.a = twVar;
    }

    public final void run() {
        boolean z;
        if (this.a.e) {
            if (this.a.c) {
                this.a.c = false;
                defpackage.tx txVar = this.a.a;
                txVar.e = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                txVar.h = -1;
                txVar.f = txVar.e;
                txVar.i = 0.5f;
                txVar.g = 0;
            }
            defpackage.tx txVar2 = this.a.a;
            if (txVar2.h <= 0 || android.view.animation.AnimationUtils.currentAnimationTimeMillis() <= txVar2.h + ((long) txVar2.j)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.a.a()) {
                this.a.e = false;
                return;
            }
            if (this.a.d) {
                this.a.d = false;
                defpackage.tw twVar = this.a;
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                twVar.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (txVar2.f == 0) {
                throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            float a2 = txVar2.a(currentAnimationTimeMillis);
            float f = (a2 * 4.0f) + (-4.0f * a2 * a2);
            long j = currentAnimationTimeMillis - txVar2.f;
            txVar2.f = currentAnimationTimeMillis;
            txVar2.g = (int) (((float) j) * f * txVar2.d);
            this.a.a(txVar2.g);
            defpackage.sn.a(this.a.b, (java.lang.Runnable) this);
        }
    }
}
