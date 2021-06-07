package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: agq  reason: default package */
/* compiled from: PG */
public final class agq {
    private static Field q;
    private static boolean r;
    private static Class s;
    private static boolean t;
    private static Field u;
    private static boolean v;
    private static Field w;
    private static boolean x;
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public boolean k;
    public DialogInterface.OnDismissListener l;
    public DialogInterface.OnKeyListener m;
    public ListAdapter n;
    public DialogInterface.OnClickListener o;
    public int p = -1;

    public static boolean a(Resources resources) {
        Map map;
        if (!r) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            r = true;
        }
        if (q != null) {
            try {
                map = (Map) q.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    public static boolean b(Resources resources) {
        Object obj;
        if (!r) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            r = true;
        }
        if (q != null) {
            try {
                obj = q.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            return obj == null && obj != null && a(obj);
        }
        obj = null;
        if (obj == null) {
            return false;
        }
    }

    public static boolean c(Resources resources) {
        Object obj;
        Object obj2;
        if (!x) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                w = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            x = true;
        }
        if (w == null) {
            return false;
        }
        try {
            obj = w.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!r) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                q = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            r = true;
        }
        if (q != null) {
            try {
                obj2 = q.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
            return obj2 != null && a(obj2);
        }
        obj2 = null;
        if (obj2 != null) {
            return false;
        }
    }

    private static boolean a(Object obj) {
        LongSparseArray longSparseArray;
        if (!t) {
            try {
                s = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            t = true;
        }
        if (s == null) {
            return false;
        }
        if (!v) {
            try {
                Field declaredField = s.getDeclaredField("mUnthemedEntries");
                u = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            v = true;
        }
        if (u == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) u.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    public agq(Context context) {
        this.a = context;
        this.k = true;
        this.b = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
