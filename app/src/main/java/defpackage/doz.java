package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: doz  reason: default package */
/* compiled from: PG */
public final class doz extends doy {
    private final dpa c;

    doz(String str, boolean z, dpa dpa) {
        super(str, z);
        cld.a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.c = (dpa) cld.a(dpa, "marshaller");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.doy
    public final byte[] a(Object obj) {
        return this.c.a(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.doy
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }
}
