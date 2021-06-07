package defpackage;

import java.io.IOException;

/* renamed from: dgp  reason: default package */
/* compiled from: PG */
public abstract class dgp implements djp {
    /* renamed from: a */
    public abstract dgp clone();

    /* access modifiers changed from: protected */
    public abstract dgp a(dgo dgo);

    public abstract dgp a(dhj dhj, dhw dhw);

    private final dgp a(dhj dhj) {
        return a(dhj, dhw.a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final dgp a(dha dha) {
        try {
            dhj e = dha.e();
            a(e);
            e.a(0);
            return this;
        } catch (dir e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(a("ByteString"), e3);
        }
    }

    public dgp a(byte[] bArr, int i) {
        try {
            dhj a = dhj.a(bArr, 0, i, false);
            a(a);
            a.a(0);
            return this;
        } catch (dir e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(a("byte array"), e2);
        }
    }

    private final String a(String str) {
        String name = getClass().getName();
        return new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length()).append("Reading ").append(name).append(" from a ").append(str).append(" threw an IOException (should never happen).").toString();
    }

    @Override // defpackage.djp
    public final /* synthetic */ djp a(djo djo) {
        if (i().getClass().isInstance(djo)) {
            return a((dgo) djo);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.djp
    public final /* synthetic */ djp a(byte[] bArr) {
        return a(bArr, bArr.length);
    }
}
