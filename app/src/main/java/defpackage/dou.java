package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dou  reason: default package */
/* compiled from: PG */
public final class dou extends doy {
    private final dov c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dou(String str, dov dov) {
        super(str, false);
        boolean z = false;
        cld.a(!str.endsWith("-bin") ? true : z, "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.c = (dov) cld.a(dov, "marshaller");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.doy
    public final byte[] a(Object obj) {
        return this.c.a(obj).getBytes(crp.a);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.doy
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, crp.a));
    }
}
