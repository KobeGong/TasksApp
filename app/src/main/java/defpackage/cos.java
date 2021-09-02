package defpackage;

/* renamed from: cos reason: default package */
/* compiled from: PG */
public final class cos {
    public final defpackage.cpd a = new defpackage.cpd(this.c);
    public final defpackage.cpa b;
    private final defpackage.cor c;

    cos(android.app.Activity activity, android.os.Bundle bundle, defpackage.ecz ecz) {
        this.c = new defpackage.cor(ecz);
        this.b = new defpackage.cpa(activity, bundle, this.a);
    }

    public static defpackage.cos a(android.content.Context context) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalThreadStateException();
        }
        defpackage.coq a2 = defpackage.coq.a(context);
        android.content.Context context2 = context;
        while (context2 != null) {
            if (!(context2 instanceof android.app.Activity)) {
                if (!(context2 instanceof android.content.ContextWrapper)) {
                    break;
                }
                context2 = ((android.content.ContextWrapper) context2).getBaseContext();
            } else {
                android.app.Activity activity = (android.app.Activity) context2;
                if (activity.isDestroyed()) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.cos cos = (defpackage.cos) a2.a.get(activity);
                if (cos != null) {
                    return cos;
                }
                throw new java.lang.IllegalStateException();
            }
        }
        throw new java.lang.IllegalStateException();
    }
}
