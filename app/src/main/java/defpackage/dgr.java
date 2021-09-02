package defpackage;

/* renamed from: dgr reason: default package */
/* compiled from: PG */
public final class dgr implements defpackage.djx {
    private static final defpackage.dhw a = defpackage.dhw.a();
    private defpackage.dih b;

    public dgr() {
    }

    private static defpackage.djo a(defpackage.djo djo) {
        defpackage.dkw dkw;
        if (djo == null || djo.e()) {
            return djo;
        }
        if (djo instanceof defpackage.dgo) {
            dkw = new defpackage.dkw();
        } else if (djo instanceof defpackage.dgq) {
            dkw = new defpackage.dkw();
        } else {
            dkw = new defpackage.dkw();
        }
        defpackage.dir a2 = dkw.a();
        if (a2 == null) {
            throw null;
        }
        throw a2;
    }

    private final defpackage.djo a(byte[] bArr, int i, defpackage.dhw dhw) {
        try {
            defpackage.dhj a2 = defpackage.dhj.a(bArr, 0, i, false);
            defpackage.djo a3 = defpackage.dih.a(this.b, a2, dhw);
            a2.a(0);
            return a3;
        } catch (defpackage.dir e) {
            throw e;
        } catch (defpackage.dir e2) {
            throw e2;
        }
    }

    private final defpackage.djo a(java.io.InputStream inputStream, defpackage.dhw dhw) {
        defpackage.dhj dhl;
        if (inputStream == null) {
            byte[] bArr = defpackage.dim.b;
            dhl = defpackage.dhj.a(bArr, 0, bArr.length, false);
        } else {
            dhl = new defpackage.dhl(inputStream);
        }
        defpackage.djo a2 = defpackage.dih.a(this.b, dhl, dhw);
        try {
            dhl.a(0);
            return a2;
        } catch (defpackage.dir e) {
            throw e;
        }
    }

    public final /* synthetic */ java.lang.Object a(java.io.InputStream inputStream) {
        return a(a(inputStream, a));
    }

    public final /* synthetic */ java.lang.Object a(byte[] bArr, defpackage.dhw dhw) {
        return a(a(bArr, bArr.length, dhw));
    }

    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        return a(a(bArr, bArr.length, a));
    }

    public final /* synthetic */ java.lang.Object a(defpackage.dhj dhj, defpackage.dhw dhw) {
        return a((defpackage.djo) defpackage.dih.a(this.b, dhj, dhw));
    }

    public dgr(defpackage.dih dih) {
        this();
        this.b = dih;
    }

    public final /* synthetic */ java.lang.Object b(defpackage.dhj dhj, defpackage.dhw dhw) {
        return defpackage.dih.a(this.b, dhj, dhw);
    }
}
