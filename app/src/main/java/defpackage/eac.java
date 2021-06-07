package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: eac  reason: default package */
/* compiled from: PG */
public final class eac implements dox {
    private final /* synthetic */ djo a;

    eac(djo djo) {
        this.a = djo;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final djo a(byte[] bArr) {
        try {
            return (djo) this.a.d().a(bArr, eaa.a);
        } catch (dir e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.dox
    public final /* synthetic */ byte[] a(Object obj) {
        return ((djo) obj).b();
    }
}
