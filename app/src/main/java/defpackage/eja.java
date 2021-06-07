package defpackage;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eja  reason: default package */
/* compiled from: PG */
public final class eja extends eiq implements egk {
    private boolean b;

    /* access modifiers changed from: protected */
    @Override // defpackage.eiq
    public final void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.a(networkChangeNotifierAutoDetect);
        ApplicationStatus.a(this);
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1) {
            a();
        } else if (stateForApplication == 2) {
            this.a.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.eiq
    public final void b() {
        int indexOf;
        if (!this.b) {
            egu egu = ApplicationStatus.b;
            if (!(this == null || (indexOf = egu.a.indexOf(this)) == -1)) {
                if (egu.b == 0) {
                    egu.a.remove(indexOf);
                } else {
                    egu.d = true;
                    egu.a.set(indexOf, null);
                }
                egu.c--;
            }
            this.b = true;
        }
    }
}
