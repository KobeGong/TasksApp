package defpackage;

/* renamed from: bfo reason: default package */
/* compiled from: PG */
public final class bfo extends defpackage.bfm {
    private final java.lang.Object a;

    private bfo(java.lang.Object obj) {
        this.a = obj;
    }

    public static defpackage.bfl a(java.lang.Object obj) {
        return new defpackage.bfo(obj);
    }

    public static java.lang.Object a(defpackage.bfl bfl) {
        int i = 0;
        if (bfl instanceof defpackage.bfo) {
            return ((defpackage.bfo) bfl).a;
        }
        android.os.IBinder asBinder = bfl.asBinder();
        java.lang.reflect.Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            java.lang.reflect.Field field2 = declaredFields[i2];
            if (!field2.isSynthetic()) {
                i++;
            } else {
                field2 = field;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (java.lang.NullPointerException e) {
                throw new java.lang.IllegalArgumentException("Binder object is null.", e);
            } catch (java.lang.IllegalAccessException e2) {
                throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
