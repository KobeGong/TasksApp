package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eim  reason: default package */
/* compiled from: PG */
final class eim implements Runnable {
    private final /* synthetic */ Network a;
    private final /* synthetic */ eii b;

    eim(eii eii, Network network) {
        this.b = eii;
        this.a = network;
    }

    public final void run() {
        eip eip = this.b.b.b;
        eip.a.b(NetworkChangeNotifierAutoDetect.a(this.a));
    }
}
