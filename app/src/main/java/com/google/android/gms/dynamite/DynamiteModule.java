package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;

/* compiled from: PG */
public final class DynamiteModule {
    public static final bfs a = new bfx();
    private static Boolean b;
    private static bgd c;
    private static bgf d;
    private static String e;
    private static final ThreadLocal f = new ThreadLocal();
    private static final bgb g = new bft();
    private final Context h;

    @DynamiteApi
    /* compiled from: PG */
    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static DynamiteModule a(Context context, bfs bfs, String str) {
        bfp bfp = (bfp) f.get();
        bfp bfp2 = new bfp();
        f.set(bfp2);
        try {
            bgc a2 = bfs.a(context, str, g);
            new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a2.a).append(" and remote module ").append(str).append(":").append(a2.b);
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                throw new bfr(new StringBuilder(91).append("No acceptable module found. Local version is ").append(a2.a).append(" and remote version is ").append(a2.b).append(".").toString());
            } else if (a2.c == -1) {
                return b(context, str);
            } else if (a2.c == 1) {
                try {
                    DynamiteModule a3 = a(context, str, a2.b);
                    if (bfp2.a != null) {
                        bfp2.a.close();
                    }
                    f.set(bfp);
                    return a3;
                } catch (bfr e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
                    if (a2.a == 0 || bfs.a(context, str, new bfq(a2.a)).c != -1) {
                        throw new bfr("Remote load failed. No local fallback found.", e2);
                    }
                    DynamiteModule b2 = b(context, str);
                    if (bfp2.a != null) {
                        bfp2.a.close();
                    }
                    f.set(bfp);
                    return b2;
                }
            } else {
                throw new bfr(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(a2.c).toString());
            }
        } finally {
            if (bfp2.a != null) {
                bfp2.a.close();
            }
            f.set(bfp);
        }
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(String.valueOf("com.google.android.gms.dynamite.descriptors.").length() + 1 + String.valueOf(str).length() + String.valueOf("ModuleDescriptor").length()).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".").append("ModuleDescriptor").toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        synchronized (DynamiteModule.class) {
            Boolean bool = b;
            if (bool == null) {
                try {
                    Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                    Field declaredField = loadClass.getDeclaredField("sClassLoader");
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    a(classLoader);
                                } catch (bfr e2) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int c2 = c(context, str, z);
                                if (e == null || e.isEmpty()) {
                                    return c2;
                                }
                                bga bga = new bga(e, ClassLoader.getSystemClassLoader());
                                a(bga);
                                declaredField.set(null, bga);
                                b = Boolean.TRUE;
                                return c2;
                            } catch (bfr e3) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                                b = bool;
                                if (!bool.booleanValue()) {
                                    return b(context, str, z);
                                }
                                try {
                                    return c(context, str, z);
                                } catch (bfr e4) {
                                    String valueOf = String.valueOf(e4.getMessage());
                                    Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                                    return 0;
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                    String valueOf2 = String.valueOf(e5);
                    Log.w("DynamiteModule", new StringBuilder(String.valueOf(valueOf2).length() + 30).append("Failed to load module via V2: ").append(valueOf2).toString());
                    bool = Boolean.FALSE;
                }
            }
        }
    }

    private static int b(Context context, String str, boolean z) {
        bgd a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            return a2.a(bfo.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule b(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule a(Context context, String str, int i) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = b;
        }
        if (bool == null) {
            throw new bfr("Failed to determine which loading route to use.");
        } else if (bool.booleanValue()) {
            return c(context, str, i);
        } else {
            return b(context, str, i);
        }
    }

    private static DynamiteModule b(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        bgd a2 = a(context);
        if (a2 == null) {
            throw new bfr("Failed to create IDynamiteLoader.");
        }
        try {
            bfl a3 = a2.a(bfo.a(context), str, i);
            if (bfo.a(a3) != null) {
                return new DynamiteModule((Context) bfo.a(a3));
            }
            throw new bfr("Failed to load remote module.");
        } catch (RemoteException e2) {
            throw new bfr("Failed to load remote module.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bgd] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.bgd a(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context):bgd");
    }

    private static DynamiteModule c(Context context, String str, int i) {
        bgf bgf;
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        synchronized (DynamiteModule.class) {
            bgf = d;
        }
        if (bgf == null) {
            throw new bfr("DynamiteLoaderV2 was not cached.");
        }
        bfp bfp = (bfp) f.get();
        if (bfp == null || bfp.a == null) {
            throw new bfr("No result cursor");
        }
        Context a2 = a(context.getApplicationContext(), str, i, bfp.a, bgf);
        if (a2 != null) {
            return new DynamiteModule(a2);
        }
        throw new bfr("Failed to get module context");
    }

    private static Context a(Context context, String str, int i, Cursor cursor, bgf bgf) {
        try {
            return (Context) bfo.a(bgf.a(bfo.a(context), str, i, bfo.a(cursor)));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bgf] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.ClassLoader r4) {
        /*
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r1 = r4.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            if (r1 != 0) goto L_0x001c
            r1 = 0
        L_0x0019:
            com.google.android.gms.dynamite.DynamiteModule.d = r1     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            return
        L_0x001c:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            boolean r3 = r2 instanceof defpackage.bgf     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            if (r3 == 0) goto L_0x002b
            r0 = r2
            bgf r0 = (defpackage.bgf) r0     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            r1 = r0
            goto L_0x0019
        L_0x002b:
            bgg r2 = new bgg     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            r2.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0032, IllegalAccessException -> 0x003d, InstantiationException -> 0x003b, InvocationTargetException -> 0x0041, NoSuchMethodException -> 0x003f }
            r1 = r2
            goto L_0x0019
        L_0x0032:
            r1 = move-exception
        L_0x0033:
            bfr r2 = new bfr
            java.lang.String r3 = "Failed to instantiate dynamite loader"
            r2.<init>(r3, r1)
            throw r2
        L_0x003b:
            r1 = move-exception
            goto L_0x0033
        L_0x003d:
            r1 = move-exception
            goto L_0x0033
        L_0x003f:
            r1 = move-exception
            goto L_0x0033
        L_0x0041:
            r1 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(java.lang.ClassLoader):void");
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.h.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new bfr(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2);
        }
    }

    private DynamiteModule(Context context) {
        this.h = (Context) azb.b(context);
    }

    static {
        new bfu();
        new bfv();
        new bfw();
        new bfy();
        new bfz();
    }
}
