package defpackage;

/* renamed from: egi reason: default package */
/* compiled from: PG */
public final class egi implements java.lang.Runnable {
    public final void run() {
        if (org.chromium.base.ApplicationStatus.a == null) {
            defpackage.egj egj = new defpackage.egj(0);
            org.chromium.base.ApplicationStatus.a = egj;
            org.chromium.base.ApplicationStatus.a(egj);
        }
    }
}
