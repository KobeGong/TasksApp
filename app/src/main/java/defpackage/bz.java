package defpackage;

import java.util.Arrays;

/* renamed from: bz  reason: default package */
/* compiled from: PG */
public final class bz {
    public int a = 0;
    public final cb b;
    public int[] c = new int[this.j];
    public int[] d = new int[this.j];
    public float[] e = new float[this.j];
    public int f = -1;
    public int g = -1;
    public boolean h = false;
    private final ca i;
    private int j = 8;

    bz(ca caVar, cb cbVar) {
        this.i = caVar;
        this.b = cbVar;
    }

    public final void a(cf cfVar, float f2) {
        if (f2 == 0.0f) {
            a(cfVar);
        } else if (this.f == -1) {
            this.f = 0;
            this.e[this.f] = f2;
            this.c[this.f] = cfVar.a;
            this.d[this.f] = -1;
            this.a++;
            if (!this.h) {
                this.g++;
            }
        } else {
            int i2 = this.f;
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.a) {
                if (this.c[i2] == cfVar.a) {
                    this.e[i2] = f2;
                    return;
                }
                if (this.c[i2] < cfVar.a) {
                    i4 = i2;
                }
                i3++;
                i2 = this.d[i2];
            }
            int i5 = this.g + 1;
            if (this.h) {
                if (this.c[this.g] == -1) {
                    i5 = this.g;
                } else {
                    i5 = this.c.length;
                }
            }
            if (i5 >= this.c.length && this.a < this.c.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.c.length) {
                        break;
                    } else if (this.c[i6] == -1) {
                        i5 = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (i5 >= this.c.length) {
                i5 = this.c.length;
                this.j <<= 1;
                this.h = false;
                this.g = i5 - 1;
                this.e = Arrays.copyOf(this.e, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
            }
            this.c[i5] = cfVar.a;
            this.e[i5] = f2;
            if (i4 != -1) {
                this.d[i5] = this.d[i4];
                this.d[i4] = i5;
            } else {
                this.d[i5] = this.f;
                this.f = i5;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            if (this.a >= this.c.length) {
                this.h = true;
            }
        }
    }

    public final void b(cf cfVar, float f2) {
        if (f2 != 0.0f) {
            if (this.f == -1) {
                this.f = 0;
                this.e[this.f] = f2;
                this.c[this.f] = cfVar.a;
                this.d[this.f] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                    return;
                }
                return;
            }
            int i2 = this.f;
            int i3 = 0;
            int i4 = -1;
            while (i2 != -1 && i3 < this.a) {
                int i5 = this.c[i2];
                if (i5 == cfVar.a) {
                    float[] fArr = this.e;
                    fArr[i2] = fArr[i2] + f2;
                    if (this.e[i2] == 0.0f) {
                        if (i2 == this.f) {
                            this.f = this.d[i2];
                        } else {
                            this.d[i4] = this.d[i2];
                        }
                        this.b.c[i5].a(this.i);
                        if (this.h) {
                            this.g = i2;
                        }
                        this.a--;
                        return;
                    }
                    return;
                }
                if (this.c[i2] < cfVar.a) {
                    i4 = i2;
                }
                i3++;
                i2 = this.d[i2];
            }
            int i6 = this.g + 1;
            if (this.h) {
                if (this.c[this.g] == -1) {
                    i6 = this.g;
                } else {
                    i6 = this.c.length;
                }
            }
            if (i6 >= this.c.length && this.a < this.c.length) {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.c.length) {
                        break;
                    } else if (this.c[i7] == -1) {
                        i6 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (i6 >= this.c.length) {
                i6 = this.c.length;
                this.j <<= 1;
                this.h = false;
                this.g = i6 - 1;
                this.e = Arrays.copyOf(this.e, this.j);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
            }
            this.c[i6] = cfVar.a;
            this.e[i6] = f2;
            if (i4 != -1) {
                this.d[i6] = this.d[i4];
                this.d[i4] = i6;
            } else {
                this.d[i6] = this.f;
                this.f = i6;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            if (this.g >= this.c.length) {
                this.h = true;
                this.g = this.c.length - 1;
            }
        }
    }

    public final float a(cf cfVar) {
        if (this.f == -1) {
            return 0.0f;
        }
        int i2 = this.f;
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            int i5 = this.c[i2];
            if (i5 == cfVar.a) {
                if (i2 == this.f) {
                    this.f = this.d[i2];
                } else {
                    this.d[i4] = this.d[i2];
                }
                this.b.c[i5].a(this.i);
                this.a--;
                this.c[i2] = -1;
                if (this.h) {
                    this.g = i2;
                }
                return this.e[i2];
            }
            i3++;
            i2 = this.d[i2];
            i4 = i2;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final void a(ca caVar, ca caVar2) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.c[i2] == caVar2.a.a) {
                float f2 = this.e[i2];
                a(caVar2.a);
                bz bzVar = caVar2.c;
                int i4 = bzVar.f;
                int i5 = 0;
                while (i4 != -1 && i5 < bzVar.a) {
                    b(this.b.c[bzVar.c[i4]], bzVar.e[i4] * f2);
                    i4 = bzVar.d[i4];
                    i5++;
                }
                caVar.b += caVar2.b * f2;
                caVar2.a.a(caVar);
                i2 = this.f;
                i3 = 0;
            } else {
                i2 = this.d[i2];
                i3++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final cf a(int i2) {
        int i3 = this.f;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.b.c[this.c[i3]];
            }
            i3 = this.d[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float b(int i2) {
        int i3 = this.f;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.e[i3];
            }
            i3 = this.d[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float b(cf cfVar) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.c[i2] == cfVar.a) {
                return this.e[i2];
            }
            i2 = this.d[i2];
            i3++;
        }
        return 0.0f;
    }

    public final String toString() {
        String str = "";
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            str = ((str + " -> ") + this.e[i2] + " : ") + this.b.c[this.c[i2]];
            i2 = this.d[i2];
            i3++;
        }
        return str;
    }
}
