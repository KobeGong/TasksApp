package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ServiceConfigurationError;

/* renamed from: dtj  reason: default package */
/* compiled from: PG */
public class dtj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.lang.Class r4, java.lang.Iterable r5, java.lang.ClassLoader r6, defpackage.dpv r7) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtj.a(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, dpv):java.util.List");
    }

    private static boolean a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static Object b(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        cld.a(inputStream);
        cld.a(outputStream);
        byte[] bArr = new byte[16384];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static dwe c() {
        if (dya.a == null) {
            return new dya();
        }
        return new drj();
    }

    public static Object a(Class cls, Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            String name = cls.getName();
            throw new ServiceConfigurationError(new StringBuilder(String.valueOf(name).length() + 36).append("Provider ").append(name).append(" could not be instantiated.").toString(), e);
        }
    }

    public static boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(charAt >= ' ' && charAt <= '~')) {
                return false;
            }
        }
        return true;
    }
}
