package defpackage;

/* renamed from: ehk reason: default package */
/* compiled from: PG */
public final class ehk extends android.telephony.PhoneStateListener implements defpackage.egk {
    private final android.telephony.TelephonyManager a = ((android.telephony.TelephonyManager) defpackage.ehw.a.getSystemService("phone"));
    private final /* synthetic */ org.chromium.net.AndroidCellularSignalStrength b;

    ehk(org.chromium.net.AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.b = androidCellularSignalStrength;
        org.chromium.base.ThreadUtils.c();
        if (this.a.getSimState() == 5) {
            org.chromium.base.ApplicationStatus.a(this);
            int stateForApplication = org.chromium.base.ApplicationStatus.getStateForApplication();
            if (stateForApplication == 1) {
                this.a.listen(this, 256);
            } else if (stateForApplication == 2) {
                this.b.a = Integer.MIN_VALUE;
                this.a.listen(this, 0);
            }
        }
    }

    @android.annotation.TargetApi(23)
    public final void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        if (org.chromium.base.ApplicationStatus.getStateForApplication() == 1) {
            try {
                this.b.a = signalStrength.getLevel();
            } catch (java.lang.SecurityException e) {
                this.b.a = Integer.MIN_VALUE;
            }
        }
    }
}
