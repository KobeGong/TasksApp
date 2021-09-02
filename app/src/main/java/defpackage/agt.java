package defpackage;

/* renamed from: agt reason: default package */
/* compiled from: PG */
public final class agt extends android.content.ContextWrapper {
    private static final java.lang.Object a = new java.lang.Object();
    private static java.util.ArrayList b;
    private final android.content.res.Resources c;
    private final android.content.res.Resources.Theme d = null;

    public static android.content.Context a(android.content.Context context) {
        boolean z = false;
        if (!(context instanceof defpackage.agt) && !(context.getResources() instanceof defpackage.agv) && !(context.getResources() instanceof defpackage.ahk) && android.os.Build.VERSION.SDK_INT < 21) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (a) {
            if (b == null) {
                b = new java.util.ArrayList();
            } else {
                for (int size = b.size() - 1; size >= 0; size--) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        b.remove(size);
                    }
                }
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) b.get(size2);
                    defpackage.agt agt = weakReference2 != null ? (defpackage.agt) weakReference2.get() : null;
                    if (agt != null && agt.getBaseContext() == context) {
                        return agt;
                    }
                }
            }
            defpackage.agt agt2 = new defpackage.agt(context);
            b.add(new java.lang.ref.WeakReference(agt2));
            return agt2;
        }
    }

    private agt(android.content.Context context) {
        super(context);
        this.c = new defpackage.agv(this, context.getResources());
    }

    public final android.content.res.Resources getResources() {
        return this.c;
    }

    public final android.content.res.AssetManager getAssets() {
        return this.c.getAssets();
    }
}
