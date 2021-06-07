package defpackage;

import java.net.InetSocketAddress;
import java.util.Arrays;

/* renamed from: dxu  reason: default package */
/* compiled from: PG */
public final class dxu {
    private final InetSocketAddress a;
    private final String b;
    private final String c;

    public dxu(InetSocketAddress inetSocketAddress, String str, String str2) {
        cld.a(inetSocketAddress);
        cld.b(!inetSocketAddress.isUnresolved());
        this.a = inetSocketAddress;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dxu)) {
            return false;
        }
        dxu dxu = (dxu) obj;
        if (!cru.d(this.a, dxu.a) || !cru.d(this.b, dxu.b) || !cru.d(this.c, dxu.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
