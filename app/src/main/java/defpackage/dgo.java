package defpackage;

/* renamed from: dgo reason: default package */
/* compiled from: PG */
public abstract class dgo implements defpackage.djo {
    public int r = 0;

    public final defpackage.dha a() {
        try {
            defpackage.dhf b = defpackage.dha.b(f());
            a(b.a);
            return b.a();
        } catch (java.io.IOException e) {
            java.lang.String str = "ByteString";
            java.lang.String name = getClass().getName();
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + java.lang.String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] b() {
        try {
            byte[] bArr = new byte[f()];
            defpackage.dhn a = defpackage.dhn.a(bArr);
            a(a);
            a.j();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String str = "byte array";
            java.lang.String name = getClass().getName();
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + java.lang.String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final void a(java.io.OutputStream outputStream) {
        defpackage.dhn a = defpackage.dhn.a(outputStream, defpackage.dhn.a(f()));
        a(a);
        a.h();
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
