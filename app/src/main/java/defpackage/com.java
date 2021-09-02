package defpackage;

/* renamed from: com reason: default package */
/* compiled from: PG */
public final class com extends defpackage.dlz {
    public defpackage.egf a;
    public java.lang.Long b;
    public java.lang.Long c;
    public java.lang.Long d;
    public java.lang.Long e;
    public java.lang.Integer f;
    public java.lang.String g;
    public java.lang.Boolean h;
    public defpackage.eeo i;

    public com() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = -1;
    }

    public final void a(defpackage.dlx dlx) {
        if (this.a != null) {
            dlx.a(1, (defpackage.dmf) this.a);
        }
        if (this.b != null) {
            dlx.a(2, this.b.longValue());
        }
        if (this.c != null) {
            dlx.a(3, this.c.longValue());
        }
        if (this.d != null) {
            dlx.a(4, this.d.longValue());
        }
        if (this.e != null) {
            dlx.b(5, this.e.longValue());
        }
        if (this.f != null) {
            dlx.a(6, this.f.intValue());
        }
        if (this.g != null) {
            dlx.a(7, this.g);
        }
        if (this.h != null) {
            dlx.a(8, this.h.booleanValue());
        }
        if (this.i != null) {
            dlx.a(9, (defpackage.dmf) this.i);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += defpackage.dlx.b(1, (defpackage.dmf) this.a);
        }
        if (this.b != null) {
            a2 += defpackage.dlx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += defpackage.dlx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += defpackage.dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            this.e.longValue();
            a2 += defpackage.dlx.c(40) + 8;
        }
        if (this.f != null) {
            a2 += defpackage.dlx.c(6, this.f.intValue());
        }
        if (this.g != null) {
            a2 += defpackage.dlx.b(7, this.g);
        }
        if (this.h != null) {
            this.h.booleanValue();
            a2 += defpackage.dlx.c(64) + 1;
        }
        if (this.i != null) {
            return a2 + defpackage.dlx.b(9, (defpackage.dmf) this.i);
        }
        return a2;
    }

    public final /* synthetic */ defpackage.dmf a(defpackage.dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new defpackage.egf();
                    }
                    dlw.a((defpackage.dmf) this.a);
                    continue;
                case 16:
                    long j = 0;
                    int i2 = 0;
                    while (i2 < 64) {
                        byte j2 = dlw.j();
                        j |= ((long) (j2 & Byte.MAX_VALUE)) << i2;
                        if ((j2 & 128) == 0) {
                            this.b = java.lang.Long.valueOf(j);
                            continue;
                        } else {
                            i2 += 7;
                        }
                    }
                    throw defpackage.dme.c();
                case 24:
                    long j3 = 0;
                    int i3 = 0;
                    while (i3 < 64) {
                        byte j4 = dlw.j();
                        j3 |= ((long) (j4 & Byte.MAX_VALUE)) << i3;
                        if ((j4 & 128) == 0) {
                            this.c = java.lang.Long.valueOf(j3);
                            continue;
                        } else {
                            i3 += 7;
                        }
                    }
                    throw defpackage.dme.c();
                case 32:
                    long j5 = 0;
                    int i4 = 0;
                    while (i4 < 64) {
                        byte j6 = dlw.j();
                        j5 |= ((long) (j6 & Byte.MAX_VALUE)) << i4;
                        if ((j6 & 128) == 0) {
                            this.d = java.lang.Long.valueOf(j5);
                            continue;
                        } else {
                            i4 += 7;
                        }
                    }
                    throw defpackage.dme.c();
                case 41:
                    this.e = java.lang.Long.valueOf(dlw.g());
                    continue;
                case 48:
                    this.f = java.lang.Integer.valueOf(dlw.e());
                    continue;
                case 58:
                    this.g = dlw.d();
                    continue;
                case 64:
                    this.h = java.lang.Boolean.valueOf(dlw.c());
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new defpackage.eeo();
                    }
                    dlw.a((defpackage.dmf) this.i);
                    continue;
                default:
                    if (!super.a(dlw, a2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }
}
