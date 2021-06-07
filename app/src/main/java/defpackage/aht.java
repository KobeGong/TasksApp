package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aht  reason: default package */
/* compiled from: PG */
public final class aht extends afc implements afi {
    private float A;
    private aew B = null;
    private aib C;
    private final afj D = new ahv(this);
    public final List a = new ArrayList();
    public afv b = null;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i = -1;
    public ahy j;
    public int k = 0;
    public int l;
    public List m = new ArrayList();
    public int n;
    public RecyclerView o;
    public final Runnable p = new ahu(this);
    public VelocityTracker q;
    public List r;
    public List s;
    public View t = null;
    public int u = -1;
    public ru v;
    public Rect w;
    public long x;
    private final float[] y = new float[2];
    private float z;

    public aht(ahy ahy) {
        this.j = ahy;
    }

    private static boolean a(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= ((float) view.getWidth()) + f4 && f3 >= f5 && f3 <= ((float) view.getHeight()) + f5;
    }

    public final void a(RecyclerView recyclerView) {
        if (this.o != recyclerView) {
            if (this.o != null) {
                this.o.b(this);
                this.o.b(this.D);
                RecyclerView recyclerView2 = this.o;
                if (recyclerView2.t != null) {
                    recyclerView2.t.remove(this);
                }
                for (int size = this.m.size() - 1; size >= 0; size--) {
                    this.j.b(this.o, ((aic) this.m.get(0)).e);
                }
                this.m.clear();
                this.t = null;
                this.u = -1;
                b();
                if (this.C != null) {
                    this.C.a = false;
                    this.C = null;
                }
                if (this.v != null) {
                    this.v = null;
                }
            }
            this.o = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.z = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.A = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.n = ViewConfiguration.get(this.o.getContext()).getScaledTouchSlop();
                this.o.a(this);
                this.o.a(this.D);
                RecyclerView recyclerView3 = this.o;
                if (recyclerView3.t == null) {
                    recyclerView3.t = new ArrayList();
                }
                recyclerView3.t.add(this);
                this.C = new aib(this);
                this.v = new ru(this.o.getContext(), this.C);
            }
        }
    }

    private final void a(float[] fArr) {
        if ((this.l & 12) != 0) {
            fArr[0] = (this.g + this.e) - ((float) this.b.a.getLeft());
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.l & 3) != 0) {
            fArr[1] = (this.h + this.f) - ((float) this.b.a.getTop());
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    @Override // defpackage.afc
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        boolean z2;
        boolean z3 = false;
        if (this.b != null) {
            a(this.y);
        }
        afv afv = this.b;
        List list = this.m;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int save = canvas.save();
            ahy.b(((aic) list.get(i2)).e);
            canvas.restoreToCount(save);
        }
        if (afv != null) {
            int save2 = canvas.save();
            ahy.b(afv);
            canvas.restoreToCount(save2);
        }
        int i3 = size - 1;
        while (i3 >= 0) {
            aic aic = (aic) list.get(i3);
            if (aic.l && !aic.h) {
                list.remove(i3);
                z2 = z3;
            } else if (!aic.l) {
                z2 = true;
            } else {
                z2 = z3;
            }
            i3--;
            z3 = z2;
        }
        if (z3) {
            recyclerView.invalidate();
        }
    }

    @Override // defpackage.afc
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f3;
        this.u = -1;
        if (this.b != null) {
            a(this.y);
            float f4 = this.y[0];
            f2 = this.y[1];
            f3 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        ahy ahy = this.j;
        afv afv = this.b;
        List list = this.m;
        int i2 = this.k;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            aic aic = (aic) list.get(i3);
            if (aic.a == aic.c) {
                aic.i = aic.e.a.getTranslationX();
            } else {
                aic.i = aic.a + (aic.m * (aic.c - aic.a));
            }
            if (aic.b == aic.d) {
                aic.j = aic.e.a.getTranslationY();
            } else {
                aic.j = aic.b + (aic.m * (aic.d - aic.b));
            }
            int save = canvas.save();
            ahy.a(canvas, recyclerView, aic.e, aic.i, aic.j, aic.f, false);
            canvas.restoreToCount(save);
        }
        if (afv != null) {
            int save2 = canvas.save();
            ahy.a(canvas, recyclerView, afv, f3, f2, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0140, code lost:
        if (r8 <= 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.afv r13, int r14) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aht.a(afv, int):void");
    }

    @Override // defpackage.afi
    public final void a() {
    }

    @Override // defpackage.afi
    public final void a(View view) {
        b(view);
        afv a2 = this.o.a(view);
        if (a2 != null) {
            if (this.b == null || a2 != this.b) {
                a(a2, false);
                if (this.a.remove(a2.a)) {
                    this.j.b(this.o, a2);
                    return;
                }
                return;
            }
            a((afv) null, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(afv afv, boolean z2) {
        for (int size = this.m.size() - 1; size >= 0; size--) {
            aic aic = (aic) this.m.get(size);
            if (aic.e == afv) {
                aic.k |= z2;
                if (!aic.l) {
                    aic.g.cancel();
                }
                this.m.remove(size);
                return;
            }
        }
    }

    @Override // defpackage.afc
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    private final void b() {
        if (this.q != null) {
            this.q.recycle();
            this.q = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (this.b != null) {
            View view = this.b.a;
            if (a(view, x2, y2, this.g + this.e, this.h + this.f)) {
                return view;
            }
        }
        for (int size = this.m.size() - 1; size >= 0; size--) {
            aic aic = (aic) this.m.get(size);
            View view2 = aic.e.a;
            if (a(view2, x2, y2, aic.i, aic.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.o;
        for (int a2 = recyclerView.g.a() - 1; a2 >= 0; a2--) {
            View b2 = recyclerView.g.b(a2);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (x2 >= ((float) b2.getLeft()) + translationX && x2 <= translationX + ((float) b2.getRight()) && y2 >= ((float) b2.getTop()) + translationY && y2 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    private final int a(int i2) {
        int i3 = 8;
        if ((i2 & 12) != 0) {
            int i4 = this.e > 0.0f ? 8 : 4;
            if (this.q != null && this.i >= 0) {
                this.q.computeCurrentVelocity(1000, ahy.b(this.A));
                float xVelocity = this.q.getXVelocity(this.i);
                float yVelocity = this.q.getYVelocity(this.i);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i2) != 0 && i4 == i3 && abs >= ahy.a(this.z) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.o.getWidth()) * ahy.e();
            if ((i2 & i4) != 0 && Math.abs(this.e) > width) {
                return i4;
            }
        }
        return 0;
    }

    private final int b(int i2) {
        int i3 = 2;
        if ((i2 & 3) != 0) {
            int i4 = this.f > 0.0f ? 2 : 1;
            if (this.q != null && this.i >= 0) {
                this.q.computeCurrentVelocity(1000, ahy.b(this.A));
                float xVelocity = this.q.getXVelocity(this.i);
                float yVelocity = this.q.getYVelocity(this.i);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i2) != 0 && i3 == i4 && abs >= ahy.a(this.z) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.o.getHeight()) * ahy.e();
            if ((i2 & i4) != 0 && Math.abs(this.f) > height) {
                return i4;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        if (view == this.t) {
            this.t = null;
            if (this.B != null) {
                this.o.a((aew) null);
            }
        }
    }
}
