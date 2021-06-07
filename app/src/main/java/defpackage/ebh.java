package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ebh  reason: default package */
/* compiled from: PG */
public final class ebh implements dpd {
    private final /* synthetic */ djo a;
    private final /* synthetic */ djx b;

    ebh() {
    }

    public ebh(djo djo, djx djx) {
        this.a = djo;
        this.b = djx;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final djo a(InputStream inputStream) {
        if ((inputStream instanceof dzz) && ((dzz) inputStream).b == this.b) {
            try {
                dzz dzz = (dzz) inputStream;
                if (dzz.a != null) {
                    return dzz.a;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException e) {
            }
        }
        dhj dhj = null;
        try {
            if (inputStream instanceof doj) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    byte[] bArr = (byte[]) ((Reference) eaa.b.get()).get();
                    if (bArr == null || bArr.length < available) {
                        bArr = new byte[available];
                        eaa.b.set(new WeakReference(bArr));
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
                        throw new RuntimeException(new StringBuilder(43).append("size inaccurate: ").append(available).append(" != ").append(available - i).toString());
                    }
                    dhj = dhj.a(bArr, 0, available, false);
                } else if (available == 0) {
                    return this.a;
                }
            }
            if (dhj == null) {
                dhj = dhj.a(inputStream);
            }
            dhj.c = Integer.MAX_VALUE;
            try {
                return a(dhj);
            } catch (dir e2) {
                throw dpw.h.a("Invalid protobuf byte sequence").b(e2).b();
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final djo a(dhj dhj) {
        djo djo = (djo) this.b.a(dhj, eaa.a);
        try {
            dhj.a(0);
            return djo;
        } catch (dir e) {
            throw e;
        }
    }

    @Override // defpackage.dpd
    public final /* synthetic */ InputStream a(Object obj) {
        return new dzz((djo) obj, this.b);
    }
}
