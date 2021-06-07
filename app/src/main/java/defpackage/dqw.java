package defpackage;

import java.net.SocketAddress;
import java.net.URI;

/* access modifiers changed from: package-private */
/* renamed from: dqw  reason: default package */
/* compiled from: PG */
public final class dqw extends dpg {
    public final SocketAddress b;
    public final String c;

    dqw(SocketAddress socketAddress, String str) {
        this.b = socketAddress;
        this.c = str;
    }

    @Override // defpackage.dpg
    public final dpf a(URI uri, dmv dmv) {
        return new dqx(this);
    }

    @Override // defpackage.dpg
    public final String a() {
        return "directaddress";
    }
}
