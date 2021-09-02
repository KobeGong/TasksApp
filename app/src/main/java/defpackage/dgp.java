package defpackage;

/* renamed from: dgp reason: default package */
/* compiled from: PG */
public abstract class dgp implements defpackage.djp {
    /* renamed from: a */
    public abstract defpackage.dgp clone();

    /* access modifiers changed from: protected */
    public abstract defpackage.dgp a(defpackage.dgo dgo);

    public abstract defpackage.dgp a(defpackage.dhj dhj, defpackage.dhw dhw);

    private final defpackage.dgp a(defpackage.dhj dhj) {
        return a(dhj, defpackage.dhw.a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.dgp a(defpackage.dha dha) {
        try {
            defpackage.dhj e = dha.e();
            a(e);
            e.a(0);
            return this;
        } catch (defpackage.dir e2) {
            throw e2;
        } catch (java.io.IOException e3) {
            throw new java.lang.RuntimeException(a("ByteString"), e3);
        }
    }

    public defpackage.dgp a(byte[] bArr, int i) {
        try {
            defpackage.dhj a = defpackage.dhj.a(bArr, 0, i, false);
            a(a);
            a.a(0);
            return this;
        } catch (defpackage.dir e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(a("byte array"), e2);
        }
    }

    private final java.lang.String a(java.lang.String str) {
        java.lang.String name = getClass().getName();
        return new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 60 + java.lang.String.valueOf(str).length()).append("Reading ").append(name).append(" from a ").append(str).append(" threw an IOException (should never happen).").toString();
    }

    public final /* synthetic */ defpackage.djp a(defpackage.djo djo) {
        if (i().getClass().isInstance(djo)) {
            return a((defpackage.dgo) djo);
        }
        throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final /* synthetic */ defpackage.djp a(byte[] bArr) {
        return a(bArr, bArr.length);
    }
}
