package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: agt  reason: default package */
/* compiled from: PG */
public final class agt extends ContextWrapper {
    private static final Object a = new Object();
    private static ArrayList b;
    private final Resources c;
    private final Resources.Theme d = null;

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof agt) && !(context.getResources() instanceof agv) && !(context.getResources() instanceof ahk) && Build.VERSION.SDK_INT < 21) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (a) {
            if (b == null) {
                b = new ArrayList();
            } else {
                for (int size = b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        b.remove(size);
                    }
                }
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) b.get(size2);
                    agt agt = weakReference2 != null ? (agt) weakReference2.get() : null;
                    if (agt != null && agt.getBaseContext() == context) {
                        return agt;
                    }
                }
            }
            agt agt2 = new agt(context);
            b.add(new WeakReference(agt2));
            return agt2;
        }
    }

    private agt(Context context) {
        super(context);
        this.c = new agv(this, context.getResources());
    }

    public final Resources getResources() {
        return this.c;
    }

    public final AssetManager getAssets() {
        return this.c.getAssets();
    }
}
