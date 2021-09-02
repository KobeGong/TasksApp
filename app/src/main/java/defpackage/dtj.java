package defpackage;

/* renamed from: dtj reason: default package */
/* compiled from: PG */
public class dtj {
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Iterable, code=java.lang.Iterable<java.lang.Class>, for r5v0, types: [java.lang.Iterable<java.lang.Class>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.lang.Class r4, java.lang.Iterable<java.lang.Class> r5, java.lang.ClassLoader r6, defpackage.dpv r7) {
        /*
            boolean r0 = a(r6)
            if (r0 == 0) goto L_0x0041
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r2.next()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r0 = b(r4, r0)
            r1.add(r0)
            goto L_0x000f
        L_0x0023:
            r0 = r1
        L_0x0024:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r0.next()
            boolean r3 = r7.b(r2)
            if (r3 == 0) goto L_0x002d
            r1.add(r2)
            goto L_0x002d
        L_0x0041:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r4, r6)
            java.util.Iterator r1 = r0.iterator()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L_0x0024
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r4)
            goto L_0x0024
        L_0x0054:
            dpu r0 = new dpu
            r0.<init>(r7)
            java.util.Comparator r0 = java.util.Collections.reverseOrder(r0)
            java.util.Collections.sort(r1, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtj.a(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, dpv):java.util.List");
    }

    private static boolean a(java.lang.ClassLoader classLoader) {
        try {
            java.lang.Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (java.lang.Exception e) {
            return false;
        }
    }

    private static java.lang.Object b(java.lang.Class cls, java.lang.Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (Throwable th) {
            throw new java.util.ServiceConfigurationError(java.lang.String.format("Provider %s could not be instantiated %s", new java.lang.Object[]{cls2.getName(), th}), th);
        }
    }

    public static byte[] a(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        a(inputStream, (java.io.OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        defpackage.cld.a((java.lang.Object) inputStream);
        defpackage.cld.a((java.lang.Object) outputStream);
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

    public static defpackage.dwe c() {
        if (defpackage.dya.a == null) {
            return new defpackage.dya();
        }
        return new defpackage.drj();
    }

    public static java.lang.Object a(java.lang.Class cls, java.lang.Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            java.lang.String name = cls.getName();
            throw new java.util.ServiceConfigurationError(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 36).append("Provider ").append(name).append(" could not be instantiated.").toString(), e);
        }
    }

    public static boolean a(java.lang.String str) {
        boolean z;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
