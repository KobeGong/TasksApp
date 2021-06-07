package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: dhc  reason: default package */
/* compiled from: PG */
final class dhc extends dhh {
    public static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    dhc(byte[] bArr, int i, int i2) {
        super(bArr);
        c(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.dhh, defpackage.dha
    public final byte a(int i) {
        b(i, a());
        return this.c[this.d + i];
    }

    @Override // defpackage.dhh, defpackage.dha
    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dhh
    public final int h() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dhh, defpackage.dha
    public final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, h() + i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return dha.a(b());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
}
