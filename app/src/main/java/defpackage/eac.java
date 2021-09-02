package defpackage;

/* renamed from: eac reason: default package */
/* compiled from: PG */
final class eac implements defpackage.dox {
    private final /* synthetic */ defpackage.djo a;

    eac(defpackage.djo djo) {
        this.a = djo;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final defpackage.djo a(byte[] bArr) {
        try {
            return (defpackage.djo) this.a.d().a(bArr, defpackage.eaa.a);
        } catch (defpackage.dir e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public final /* synthetic */ byte[] a(java.lang.Object obj) {
        return ((defpackage.djo) obj).b();
    }
}
