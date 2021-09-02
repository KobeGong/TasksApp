package defpackage;

/* renamed from: dqw reason: default package */
/* compiled from: PG */
final class dqw extends defpackage.dpg {
    public final java.net.SocketAddress b;
    public final java.lang.String c;

    dqw(java.net.SocketAddress socketAddress, java.lang.String str) {
        this.b = socketAddress;
        this.c = str;
    }

    public final defpackage.dpf a(java.net.URI uri, defpackage.dmv dmv) {
        return new defpackage.dqx(this);
    }

    public final java.lang.String a() {
        return "directaddress";
    }
}
