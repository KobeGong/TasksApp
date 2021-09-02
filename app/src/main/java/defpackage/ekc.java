package defpackage;

/* renamed from: ekc reason: default package */
/* compiled from: PG */
public final class ekc implements java.lang.Runnable {
    private final /* synthetic */ org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener a;
    private final /* synthetic */ int b;

    public ekc(org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
        this.b = i;
    }

    public final void run() {
        org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.a;
        switch (this.b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                versionSafeCallbacks$UrlRequestStatusListener.a();
                return;
            default:
                throw new java.lang.IllegalArgumentException("No request status found.");
        }
    }
}
