package defpackage;

/* renamed from: agq reason: default package */
/* compiled from: PG */
public final class agq {
    private static java.lang.reflect.Field q;
    private static boolean r;
    private static java.lang.Class s;
    private static boolean t;
    private static java.lang.reflect.Field u;
    private static boolean v;
    private static java.lang.reflect.Field w;
    private static boolean x;
    public final android.content.Context a;
    public final android.view.LayoutInflater b;
    public android.graphics.drawable.Drawable c;
    public java.lang.CharSequence d;
    public android.view.View e;
    public java.lang.CharSequence f;
    public java.lang.CharSequence g;
    public android.content.DialogInterface.OnClickListener h;
    public java.lang.CharSequence i;
    public android.content.DialogInterface.OnClickListener j;
    public boolean k;
    public android.content.DialogInterface.OnDismissListener l;
    public android.content.DialogInterface.OnKeyListener m;
    public android.widget.ListAdapter n;
    public android.content.DialogInterface.OnClickListener o;
    public int p = -1;

    public static boolean a(android.content.res.Resources resources) {
        java.util.Map map;
        if (!r) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mDrawableCache");
                q = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            r = true;
        }
        if (q != null) {
            try {
                map = (java.util.Map) q.get(resources);
            } catch (java.lang.IllegalAccessException e3) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    public static boolean b(android.content.res.Resources resources) {
        java.lang.Object obj;
        if (!r) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mDrawableCache");
                q = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            r = true;
        }
        if (q != null) {
            try {
                obj = q.get(resources);
            } catch (java.lang.IllegalAccessException e3) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (obj == null && obj != null && a(obj)) {
                return true;
            }
            return false;
        }
        obj = null;
        if (obj == null) {
            return false;
        }
        return true;
    }

    public static boolean c(android.content.res.Resources resources) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (!x) {
            try {
                java.lang.reflect.Field declaredField = android.content.res.Resources.class.getDeclaredField("mResourcesImpl");
                w = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            x = true;
        }
        if (w == null) {
            return false;
        }
        try {
            obj = w.get(resources);
        } catch (java.lang.IllegalAccessException e3) {
            android.util.Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!r) {
            try {
                java.lang.reflect.Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                q = declaredField2;
                declaredField2.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e4) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            r = true;
        }
        if (q != null) {
            try {
                obj2 = q.get(obj);
            } catch (java.lang.IllegalAccessException e5) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
            if (obj2 == null && a(obj2)) {
                return true;
            }
        }
        obj2 = null;
        return obj2 == null ? false : false;
    }

    private static boolean a(java.lang.Object obj) {
        android.util.LongSparseArray longSparseArray;
        if (!t) {
            try {
                s = java.lang.Class.forName("android.content.res.ThemedResourceCache");
            } catch (java.lang.ClassNotFoundException e2) {
                android.util.Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            t = true;
        }
        if (s == null) {
            return false;
        }
        if (!v) {
            try {
                java.lang.reflect.Field declaredField = s.getDeclaredField("mUnthemedEntries");
                u = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e3) {
                android.util.Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            v = true;
        }
        if (u == null) {
            return false;
        }
        try {
            longSparseArray = (android.util.LongSparseArray) u.get(obj);
        } catch (java.lang.IllegalAccessException e4) {
            android.util.Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    public agq(android.content.Context context) {
        this.a = context;
        this.k = true;
        this.b = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }
}
