package defpackage;

/* renamed from: dld reason: default package */
/* compiled from: PG */
final class dld implements java.security.PrivilegedExceptionAction {
    dld() {
    }

    public final /* synthetic */ java.lang.Object run() {
        java.lang.reflect.Field[] declaredFields;
        java.lang.Class<sun.misc.Unsafe> cls = sun.misc.Unsafe.class;
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (sun.misc.Unsafe) cls.cast(obj);
            }
        }
        return null;
    }
}
