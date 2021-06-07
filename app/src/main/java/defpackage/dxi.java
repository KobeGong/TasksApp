package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: dxi  reason: default package */
/* compiled from: PG */
public final class dxi implements dva {
    private final dxl a;
    private int b = -1;
    private dzx c;
    private doa d = dno.a;
    private boolean e = true;
    private final dxk f = new dxk(this);
    private final byte[] g = new byte[5];
    private final dzo h;
    private boolean i;
    private int j;
    private int k = -1;
    private long l;

    public dxi(dxl dxl, dzy dzy, dzo dzo) {
        this.a = (dxl) cld.a(dxl, "sink");
        cld.a(dzy, "bufferAllocator");
        this.h = (dzo) cld.a(dzo, "statsTraceCtx");
    }

    @Override // defpackage.dva
    public final void a(int i2) {
        cld.b(this.b == -1, "max size already set");
        this.b = i2;
    }

    @Override // defpackage.dva
    public final void a(InputStream inputStream) {
        int i2;
        int a2;
        int i3;
        if (this.i) {
            throw new IllegalStateException("Framer already closed");
        }
        this.j++;
        this.k++;
        this.l = 0;
        this.h.a();
        boolean z = this.e && this.d != dno.a;
        try {
            if ((inputStream instanceof doj) || (inputStream instanceof ByteArrayInputStream)) {
                i2 = inputStream.available();
            } else {
                i2 = -1;
            }
            if (i2 == 0 || !z) {
                if (i2 != -1) {
                    this.l = (long) i2;
                    if (this.b < 0 || i2 <= this.b) {
                        ByteBuffer wrap = ByteBuffer.wrap(this.g);
                        wrap.put((byte) 0);
                        wrap.putInt(i2);
                        if (this.c == null) {
                            this.c = dzy.a(wrap.position() + i2);
                        }
                        a(this.g, 0, wrap.position());
                        a2 = a(inputStream, this.f);
                    } else {
                        throw dpw.g.a(String.format("message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.b))).b();
                    }
                } else {
                    dxj dxj = new dxj(this);
                    a2 = a(inputStream, dxj);
                    if (this.b < 0 || a2 <= this.b) {
                        a(dxj, false);
                    } else {
                        throw dpw.g.a(String.format("message too large %d > %d", Integer.valueOf(a2), Integer.valueOf(this.b))).b();
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
            throw dpw.h.a(String.format("Message length inaccurate %s != %s", Integer.valueOf(i3), Integer.valueOf(i2))).b();
        } catch (IOException e2) {
            throw dpw.h.a("Failed to frame message").b(e2).b();
        } catch (RuntimeException e3) {
            throw dpw.h.a("Failed to frame message").b(e3).b();
        }
    }

    /* JADX INFO: finally extract failed */
    private final int b(InputStream inputStream) {
        dxj dxj = new dxj(this);
        OutputStream a2 = this.d.a(dxj);
        try {
            int a3 = a(inputStream, a2);
            a2.close();
            if (this.b < 0 || a3 <= this.b) {
                a(dxj, true);
                return a3;
            }
            throw dpw.g.a(String.format("message too large %d > %d", Integer.valueOf(a3), Integer.valueOf(this.b))).b();
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    private final void a(dxj dxj, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.g);
        wrap.put(z ? (byte) 1 : 0);
        int i2 = 0;
        for (dzx dzx : dxj.a) {
            i2 = dzx.a.position() + i2;
        }
        wrap.putInt(i2);
        dzx a2 = dzy.a(5);
        a2.a(this.g, 0, wrap.position());
        if (i2 == 0) {
            this.c = a2;
            return;
        }
        this.a.a(a2, false, false);
        this.j = 1;
        List list = dxj.a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.a.a((dzx) list.get(i3), false, false);
        }
        this.c = (dzx) list.get(list.size() - 1);
        this.l = (long) i2;
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof dod) {
            return ((dod) inputStream).a(outputStream);
        }
        long a2 = dtj.a(inputStream, outputStream);
        cld.a(a2 <= 2147483647L, "Message size overflow: %s", a2);
        return (int) a2;
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            if (this.c != null && this.c.a.remaining() == 0) {
                a(false, false);
            }
            if (this.c == null) {
                this.c = dzy.a(i3);
            }
            int min = Math.min(i3, this.c.a.remaining());
            this.c.a(bArr, i2, min);
            i2 += min;
            i3 -= min;
        }
    }

    @Override // defpackage.dva
    public final void a() {
        if (this.c != null && this.c.a.position() > 0) {
            a(false, true);
        }
    }

    @Override // defpackage.dva
    public final boolean b() {
        return this.i;
    }

    @Override // defpackage.dva
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
        dzx dzx = this.c;
        this.c = null;
        this.a.a(dzx, z, z2);
        this.j = 0;
    }

    @Override // defpackage.dva
    public final /* synthetic */ dva a(doa doa) {
        this.d = (doa) cld.a(doa, "Can't pass an empty compressor");
        return this;
    }
}
