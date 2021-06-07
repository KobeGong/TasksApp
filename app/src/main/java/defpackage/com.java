package defpackage;

/* renamed from: com  reason: default package */
/* compiled from: PG */
public final class com extends dlz {
    public egf a = null;
    public Long b = null;
    public Long c = null;
    public Long d = null;
    public Long e = null;
    public Integer f = null;
    public String g = null;
    public Boolean h = null;
    public eeo i = null;

    public com() {
        this.k = -1;
    }

    @Override // defpackage.dlz, defpackage.dmf
    public final void a(dlx dlx) {
        if (this.a != null) {
            dlx.a(1, this.a);
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
            dlx.a(9, this.i);
        }
        super.a(dlx);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dlz, defpackage.dmf
    public final int a() {
        int a2 = super.a();
        if (this.a != null) {
            a2 += dlx.b(1, this.a);
        }
        if (this.b != null) {
            a2 += dlx.c(2, this.b.longValue());
        }
        if (this.c != null) {
            a2 += dlx.c(3, this.c.longValue());
        }
        if (this.d != null) {
            a2 += dlx.c(4, this.d.longValue());
        }
        if (this.e != null) {
            this.e.longValue();
            a2 += dlx.c(40) + 8;
        }
        if (this.f != null) {
            a2 += dlx.c(6, this.f.intValue());
        }
        if (this.g != null) {
            a2 += dlx.b(7, this.g);
        }
        if (this.h != null) {
            this.h.booleanValue();
            a2 += dlx.c(64) + 1;
        }
        if (this.i != null) {
            return a2 + dlx.b(9, this.i);
        }
        return a2;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf a(dlw dlw) {
        while (true) {
            int a2 = dlw.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new egf();
                    }
                    dlw.a(this.a);
                    break;
                case 16:
                    long j = 0;
                    for (int i2 = 0; i2 < 64; i2 += 7) {
                        byte j2 = dlw.j();
                        j |= ((long) (j2 & Byte.MAX_VALUE)) << i2;
                        if ((j2 & 128) == 0) {
                            this.b = Long.valueOf(j);
                            break;
                        }
                    }
                    throw dme.c();
                case 24:
                    long j3 = 0;
                    for (int i3 = 0; i3 < 64; i3 += 7) {
                        byte j4 = dlw.j();
                        j3 |= ((long) (j4 & Byte.MAX_VALUE)) << i3;
                        if ((j4 & 128) == 0) {
                            this.c = Long.valueOf(j3);
                            break;
                        }
                    }
                    throw dme.c();
                case 32:
                    long j5 = 0;
                    for (int i4 = 0; i4 < 64; i4 += 7) {
                        byte j6 = dlw.j();
                        j5 |= ((long) (j6 & Byte.MAX_VALUE)) << i4;
                        if ((j6 & 128) == 0) {
                            this.d = Long.valueOf(j5);
                            break;
                        }
                    }
                    throw dme.c();
                case 41:
                    this.e = Long.valueOf(dlw.g());
                    break;
                case 48:
                    this.f = Integer.valueOf(dlw.e());
                    break;
                case by.bc:
                    this.g = dlw.d();
                    break;
                case 64:
                    this.h = Boolean.valueOf(dlw.c());
                    break;
                case 74:
                    if (this.i == null) {
                        this.i = new eeo();
                    }
                    dlw.a(this.i);
                    break;
                default:
                    if (!super.a(dlw, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
