package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: bu  reason: default package */
/* compiled from: PG */
public final class bu extends ViewGroup.MarginLayoutParams {
    public float A = 0.0f;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public boolean M = true;
    public boolean N = true;
    public boolean O = false;
    public boolean P = false;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public float W = 0.5f;
    public ch X = new ch();
    private int Y = 1;
    public int a = -1;
    public int b = -1;
    public float c = -1.0f;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public float w = 0.5f;
    public float x = 0.5f;
    public String y = null;
    public float z = 0.0f;

    public bu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == by.x) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
                if (this.d == -1) {
                    this.d = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.y) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
                if (this.e == -1) {
                    this.e = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.z) {
                this.f = obtainStyledAttributes.getResourceId(index, this.f);
                if (this.f == -1) {
                    this.f = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.A) {
                this.g = obtainStyledAttributes.getResourceId(index, this.g);
                if (this.g == -1) {
                    this.g = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.F) {
                this.h = obtainStyledAttributes.getResourceId(index, this.h);
                if (this.h == -1) {
                    this.h = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.E) {
                this.i = obtainStyledAttributes.getResourceId(index, this.i);
                if (this.i == -1) {
                    this.i = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.j) {
                this.j = obtainStyledAttributes.getResourceId(index, this.j);
                if (this.j == -1) {
                    this.j = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.i) {
                this.k = obtainStyledAttributes.getResourceId(index, this.k);
                if (this.k == -1) {
                    this.k = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.h) {
                this.l = obtainStyledAttributes.getResourceId(index, this.l);
                if (this.l == -1) {
                    this.l = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.M) {
                this.J = obtainStyledAttributes.getDimensionPixelOffset(index, this.J);
            } else if (index == by.N) {
                this.K = obtainStyledAttributes.getDimensionPixelOffset(index, this.K);
            } else if (index == by.n) {
                this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
            } else if (index == by.o) {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
            } else if (index == by.p) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == by.f) {
                this.L = obtainStyledAttributes.getInt(index, this.L);
            } else if (index == by.B) {
                this.m = obtainStyledAttributes.getResourceId(index, this.m);
                if (this.m == -1) {
                    this.m = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.C) {
                this.n = obtainStyledAttributes.getResourceId(index, this.n);
                if (this.n == -1) {
                    this.n = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.m) {
                this.o = obtainStyledAttributes.getResourceId(index, this.o);
                if (this.o == -1) {
                    this.o = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.l) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
                if (this.p == -1) {
                    this.p = obtainStyledAttributes.getInt(index, -1);
                }
            } else if (index == by.Q) {
                this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
            } else if (index == by.T) {
                this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
            } else if (index == by.R) {
                this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
            } else if (index == by.O) {
                this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
            } else if (index == by.S) {
                this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
            } else if (index == by.P) {
                this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
            } else if (index == by.t) {
                this.w = obtainStyledAttributes.getFloat(index, this.w);
            } else if (index == by.G) {
                this.x = obtainStyledAttributes.getFloat(index, this.x);
            } else if (index == by.k) {
                this.y = obtainStyledAttributes.getString(index);
                this.Y = -1;
                if (this.y != null) {
                    int length = this.y.length();
                    int indexOf = this.y.indexOf(44);
                    if (indexOf <= 0 || indexOf >= length - 1) {
                        i2 = 0;
                    } else {
                        String substring = this.y.substring(0, indexOf);
                        if (substring.equalsIgnoreCase("W")) {
                            this.Y = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.Y = 1;
                        }
                        i2 = indexOf + 1;
                    }
                    int indexOf2 = this.y.indexOf(58);
                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                        String substring2 = this.y.substring(i2);
                        if (substring2.length() > 0) {
                            try {
                                Float.parseFloat(substring2);
                            } catch (NumberFormatException e2) {
                            }
                        }
                    } else {
                        String substring3 = this.y.substring(i2, indexOf2);
                        String substring4 = this.y.substring(indexOf2 + 1);
                        if (substring3.length() > 0 && substring4.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring3);
                                float parseFloat2 = Float.parseFloat(substring4);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.Y == 1) {
                                        Math.abs(parseFloat2 / parseFloat);
                                    } else {
                                        Math.abs(parseFloat / parseFloat2);
                                    }
                                }
                            } catch (NumberFormatException e3) {
                            }
                        }
                    }
                }
            } else if (index == by.v) {
                this.z = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == by.I) {
                this.A = obtainStyledAttributes.getFloat(index, 0.0f);
            } else if (index == by.u) {
                this.B = obtainStyledAttributes.getInt(index, 0);
            } else if (index == by.H) {
                this.C = obtainStyledAttributes.getInt(index, 0);
            } else if (index == by.J) {
                this.D = obtainStyledAttributes.getInt(index, 0);
            } else if (index == by.q) {
                this.E = obtainStyledAttributes.getInt(index, 0);
            } else if (index == by.L) {
                this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
            } else if (index == by.K) {
                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
            } else if (index == by.s) {
                this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
            } else if (index == by.r) {
                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
            } else if (index != by.w && index == by.D) {
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.P = false;
        this.M = true;
        this.N = true;
        if (this.width == 0 || this.width == -1) {
            this.M = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.N = false;
        }
        if (this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.P = true;
            this.M = true;
            this.N = true;
            if (!(this.X instanceof cj)) {
                this.X = new cj();
            }
            ((cj) this.X).h(this.L);
        }
    }

    public bu() {
        super(-2, -2);
    }

    public bu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    @TargetApi(17)
    public final void resolveLayoutDirection(int i2) {
        super.resolveLayoutDirection(i2);
        this.S = -1;
        this.T = -1;
        this.Q = -1;
        this.R = -1;
        this.U = -1;
        this.V = -1;
        this.U = this.q;
        this.V = this.s;
        this.W = this.w;
        if (1 == getLayoutDirection()) {
            if (this.m != -1) {
                this.S = this.m;
            } else if (this.n != -1) {
                this.T = this.n;
            }
            if (this.o != -1) {
                this.R = this.o;
            }
            if (this.p != -1) {
                this.Q = this.p;
            }
            if (this.u != -1) {
                this.V = this.u;
            }
            if (this.v != -1) {
                this.U = this.v;
            }
            this.W = 1.0f - this.w;
        } else {
            if (this.m != -1) {
                this.R = this.m;
            }
            if (this.n != -1) {
                this.Q = this.n;
            }
            if (this.o != -1) {
                this.S = this.o;
            }
            if (this.p != -1) {
                this.T = this.p;
            }
            if (this.u != -1) {
                this.U = this.u;
            }
            if (this.v != -1) {
                this.V = this.v;
            }
        }
        if (this.o == -1 && this.p == -1) {
            if (this.f != -1) {
                this.S = this.f;
            } else if (this.g != -1) {
                this.T = this.g;
            }
        }
        if (this.n != -1 || this.m != -1) {
            return;
        }
        if (this.d != -1) {
            this.Q = this.d;
        } else if (this.e != -1) {
            this.R = this.e;
        }
    }
}
