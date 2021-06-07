package defpackage;

import java.util.Arrays;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: bxa  reason: default package */
/* compiled from: PG */
public final class bxa extends bxd {
    private final String a;
    private final byte[] b;
    private final String c;
    private final Map d;

    bxa(String str, byte[] bArr, String str2, Map map) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
        this.d = map;
    }

    @Override // defpackage.bxd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bxd
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.bxd
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bxd
    public final Map d() {
        return this.d;
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b);
        String str2 = this.c;
        String valueOf = String.valueOf(this.d);
        return new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(arrays).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("ChimeHttpRequest{url=").append(str).append(", body=").append(arrays).append(", contentType=").append(str2).append(", headers=").append(valueOf).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxd)) {
            return false;
        }
        bxd bxd = (bxd) obj;
        if (this.a.equals(bxd.a())) {
            if (Arrays.equals(this.b, bxd instanceof bxa ? ((bxa) bxd).b : bxd.b()) && this.c.equals(bxd.c()) && (this.d != null ? this.d.equals(bxd.d()) : bxd.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d == null ? 0 : this.d.hashCode()) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003);
    }
}
