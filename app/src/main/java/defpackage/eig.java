package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eig  reason: default package */
/* compiled from: PG */
public final class eig implements Runnable {
    private final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public eig(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    public final void run() {
        if (this.a.g) {
            if (this.a.h) {
                this.a.h = false;
            } else {
                this.a.c();
            }
        }
    }
}
