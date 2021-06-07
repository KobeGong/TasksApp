package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* access modifiers changed from: package-private */
/* renamed from: dld  reason: default package */
/* compiled from: PG */
public final class dld implements PrivilegedExceptionAction {
    dld() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
