package defpackage;

/* renamed from: eim reason: default package */
/* compiled from: PG */
final class eim implements java.lang.Runnable {
    private final /* synthetic */ android.net.Network a;
    private final /* synthetic */ defpackage.eii b;

    eim(defpackage.eii eii, android.net.Network network) {
        this.b = eii;
        this.a = network;
    }

    public final void run() {
        defpackage.eip eip = this.b.b.b;
        eip.a.b(org.chromium.net.NetworkChangeNotifierAutoDetect.a(this.a));
    }
}
