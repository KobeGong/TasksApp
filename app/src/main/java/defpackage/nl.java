package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: nl  reason: default package */
/* compiled from: PG */
public final class nl {
    private static final Object a = new Object();
    private static Field b;
    private static boolean c;

    public static SparseArray a(List list) {
        SparseArray sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    public static Bundle a(Notification.Builder builder, nf nfVar) {
        builder.addAction(nfVar.d, nfVar.e, nfVar.f);
        Bundle bundle = new Bundle(nfVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
        return bundle;
    }

    static Bundle a(nf nfVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", nfVar.d);
        bundle2.putCharSequence("title", nfVar.e);
        bundle2.putParcelable("actionIntent", nfVar.f);
        if (nfVar.a != null) {
            bundle = new Bundle(nfVar.a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", null);
        return bundle2;
    }

    static {
        new Object();
    }
}
