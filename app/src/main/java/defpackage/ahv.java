package defpackage;

/* renamed from: ahv reason: default package */
/* compiled from: PG */
final class ahv implements defpackage.afj {
    private final /* synthetic */ defpackage.aht a;

    ahv(defpackage.aht aht) {
        this.a = aht;
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        RecyclerViewHolder a2;
        defpackage.aic aic;
        this.a.v.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            defpackage.aht aht = this.a;
            if (aht.q != null) {
                aht.q.recycle();
            }
            aht.q = android.view.VelocityTracker.obtain();
            if (this.a.b == null) {
                defpackage.aht aht2 = this.a;
                if (!aht2.m.isEmpty()) {
                    android.view.View a3 = aht2.a(motionEvent);
                    int size = aht2.m.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        aic = (defpackage.aic) aht2.m.get(size);
                        if (aic.e.itemView == a3) {
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
                    if (this.a.a.remove(aic.e.itemView)) {
                        this.a.j.b(this.a.o, aic.e);
                    }
                    this.a.a(aic.e, aic.f);
                    defpackage.aht aht3 = this.a;
                    int i = this.a.l;
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    aht3.e = x - aht3.c;
                    aht3.f = y - aht3.d;
                    if ((i & 4) == 0) {
                        aht3.e = java.lang.Math.max(0.0f, aht3.e);
                    }
                    if ((i & 8) == 0) {
                        aht3.e = java.lang.Math.min(0.0f, aht3.e);
                    }
                    if ((i & 1) == 0) {
                        aht3.f = java.lang.Math.max(0.0f, aht3.f);
                    }
                    if ((i & 2) == 0) {
                        aht3.f = java.lang.Math.min(0.0f, aht3.f);
                    }
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.a.i = -1;
            this.a.a((RecyclerViewHolder) null, 0);
        } else if (this.a.i != -1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
            if (findPointerIndex >= 0) {
                defpackage.aht aht4 = this.a;
                if (aht4.b == null && actionMasked == 2 && aht4.k != 2) {
                    aht4.j.c();
                    if (aht4.o.A != 1) {
                        LayoutManager afd = aht4.o.mLayout;
                        if (aht4.i == -1) {
                            a2 = null;
                        } else {
                            int findPointerIndex2 = motionEvent.findPointerIndex(aht4.i);
                            float x2 = motionEvent.getX(findPointerIndex2) - aht4.c;
                            float y2 = motionEvent.getY(findPointerIndex2) - aht4.d;
                            float abs = java.lang.Math.abs(x2);
                            float abs2 = java.lang.Math.abs(y2);
                            if (abs < ((float) aht4.n) && abs2 < ((float) aht4.n)) {
                                a2 = null;
                            } else if (abs > abs2 && afd.d()) {
                                a2 = null;
                            } else if (abs2 <= abs || !afd.e()) {
                                android.view.View a4 = aht4.a(motionEvent);
                                if (a4 == null) {
                                    a2 = null;
                                } else {
                                    a2 = aht4.o.a(a4);
                                }
                            } else {
                                a2 = null;
                            }
                        }
                        if (a2 != null) {
                            int a5 = (aht4.j.a(aht4.o, a2) >> 8) & 255;
                            if (a5 != 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float f = x3 - aht4.c;
                                float y3 = motionEvent.getY(findPointerIndex) - aht4.d;
                                float abs3 = java.lang.Math.abs(f);
                                float abs4 = java.lang.Math.abs(y3);
                                if ((abs3 >= ((float) aht4.n) || abs4 >= ((float) aht4.n)) && (abs3 <= abs4 ? (y3 >= 0.0f || (a5 & 1) != 0) && (y3 <= 0.0f || (a5 & 2) != 0) : (f >= 0.0f || (a5 & 4) != 0) && (f <= 0.0f || (a5 & 8) != 0))) {
                                    aht4.f = 0.0f;
                                    aht4.e = 0.0f;
                                    aht4.i = motionEvent.getPointerId(0);
                                    aht4.a(a2, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.a.q != null) {
            this.a.q.addMovement(motionEvent);
        }
        if (this.a.b != null) {
            return true;
        }
        return false;
    }

    public final void b(android.view.MotionEvent motionEvent) {
        RecyclerViewHolder a2;
        this.a.v.a(motionEvent);
        if (this.a.q != null) {
            this.a.q.addMovement(motionEvent);
        }
        if (this.a.i != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
            if (findPointerIndex >= 0) {
                defpackage.aht aht = this.a;
                if (aht.b == null && actionMasked == 2 && aht.k != 2) {
                    aht.j.c();
                    if (aht.o.A != 1) {
                        LayoutManager afd = aht.o.mLayout;
                        if (aht.i == -1) {
                            a2 = null;
                        } else {
                            int findPointerIndex2 = motionEvent.findPointerIndex(aht.i);
                            float x = motionEvent.getX(findPointerIndex2) - aht.c;
                            float y = motionEvent.getY(findPointerIndex2) - aht.d;
                            float abs = java.lang.Math.abs(x);
                            float abs2 = java.lang.Math.abs(y);
                            if (abs < ((float) aht.n) && abs2 < ((float) aht.n)) {
                                a2 = null;
                            } else if (abs > abs2 && afd.d()) {
                                a2 = null;
                            } else if (abs2 <= abs || !afd.e()) {
                                android.view.View a3 = aht.a(motionEvent);
                                if (a3 == null) {
                                    a2 = null;
                                } else {
                                    a2 = aht.o.a(a3);
                                }
                            } else {
                                a2 = null;
                            }
                        }
                        if (a2 != null) {
                            int a4 = (aht.j.a(aht.o, a2) >> 8) & 255;
                            if (a4 != 0) {
                                float x2 = motionEvent.getX(findPointerIndex) - aht.c;
                                float y2 = motionEvent.getY(findPointerIndex) - aht.d;
                                float abs3 = java.lang.Math.abs(x2);
                                float abs4 = java.lang.Math.abs(y2);
                                if ((abs3 >= ((float) aht.n) || abs4 >= ((float) aht.n)) && (abs3 <= abs4 ? (y2 >= 0.0f || (a4 & 1) != 0) && (y2 <= 0.0f || (a4 & 2) != 0) : (x2 >= 0.0f || (a4 & 4) != 0) && (x2 <= 0.0f || (a4 & 8) != 0))) {
                                    aht.f = 0.0f;
                                    aht.e = 0.0f;
                                    aht.i = motionEvent.getPointerId(0);
                                    aht.a(a2, 1);
                                }
                            }
                        }
                    }
                }
            }
            RecyclerViewHolder afv = this.a.b;
            if (afv != null) {
                switch (actionMasked) {
                    case 1:
                        break;
                    case 2:
                        if (findPointerIndex >= 0) {
                            defpackage.aht aht2 = this.a;
                            int i = this.a.l;
                            float x3 = motionEvent.getX(findPointerIndex);
                            float y3 = motionEvent.getY(findPointerIndex);
                            aht2.e = x3 - aht2.c;
                            aht2.f = y3 - aht2.d;
                            if ((i & 4) == 0) {
                                aht2.e = java.lang.Math.max(0.0f, aht2.e);
                            }
                            if ((i & 8) == 0) {
                                aht2.e = java.lang.Math.min(0.0f, aht2.e);
                            }
                            if ((i & 1) == 0) {
                                aht2.f = java.lang.Math.max(0.0f, aht2.f);
                            }
                            if ((i & 2) == 0) {
                                aht2.f = java.lang.Math.min(0.0f, aht2.f);
                            }
                            defpackage.aht aht3 = this.a;
                            if (!aht3.o.isLayoutRequested() && aht3.k == 2) {
                                defpackage.ahy.f();
                                int i2 = (int) (aht3.g + aht3.e);
                                int i3 = (int) (aht3.h + aht3.f);
                                if (((float) java.lang.Math.abs(i3 - afv.itemView.getTop())) >= ((float) afv.itemView.getHeight()) * 0.5f || ((float) java.lang.Math.abs(i2 - afv.itemView.getLeft())) >= ((float) afv.itemView.getWidth()) * 0.5f) {
                                    if (aht3.r == null) {
                                        aht3.r = new java.util.ArrayList();
                                        aht3.s = new java.util.ArrayList();
                                    } else {
                                        aht3.r.clear();
                                        aht3.s.clear();
                                    }
                                    defpackage.ahy.d();
                                    int round = java.lang.Math.round(aht3.g + aht3.e);
                                    int round2 = java.lang.Math.round(aht3.h + aht3.f);
                                    int width = round + afv.itemView.getWidth();
                                    int height = round2 + afv.itemView.getHeight();
                                    int i4 = (round + width) / 2;
                                    int i5 = (round2 + height) / 2;
                                    LayoutManager afd2 = aht3.o.mLayout;
                                    int k = afd2.k();
                                    int i6 = 0;
                                    while (true) {
                                        int i7 = i6;
                                        if (i7 < k) {
                                            android.view.View e = afd2.e(i7);
                                            if (e != afv.itemView && e.getBottom() >= round2 && e.getTop() <= height && e.getRight() >= round && e.getLeft() <= width) {
                                                RecyclerViewHolder a5 = aht3.o.a(e);
                                                defpackage.ahy.a();
                                                int abs5 = java.lang.Math.abs(i4 - ((e.getLeft() + e.getRight()) / 2));
                                                int abs6 = java.lang.Math.abs(i5 - ((e.getBottom() + e.getTop()) / 2));
                                                int i8 = (abs5 * abs5) + (abs6 * abs6);
                                                int size = aht3.r.size();
                                                int i9 = 0;
                                                int i10 = 0;
                                                while (true) {
                                                    int i11 = i9;
                                                    if (i11 >= size || i8 <= ((java.lang.Integer) aht3.s.get(i11)).intValue()) {
                                                        aht3.r.add(i10, a5);
                                                        aht3.s.add(i10, java.lang.Integer.valueOf(i8));
                                                    } else {
                                                        i10++;
                                                        i9 = i11 + 1;
                                                    }
                                                }
                                                aht3.r.add(i10, a5);
                                                aht3.s.add(i10, java.lang.Integer.valueOf(i8));
                                            }
                                            i6 = i7 + 1;
                                        } else {
                                            java.util.List list = aht3.r;
                                            if (list.size() != 0) {
                                                RecyclerViewHolder a6 = defpackage.ahy.a(afv, list, i2, i3);
                                                if (a6 == null) {
                                                    aht3.r.clear();
                                                    aht3.s.clear();
                                                } else {
                                                    int d = a6.d();
                                                    afv.d();
                                                    if (aht3.j.a(afv, a6)) {
                                                        defpackage.ahy.a(aht3.o, afv, a6, d);
                                                    }
                                                }
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
                    case 6:
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.a.i) {
                            this.a.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            defpackage.aht aht4 = this.a;
                            int i12 = this.a.l;
                            float x4 = motionEvent.getX(actionIndex);
                            float y4 = motionEvent.getY(actionIndex);
                            aht4.e = x4 - aht4.c;
                            aht4.f = y4 - aht4.d;
                            if ((i12 & 4) == 0) {
                                aht4.e = java.lang.Math.max(0.0f, aht4.e);
                            }
                            if ((i12 & 8) == 0) {
                                aht4.e = java.lang.Math.min(0.0f, aht4.e);
                            }
                            if ((i12 & 1) == 0) {
                                aht4.f = java.lang.Math.max(0.0f, aht4.f);
                            }
                            if ((i12 & 2) == 0) {
                                aht4.f = java.lang.Math.min(0.0f, aht4.f);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
                this.a.a((RecyclerViewHolder) null, 0);
                this.a.i = -1;
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.a((RecyclerViewHolder) null, 0);
        }
    }
}
