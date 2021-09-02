package defpackage;

/* renamed from: rw reason: default package */
/* compiled from: PG */
final class rw implements defpackage.rv {
    private static final int l = android.view.ViewConfiguration.getLongPressTimeout();
    private static final int m = android.view.ViewConfiguration.getTapTimeout();
    private static final int n = android.view.ViewConfiguration.getDoubleTapTimeout();
    public final android.os.Handler a = new defpackage.rx(this);
    public final android.view.GestureDetector.OnGestureListener b;
    public android.view.GestureDetector.OnDoubleTapListener c;
    public boolean d;
    public boolean e;
    public boolean f;
    public android.view.MotionEvent g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean o;
    private boolean p;
    private android.view.MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private android.view.VelocityTracker x;

    rw(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this.b = onGestureListener;
        if (onGestureListener instanceof android.view.GestureDetector.OnDoubleTapListener) {
            this.c = (android.view.GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        } else if (this.b == null) {
            throw new java.lang.IllegalArgumentException("OnGestureListener must not be null");
        } else {
            this.w = true;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r14) {
        /*
            r13 = this;
            r7 = 0
            r12 = 2
            r11 = 3
            r4 = 1
            r3 = 0
            int r9 = r14.getAction()
            android.view.VelocityTracker r0 = r13.x
            if (r0 != 0) goto L_0x0013
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.x = r0
        L_0x0013:
            android.view.VelocityTracker r0 = r13.x
            r0.addMovement(r14)
            r0 = r9 & 255(0xff, float:3.57E-43)
            r1 = 6
            if (r0 != r1) goto L_0x003c
            r8 = r4
        L_0x001e:
            if (r8 == 0) goto L_0x003e
            int r0 = r14.getActionIndex()
        L_0x0024:
            int r5 = r14.getPointerCount()
            r6 = r3
            r1 = r7
            r2 = r7
        L_0x002b:
            if (r6 >= r5) goto L_0x0040
            if (r0 == r6) goto L_0x0039
            float r10 = r14.getX(r6)
            float r2 = r2 + r10
            float r10 = r14.getY(r6)
            float r1 = r1 + r10
        L_0x0039:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x003c:
            r8 = r3
            goto L_0x001e
        L_0x003e:
            r0 = -1
            goto L_0x0024
        L_0x0040:
            if (r8 == 0) goto L_0x004e
            int r0 = r5 + -1
        L_0x0044:
            float r6 = (float) r0
            float r2 = r2 / r6
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = r9 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x01fe;
                case 2: goto L_0x0189;
                case 3: goto L_0x0293;
                case 4: goto L_0x004d;
                case 5: goto L_0x0050;
                case 6: goto L_0x0076;
                default: goto L_0x004d;
            }
        L_0x004d:
            return r3
        L_0x004e:
            r0 = r5
            goto L_0x0044
        L_0x0050:
            r13.s = r2
            r13.u = r2
            r13.t = r1
            r13.v = r1
            android.os.Handler r0 = r13.a
            r0.removeMessages(r4)
            android.os.Handler r0 = r13.a
            r0.removeMessages(r12)
            android.os.Handler r0 = r13.a
            r0.removeMessages(r11)
            r13.r = r3
            r13.o = r3
            r13.p = r3
            r13.e = r3
            boolean r0 = r13.f
            if (r0 == 0) goto L_0x004d
            r13.f = r3
            goto L_0x004d
        L_0x0076:
            r13.s = r2
            r13.u = r2
            r13.t = r1
            r13.v = r1
            android.view.VelocityTracker r0 = r13.x
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r13.k
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            int r1 = r14.getActionIndex()
            int r0 = r14.getPointerId(r1)
            android.view.VelocityTracker r2 = r13.x
            float r2 = r2.getXVelocity(r0)
            android.view.VelocityTracker r4 = r13.x
            float r4 = r4.getYVelocity(r0)
            r0 = r3
        L_0x009d:
            if (r0 >= r5) goto L_0x004d
            if (r0 == r1) goto L_0x00be
            int r6 = r14.getPointerId(r0)
            android.view.VelocityTracker r8 = r13.x
            float r8 = r8.getXVelocity(r6)
            float r8 = r8 * r2
            android.view.VelocityTracker r9 = r13.x
            float r6 = r9.getYVelocity(r6)
            float r6 = r6 * r4
            float r6 = r6 + r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00be
            android.view.VelocityTracker r0 = r13.x
            r0.clear()
            goto L_0x004d
        L_0x00be:
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00c1:
            android.view.GestureDetector$OnDoubleTapListener r0 = r13.c
            if (r0 == 0) goto L_0x0187
            android.os.Handler r0 = r13.a
            boolean r0 = r0.hasMessages(r11)
            if (r0 == 0) goto L_0x00d2
            android.os.Handler r5 = r13.a
            r5.removeMessages(r11)
        L_0x00d2:
            android.view.MotionEvent r5 = r13.g
            if (r5 == 0) goto L_0x017f
            android.view.MotionEvent r5 = r13.q
            if (r5 == 0) goto L_0x017f
            if (r0 == 0) goto L_0x017f
            android.view.MotionEvent r0 = r13.g
            android.view.MotionEvent r5 = r13.q
            boolean r6 = r13.p
            if (r6 == 0) goto L_0x017d
            long r6 = r14.getEventTime()
            long r8 = r5.getEventTime()
            long r6 = r6 - r8
            int r5 = n
            long r8 = (long) r5
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x017d
            float r5 = r0.getX()
            int r5 = (int) r5
            float r6 = r14.getX()
            int r6 = (int) r6
            int r5 = r5 - r6
            float r0 = r0.getY()
            int r0 = (int) r0
            float r6 = r14.getY()
            int r6 = (int) r6
            int r0 = r0 - r6
            int r5 = r5 * r5
            int r0 = r0 * r0
            int r0 = r0 + r5
            int r5 = r13.i
            if (r0 >= r5) goto L_0x017d
            r0 = r4
        L_0x0112:
            if (r0 == 0) goto L_0x017f
            r13.r = r4
            android.view.GestureDetector$OnDoubleTapListener r0 = r13.c
            android.view.MotionEvent r5 = r13.g
            boolean r0 = r0.onDoubleTap(r5)
            r0 = r0 | 0
            android.view.GestureDetector$OnDoubleTapListener r5 = r13.c
            boolean r5 = r5.onDoubleTapEvent(r14)
            r0 = r0 | r5
        L_0x0127:
            r13.s = r2
            r13.u = r2
            r13.t = r1
            r13.v = r1
            android.view.MotionEvent r1 = r13.g
            if (r1 == 0) goto L_0x0138
            android.view.MotionEvent r1 = r13.g
            r1.recycle()
        L_0x0138:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
            r13.g = r1
            r13.o = r4
            r13.p = r4
            r13.d = r4
            r13.f = r3
            r13.e = r3
            boolean r1 = r13.w
            if (r1 == 0) goto L_0x0164
            android.os.Handler r1 = r13.a
            r1.removeMessages(r12)
            android.os.Handler r1 = r13.a
            android.view.MotionEvent r2 = r13.g
            long r2 = r2.getDownTime()
            int r5 = m
            long r6 = (long) r5
            long r2 = r2 + r6
            int r5 = l
            long r6 = (long) r5
            long r2 = r2 + r6
            r1.sendEmptyMessageAtTime(r12, r2)
        L_0x0164:
            android.os.Handler r1 = r13.a
            android.view.MotionEvent r2 = r13.g
            long r2 = r2.getDownTime()
            int r5 = m
            long r6 = (long) r5
            long r2 = r2 + r6
            r1.sendEmptyMessageAtTime(r4, r2)
            android.view.GestureDetector$OnGestureListener r1 = r13.b
            boolean r1 = r1.onDown(r14)
            r3 = r0 | r1
            goto L_0x004d
        L_0x017d:
            r0 = r3
            goto L_0x0112
        L_0x017f:
            android.os.Handler r0 = r13.a
            int r5 = n
            long r6 = (long) r5
            r0.sendEmptyMessageDelayed(r11, r6)
        L_0x0187:
            r0 = r3
            goto L_0x0127
        L_0x0189:
            boolean r0 = r13.f
            if (r0 != 0) goto L_0x004d
            float r0 = r13.s
            float r0 = r0 - r2
            float r5 = r13.t
            float r5 = r5 - r1
            boolean r6 = r13.r
            if (r6 == 0) goto L_0x01a1
            android.view.GestureDetector$OnDoubleTapListener r0 = r13.c
            boolean r0 = r0.onDoubleTapEvent(r14)
            r3 = r0 | 0
            goto L_0x004d
        L_0x01a1:
            boolean r6 = r13.o
            if (r6 == 0) goto L_0x01dc
            float r6 = r13.u
            float r6 = r2 - r6
            int r6 = (int) r6
            float r7 = r13.v
            float r7 = r1 - r7
            int r7 = (int) r7
            int r6 = r6 * r6
            int r7 = r7 * r7
            int r6 = r6 + r7
            int r7 = r13.h
            if (r6 <= r7) goto L_0x02bf
            android.view.GestureDetector$OnGestureListener r7 = r13.b
            android.view.MotionEvent r8 = r13.g
            boolean r0 = r7.onScroll(r8, r14, r0, r5)
            r13.s = r2
            r13.t = r1
            r13.o = r3
            android.os.Handler r1 = r13.a
            r1.removeMessages(r11)
            android.os.Handler r1 = r13.a
            r1.removeMessages(r4)
            android.os.Handler r1 = r13.a
            r1.removeMessages(r12)
        L_0x01d3:
            int r1 = r13.h
            if (r6 <= r1) goto L_0x01d9
            r13.p = r3
        L_0x01d9:
            r3 = r0
            goto L_0x004d
        L_0x01dc:
            float r4 = java.lang.Math.abs(r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f0
            float r4 = java.lang.Math.abs(r5)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x004d
        L_0x01f0:
            android.view.GestureDetector$OnGestureListener r3 = r13.b
            android.view.MotionEvent r4 = r13.g
            boolean r3 = r3.onScroll(r4, r14, r0, r5)
            r13.s = r2
            r13.t = r1
            goto L_0x004d
        L_0x01fe:
            r13.d = r3
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
            boolean r0 = r13.r
            if (r0 == 0) goto L_0x0238
            android.view.GestureDetector$OnDoubleTapListener r0 = r13.c
            boolean r0 = r0.onDoubleTapEvent(r14)
            r0 = r0 | 0
        L_0x0210:
            android.view.MotionEvent r2 = r13.q
            if (r2 == 0) goto L_0x0219
            android.view.MotionEvent r2 = r13.q
            r2.recycle()
        L_0x0219:
            r13.q = r1
            android.view.VelocityTracker r1 = r13.x
            if (r1 == 0) goto L_0x0227
            android.view.VelocityTracker r1 = r13.x
            r1.recycle()
            r1 = 0
            r13.x = r1
        L_0x0227:
            r13.r = r3
            r13.e = r3
            android.os.Handler r1 = r13.a
            r1.removeMessages(r4)
            android.os.Handler r1 = r13.a
            r1.removeMessages(r12)
            r3 = r0
            goto L_0x004d
        L_0x0238:
            boolean r0 = r13.f
            if (r0 == 0) goto L_0x0245
            android.os.Handler r0 = r13.a
            r0.removeMessages(r11)
            r13.f = r3
            r0 = r3
            goto L_0x0210
        L_0x0245:
            boolean r0 = r13.o
            if (r0 == 0) goto L_0x025d
            android.view.GestureDetector$OnGestureListener r0 = r13.b
            boolean r0 = r0.onSingleTapUp(r14)
            boolean r2 = r13.e
            if (r2 == 0) goto L_0x0210
            android.view.GestureDetector$OnDoubleTapListener r2 = r13.c
            if (r2 == 0) goto L_0x0210
            android.view.GestureDetector$OnDoubleTapListener r2 = r13.c
            r2.onSingleTapConfirmed(r14)
            goto L_0x0210
        L_0x025d:
            android.view.VelocityTracker r0 = r13.x
            int r2 = r14.getPointerId(r3)
            r5 = 1000(0x3e8, float:1.401E-42)
            int r6 = r13.k
            float r6 = (float) r6
            r0.computeCurrentVelocity(r5, r6)
            float r5 = r0.getYVelocity(r2)
            float r0 = r0.getXVelocity(r2)
            float r2 = java.lang.Math.abs(r5)
            int r6 = r13.j
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0289
            float r2 = java.lang.Math.abs(r0)
            int r6 = r13.j
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x02bc
        L_0x0289:
            android.view.GestureDetector$OnGestureListener r2 = r13.b
            android.view.MotionEvent r6 = r13.g
            boolean r0 = r2.onFling(r6, r14, r0, r5)
            goto L_0x0210
        L_0x0293:
            android.os.Handler r0 = r13.a
            r0.removeMessages(r4)
            android.os.Handler r0 = r13.a
            r0.removeMessages(r12)
            android.os.Handler r0 = r13.a
            r0.removeMessages(r11)
            android.view.VelocityTracker r0 = r13.x
            r0.recycle()
            r0 = 0
            r13.x = r0
            r13.r = r3
            r13.d = r3
            r13.o = r3
            r13.p = r3
            r13.e = r3
            boolean r0 = r13.f
            if (r0 == 0) goto L_0x004d
            r13.f = r3
            goto L_0x004d
        L_0x02bc:
            r0 = r3
            goto L_0x0210
        L_0x02bf:
            r0 = r3
            goto L_0x01d3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.a(android.view.MotionEvent):boolean");
    }
}
