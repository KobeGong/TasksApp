package defpackage;

/* renamed from: bga reason: default package */
/* compiled from: PG */
public final class bga extends dalvik.system.PathClassLoader {
    public bga(java.lang.String str, java.lang.ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    public final java.lang.Class loadClass(java.lang.String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (java.lang.ClassNotFoundException e) {
            }
        }
        return super.loadClass(str, z);
    }
}
