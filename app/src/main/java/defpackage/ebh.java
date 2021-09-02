package defpackage;

/* renamed from: ebh reason: default package */
/* compiled from: PG */
public final class ebh implements defpackage.dpd {
    private final /* synthetic */ defpackage.djo a;
    private final /* synthetic */ defpackage.djx b;

    ebh() {
    }

    public ebh(defpackage.djo djo, defpackage.djx djx) {
        this.a = djo;
        this.b = djx;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.djo a(java.io.InputStream inputStream) {
        if ((inputStream instanceof defpackage.dzz) && ((defpackage.dzz) inputStream).b == this.b) {
            try {
                defpackage.dzz dzz = (defpackage.dzz) inputStream;
                if (dzz.a != null) {
                    return dzz.a;
                }
                throw new java.lang.IllegalStateException("message not available");
            } catch (java.lang.IllegalStateException e) {
            }
        }
        defpackage.dhj dhj = null;
        try {
            if (inputStream instanceof defpackage.doj) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    byte[] bArr = (byte[]) ((java.lang.ref.Reference) defpackage.eaa.b.get()).get();
                    if (bArr == null || bArr.length < available) {
                        bArr = new byte[available];
                        defpackage.eaa.b.set(new java.lang.ref.WeakReference(bArr));
                    }
                    int i = available;
                    while (i > 0) {
                        int read = inputStream.read(bArr, available - i, i);
                        if (read == -1) {
                            break;
                        }
                        i -= read;
                    }
                    if (i != 0) {
                        throw new java.lang.RuntimeException("size inaccurate: " + available + " != " + (available - i));
                    }
                    dhj = defpackage.dhj.a(bArr, 0, available, false);
                } else if (available == 0) {
                    return this.a;
                }
            }
            if (dhj == null) {
                dhj = defpackage.dhj.a(inputStream);
            }
            dhj.c = Integer.MAX_VALUE;
            try {
                return a(dhj);
            } catch (defpackage.dir e2) {
                throw defpackage.dpw.h.a("Invalid protobuf byte sequence").b((java.lang.Throwable) e2).b();
            }
        } catch (java.io.IOException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private final defpackage.djo a(defpackage.dhj dhj) {
        defpackage.djo djo = (defpackage.djo) this.b.a(dhj, defpackage.eaa.a);
        try {
            dhj.a(0);
            return djo;
        } catch (defpackage.dir e) {
            throw e;
        }
    }

    public final /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        return new defpackage.dzz((defpackage.djo) obj, this.b);
    }
}
