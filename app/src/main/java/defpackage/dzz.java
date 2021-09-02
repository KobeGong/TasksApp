package defpackage;

/* renamed from: dzz reason: default package */
/* compiled from: PG */
public final class dzz extends java.io.InputStream implements defpackage.dod, defpackage.doj {
    public defpackage.djo a;
    public final defpackage.djx b;
    private java.io.ByteArrayInputStream c;

    public dzz(defpackage.djo djo, defpackage.djx djx) {
        this.a = djo;
        this.b = djx;
    }

    public final int a(java.io.OutputStream outputStream) {
        if (this.a != null) {
            int f = this.a.f();
            this.a.a(outputStream);
            this.a = null;
            return f;
        } else if (this.c == null) {
            return 0;
        } else {
            int a2 = (int) defpackage.eaa.a(this.c, outputStream);
            this.c = null;
            return a2;
        }
    }

    public final int read() {
        if (this.a != null) {
            this.c = new java.io.ByteArrayInputStream(this.a.b());
            this.a = null;
        }
        if (this.c != null) {
            return this.c.read();
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            int f = this.a.f();
            if (f == 0) {
                this.a = null;
                this.c = null;
                return -1;
            } else if (i2 >= f) {
                defpackage.dhn b2 = defpackage.dhn.b(bArr, i, f);
                this.a.a(b2);
                b2.h();
                b2.j();
                this.a = null;
                this.c = null;
                return f;
            } else {
                this.c = new java.io.ByteArrayInputStream(this.a.b());
                this.a = null;
            }
        }
        if (this.c != null) {
            return this.c.read(bArr, i, i2);
        }
        return -1;
    }

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
