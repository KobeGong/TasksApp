package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: n  reason: default package */
/* compiled from: PG */
public final class n {
    public static n a = new n();
    public final Map b = new HashMap();
    private final Map c = new HashMap();

    n() {
    }

    static Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final cr b(Class cls) {
        cr crVar = (cr) this.c.get(cls);
        if (crVar != null) {
            return crVar;
        }
        return a(cls, null);
    }

    private static void a(Map map, o oVar, v vVar, Class cls) {
        v vVar2 = (v) map.get(oVar);
        if (vVar2 != null && vVar != vVar2) {
            throw new IllegalArgumentException("Method " + oVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + vVar2 + ", new value " + vVar);
        } else if (vVar2 == null) {
            map.put(oVar, vVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final cr a(Class cls, Method[] methodArr) {
        boolean z;
        int i;
        cr b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                a(hashMap, (o) entry.getKey(), (v) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        int length = methodArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            Method method = methodArr[i2];
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(y.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                v a2 = onLifecycleEvent.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(v.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a2 != v.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new o(i, method), a2, cls);
                z = true;
            } else {
                z = z2;
            }
            i2++;
            z2 = z;
        }
        cr crVar = new cr(hashMap);
        this.c.put(cls, crVar);
        this.b.put(cls, Boolean.valueOf(z2));
        return crVar;
    }
}
