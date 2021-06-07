package defpackage;

import java.io.InputStream;

/* renamed from: dgr  reason: default package */
/* compiled from: PG */
public final class dgr implements djx {
    private static final dhw a = dhw.a();
    private dih b;

    public dgr() {
    }

    private static djo a(djo djo) {
        dkw dkw;
        if (djo == null || djo.e()) {
            return djo;
        }
        if (djo instanceof dgo) {
            dkw = new dkw();
        } else if (djo instanceof dgq) {
            dkw = new dkw();
        } else {
            dkw = new dkw();
        }
        dir a2 = dkw.a();
        if (a2 == null) {
            throw null;
        }
        throw a2;
    }

    private final djo a(byte[] bArr, int i, dhw dhw) {
        try {
            dhj a2 = dhj.a(bArr, 0, i, false);
            dih a3 = dih.a(this.b, a2, dhw);
            try {
                a2.a(0);
                return a3;
            } catch (dir e) {
                throw e;
            }
        } catch (dir e2) {
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [dhj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.djo a(java.io.InputStream r4, defpackage.dhw r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L_0x0018
            byte[] r0 = defpackage.dim.b
            int r1 = r0.length
            dhj r0 = defpackage.dhj.a(r0, r2, r1, r2)
            r1 = r0
        L_0x000b:
            dih r0 = r3.b
            dih r0 = defpackage.dih.a(r0, r1, r5)
            djo r0 = (defpackage.djo) r0
            r2 = 0
            r1.a(r2)     // Catch:{ dir -> 0x001f }
            return r0
        L_0x0018:
            dhl r0 = new dhl
            r0.<init>(r4)
            r1 = r0
            goto L_0x000b
        L_0x001f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgr.a(java.io.InputStream, dhw):djo");
    }

    @Override // defpackage.djx
    public final /* synthetic */ Object a(InputStream inputStream) {
        return a(a(inputStream, a));
    }

    @Override // defpackage.djx
    public final /* synthetic */ Object a(byte[] bArr, dhw dhw) {
        return a(a(bArr, bArr.length, dhw));
    }

    @Override // defpackage.djx
    public final /* synthetic */ Object a(byte[] bArr) {
        return a(a(bArr, bArr.length, a));
    }

    @Override // defpackage.djx
    public final /* synthetic */ Object a(dhj dhj, dhw dhw) {
        return a(dih.a(this.b, dhj, dhw));
    }

    public dgr(dih dih) {
        this();
        this.b = dih;
    }

    @Override // defpackage.djx
    public final /* synthetic */ Object b(dhj dhj, dhw dhw) {
        return dih.a(this.b, dhj, dhw);
    }
}
