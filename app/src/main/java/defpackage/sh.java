package defpackage;

/* renamed from: sh reason: default package */
/* compiled from: PG */
public final class sh {
    public boolean a;
    private android.view.ViewParent b;
    private android.view.ViewParent c;
    private final android.view.View d;
    private int[] e;

    public sh(android.view.View view) {
        this.d = view;
    }

    public final void a(boolean z) {
        if (this.a) {
            ViewCompat.a.x(this.d);
        }
        this.a = z;
    }

    public final boolean a(int i) {
        return c(i) != null;
    }

    public final boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (this.a) {
            android.view.View view = this.d;
            for (android.view.ViewParent parent = this.d.getParent(); parent != null; parent = parent.getParent()) {
                if (defpackage.tb.a(parent, view, this.d, i, i2)) {
                    a(i2, parent);
                    defpackage.tb.b(parent, view, this.d, i, i2);
                    return true;
                }
                if (parent instanceof android.view.View) {
                    view = (android.view.View) parent;
                }
            }
        }
        return false;
    }

    public final void b(int i) {
        android.view.ViewParent c2 = c(i);
        if (c2 != null) {
            defpackage.tb.a(c2, this.d, i);
            a(i, (android.view.ViewParent) null);
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0);
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        if (this.a) {
            android.view.ViewParent c2 = c(i5);
            if (c2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    this.d.getLocationInWindow(iArr);
                    int i8 = iArr[0];
                    i6 = iArr[1];
                    i7 = i8;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                defpackage.tb.a(c2, this.d, i, i2, i3, i4, i5);
                if (iArr != null) {
                    this.d.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public final boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        int[] iArr3;
        if (this.a) {
            android.view.ViewParent c2 = c(i3);
            if (c2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    iArr3 = this.e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                defpackage.tb.a(c2, this.d, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (!this.a) {
            return false;
        }
        android.view.ViewParent c2 = c(0);
        if (c2 == null) {
            return false;
        }
        return defpackage.tb.a.a(c2, this.d, f, f2, z);
    }

    public final boolean a(float f, float f2) {
        if (!this.a) {
            return false;
        }
        android.view.ViewParent c2 = c(0);
        if (c2 == null) {
            return false;
        }
        return defpackage.tb.a.a(c2, this.d, f, f2);
    }

    private final android.view.ViewParent c(int i) {
        switch (i) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            default:
                return null;
        }
    }

    private final void a(int i, android.view.ViewParent viewParent) {
        switch (i) {
            case 0:
                this.b = viewParent;
                return;
            case 1:
                this.c = viewParent;
                return;
            default:
                return;
        }
    }
}
