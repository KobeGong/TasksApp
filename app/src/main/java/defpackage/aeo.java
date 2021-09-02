package defpackage;

/* renamed from: aeo reason: default package */
/* compiled from: PG */
public final class aeo {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public int c;
    private defpackage.rg d;
    private final defpackage.abd e;
    private final defpackage.aen f;

    public final defpackage.abe a(int i, int i2, int i3, java.lang.Object obj) {
        defpackage.abe abe = (defpackage.abe) this.d.a();
        if (abe == null) {
            return new defpackage.abe(i, i2, i3, obj);
        }
        abe.a = i;
        abe.b = i2;
        abe.d = i3;
        abe.c = obj;
        return abe;
    }

    private final void a(defpackage.abe abe) {
        abe.c = null;
        this.d.a(abe);
    }

    public aeo(defpackage.abd abd) {
        this(abd, 0);
    }

    private aeo(defpackage.abd abd, byte b2) {
        this.d = new defpackage.rg(30);
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.c = 0;
        this.e = abd;
        this.f = new defpackage.aen(this);
    }

    public final void a() {
        a((java.util.List) this.a);
        a((java.util.List) this.b);
        this.c = 0;
    }

    public final void b() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        defpackage.aen aen = this.f;
        java.util.ArrayList arrayList = this.a;
        while (true) {
            boolean z4 = false;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((defpackage.abe) arrayList.get(size)).a != 8) {
                        z3 = true;
                    } else if (z4) {
                        i = size;
                    } else {
                        z3 = z4;
                    }
                    size--;
                    z4 = z3;
                } else {
                    i = -1;
                }
            }
            if (i != -1) {
                int i5 = i + 1;
                defpackage.abe abe = (defpackage.abe) arrayList.get(i);
                defpackage.abe abe2 = (defpackage.abe) arrayList.get(i5);
                switch (abe2.a) {
                    case 1:
                        int i6 = 0;
                        if (abe.d < abe2.b) {
                            i6 = -1;
                        }
                        if (abe.b < abe2.b) {
                            i6++;
                        }
                        if (abe2.b <= abe.b) {
                            abe.b += abe2.d;
                        }
                        if (abe2.b <= abe.d) {
                            abe.d += abe2.d;
                        }
                        abe2.b = i6 + abe2.b;
                        arrayList.set(i, abe2);
                        arrayList.set(i5, abe);
                        break;
                    case 2:
                        defpackage.abe abe3 = null;
                        boolean z5 = false;
                        if (abe.b < abe.d) {
                            z2 = false;
                            if (abe2.b == abe.b && abe2.d == abe.d - abe.b) {
                                z5 = true;
                            }
                        } else {
                            z2 = true;
                            if (abe2.b == abe.d + 1 && abe2.d == abe.b - abe.d) {
                                z5 = true;
                            }
                        }
                        if (abe.d >= abe2.b) {
                            if (abe.d < abe2.b + abe2.d) {
                                abe2.d--;
                                abe.a = 2;
                                abe.d = 1;
                                if (abe2.d != 0) {
                                    break;
                                } else {
                                    arrayList.remove(i5);
                                    aen.a.a(abe2);
                                    break;
                                }
                            }
                        } else {
                            abe2.b--;
                        }
                        if (abe.b <= abe2.b) {
                            abe2.b++;
                        } else if (abe.b < abe2.b + abe2.d) {
                            abe3 = aen.a.a(2, abe.b + 1, (abe2.b + abe2.d) - abe.b, null);
                            abe2.d = abe.b - abe2.b;
                        }
                        if (!z5) {
                            if (z2) {
                                if (abe3 != null) {
                                    if (abe.b > abe3.b) {
                                        abe.b -= abe3.d;
                                    }
                                    if (abe.d > abe3.b) {
                                        abe.d -= abe3.d;
                                    }
                                }
                                if (abe.b > abe2.b) {
                                    abe.b -= abe2.d;
                                }
                                if (abe.d > abe2.b) {
                                    abe.d -= abe2.d;
                                }
                            } else {
                                if (abe3 != null) {
                                    if (abe.b >= abe3.b) {
                                        abe.b -= abe3.d;
                                    }
                                    if (abe.d >= abe3.b) {
                                        abe.d -= abe3.d;
                                    }
                                }
                                if (abe.b >= abe2.b) {
                                    abe.b -= abe2.d;
                                }
                                if (abe.d >= abe2.b) {
                                    abe.d -= abe2.d;
                                }
                            }
                            arrayList.set(i, abe2);
                            if (abe.b != abe.d) {
                                arrayList.set(i5, abe);
                            } else {
                                arrayList.remove(i5);
                            }
                            if (abe3 == null) {
                                break;
                            } else {
                                arrayList.add(i, abe3);
                                break;
                            }
                        } else {
                            arrayList.set(i, abe2);
                            arrayList.remove(i5);
                            aen.a.a(abe);
                            break;
                        }
                    case 4:
                        defpackage.abe abe4 = null;
                        defpackage.abe abe5 = null;
                        if (abe.d < abe2.b) {
                            abe2.b--;
                        } else if (abe.d < abe2.b + abe2.d) {
                            abe2.d--;
                            abe4 = aen.a.a(4, abe.b, 1, abe2.c);
                        }
                        if (abe.b <= abe2.b) {
                            abe2.b++;
                        } else if (abe.b < abe2.b + abe2.d) {
                            int i7 = (abe2.b + abe2.d) - abe.b;
                            abe5 = aen.a.a(4, abe.b + 1, i7, abe2.c);
                            abe2.d -= i7;
                        }
                        arrayList.set(i5, abe);
                        if (abe2.d > 0) {
                            arrayList.set(i, abe2);
                        } else {
                            arrayList.remove(i);
                            aen.a.a(abe2);
                        }
                        if (abe4 != null) {
                            arrayList.add(i, abe4);
                        }
                        if (abe5 == null) {
                            break;
                        } else {
                            arrayList.add(i, abe5);
                            break;
                        }
                }
            } else {
                int size2 = this.a.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    defpackage.abe abe6 = (defpackage.abe) this.a.get(i8);
                    switch (abe6.a) {
                        case 1:
                            c(abe6);
                            break;
                        case 2:
                            int i9 = abe6.b;
                            int i10 = abe6.d + abe6.b;
                            char c2 = 65535;
                            int i11 = abe6.b;
                            int i12 = 0;
                            while (i11 < i10) {
                                boolean z6 = false;
                                if (this.e.a(i11) != null || b(i11)) {
                                    if (c2 == 0) {
                                        b(a(2, i9, i12, null));
                                        z6 = true;
                                    }
                                    c2 = 1;
                                } else {
                                    if (c2 == 1) {
                                        c(a(2, i9, i12, null));
                                        z6 = true;
                                    }
                                    c2 = 0;
                                }
                                if (z6) {
                                    i4 = i11 - i12;
                                    i2 = i10 - i12;
                                    i3 = 1;
                                } else {
                                    int i13 = i11;
                                    i2 = i10;
                                    i3 = i12 + 1;
                                    i4 = i13;
                                }
                                i12 = i3;
                                i10 = i2;
                                i11 = i4 + 1;
                            }
                            if (i12 != abe6.d) {
                                a(abe6);
                                abe6 = a(2, i9, i12, null);
                            }
                            if (c2 != 0) {
                                c(abe6);
                                break;
                            } else {
                                b(abe6);
                                break;
                            }
                            break;
                        case 4:
                            int i14 = abe6.b;
                            int i15 = abe6.b + abe6.d;
                            int i16 = abe6.b;
                            int i17 = 0;
                            int i18 = i14;
                            boolean z7 = true;
                            while (i16 < i15) {
                                if (this.e.a(i16) != null || b(i16)) {
                                    if (!z7) {
                                        b(a(4, i18, i17, abe6.c));
                                        i17 = 0;
                                        i18 = i16;
                                    }
                                    z = true;
                                } else {
                                    if (z7) {
                                        c(a(4, i18, i17, abe6.c));
                                        i17 = 0;
                                        i18 = i16;
                                    }
                                    z = false;
                                }
                                boolean z8 = z;
                                int i19 = i18;
                                i16++;
                                i17++;
                                i18 = i19;
                                z7 = z8;
                            }
                            if (i17 != abe6.d) {
                                java.lang.Object obj = abe6.c;
                                a(abe6);
                                abe6 = a(4, i18, i17, obj);
                            }
                            if (z7) {
                                c(abe6);
                                break;
                            } else {
                                b(abe6);
                                break;
                            }
                        case 8:
                            c(abe6);
                            break;
                    }
                }
                this.a.clear();
                return;
            }
        }
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.a((defpackage.abe) this.b.get(i));
        }
        a((java.util.List) this.b);
        this.c = 0;
    }

    private final void b(defpackage.abe abe) {
        int i;
        boolean z;
        if (abe.a == 1 || abe.a == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(abe.b, abe.a);
        int i2 = abe.b;
        switch (abe.a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                throw new java.lang.IllegalArgumentException("op should be remove or update." + abe);
        }
        int i3 = 1;
        int i4 = b2;
        int i5 = i2;
        for (int i6 = 1; i6 < abe.d; i6++) {
            int b3 = b(abe.b + (i * i6), abe.a);
            switch (abe.a) {
                case 2:
                    if (b3 != i4) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 4:
                    if (b3 != i4 + 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    z = false;
                    break;
            }
            if (z) {
                i3++;
            } else {
                defpackage.abe a2 = a(abe.a, i4, i3, abe.c);
                a(a2, i5);
                a(a2);
                if (abe.a == 4) {
                    i5 += i3;
                }
                i3 = 1;
                i4 = b3;
            }
        }
        java.lang.Object obj = abe.c;
        a(abe);
        if (i3 > 0) {
            defpackage.abe a3 = a(abe.a, i4, i3, obj);
            a(a3, i5);
            a(a3);
        }
    }

    private final void a(defpackage.abe abe, int i) {
        this.e.a(abe);
        switch (abe.a) {
            case 2:
                this.e.a(i, abe.d);
                return;
            case 4:
                this.e.a(i, abe.d, abe.c);
                return;
            default:
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private final int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = this.b.size() - 1;
        int i6 = i;
        while (size >= 0) {
            defpackage.abe abe = (defpackage.abe) this.b.get(size);
            if (abe.a == 8) {
                if (abe.b < abe.d) {
                    i4 = abe.b;
                    i5 = abe.d;
                } else {
                    i4 = abe.d;
                    i5 = abe.b;
                }
                if (i6 < i4 || i6 > i5) {
                    if (i6 < abe.b) {
                        if (i2 == 1) {
                            abe.b++;
                            abe.d++;
                            i3 = i6;
                        } else if (i2 == 2) {
                            abe.b--;
                            abe.d--;
                        }
                    }
                    i3 = i6;
                } else if (i4 == abe.b) {
                    if (i2 == 1) {
                        abe.d++;
                    } else if (i2 == 2) {
                        abe.d--;
                    }
                    i3 = i6 + 1;
                } else {
                    if (i2 == 1) {
                        abe.b++;
                    } else if (i2 == 2) {
                        abe.b--;
                    }
                    i3 = i6 - 1;
                }
            } else {
                if (abe.b <= i6) {
                    if (abe.a == 1) {
                        i3 = i6 - abe.d;
                    } else if (abe.a == 2) {
                        i3 = abe.d + i6;
                    }
                } else if (i2 == 1) {
                    abe.b++;
                    i3 = i6;
                } else if (i2 == 2) {
                    abe.b--;
                }
                i3 = i6;
            }
            size--;
            i6 = i3;
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            defpackage.abe abe2 = (defpackage.abe) this.b.get(size2);
            if (abe2.a == 8) {
                if (abe2.d == abe2.b || abe2.d < 0) {
                    this.b.remove(size2);
                    a(abe2);
                }
            } else if (abe2.d <= 0) {
                this.b.remove(size2);
                a(abe2);
            }
        }
        return i6;
    }

    private final boolean b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.abe abe = (defpackage.abe) this.b.get(i2);
            if (abe.a == 8) {
                if (a(abe.d, i2 + 1) == i) {
                    return true;
                }
            } else if (abe.a == 1) {
                int i3 = abe.b + abe.d;
                for (int i4 = abe.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private final void c(defpackage.abe abe) {
        this.b.add(abe);
        switch (abe.a) {
            case 1:
                this.e.b(abe.b, abe.d);
                return;
            case 2:
                defpackage.abd abd = this.e;
                abd.a.a(abe.b, abe.d, false);
                abd.a.F = true;
                return;
            case 4:
                this.e.a(abe.b, abe.d, abe.c);
                return;
            case 8:
                this.e.c(abe.b, abe.d);
                return;
            default:
                throw new java.lang.IllegalArgumentException("Unknown update op type for " + abe);
        }
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final boolean a(int i) {
        return (this.c & i) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i, int i2) {
        int size = this.b.size();
        int i3 = i;
        while (i2 < size) {
            defpackage.abe abe = (defpackage.abe) this.b.get(i2);
            if (abe.a == 8) {
                if (abe.b == i3) {
                    i3 = abe.d;
                } else {
                    if (abe.b < i3) {
                        i3--;
                    }
                    if (abe.d <= i3) {
                        i3++;
                    }
                }
            } else if (abe.b > i3) {
                continue;
            } else if (abe.a == 2) {
                if (i3 < abe.b + abe.d) {
                    return -1;
                }
                i3 -= abe.d;
            } else if (abe.a == 1) {
                i3 += abe.d;
            }
            i2++;
        }
        return i3;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            defpackage.abe abe = (defpackage.abe) this.a.get(i);
            switch (abe.a) {
                case 1:
                    this.e.a(abe);
                    this.e.b(abe.b, abe.d);
                    break;
                case 2:
                    this.e.a(abe);
                    this.e.a(abe.b, abe.d);
                    break;
                case 4:
                    this.e.a(abe);
                    this.e.a(abe.b, abe.d, abe.c);
                    break;
                case 8:
                    this.e.a(abe);
                    this.e.c(abe.b, abe.d);
                    break;
            }
        }
        a((java.util.List) this.a);
        this.c = 0;
    }

    private final void a(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((defpackage.abe) list.get(i));
        }
        list.clear();
    }
}
