package defpackage;

/* renamed from: egt reason: default package */
/* compiled from: PG */
public final class egt implements android.content.ComponentCallbacks2 {
    public final void onTrimMemory(int i) {
        if (i >= 80 || i == 15) {
            org.chromium.base.MemoryPressureListener.a(2);
        } else if (i >= 40) {
            org.chromium.base.MemoryPressureListener.a(1);
        }
    }

    public final void onLowMemory() {
        org.chromium.base.MemoryPressureListener.a(2);
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
