package defpackage;

/* renamed from: eig reason: default package */
/* compiled from: PG */
public final class eig implements java.lang.Runnable {
    private final /* synthetic */ org.chromium.net.NetworkChangeNotifierAutoDetect a;

    public eig(org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
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
