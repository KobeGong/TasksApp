package defpackage;

/* renamed from: cq reason: default package */
/* compiled from: PG */
public final class cq {
    public final android.content.Intent a;
    public boolean b;

    public cq() {
        this(0);
    }

    private cq(byte b2) {
        this.a = new android.content.Intent("android.intent.action.VIEW");
        this.b = true;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = "android.support.customtabs.extra.SESSION";
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, null);
        } else {
            if (!defpackage.ba.b) {
                try {
                    java.lang.reflect.Method method = android.os.Bundle.class.getMethod("putIBinder", new java.lang.Class[]{java.lang.String.class, android.os.IBinder.class});
                    defpackage.ba.a = method;
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                }
                defpackage.ba.b = true;
            }
            if (defpackage.ba.a != null) {
                try {
                    defpackage.ba.a.invoke(bundle, new java.lang.Object[]{str, null});
                } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                    defpackage.ba.a = null;
                }
            }
        }
        this.a.putExtras(bundle);
    }
}
