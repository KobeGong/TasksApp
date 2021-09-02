package defpackage;

/* renamed from: dxi reason: default package */
/* compiled from: PG */
public final class dxi implements defpackage.dva {
    private final defpackage.dxl a;
    private int b = -1;
    private defpackage.dzx c;
    private defpackage.doa d = defpackage.dno.a;
    private boolean e = true;
    private final defpackage.dxk f = new defpackage.dxk(this);
    private final byte[] g = new byte[5];
    private final defpackage.dzo h;
    private boolean i;
    private int j;
    private int k = -1;
    private long l;

    public dxi(defpackage.dxl dxl, defpackage.dzy dzy, defpackage.dzo dzo) {
        this.a = (defpackage.dxl) defpackage.cld.a((java.lang.Object) dxl, (java.lang.Object) "sink");
        defpackage.cld.a((java.lang.Object) dzy, (java.lang.Object) "bufferAllocator");
        this.h = (defpackage.dzo) defpackage.cld.a((java.lang.Object) dzo, (java.lang.Object) "statsTraceCtx");
    }

    public final void a(int i2) {
        defpackage.cld.b(this.b == -1, (java.lang.Object) "max size already set");
        this.b = i2;
    }

    public final void a(java.io.InputStream inputStream) {
        int i2;
        int a2;
        int i3;
        if (this.i) {
            throw new java.lang.IllegalStateException("Framer already closed");
        }
        this.j++;
        this.k++;
        this.l = 0;
        this.h.a();
        boolean z = this.e && this.d != defpackage.dno.a;
        try {
            if ((inputStream instanceof defpackage.doj) || (inputStream instanceof java.io.ByteArrayInputStream)) {
                i2 = inputStream.available();
            } else {
                i2 = -1;
            }
            if (i2 == 0 || !z) {
                if (i2 != -1) {
                    this.l = (long) i2;
                    if (this.b < 0 || i2 <= this.b) {
                        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.g);
                        wrap.put(0);
                        wrap.putInt(i2);
                        if (this.c == null) {
                            this.c = defpackage.dzy.a(wrap.position() + i2);
                        }
                        a(this.g, 0, wrap.position());
                        a2 = a(inputStream, (java.io.OutputStream) this.f);
                    } else {
                        throw defpackage.dpw.g.a(java.lang.String.format("message too large %d > %d", new java.lang.Object[]{java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(this.b)})).b();
                    }
                } else {
                    defpackage.dxj dxj = new defpackage.dxj(this);
                    a2 = a(inputStream, (java.io.OutputStream) dxj);
                    if (this.b < 0 || a2 <= this.b) {
                        a(dxj, false);
                    } else {
                        throw defpackage.dpw.g.a(java.lang.String.format("message too large %d > %d", new java.lang.Object[]{java.lang.Integer.valueOf(a2), java.lang.Integer.valueOf(this.b)})).b();
                    }
                }
                i3 = a2;
            } else {
                i3 = b(inputStream);
            }
            if (i2 == -1 || i3 == i2) {
                this.h.a((long) i3);
                this.h.b(this.l);
                this.h.a(this.k, this.l, (long) i3);
                return;
            }
            throw defpackage.dpw.h.a(java.lang.String.format("Message length inaccurate %s != %s", new java.lang.Object[]{java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2)})).b();
        } catch (java.io.IOException e2) {
            throw defpackage.dpw.h.a("Failed to frame message").b((java.lang.Throwable) e2).b();
        } catch (java.lang.RuntimeException e3) {
            throw defpackage.dpw.h.a("Failed to frame message").b((java.lang.Throwable) e3).b();
        }
    }

    /* JADX INFO: finally extract failed */
    private final int b(java.io.InputStream inputStream) {
        defpackage.dxj dxj = new defpackage.dxj(this);
        java.io.OutputStream a2 = this.d.a((java.io.OutputStream) dxj);
        try {
            int a3 = a(inputStream, a2);
            a2.close();
            if (this.b < 0 || a3 <= this.b) {
                a(dxj, true);
                return a3;
            }
            throw defpackage.dpw.g.a(java.lang.String.format("message too large %d > %d", new java.lang.Object[]{java.lang.Integer.valueOf(a3), java.lang.Integer.valueOf(this.b)})).b();
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    private final void a(defpackage.dxj dxj, boolean z) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(this.g);
        wrap.put(z ? (byte) 1 : 0);
        int i2 = 0;
        for (defpackage.dzx dzx : dxj.a) {
            i2 = dzx.a.position() + i2;
        }
        wrap.putInt(i2);
        defpackage.dzx a2 = defpackage.dzy.a(5);
        a2.a(this.g, 0, wrap.position());
        if (i2 == 0) {
            this.c = a2;
            return;
        }
        this.a.a(a2, false, false);
        this.j = 1;
        java.util.List list = dxj.a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.a.a((defpackage.dzx) list.get(i3), false, false);
        }
        this.c = (defpackage.dzx) list.get(list.size() - 1);
        this.l = (long) i2;
    }

    private static int a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream instanceof defpackage.dod) {
            return ((defpackage.dod) inputStream).a(outputStream);
        }
        long a2 = defpackage.dtj.a(inputStream, outputStream);
        defpackage.cld.a(a2 <= 2147483647L, "Message size overflow: %s", a2);
        return (int) a2;
    }

    /* access modifiers changed from: 0000 */
    public final void a(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            if (this.c != null && this.c.a.remaining() == 0) {
                a(false, false);
            }
            if (this.c == null) {
                this.c = defpackage.dzy.a(i3);
            }
            int min = java.lang.Math.min(i3, this.c.a.remaining());
            this.c.a(bArr, i2, min);
            i2 += min;
            i3 -= min;
        }
    }

    public final void a() {
        if (this.c != null && this.c.a.position() > 0) {
            a(false, true);
        }
    }

    public final boolean b() {
        return this.i;
    }

    public final void c() {
        if (!this.i) {
            this.i = true;
            if (!(this.c == null || this.c.a.position() != 0 || this.c == null)) {
                this.c = null;
            }
            a(true, true);
        }
    }

    private final void a(boolean z, boolean z2) {
        defpackage.dzx dzx = this.c;
        this.c = null;
        this.a.a(dzx, z, z2);
        this.j = 0;
    }

    public final /* synthetic */ defpackage.dva a(defpackage.doa doa) {
        this.d = (defpackage.doa) defpackage.cld.a((java.lang.Object) doa, (java.lang.Object) "Can't pass an empty compressor");
        return this;
    }
}
