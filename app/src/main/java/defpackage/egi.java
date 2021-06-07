package defpackage;

import org.chromium.base.ApplicationStatus;

/* renamed from: egi  reason: default package */
/* compiled from: PG */
public final class egi implements Runnable {
    public final void run() {
        if (ApplicationStatus.a == null) {
            egj egj = new egj((byte) 0);
            ApplicationStatus.a = egj;
            ApplicationStatus.a(egj);
        }
    }
}
