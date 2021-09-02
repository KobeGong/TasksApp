package defpackage;

/* renamed from: ehm reason: default package */
/* compiled from: PG */
public final class ehm {
    private static final java.lang.reflect.Method a;

    public static java.io.FileDescriptor a(int i) {
        try {
            java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
            a.invoke(fileDescriptor, new java.lang.Object[]{java.lang.Integer.valueOf(i)});
            return fileDescriptor;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e2);
        }
    }

    static {
        try {
            a = java.io.FileDescriptor.class.getMethod("setInt$", new java.lang.Class[]{java.lang.Integer.TYPE});
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e) {
            throw new java.lang.RuntimeException("Unable to get FileDescriptor.setInt$", e);
        }
    }
}
