package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: dgo  reason: default package */
/* compiled from: PG */
public abstract class dgo implements djo {
    public int r = 0;

    @Override // defpackage.djo
    public final dha a() {
        try {
            dhf b = dha.b(f());
            a(b.a);
            return b.a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    @Override // defpackage.djo
    public final byte[] b() {
        try {
            byte[] bArr = new byte[f()];
            dhn a = dhn.a(bArr);
            a(a);
            a.j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    @Override // defpackage.djo
    public final void a(OutputStream outputStream) {
        dhn a = dhn.a(outputStream, dhn.a(f()));
        a(a);
        a.h();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        throw new UnsupportedOperationException();
    }
}
