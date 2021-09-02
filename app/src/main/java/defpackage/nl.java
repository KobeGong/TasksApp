package defpackage;

/* renamed from: nl reason: default package */
/* compiled from: PG */
public final class nl {
    private static final java.lang.Object a = new java.lang.Object();
    private static java.lang.reflect.Field b;
    private static boolean c;

    public static android.util.SparseArray a(java.util.List list) {
        android.util.SparseArray sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.os.Bundle bundle = (android.os.Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static android.os.Bundle a(android.app.Notification notification) {
        synchronized (a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    java.lang.reflect.Field declaredField = android.app.Notification.class.getDeclaredField("extras");
                    if (!android.os.Bundle.class.isAssignableFrom(declaredField.getType())) {
                        android.util.Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                android.os.Bundle bundle = (android.os.Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (java.lang.IllegalAccessException e) {
                android.util.Log.e("NotificationCompat", "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e("NotificationCompat", "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    public static android.os.Bundle a(android.app.Notification.Builder builder, defpackage.nf nfVar) {
        builder.addAction(nfVar.d, nfVar.e, nfVar.f);
        android.os.Bundle bundle = new android.os.Bundle(nfVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
        return bundle;
    }

    static android.os.Bundle a(defpackage.nf nfVar) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("icon", nfVar.d);
        bundle2.putCharSequence("title", nfVar.e);
        bundle2.putParcelable("actionIntent", nfVar.f);
        if (nfVar.a != null) {
            bundle = new android.os.Bundle(nfVar.a);
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", nfVar.b);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", null);
        return bundle2;
    }

    static {
        new java.lang.Object();
    }
}
