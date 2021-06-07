package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: dya  reason: default package */
/* compiled from: PG */
public final class dya implements dwe {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(dya.class.getName());
    private static final Constructor c;
    private static final Method d;
    private final Object e;

    public dya() {
        if (a != null) {
            throw a;
        }
        try {
            this.e = c.newInstance(new Object[0]);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // defpackage.dwe
    public final void a() {
        try {
            d.invoke(this.e, 1L);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[ADDED_TO_REGION] */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dya.<clinit>():void");
    }
}
