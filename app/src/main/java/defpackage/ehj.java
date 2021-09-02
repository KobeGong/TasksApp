package defpackage;

/* renamed from: ehj reason: default package */
/* compiled from: PG */
public final class ehj implements java.lang.Runnable {
    private final /* synthetic */ org.chromium.net.AndroidCellularSignalStrength a;

    public ehj(org.chromium.net.AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.a = androidCellularSignalStrength;
    }

    public final void run() {
        new defpackage.ehk(this.a);
    }
}
