package defpackage;

/* renamed from: eja reason: default package */
/* compiled from: PG */
public final class eja extends defpackage.eiq implements defpackage.egk {
    private boolean b;

    /* access modifiers changed from: protected */
    public final void a(org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.a(networkChangeNotifierAutoDetect);
        org.chromium.base.ApplicationStatus.a(this);
        int stateForApplication = org.chromium.base.ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1) {
            a();
        } else if (stateForApplication == 2) {
            this.a.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.b) {
            defpackage.egu egu = org.chromium.base.ApplicationStatus.b;
            if (this != null) {
                int indexOf = egu.a.indexOf(this);
                if (indexOf != -1) {
                    if (egu.b == 0) {
                        egu.a.remove(indexOf);
                    } else {
                        egu.d = true;
                        egu.a.set(indexOf, null);
                    }
                    egu.c--;
                }
            }
            this.b = true;
        }
    }
}
