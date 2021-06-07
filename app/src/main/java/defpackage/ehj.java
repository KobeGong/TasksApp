package defpackage;

import org.chromium.net.AndroidCellularSignalStrength;

/* renamed from: ehj  reason: default package */
/* compiled from: PG */
public final class ehj implements Runnable {
    private final /* synthetic */ AndroidCellularSignalStrength a;

    public ehj(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.a = androidCellularSignalStrength;
    }

    public final void run() {
        new ehk(this.a);
    }
}
