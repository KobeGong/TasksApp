package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: bdz  reason: default package */
/* compiled from: PG */
public final class bdz {
    private static Object a = new Object();
    private static boolean b;
    private static int c;

    public static int a(Context context) {
        synchronized (a) {
            if (!b) {
                b = true;
                try {
                    Bundle bundle = bjg.a.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return c;
    }
}
