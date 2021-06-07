package defpackage;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* access modifiers changed from: package-private */
/* renamed from: xf  reason: default package */
/* compiled from: PG */
public final class xf extends ContentFrameLayout {
    private final /* synthetic */ wz i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xf(wz wzVar, Context context) {
        super(context);
        this.i = wzVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                wz wzVar = this.i;
                wzVar.a(wzVar.g(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(xw.b(getContext(), i2));
    }
}
