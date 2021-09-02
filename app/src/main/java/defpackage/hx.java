package defpackage;

/* renamed from: hx reason: default package */
/* compiled from: PG */
public final class hx {
    public static final java.util.Set a = new java.util.HashSet();
    public static final boolean b = a(java.lang.System.getProperty("java.vm.version"));

    public static android.content.pm.ApplicationInfo a(android.content.Context context) {
        try {
            return context.getApplicationInfo();
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static boolean a(java.lang.String str) {
        boolean z = false;
        if (str != null) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = java.lang.Integer.parseInt(matcher.group(1));
                    int parseInt2 = java.lang.Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (java.lang.NumberFormatException e) {
                }
            }
        }
        new java.lang.StringBuilder("VM with version ").append(str).append(z ? " has multidex support" : " does not have multidex support");
        return z;
    }

    public static java.lang.reflect.Field a(java.lang.Object obj, java.lang.String str) {
        java.lang.Class cls = obj.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new java.lang.NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static java.lang.reflect.Method a(java.lang.Object obj, java.lang.String str, java.lang.Class... clsArr) {
        java.lang.Class cls = obj.getClass();
        while (cls != null) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new java.lang.NoSuchMethodException("Method " + str + " with parameters " + java.util.Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static void a(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr) {
        java.lang.reflect.Field a2 = a(obj, str);
        java.lang.Object[] objArr2 = (java.lang.Object[]) a2.get(obj);
        java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        java.lang.System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        java.lang.System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        a2.set(obj, objArr3);
    }

    public static java.io.File a(android.content.Context context, android.content.pm.ApplicationInfo applicationInfo) {
        java.io.File file = new java.io.File(applicationInfo.dataDir, "code_cache");
        try {
            a(file);
        } catch (java.io.IOException e) {
            file = new java.io.File(context.getFilesDir(), "code_cache");
            a(file);
        }
        java.io.File file2 = new java.io.File(file, "secondary-dexes");
        a(file2);
        return file2;
    }

    private static void a(java.io.File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            java.io.File parentFile = file.getParentFile();
            if (parentFile == null) {
                android.util.Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                android.util.Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new java.io.IOException("Failed to create directory " + file.getPath());
        }
    }
}
