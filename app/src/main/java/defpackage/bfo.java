package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: bfo  reason: default package */
/* compiled from: PG */
public final class bfo extends bfm {
    private final Object a;

    private bfo(Object obj) {
        this.a = obj;
    }

    public static bfl a(Object obj) {
        return new bfo(obj);
    }

    public static Object a(bfl bfl) {
        int i = 0;
        if (bfl instanceof bfo) {
            return ((bfo) bfl).a;
        }
        IBinder asBinder = bfl.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (!field2.isSynthetic()) {
                i++;
            } else {
                field2 = field;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
