package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* renamed from: ekc  reason: default package */
/* compiled from: PG */
public final class ekc implements Runnable {
    private final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;
    private final /* synthetic */ int b;

    public ekc(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
        this.b = i;
    }

    public final void run() {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.a;
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
            case 5:
            default:
                throw new IllegalArgumentException("No request status found.");
        }
    }
}
