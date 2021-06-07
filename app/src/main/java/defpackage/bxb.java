package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: bxb  reason: default package */
/* compiled from: PG */
final class bxb extends bxf {
    private final int a;
    private final String b;
    private final byte[] c;
    private final Map d;
    private final Throwable e;

    bxb(int i, String str, byte[] bArr, Map map, Throwable th) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = map;
        this.e = th;
    }

    @Override // defpackage.bxf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bxf
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bxf
    public final byte[] c() {
        return this.c;
    }

    @Override // defpackage.bxf
    public final Map d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.bxf
    public final Throwable e() {
        return this.e;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String arrays = Arrays.toString(this.c);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(str).length() + 95 + String.valueOf(arrays).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append("ChimeHttpResponse{statusCode=").append(i).append(", statusMessage=").append(str).append(", bytes=").append(arrays).append(", responseHeaders=").append(valueOf).append(", exception=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxf)) {
            return false;
        }
        bxf bxf = (bxf) obj;
        if (this.a == bxf.a() && (this.b != null ? this.b.equals(bxf.b()) : bxf.b() == null)) {
            if (Arrays.equals(this.c, bxf instanceof bxb ? ((bxb) bxf).c : bxf.c()) && this.d.equals(bxf.d()) && (this.e != null ? this.e.equals(bxf.e()) : bxf.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.b == null ? 0 : this.b.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode ^ i;
    }
}
