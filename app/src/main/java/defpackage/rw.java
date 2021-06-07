package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* access modifiers changed from: package-private */
/* renamed from: rw  reason: default package */
/* compiled from: PG */
public final class rw implements rv {
    private static final int l = ViewConfiguration.getLongPressTimeout();
    private static final int m = ViewConfiguration.getTapTimeout();
    private static final int n = ViewConfiguration.getDoubleTapTimeout();
    public final Handler a = new rx(this);
    public final GestureDetector.OnGestureListener b;
    public GestureDetector.OnDoubleTapListener c;
    public boolean d;
    public boolean e;
    public boolean f;
    public MotionEvent g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean o;
    private boolean p;
    private MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private VelocityTracker x;

    rw(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.b = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.c = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        } else if (this.b == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else {
            this.w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.j = viewConfiguration.getScaledMinimumFlingVelocity();
            this.k = viewConfiguration.getScaledMaximumFlingVelocity();
            this.h = scaledTouchSlop * scaledTouchSlop;
            this.i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014c  */
    @Override // defpackage.rv
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 724
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.a(android.view.MotionEvent):boolean");
    }
}
