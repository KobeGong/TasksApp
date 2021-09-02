package defpackage;

/* renamed from: ca reason: default package */
/* compiled from: PG */
public final class ca {
    public defpackage.cf a = null;
    public float b = 0.0f;
    public final defpackage.bz c;
    public boolean d = false;

    public ca(defpackage.cb cbVar) {
        this.c = new defpackage.bz(this, cbVar);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        defpackage.bz bzVar = this.c;
        int i = 0;
        int i2 = bzVar.f;
        while (i2 != -1 && i < bzVar.a) {
            defpackage.cf cfVar = bzVar.b.c[bzVar.c[i2]];
            int i3 = 0;
            while (true) {
                if (i3 < cfVar.h) {
                    if (cfVar.g[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    if (cfVar.h >= cfVar.g.length) {
                        cfVar.g = (defpackage.ca[]) java.util.Arrays.copyOf(cfVar.g, cfVar.g.length << 1);
                    }
                    cfVar.g[cfVar.h] = this;
                    cfVar.h++;
                }
            }
            i2 = bzVar.d[i2];
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        float f;
        java.lang.String str3;
        java.lang.String str4 = "";
        if (this.a == null) {
            str = str4 + "0";
        } else {
            str = str4 + this.a;
        }
        java.lang.String str5 = str + " = ";
        if (this.b != 0.0f) {
            str2 = str5 + this.b;
            z = true;
        } else {
            str2 = str5;
            z = false;
        }
        int i = this.c.a;
        java.lang.String str6 = str2;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cf a2 = this.c.a(i2);
            if (a2 != null) {
                float b2 = this.c.b(i2);
                java.lang.String cfVar = a2.toString();
                if (!z) {
                    if (b2 < 0.0f) {
                        str6 = str6 + "- ";
                        f = -b2;
                    } else {
                        f = b2;
                    }
                } else if (b2 > 0.0f) {
                    str6 = str6 + " + ";
                    f = b2;
                } else {
                    str6 = str6 + " - ";
                    f = -b2;
                }
                if (f == 1.0f) {
                    str3 = str6 + cfVar;
                } else {
                    str3 = str6 + f + " " + cfVar;
                }
                str6 = str3;
                z = true;
            }
        }
        if (!z) {
            return str6 + "0.0";
        }
        return str6;
    }

    public final defpackage.ca a(defpackage.cf cfVar, int i) {
        if (i < 0) {
            this.b = (float) (i * -1);
            this.c.a(cfVar, 1.0f);
        } else {
            this.b = (float) i;
            this.c.a(cfVar, -1.0f);
        }
        return this;
    }

    public final defpackage.ca a(defpackage.cf cfVar, defpackage.cf cfVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.c.a(cfVar, -1.0f);
            this.c.a(cfVar2, 1.0f);
        } else {
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
        }
        return this;
    }

    public final defpackage.ca a(defpackage.cf cfVar, defpackage.cf cfVar2, defpackage.cf cfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.c.a(cfVar, -1.0f);
            this.c.a(cfVar2, 1.0f);
            this.c.a(cfVar3, 1.0f);
        } else {
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
            this.c.a(cfVar3, -1.0f);
        }
        return this;
    }

    public final defpackage.ca b(defpackage.cf cfVar, defpackage.cf cfVar2, defpackage.cf cfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.c.a(cfVar, -1.0f);
            this.c.a(cfVar2, 1.0f);
            this.c.a(cfVar3, -1.0f);
        } else {
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
            this.c.a(cfVar3, 1.0f);
        }
        return this;
    }

    public final defpackage.ca a(float f, float f2, float f3, defpackage.cf cfVar, int i, defpackage.cf cfVar2, int i2, defpackage.cf cfVar3, int i3, defpackage.cf cfVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = (float) (((-i) - i2) + i3 + i4);
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
            this.c.a(cfVar4, 1.0f);
            this.c.a(cfVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
            this.c.a(cfVar4, f4);
            this.c.a(cfVar3, -f4);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ca a(defpackage.cf cfVar, defpackage.cf cfVar2, int i, float f, defpackage.cf cfVar3, defpackage.cf cfVar4, int i2) {
        if (cfVar2 == cfVar3) {
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar4, 1.0f);
            this.c.a(cfVar2, -2.0f);
        } else if (f == 0.5f) {
            this.c.a(cfVar, 1.0f);
            this.c.a(cfVar2, -1.0f);
            this.c.a(cfVar3, -1.0f);
            this.c.a(cfVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.c.a(cfVar, -1.0f);
            this.c.a(cfVar2, 1.0f);
            this.b = (float) i;
        } else if (f >= 1.0f) {
            this.c.a(cfVar3, -1.0f);
            this.c.a(cfVar4, 1.0f);
            this.b = (float) i2;
        } else {
            this.c.a(cfVar, (1.0f - f) * 1.0f);
            this.c.a(cfVar2, (1.0f - f) * -1.0f);
            this.c.a(cfVar3, -1.0f * f);
            this.c.a(cfVar4, f);
            if (i > 0 || i2 > 0) {
                this.b = (((float) (-i)) * (1.0f - f)) + (((float) i2) * f);
            }
        }
        return this;
    }

    public final defpackage.ca a(defpackage.cf cfVar, defpackage.cf cfVar2) {
        this.c.a(cfVar, 1.0f);
        this.c.a(cfVar2, -1.0f);
        return this;
    }

    public final defpackage.ca a(defpackage.cf cfVar, defpackage.cf cfVar2, defpackage.cf cfVar3, defpackage.cf cfVar4, float f) {
        this.c.a(cfVar, -1.0f);
        this.c.a(cfVar2, 1.0f);
        this.c.a(cfVar3, f);
        this.c.a(cfVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.ca caVar) {
        this.c.a(this, caVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.cf cfVar) {
        if (this.a != null) {
            this.c.a(this.a, -1.0f);
            this.a = null;
        }
        float f = -this.c.a(cfVar);
        this.a = cfVar;
        if (f != 1.0f) {
            this.b /= f;
            defpackage.bz bzVar = this.c;
            int i = bzVar.f;
            int i2 = 0;
            while (i != -1 && i2 < bzVar.a) {
                float[] fArr = bzVar.e;
                fArr[i] = fArr[i] / f;
                i = bzVar.d[i];
                i2++;
            }
        }
    }
}
