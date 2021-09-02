package defpackage;

/* renamed from: n reason: default package */
/* compiled from: PG */
final class n {
    public static defpackage.n a = new defpackage.n();
    public final java.util.Map b = new java.util.HashMap();
    private final java.util.Map c = new java.util.HashMap();

    n() {
    }

    static java.lang.reflect.Method[] a(java.lang.Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e) {
            throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cr b(java.lang.Class cls) {
        defpackage.cr crVar = (defpackage.cr) this.c.get(cls);
        if (crVar != null) {
            return crVar;
        }
        return a(cls, null);
    }

    private static void a(java.util.Map map, defpackage.o oVar, defpackage.v vVar, java.lang.Class cls) {
        defpackage.v vVar2 = (defpackage.v) map.get(oVar);
        if (vVar2 != null && vVar != vVar2) {
            throw new java.lang.IllegalArgumentException("Method " + oVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + vVar2 + ", new value " + vVar);
        } else if (vVar2 == null) {
            map.put(oVar, vVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cr a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        boolean z;
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (superclass != null) {
            defpackage.cr b2 = b(superclass);
            if (b2 != null) {
                hashMap.putAll(b2.b);
            }
        }
        for (java.lang.Class b3 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : b(b3).b.entrySet()) {
                a(hashMap, (defpackage.o) entry.getKey(), (defpackage.v) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        int length = methodArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            java.lang.reflect.Method method = methodArr[i2];
            android.arch.lifecycle.OnLifecycleEvent onLifecycleEvent = (android.arch.lifecycle.OnLifecycleEvent) method.getAnnotation(android.arch.lifecycle.OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                java.lang.Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                defpackage.v a2 = onLifecycleEvent.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(defpackage.v.class)) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a2 != defpackage.v.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new defpackage.o(i, method), a2, cls);
                z = true;
            } else {
                z = z2;
            }
            i2++;
            z2 = z;
        }
        defpackage.cr crVar = new defpackage.cr(hashMap);
        this.c.put(cls, crVar);
        this.b.put(cls, java.lang.Boolean.valueOf(z2));
        return crVar;
    }
}
