package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dow  reason: default package */
/* compiled from: PG */
public final class dow extends doy {
    private final dox c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dow(String str, dox dox) {
        super(str, false);
        boolean z = false;
        cld.a(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        cld.a(str.length() > 4 ? true : z, "empty key name");
        this.c = (dox) cld.a(dox, "marshaller is null");
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
