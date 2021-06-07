package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ehx  reason: default package */
/* compiled from: PG */
public abstract class ehx {
    private static final String b = ehx.class.getSimpleName();
    public final Context a;

    public ehx(Context context) {
        this.a = context;
    }

    public abstract ehu a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + b() + ", version=" + c() + ", enabled=" + d() + "]";
    }

    public static List a(Context context) {
        ArrayList arrayList = new ArrayList();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier != 0) {
            String string = context.getResources().getString(identifier);
            if (!a(context, string, arrayList, true)) {
                throw new RuntimeException("Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        a(context, "org.chromium.net.impl.NativeCronetProvider", arrayList, false);
        a(context, "org.chromium.net.impl.JavaCronetProvider", arrayList, false);
        return arrayList;
    }

    private static boolean a(Context context, String str, List list, boolean z) {
        try {
            list.add((ehx) context.getClassLoader().loadClass(str).asSubclass(ehx.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            if (z) {
                Log.e(b, "Unable to load provider class: " + str, e);
            } else {
                new StringBuilder("Tried to load ").append(str).append(" provider class but it wasn't included in the app classpath");
            }
            return false;
        }
    }
}
