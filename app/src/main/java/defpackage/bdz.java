package defpackage;

/* renamed from: bdz reason: default package */
/* compiled from: PG */
public final class bdz {
    private static java.lang.Object a = new java.lang.Object();
    private static boolean b;
    private static int c;

    public static int a(android.content.Context context) {
        synchronized (a) {
            if (!b) {
                b = true;
                try {
                    android.os.Bundle bundle = defpackage.bjg.a.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return c;
    }
}
