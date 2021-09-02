package defpackage;

/* renamed from: ab reason: default package */
/* compiled from: PG */
public final class ab {
    private static java.util.Map a = new java.util.HashMap();
    private static java.util.Map b = new java.util.HashMap();

    public static defpackage.t a(java.lang.Object obj) {
        int i = 0;
        if (obj instanceof defpackage.q) {
            return new defpackage.r((defpackage.q) obj);
        }
        if (obj instanceof defpackage.t) {
            return (defpackage.t) obj;
        }
        java.lang.Class cls = obj.getClass();
        if (b(cls) != 2) {
            return new defpackage.ah(obj);
        }
        java.util.List list = (java.util.List) b.get(cls);
        if (list.size() == 1) {
            return new defpackage.aj(a((java.lang.reflect.Constructor) list.get(0), obj));
        }
        defpackage.s[] sVarArr = new defpackage.s[list.size()];
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return new defpackage.p(sVarArr);
            }
            sVarArr[i2] = a((java.lang.reflect.Constructor) list.get(i2), obj);
            i = i2 + 1;
        }
    }

    private static defpackage.s a(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            return (defpackage.s) constructor.newInstance(new java.lang.Object[]{obj});
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static java.lang.reflect.Constructor a(java.lang.Class cls) {
        try {
            java.lang.Package packageR = cls.getPackage();
            java.lang.String canonicalName = cls.getCanonicalName();
            java.lang.String str = packageR != null ? packageR.getName() : "";
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            java.lang.String str2 = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!str.isEmpty()) {
                str2 = str + "." + str2;
            }
            java.lang.reflect.Constructor declaredConstructor = java.lang.Class.forName(str2).getDeclaredConstructor(new java.lang.Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (java.lang.ClassNotFoundException e) {
            return null;
        } catch (java.lang.NoSuchMethodException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private static int b(java.lang.Class cls) {
        int i;
        boolean z;
        java.util.List list;
        int i2 = 0;
        if (a.containsKey(cls)) {
            return ((java.lang.Integer) a.get(cls)).intValue();
        }
        if (cls.getCanonicalName() != null) {
            java.lang.reflect.Constructor a2 = a(cls);
            if (a2 != null) {
                b.put(cls, java.util.Collections.singletonList(a2));
                i = 2;
            } else {
                defpackage.n nVar = defpackage.n.a;
                if (!nVar.b.containsKey(cls)) {
                    java.lang.reflect.Method[] a3 = defpackage.n.a(cls);
                    int length = a3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            nVar.b.put(cls, java.lang.Boolean.valueOf(false));
                            z = false;
                            break;
                        } else if (((android.arch.lifecycle.OnLifecycleEvent) a3[i3].getAnnotation(android.arch.lifecycle.OnLifecycleEvent.class)) != null) {
                            nVar.a(cls, a3);
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = ((java.lang.Boolean) nVar.b.get(cls)).booleanValue();
                }
                if (!z) {
                    java.lang.Class superclass = cls.getSuperclass();
                    java.util.List list2 = null;
                    if (c(superclass)) {
                        if (b(superclass) != 1) {
                            list2 = new java.util.ArrayList((java.util.Collection) b.get(superclass));
                        }
                    }
                    java.lang.Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    while (true) {
                        if (i2 < length2) {
                            java.lang.Class cls2 = interfaces[i2];
                            if (c(cls2)) {
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (list2 == null) {
                                    list = new java.util.ArrayList();
                                } else {
                                    list = list2;
                                }
                                list.addAll((java.util.Collection) b.get(cls2));
                            } else {
                                list = list2;
                            }
                            i2++;
                            list2 = list;
                        } else if (list2 != null) {
                            b.put(cls, list2);
                            i = 2;
                        }
                    }
                }
            }
            a.put(cls, java.lang.Integer.valueOf(i));
            return i;
        }
        i = 1;
        a.put(cls, java.lang.Integer.valueOf(i));
        return i;
    }

    private static boolean c(java.lang.Class cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }
}
