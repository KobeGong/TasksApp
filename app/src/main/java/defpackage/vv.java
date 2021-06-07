package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: vv  reason: default package */
/* compiled from: PG */
public final class vv {
    private static final Interpolator u = new vw();
    public int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private OverScroller p;
    private final vy q;
    private View r;
    private boolean s;
    private final ViewGroup t;
    private final Runnable v = new vx(this);

    public static vv a(ViewGroup viewGroup, vy vyVar) {
        return new vv(viewGroup.getContext(), viewGroup, vyVar);
    }

    private vv(Context context, ViewGroup viewGroup, vy vyVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (vyVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.t = viewGroup;
            this.q = vyVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.a = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, u);
        }
    }

    public final void a(View view, int i2) {
        if (view.getParent() != this.t) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
        }
        this.r = view;
        this.c = i2;
        this.q.b(view, i2);
        a(1);
    }

    private final void b() {
        this.c = -1;
        if (this.d != null) {
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public final boolean a(View view, int i2, int i3) {
        this.r = view;
        this.c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.b == 0 && this.r != null) {
            this.r = null;
        }
        return a2;
    }

    public final boolean a(int i2, int i3) {
        if (this.s) {
            return a(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private final boolean a(int i2, int i3, int i4, int i5) {
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.p.abortAnimation();
            a(0);
            return false;
        }
        View view = this.r;
        int b2 = b(i4, (int) this.n, (int) this.m);
        int b3 = b(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(b2);
        int abs4 = Math.abs(b3);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        this.p.startScroll(left, top, i6, i7, (int) (((b3 != 0 ? ((float) abs4) / ((float) i8) : ((float) abs2) / ((float) i9)) * ((float) a(i7, b3, this.q.a()))) + ((b2 != 0 ? ((float) abs3) / ((float) i8) : ((float) abs) / ((float) i9)) * ((float) a(i6, b2, this.q.a(view))))));
        a(2);
        return true;
    }

    private final int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        int i5 = width / 2;
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i5)) + ((float) i5);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private static int b(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs <= i4) {
            return i2;
        }
        if (i2 <= 0) {
            return -i4;
        }
        return i4;
    }

    private static float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs <= f4) {
            return f2;
        }
        if (f2 <= 0.0f) {
            return -f4;
        }
        return f4;
    }

    public final boolean a() {
        if (this.b == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                sn.c(this.r, left);
            }
            if (top != 0) {
                sn.b(this.r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.a(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.v);
            }
        }
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    private final void a(float f2, float f3) {
        this.s = true;
        this.q.a(this.r, f2, f3);
        this.s = false;
        if (this.b == 1) {
            a(0);
        }
    }

    private final void b(int i2) {
        if (this.d != null && c(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k &= (1 << i2) ^ -1;
        }
    }

    private final void a(float f2, float f3, int i2) {
        int i3 = 0;
        if (this.d == null || this.d.length <= i2) {
            float[] fArr = new float[(i2 + 1)];
            float[] fArr2 = new float[(i2 + 1)];
            float[] fArr3 = new float[(i2 + 1)];
            float[] fArr4 = new float[(i2 + 1)];
            int[] iArr = new int[(i2 + 1)];
            int[] iArr2 = new int[(i2 + 1)];
            int[] iArr3 = new int[(i2 + 1)];
            if (this.d != null) {
                System.arraycopy(this.d, 0, fArr, 0, this.d.length);
                System.arraycopy(this.e, 0, fArr2, 0, this.e.length);
                System.arraycopy(this.f, 0, fArr3, 0, this.f.length);
                System.arraycopy(this.g, 0, fArr4, 0, this.g.length);
                System.arraycopy(this.h, 0, iArr, 0, this.h.length);
                System.arraycopy(this.i, 0, iArr2, 0, this.i.length);
                System.arraycopy(this.j, 0, iArr3, 0, this.j.length);
            }
            this.d = fArr;
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr5 = this.d;
        this.f[i2] = f2;
        fArr5[i2] = f2;
        float[] fArr6 = this.e;
        this.g[i2] = f3;
        fArr6[i2] = f3;
        int[] iArr4 = this.h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        if (i4 < this.t.getLeft() + this.o) {
            i3 = 1;
        }
        if (i5 < this.t.getTop() + this.o) {
            i3 |= 4;
        }
        if (i4 > this.t.getRight() - this.o) {
            i3 |= 2;
        }
        if (i5 > this.t.getBottom() - this.o) {
            i3 |= 8;
        }
        iArr4[i2] = i3;
        this.k |= 1 << i2;
    }

    private final void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private final boolean c(int i2) {
        return (this.k & (1 << i2)) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.t.removeCallbacks(this.v);
        if (this.b != i2) {
            this.b = i2;
            this.q.a(i2);
            if (this.b == 0) {
                this.r = null;
            }
        }
    }

    private final boolean b(View view, int i2) {
        if (view == this.r && this.c == i2) {
            return true;
        }
        if (view == null || !this.q.a(view, i2)) {
            return false;
        }
        this.c = i2;
        a(view, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r8 != r7) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.a(android.view.MotionEvent):boolean");
    }

    public final void b(MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View b2 = b((int) x, (int) y);
                a(x, y, pointerId);
                b(b2, pointerId);
                return;
            case 1:
                if (this.b == 1) {
                    c();
                }
                b();
                return;
            case 2:
                if (this.b != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i3 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (d(pointerId2)) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f2 = x2 - this.d[pointerId2];
                            float f3 = y2 - this.e[pointerId2];
                            b(f2, f3, pointerId2);
                            if (this.b != 1) {
                                View b3 = b((int) x2, (int) y2);
                                if (a(b3, f2, f3) && b(b3, pointerId2)) {
                                }
                            }
                            c(motionEvent);
                            return;
                        }
                        i3++;
                    }
                    c(motionEvent);
                    return;
                } else if (d(this.c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    int i4 = (int) (x3 - this.f[this.c]);
                    int i5 = (int) (y3 - this.g[this.c]);
                    int left = this.r.getLeft() + i4;
                    int top = this.r.getTop() + i5;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i4 != 0) {
                        left = this.q.c(this.r, left);
                        sn.c(this.r, left - left2);
                    }
                    if (i5 != 0) {
                        top = this.q.d(this.r, top);
                        sn.b(this.r, top - top2);
                    }
                    if (!(i4 == 0 && i5 == 0)) {
                        this.q.a(this.r, left, top);
                    }
                    c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.b == 1) {
                    a(0.0f, 0.0f);
                }
                b();
                return;
            case 4:
            default:
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                a(x4, y4, pointerId3);
                if (this.b == 0) {
                    b(b((int) x4, (int) y4), pointerId3);
                    return;
                }
                int i6 = (int) x4;
                int i7 = (int) y4;
                View view = this.r;
                if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    b(this.r, pointerId3);
                    return;
                }
                return;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.b == 1 && pointerId4 == this.c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount2) {
                            i2 = -1;
                        } else {
                            int pointerId5 = motionEvent.getPointerId(i3);
                            if (pointerId5 != this.c) {
                                if (b((int) motionEvent.getX(i3), (int) motionEvent.getY(i3)) == this.r && b(this.r, pointerId5)) {
                                    i2 = this.c;
                                }
                            }
                            i3++;
                        }
                    }
                    if (i2 == -1) {
                        c();
                    }
                }
                b(pointerId4);
                return;
        }
    }

    private final void b(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = i3 | iArr[i2];
        }
    }

    private final boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (i3 & 0) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        if ((abs > ((float) this.a) || abs2 > ((float) this.a)) && (this.i[i2] & i3) == 0 && abs > ((float) this.a)) {
            return true;
        }
        return false;
    }

    private final boolean a(View view, float f2, float f3) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.q.a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.q.a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return (!z || !z2) ? z ? Math.abs(f2) > ((float) this.a) : z2 && Math.abs(f3) > ((float) this.a) : (f2 * f2) + (f3 * f3) > ((float) (this.a * this.a));
    }

    private final void c() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(this.l.getXVelocity(this.c), this.n, this.m), a(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private final View b(int i2, int i3) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.t.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final boolean d(int i2) {
        if (c(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
