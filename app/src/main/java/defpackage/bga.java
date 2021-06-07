package defpackage;

import dalvik.system.PathClassLoader;

/* renamed from: bga  reason: default package */
/* compiled from: PG */
public final class bga extends PathClassLoader {
    public bga(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException e) {
            }
        }
        return super.loadClass(str, z);
    }
}
