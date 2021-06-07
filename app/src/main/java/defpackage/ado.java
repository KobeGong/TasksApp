package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ado  reason: default package */
/* compiled from: PG */
public abstract class ado implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final View a;
    public boolean b;
    private final float c;
    private final int d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public ado(View view) {
        this.a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.d = ViewConfiguration.getTapTimeout();
        this.e = (this.d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract zz a();

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ado.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.b = false;
        this.h = -1;
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }

    public boolean b() {
        zz a2 = a();
        if (a2 == null || a2.f()) {
            return true;
        }
        a2.d();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        zz a2 = a();
        if (a2 == null || !a2.f()) {
            return true;
        }
        a2.e();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.g != null) {
            this.a.removeCallbacks(this.g);
        }
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }
}
