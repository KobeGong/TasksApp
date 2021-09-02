package defpackage;

/* renamed from: adh reason: default package */
/* compiled from: PG */
public final class adh extends defpackage.afc implements defpackage.afj {
    private static final int[] p = {16842919};
    private static final int[] q = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final java.lang.Runnable D = new defpackage.adi(this);
    private final defpackage.afk E = new defpackage.adj(this);
    public final int a;
    public final android.graphics.drawable.StateListDrawable b;
    public final android.graphics.drawable.Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public android.support.v7.widget.RecyclerView j;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public final android.animation.ValueAnimator n = android.animation.ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public int o = 0;
    private final int r;
    private final int s;
    private final int t;
    private final android.graphics.drawable.StateListDrawable u;
    private final android.graphics.drawable.Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;

    public adh(android.support.v7.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i2, int i3, int i4) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = java.lang.Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.t = java.lang.Math.max(i2, drawable.getIntrinsicWidth());
        this.w = java.lang.Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.x = java.lang.Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.r = i4;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new defpackage.adk(this));
        this.n.addUpdateListener(new defpackage.adl(this));
        if (this.j != recyclerView) {
            if (this.j != null) {
                this.j.b((defpackage.afc) this);
                this.j.b((defpackage.afj) this);
                android.support.v7.widget.RecyclerView recyclerView2 = this.j;
                defpackage.afk afk = this.E;
                if (recyclerView2.E != null) {
                    recyclerView2.E.remove(afk);
                }
                c();
            }
            this.j = recyclerView;
            if (this.j != null) {
                android.support.v7.widget.RecyclerView recyclerView3 = this.j;
                if (recyclerView3.l != null) {
                    recyclerView3.l.a("Cannot add item decoration during a scroll  or layout");
                }
                if (recyclerView3.n.isEmpty()) {
                    recyclerView3.setWillNotDraw(false);
                }
                recyclerView3.n.add(this);
                recyclerView3.l();
                recyclerView3.requestLayout();
                this.j.a((defpackage.afj) this);
                this.j.a(this.E);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (i2 == 2 && this.m != 2) {
            this.b.setState(p);
            c();
        }
        if (i2 == 0) {
            this.j.invalidate();
        } else {
            b();
        }
        if (this.m == 2 && i2 != 2) {
            this.b.setState(q);
            b(1200);
        } else if (i2 == 1) {
            b(1500);
        }
        this.m = i2;
    }

    private final boolean a() {
        if (defpackage.sn.a.j(this.j) == 1) {
            return true;
        }
        return false;
    }

    private final void b() {
        switch (this.o) {
            case 0:
                break;
            case 3:
                this.n.cancel();
                break;
            default:
                return;
        }
        this.o = 1;
        this.n.setFloatValues(new float[]{((java.lang.Float) this.n.getAnimatedValue()).floatValue(), 1.0f});
        this.n.setDuration(500);
        this.n.setStartDelay(0);
        this.n.start();
    }

    private final void c() {
        this.j.removeCallbacks(this.D);
    }

    private final void b(int i2) {
        c();
        this.j.postDelayed(this.D, (long) i2);
    }

    public final void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        if (this.h != this.j.getWidth() || this.i != this.j.getHeight()) {
            this.h = this.j.getWidth();
            this.i = this.j.getHeight();
            a(0);
        } else if (this.o != 0) {
            if (this.k) {
                int i2 = this.h - this.s;
                int i3 = this.e - (this.d / 2);
                this.b.setBounds(0, 0, this.s, this.d);
                this.c.setBounds(0, 0, this.t, this.i);
                if (a()) {
                    this.c.draw(canvas);
                    canvas.translate((float) this.s, (float) i3);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.s), (float) (-i3));
                } else {
                    canvas.translate((float) i2, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, (float) i3);
                    this.b.draw(canvas);
                    canvas.translate((float) (-i2), (float) (-i3));
                }
            }
            if (this.l) {
                int i4 = this.i - this.w;
                int i5 = this.g - (this.f / 2);
                this.u.setBounds(0, 0, this.f, this.w);
                this.v.setBounds(0, 0, this.h, this.x);
                canvas.translate(0.0f, (float) i4);
                this.v.draw(canvas);
                canvas.translate((float) i5, 0.0f);
                this.u.draw(canvas);
                canvas.translate((float) (-i5), (float) (-i4));
            }
        }
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        if (this.m == 1) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0 || (!a2 && !b2)) {
                return false;
            }
            if (b2) {
                this.A = 1;
                this.z = (float) ((int) motionEvent.getX());
            } else if (a2) {
                this.A = 2;
                this.y = (float) ((int) motionEvent.getY());
            }
            a(2);
            return true;
        } else if (this.m != 2) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(android.view.MotionEvent motionEvent) {
        if (this.m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                if (a2 || b2) {
                    if (b2) {
                        this.A = 1;
                        this.z = (float) ((int) motionEvent.getX());
                    } else if (a2) {
                        this.A = 2;
                        this.y = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.m == 2) {
                this.y = 0.0f;
                this.z = 0.0f;
                a(1);
                this.A = 0;
            } else if (motionEvent.getAction() == 2 && this.m == 2) {
                b();
                if (this.A == 1) {
                    float x2 = motionEvent.getX();
                    this.C[0] = this.r;
                    this.C[1] = this.h - this.r;
                    int[] iArr = this.C;
                    float max = java.lang.Math.max((float) iArr[0], java.lang.Math.min((float) iArr[1], x2));
                    if (java.lang.Math.abs(((float) this.g) - max) >= 2.0f) {
                        int a3 = a(this.z, max, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                        if (a3 != 0) {
                            this.j.scrollBy(a3, 0);
                        }
                        this.z = max;
                    }
                }
                if (this.A == 2) {
                    float y2 = motionEvent.getY();
                    this.B[0] = this.r;
                    this.B[1] = this.i - this.r;
                    int[] iArr2 = this.B;
                    float max2 = java.lang.Math.max((float) iArr2[0], java.lang.Math.min((float) iArr2[1], y2));
                    if (java.lang.Math.abs(((float) this.e) - max2) >= 2.0f) {
                        int a4 = a(this.y, max2, iArr2, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                        if (a4 != 0) {
                            this.j.scrollBy(0, a4);
                        }
                        this.y = max2;
                    }
                }
            }
        }
    }

    public final void a(boolean z2) {
    }

    private static int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private final boolean a(float f2, float f3) {
        if (!a() ? f2 >= ((float) (this.h - this.s)) : f2 <= ((float) (this.s / 2))) {
            if (f3 >= ((float) (this.e - (this.d / 2))) && f3 <= ((float) (this.e + (this.d / 2)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(float f2, float f3) {
        return f3 >= ((float) (this.i - this.w)) && f2 >= ((float) (this.g - (this.f / 2))) && f2 <= ((float) (this.g + (this.f / 2)));
    }
}
