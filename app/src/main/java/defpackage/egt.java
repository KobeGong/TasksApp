package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import org.chromium.base.MemoryPressureListener;

/* renamed from: egt  reason: default package */
/* compiled from: PG */
public final class egt implements ComponentCallbacks2 {
    public final void onTrimMemory(int i) {
        if (i >= 80 || i == 15) {
            MemoryPressureListener.a(2);
        } else if (i >= 40) {
            MemoryPressureListener.a(1);
        }
    }

    public final void onLowMemory() {
        MemoryPressureListener.a(2);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }
}
