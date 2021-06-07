package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* access modifiers changed from: package-private */
/* renamed from: ty  reason: default package */
/* compiled from: PG */
public final class ty implements Runnable {
    private final /* synthetic */ tw a;

    ty(tw twVar) {
        this.a = twVar;
    }

    public final void run() {
        boolean z;
        if (this.a.e) {
            if (this.a.c) {
                this.a.c = false;
                tx txVar = this.a.a;
                txVar.e = AnimationUtils.currentAnimationTimeMillis();
                txVar.h = -1;
                txVar.f = txVar.e;
                txVar.i = 0.5f;
                txVar.g = 0;
            }
            tx txVar2 = this.a.a;
            if (txVar2.h <= 0 || AnimationUtils.currentAnimationTimeMillis() <= txVar2.h + ((long) txVar2.j)) {
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
                tw twVar = this.a;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                twVar.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (txVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a2 = txVar2.a(currentAnimationTimeMillis);
            txVar2.f = currentAnimationTimeMillis;
            txVar2.g = (int) (((float) (currentAnimationTimeMillis - txVar2.f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2)) * txVar2.d);
            this.a.a(txVar2.g);
            sn.a(this.a.b, this);
        }
    }
}
