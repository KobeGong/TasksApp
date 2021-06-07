package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: dzz  reason: default package */
/* compiled from: PG */
public final class dzz extends InputStream implements dod, doj {
    public djo a;
    public final djx b;
    private ByteArrayInputStream c;

    public dzz(djo djo, djx djx) {
        this.a = djo;
        this.b = djx;
    }

    @Override // defpackage.dod
    public final int a(OutputStream outputStream) {
        if (this.a != null) {
            int f = this.a.f();
            this.a.a(outputStream);
            this.a = null;
            return f;
        } else if (this.c == null) {
            return 0;
        } else {
            int a2 = (int) eaa.a(this.c, outputStream);
            this.c = null;
            return a2;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a != null) {
            this.c = new ByteArrayInputStream(this.a.b());
            this.a = null;
        }
        if (this.c != null) {
            return this.c.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            int f = this.a.f();
            if (f == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= f) {
                dhn b2 = dhn.b(bArr, i, f);
                this.a.a(b2);
                b2.h();
                b2.j();
                this.a = null;
                this.c = null;
                return f;
            } else {
                this.c = new ByteArrayInputStream(this.a.b());
                this.a = null;
            }
        }
        if (this.c != null) {
            return this.c.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            return this.a.f();
        }
        if (this.c != null) {
            return this.c.available();
        }
        return 0;
    }
}
