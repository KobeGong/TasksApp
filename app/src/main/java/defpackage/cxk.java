package defpackage;

/* renamed from: cxk reason: default package */
/* compiled from: PG */
class cxk implements java.security.PrivilegedExceptionAction {
    cxk() {
    }

    public /* synthetic */ java.lang.Object run() {
        java.lang.reflect.Field[] declaredFields;
        java.lang.Class<sun.misc.Unsafe> cls = sun.misc.Unsafe.class;
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (sun.misc.Unsafe) cls.cast(obj);
            }
        }
        throw new java.lang.NoSuchFieldError("the Unsafe");
    }
}
