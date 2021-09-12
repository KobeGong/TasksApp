package defpackage;

/* renamed from: aht reason: default package */
/* compiled from: PG */
public final class aht extends defpackage.afc implements defpackage.afi {
    private float A;
    private ChildDrawingOrderCallback B = null;
    private defpackage.aib C;
    private final defpackage.afj D = new defpackage.ahv(this);
    public final java.util.List a = new java.util.ArrayList();
    public RecyclerViewHolder b = null;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i = -1;
    public defpackage.ahy j;
    public int k = 0;
    public int l;
    public java.util.List m = new java.util.ArrayList();
    public int n;
    public android.support.v7.widget.RecyclerView o;
    public final java.lang.Runnable p = new defpackage.ahu(this);
    public android.view.VelocityTracker q;
    public java.util.List r;
    public java.util.List s;
    public android.view.View t = null;
    public int u = -1;
    public defpackage.ru v;
    public android.graphics.Rect w;
    public long x;
    private final float[] y = new float[2];
    private float z;

    public aht(defpackage.ahy ahy) {
        this.j = ahy;
    }

    private static boolean a(android.view.View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= ((float) view.getWidth()) + f4 && f3 >= f5 && f3 <= ((float) view.getHeight()) + f5;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView) {
        if (this.o != recyclerView) {
            if (this.o != null) {
                this.o.removeItemDecoration((defpackage.afc) this);
                this.o.b(this.D);
                android.support.v7.widget.RecyclerView recyclerView2 = this.o;
                if (recyclerView2.t != null) {
                    recyclerView2.t.remove(this);
                }
                for (int size = this.m.size() - 1; size >= 0; size--) {
                    this.j.b(this.o, ((defpackage.aic) this.m.get(0)).e);
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
                android.content.res.Resources resources = recyclerView.getResources();
                this.z = resources.getDimension(2131689766);
                this.A = resources.getDimension(2131689765);
                this.n = android.view.ViewConfiguration.get(this.o.getContext()).getScaledTouchSlop();
                this.o.addItemDecoration((defpackage.afc) this);
                this.o.a(this.D);
                android.support.v7.widget.RecyclerView recyclerView3 = this.o;
                if (recyclerView3.t == null) {
                    recyclerView3.t = new java.util.ArrayList();
                }
                recyclerView3.t.add(this);
                this.C = new defpackage.aib(this);
                this.v = new defpackage.ru(this.o.getContext(), this.C);
            }
        }
    }

    private final void a(float[] fArr) {
        if ((this.l & 12) != 0) {
            fArr[0] = (this.g + this.e) - ((float) this.b.itemView.getLeft());
        } else {
            fArr[0] = this.b.itemView.getTranslationX();
        }
        if ((this.l & 3) != 0) {
            fArr[1] = (this.h + this.f) - ((float) this.b.itemView.getTop());
        } else {
            fArr[1] = this.b.itemView.getTranslationY();
        }
    }

    public final void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        boolean z2;
        boolean z3 = false;
        if (this.b != null) {
            a(this.y);
        }
        RecyclerViewHolder afv = this.b;
        java.util.List list = this.m;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.aic aic = (defpackage.aic) list.get(i2);
            int save = canvas.save();
            defpackage.ahy.b(aic.e);
            canvas.restoreToCount(save);
        }
        if (afv != null) {
            int save2 = canvas.save();
            defpackage.ahy.b(afv);
            canvas.restoreToCount(save2);
        }
        int i3 = size - 1;
        while (i3 >= 0) {
            defpackage.aic aic2 = (defpackage.aic) list.get(i3);
            if (aic2.l && !aic2.h) {
                list.remove(i3);
                z2 = z3;
            } else if (!aic2.l) {
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

    public final void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
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
        defpackage.ahy ahy = this.j;
        RecyclerViewHolder afv = this.b;
        java.util.List list = this.m;
        int i2 = this.k;
        int size = list.size();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                break;
            }
            defpackage.aic aic = (defpackage.aic) list.get(i4);
            if (aic.a == aic.c) {
                aic.i = aic.e.itemView.getTranslationX();
            } else {
                aic.i = aic.a + (aic.m * (aic.c - aic.a));
            }
            if (aic.b == aic.d) {
                aic.j = aic.e.itemView.getTranslationY();
            } else {
                aic.j = aic.b + (aic.m * (aic.d - aic.b));
            }
            int save = canvas.save();
            ahy.a(canvas, recyclerView, aic.e, aic.i, aic.j, aic.f, false);
            canvas.restoreToCount(save);
            i3 = i4 + 1;
        }
        if (afv != null) {
            int save2 = canvas.save();
            ahy.a(canvas, recyclerView, afv, f3, f2, i2, true);
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0140, code lost:
        if (r8 <= 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(RecyclerViewHolder r13, int r14) {
        /*
            r12 = this;
            afv r0 = r12.b
            if (r13 != r0) goto L_0x0009
            int r0 = r12.k
            if (r14 != r0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            r0 = -9223372036854775808
            r12.x = r0
            int r3 = r12.k
            r0 = 1
            r12.a(r13, r0)
            r12.k = r14
            r0 = 2
            if (r14 != r0) goto L_0x003e
            if (r13 != 0) goto L_0x0022
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            android.view.View r0 = r13.a
            r12.t = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x003e
            aew r0 = r12.B
            if (r0 != 0) goto L_0x0037
            aew r0 = new aew
            r0.<init>(r12)
            r12.B = r0
        L_0x0037:
            android.support.v7.widget.RecyclerView r0 = r12.o
            aew r1 = r12.B
            r0.a(r1)
        L_0x003e:
            r0 = 1
            int r1 = r14 << 3
            int r1 = r1 + 8
            int r0 = r0 << r1
            int r11 = r0 + -1
            r0 = 0
            afv r1 = r12.b
            if (r1 == 0) goto L_0x00e1
            afv r2 = r12.b
            android.view.View r1 = r2.a
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x0190
            r0 = 2
            if (r3 == r0) goto L_0x0142
            int r0 = r12.k
            r1 = 2
            if (r0 == r1) goto L_0x0142
            ahy r0 = r12.j
            int r0 = r0.a(r2)
            android.support.v7.widget.RecyclerView r1 = r12.o
            sw r4 = defpackage.sn.a
            int r1 = r4.j(r1)
            int r1 = defpackage.ahy.c(r0, r1)
            int r1 = r1 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0142
            int r0 = r0 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r4 = r12.e
            float r4 = java.lang.Math.abs(r4)
            float r5 = r12.f
            float r5 = java.lang.Math.abs(r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0145
            int r8 = r12.a(r1)
            if (r8 <= 0) goto L_0x013c
            r0 = r0 & r8
            if (r0 != 0) goto L_0x009e
            android.support.v7.widget.RecyclerView r0 = r12.o
            sw r1 = defpackage.sn.a
            int r0 = r1.j(r0)
            int r8 = defpackage.ahy.a(r8, r0)
        L_0x009e:
            r12.b()
            switch(r8) {
                case 1: goto L_0x0174;
                case 2: goto L_0x0174;
                case 4: goto L_0x0162;
                case 8: goto L_0x0162;
                case 16: goto L_0x0162;
                case 32: goto L_0x0162;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            r6 = 0
            r7 = 0
        L_0x00a6:
            r0 = 2
            if (r3 != r0) goto L_0x0186
            r0 = 8
            r10 = r0
        L_0x00ac:
            float[] r0 = r12.y
            r12.a(r0)
            float[] r0 = r12.y
            r1 = 0
            r4 = r0[r1]
            float[] r0 = r12.y
            r1 = 1
            r5 = r0[r1]
            ahw r0 = new ahw
            r1 = r12
            r9 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.support.v7.widget.RecyclerView r1 = r12.o
            long r2 = defpackage.ahy.a(r1, r10)
            android.animation.ValueAnimator r1 = r0.g
            r1.setDuration(r2)
            java.util.List r1 = r12.m
            r1.add(r0)
            afv r1 = r0.e
            r2 = 0
            r1.a(r2)
            android.animation.ValueAnimator r0 = r0.g
            r0.start()
            r0 = 1
        L_0x00de:
            r1 = 0
            r12.b = r1
        L_0x00e1:
            r1 = r0
            if (r13 == 0) goto L_0x0113
            ahy r0 = r12.j
            android.support.v7.widget.RecyclerView r2 = r12.o
            int r0 = r0.a(r2, r13)
            r0 = r0 & r11
            int r2 = r12.k
            int r2 = r2 << 3
            int r0 = r0 >> r2
            r12.l = r0
            android.view.View r0 = r13.a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r12.g = r0
            android.view.View r0 = r13.a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r12.h = r0
            r12.b = r13
            r0 = 2
            if (r14 != r0) goto L_0x0113
            afv r0 = r12.b
            android.view.View r0 = r0.a
            r2 = 0
            r0.performHapticFeedback(r2)
        L_0x0113:
            android.support.v7.widget.RecyclerView r0 = r12.o
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L_0x0123
            afv r0 = r12.b
            if (r0 == 0) goto L_0x019e
            r0 = 1
        L_0x0120:
            r2.requestDisallowInterceptTouchEvent(r0)
        L_0x0123:
            if (r1 != 0) goto L_0x012c
            android.support.v7.widget.RecyclerView r0 = r12.o
            afd r0 = r0.l
            r1 = 1
            r0.e = r1
        L_0x012c:
            ahy r0 = r12.j
            afv r1 = r12.b
            int r2 = r12.k
            r0.b(r1, r2)
            android.support.v7.widget.RecyclerView r0 = r12.o
            r0.invalidate()
            goto L_0x0008
        L_0x013c:
            int r8 = r12.b(r1)
            if (r8 > 0) goto L_0x009e
        L_0x0142:
            r8 = 0
            goto L_0x009e
        L_0x0145:
            int r8 = r12.b(r1)
            if (r8 > 0) goto L_0x009e
            int r8 = r12.a(r1)
            if (r8 <= 0) goto L_0x0142
            r0 = r0 & r8
            if (r0 != 0) goto L_0x009e
            android.support.v7.widget.RecyclerView r0 = r12.o
            sw r1 = defpackage.sn.a
            int r0 = r1.j(r0)
            int r8 = defpackage.ahy.a(r8, r0)
            goto L_0x009e
        L_0x0162:
            r7 = 0
            float r0 = r12.e
            float r0 = java.lang.Math.signum(r0)
            android.support.v7.widget.RecyclerView r1 = r12.o
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r6 = r0 * r1
            goto L_0x00a6
        L_0x0174:
            r6 = 0
            float r0 = r12.f
            float r0 = java.lang.Math.signum(r0)
            android.support.v7.widget.RecyclerView r1 = r12.o
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r7 = r0 * r1
            goto L_0x00a6
        L_0x0186:
            if (r8 <= 0) goto L_0x018c
            r0 = 2
            r10 = r0
            goto L_0x00ac
        L_0x018c:
            r0 = 4
            r10 = r0
            goto L_0x00ac
        L_0x0190:
            android.view.View r1 = r2.a
            r12.b(r1)
            ahy r1 = r12.j
            android.support.v7.widget.RecyclerView r3 = r12.o
            r1.b(r3, r2)
            goto L_0x00de
        L_0x019e:
            r0 = 0
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aht.a(afv, int):void");
    }

    public final void a() {
    }

    public final void a(android.view.View view) {
        b(view);
        RecyclerViewHolder a2 = this.o.a(view);
        if (a2 != null) {
            if (this.b == null || a2 != this.b) {
                a(a2, false);
                if (this.a.remove(a2.itemView)) {
                    this.j.b(this.o, a2);
                    return;
                }
                return;
            }
            a((RecyclerViewHolder) null, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(RecyclerViewHolder afv, boolean z2) {
        for (int size = this.m.size() - 1; size >= 0; size--) {
            defpackage.aic aic = (defpackage.aic) this.m.get(size);
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

    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView) {
        rect.setEmpty();
    }

    private final void b() {
        if (this.q != null) {
            this.q.recycle();
            this.q = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final android.view.View a(android.view.MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (this.b != null) {
            android.view.View view = this.b.itemView;
            if (a(view, x2, y2, this.g + this.e, this.h + this.f)) {
                return view;
            }
        }
        for (int size = this.m.size() - 1; size >= 0; size--) {
            defpackage.aic aic = (defpackage.aic) this.m.get(size);
            android.view.View view2 = aic.e.itemView;
            if (a(view2, x2, y2, aic.i, aic.j)) {
                return view2;
            }
        }
        android.support.v7.widget.RecyclerView recyclerView = this.o;
        for (int a2 = recyclerView.g.a() - 1; a2 >= 0; a2--) {
            android.view.View b2 = recyclerView.g.b(a2);
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
                this.q.computeCurrentVelocity(1000, defpackage.ahy.b(this.A));
                float xVelocity = this.q.getXVelocity(this.i);
                float yVelocity = this.q.getYVelocity(this.i);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = java.lang.Math.abs(xVelocity);
                if ((i3 & i2) != 0 && i4 == i3 && abs >= defpackage.ahy.a(this.z) && abs > java.lang.Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = ((float) this.o.getWidth()) * defpackage.ahy.e();
            if ((i2 & i4) != 0 && java.lang.Math.abs(this.e) > width) {
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
                this.q.computeCurrentVelocity(1000, defpackage.ahy.b(this.A));
                float xVelocity = this.q.getXVelocity(this.i);
                float yVelocity = this.q.getYVelocity(this.i);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = java.lang.Math.abs(yVelocity);
                if ((i3 & i2) != 0 && i3 == i4 && abs >= defpackage.ahy.a(this.z) && abs > java.lang.Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = ((float) this.o.getHeight()) * defpackage.ahy.e();
            if ((i2 & i4) != 0 && java.lang.Math.abs(this.f) > height) {
                return i4;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final void b(android.view.View view) {
        if (view == this.t) {
            this.t = null;
            if (this.B != null) {
                this.o.setChildDrawingOrderCallback((ChildDrawingOrderCallback) null);
            }
        }
    }
}
