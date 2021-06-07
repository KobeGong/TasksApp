package defpackage;

import android.annotation.TargetApi;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.net.AndroidCellularSignalStrength;

/* renamed from: ehk  reason: default package */
/* compiled from: PG */
public final class ehk extends PhoneStateListener implements egk {
    private final TelephonyManager a = ((TelephonyManager) ehw.a.getSystemService("phone"));
    private final /* synthetic */ AndroidCellularSignalStrength b;

    ehk(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.b = androidCellularSignalStrength;
        ThreadUtils.c();
        if (this.a.getSimState() == 5) {
            ApplicationStatus.a(this);
            int stateForApplication = ApplicationStatus.getStateForApplication();
            if (stateForApplication == 1) {
                this.a.listen(this, 256);
            } else if (stateForApplication == 2) {
                this.b.a = Integer.MIN_VALUE;
                this.a.listen(this, 0);
            }
        }
    }

    @TargetApi(23)
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (ApplicationStatus.getStateForApplication() == 1) {
            try {
                this.b.a = signalStrength.getLevel();
            } catch (SecurityException e) {
                this.b.a = Integer.MIN_VALUE;
            }
        }
    }
}
