package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ahv  reason: default package */
/* compiled from: PG */
public final class ahv implements afj {
    private final /* synthetic */ aht a;

    ahv(aht aht) {
        this.a = aht;
    }

    @Override // defpackage.afj
    public final boolean a(MotionEvent motionEvent) {
        int findPointerIndex;
        afv a2;
        int a3;
        aic aic;
        this.a.v.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            aht aht = this.a;
            if (aht.q != null) {
                aht.q.recycle();
            }
            aht.q = VelocityTracker.obtain();
            if (this.a.b == null) {
                aht aht2 = this.a;
                if (!aht2.m.isEmpty()) {
                    View a4 = aht2.a(motionEvent);
                    int size = aht2.m.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        aic = (aic) aht2.m.get(size);
                        if (aic.e.a == a4) {
                            break;
                        }
                        size--;
                    }
                }
                aic = null;
                if (aic != null) {
                    this.a.c -= aic.i;
                    this.a.d -= aic.j;
                    this.a.a(aic.e, true);
                    if (this.a.a.remove(aic.e.a)) {
                        this.a.j.b(this.a.o, aic.e);
                    }
                    this.a.a(aic.e, aic.f);
                    aht aht3 = this.a;
                    int i = this.a.l;
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    aht3.e = x - aht3.c;
                    aht3.f = y - aht3.d;
                    if ((i & 4) == 0) {
                        aht3.e = Math.max(0.0f, aht3.e);
                    }
                    if ((i & 8) == 0) {
                        aht3.e = Math.min(0.0f, aht3.e);
                    }
                    if ((i & 1) == 0) {
                        aht3.f = Math.max(0.0f, aht3.f);
                    }
                    if ((i & 2) == 0) {
                        aht3.f = Math.min(0.0f, aht3.f);
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.a.i = -1;
            this.a.a((afv) null, 0);
        } else if (this.a.i != -1 && (findPointerIndex = motionEvent.findPointerIndex(this.a.i)) >= 0) {
            aht aht4 = this.a;
            if (aht4.b == null && actionMasked == 2 && aht4.k != 2) {
                aht4.j.c();
                if (aht4.o.A != 1) {
                    afd afd = aht4.o.l;
                    if (aht4.i == -1) {
                        a2 = null;
                    } else {
                        int findPointerIndex2 = motionEvent.findPointerIndex(aht4.i);
                        float abs = Math.abs(motionEvent.getX(findPointerIndex2) - aht4.c);
                        float abs2 = Math.abs(motionEvent.getY(findPointerIndex2) - aht4.d);
                        if (abs < ((float) aht4.n) && abs2 < ((float) aht4.n)) {
                            a2 = null;
                        } else if (abs > abs2 && afd.d()) {
                            a2 = null;
                        } else if (abs2 <= abs || !afd.e()) {
                            View a5 = aht4.a(motionEvent);
                            if (a5 == null) {
                                a2 = null;
                            } else {
                                a2 = aht4.o.a(a5);
                            }
                        } else {
                            a2 = null;
                        }
                    }
                    if (!(a2 == null || (a3 = (aht4.j.a(aht4.o, a2) >> 8) & 255) == 0)) {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float f = x2 - aht4.c;
                        float f2 = y2 - aht4.d;
                        float abs3 = Math.abs(f);
                        float abs4 = Math.abs(f2);
                        if ((abs3 >= ((float) aht4.n) || abs4 >= ((float) aht4.n)) && (abs3 <= abs4 ? (f2 >= 0.0f || (a3 & 1) != 0) && (f2 <= 0.0f || (a3 & 2) != 0) : (f >= 0.0f || (a3 & 4) != 0) && (f <= 0.0f || (a3 & 8) != 0))) {
                            aht4.f = 0.0f;
                            aht4.e = 0.0f;
                            aht4.i = motionEvent.getPointerId(0);
                            aht4.a(a2, 1);
                        }
                    }
                }
            }
        }
        if (this.a.q != null) {
            this.a.q.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.afj
    public final void b(MotionEvent motionEvent) {
        afv a2;
        int a3;
        this.a.v.a(motionEvent);
        if (this.a.q != null) {
            this.a.q.addMovement(motionEvent);
        }
        if (this.a.i != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
            if (findPointerIndex >= 0) {
                aht aht = this.a;
                if (aht.b == null && actionMasked == 2 && aht.k != 2) {
                    aht.j.c();
                    if (aht.o.A != 1) {
                        afd afd = aht.o.l;
                        if (aht.i == -1) {
                            a2 = null;
                        } else {
                            int findPointerIndex2 = motionEvent.findPointerIndex(aht.i);
                            float abs = Math.abs(motionEvent.getX(findPointerIndex2) - aht.c);
                            float abs2 = Math.abs(motionEvent.getY(findPointerIndex2) - aht.d);
                            if (abs < ((float) aht.n) && abs2 < ((float) aht.n)) {
                                a2 = null;
                            } else if (abs > abs2 && afd.d()) {
                                a2 = null;
                            } else if (abs2 <= abs || !afd.e()) {
                                View a4 = aht.a(motionEvent);
                                if (a4 == null) {
                                    a2 = null;
                                } else {
                                    a2 = aht.o.a(a4);
                                }
                            } else {
                                a2 = null;
                            }
                        }
                        if (!(a2 == null || (a3 = (aht.j.a(aht.o, a2) >> 8) & 255) == 0)) {
                            float x = motionEvent.getX(findPointerIndex);
                            float y = motionEvent.getY(findPointerIndex);
                            float f = x - aht.c;
                            float f2 = y - aht.d;
                            float abs3 = Math.abs(f);
                            float abs4 = Math.abs(f2);
                            if ((abs3 >= ((float) aht.n) || abs4 >= ((float) aht.n)) && (abs3 <= abs4 ? (f2 >= 0.0f || (a3 & 1) != 0) && (f2 <= 0.0f || (a3 & 2) != 0) : (f >= 0.0f || (a3 & 4) != 0) && (f <= 0.0f || (a3 & 8) != 0))) {
                                aht.f = 0.0f;
                                aht.e = 0.0f;
                                aht.i = motionEvent.getPointerId(0);
                                aht.a(a2, 1);
                            }
                        }
                    }
                }
            }
            afv afv = this.a.b;
            if (afv != null) {
                switch (actionMasked) {
                    case 1:
                        break;
                    case 2:
                        if (findPointerIndex >= 0) {
                            aht aht2 = this.a;
                            int i = this.a.l;
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            aht2.e = x2 - aht2.c;
                            aht2.f = y2 - aht2.d;
                            if ((i & 4) == 0) {
                                aht2.e = Math.max(0.0f, aht2.e);
                            }
                            if ((i & 8) == 0) {
                                aht2.e = Math.min(0.0f, aht2.e);
                            }
                            if ((i & 1) == 0) {
                                aht2.f = Math.max(0.0f, aht2.f);
                            }
                            if ((i & 2) == 0) {
                                aht2.f = Math.min(0.0f, aht2.f);
                            }
                            aht aht3 = this.a;
                            if (!aht3.o.isLayoutRequested() && aht3.k == 2) {
                                ahy.f();
                                int i2 = (int) (aht3.g + aht3.e);
                                int i3 = (int) (aht3.h + aht3.f);
                                if (((float) Math.abs(i3 - afv.a.getTop())) >= ((float) afv.a.getHeight()) * 0.5f || ((float) Math.abs(i2 - afv.a.getLeft())) >= ((float) afv.a.getWidth()) * 0.5f) {
                                    if (aht3.r == null) {
                                        aht3.r = new ArrayList();
                                        aht3.s = new ArrayList();
                                    } else {
                                        aht3.r.clear();
                                        aht3.s.clear();
                                    }
                                    ahy.d();
                                    int round = Math.round(aht3.g + aht3.e);
                                    int round2 = Math.round(aht3.h + aht3.f);
                                    int width = round + afv.a.getWidth();
                                    int height = round2 + afv.a.getHeight();
                                    int i4 = (round + width) / 2;
                                    int i5 = (round2 + height) / 2;
                                    afd afd2 = aht3.o.l;
                                    int k = afd2.k();
                                    for (int i6 = 0; i6 < k; i6++) {
                                        View e = afd2.e(i6);
                                        if (e != afv.a && e.getBottom() >= round2 && e.getTop() <= height && e.getRight() >= round && e.getLeft() <= width) {
                                            afv a5 = aht3.o.a(e);
                                            ahy.a();
                                            int abs5 = Math.abs(i4 - ((e.getLeft() + e.getRight()) / 2));
                                            int abs6 = Math.abs(i5 - ((e.getBottom() + e.getTop()) / 2));
                                            int i7 = (abs5 * abs5) + (abs6 * abs6);
                                            int size = aht3.r.size();
                                            int i8 = 0;
                                            int i9 = 0;
                                            while (i8 < size && i7 > ((Integer) aht3.s.get(i8)).intValue()) {
                                                i9++;
                                                i8++;
                                            }
                                            aht3.r.add(i9, a5);
                                            aht3.s.add(i9, Integer.valueOf(i7));
                                        }
                                    }
                                    List list = aht3.r;
                                    if (list.size() != 0) {
                                        afv a6 = ahy.a(afv, list, i2, i3);
                                        if (a6 == null) {
                                            aht3.r.clear();
                                            aht3.s.clear();
                                        } else {
                                            int d = a6.d();
                                            afv.d();
                                            if (aht3.j.a(afv, a6)) {
                                                ahy.a(aht3.o, afv, a6, d);
                                            }
                                        }
                                    }
                                }
                            }
                            this.a.o.removeCallbacks(this.a.p);
                            this.a.p.run();
                            this.a.o.invalidate();
                            return;
                        }
                        return;
                    case 3:
                        if (this.a.q != null) {
                            this.a.q.clear();
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                    default:
                        return;
                    case 6:
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.a.i) {
                            this.a.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            aht aht4 = this.a;
                            int i10 = this.a.l;
                            float x3 = motionEvent.getX(actionIndex);
                            float y3 = motionEvent.getY(actionIndex);
                            aht4.e = x3 - aht4.c;
                            aht4.f = y3 - aht4.d;
                            if ((i10 & 4) == 0) {
                                aht4.e = Math.max(0.0f, aht4.e);
                            }
                            if ((i10 & 8) == 0) {
                                aht4.e = Math.min(0.0f, aht4.e);
                            }
                            if ((i10 & 1) == 0) {
                                aht4.f = Math.max(0.0f, aht4.f);
                            }
                            if ((i10 & 2) == 0) {
                                aht4.f = Math.min(0.0f, aht4.f);
                                return;
                            }
                            return;
                        }
                        return;
                }
                this.a.a((afv) null, 0);
                this.a.i = -1;
            }
        }
    }

    @Override // defpackage.afj
    public final void a(boolean z) {
        if (z) {
            this.a.a((afv) null, 0);
        }
    }
}
