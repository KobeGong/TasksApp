package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ab  reason: default package */
/* compiled from: PG */
public final class ab {
    private static Map a = new HashMap();
    private static Map b = new HashMap();

    public static t a(Object obj) {
        if (obj instanceof q) {
            return new r((q) obj);
        }
        if (obj instanceof t) {
            return (t) obj;
        }
        Class<?> cls = obj.getClass();
        if (b(cls) != 2) {
            return new ah(obj);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            return new aj(a((Constructor) list.get(0), obj));
        }
        s[] sVarArr = new s[list.size()];
        for (int i = 0; i < list.size(); i++) {
            sVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new p(sVarArr);
    }

    private static s a(Constructor constructor, Object obj) {
        try {
            return (s) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor a(Class cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!name.isEmpty()) {
                str = name + "." + str;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static int b(Class cls) {
        int i;
        boolean z;
        ArrayList arrayList;
        int i2 = 0;
        if (a.containsKey(cls)) {
            return ((Integer) a.get(cls)).intValue();
        }
        if (cls.getCanonicalName() != null) {
            Constructor a2 = a(cls);
            if (a2 != null) {
                b.put(cls, Collections.singletonList(a2));
                i = 2;
            } else {
                n nVar = n.a;
                if (!nVar.b.containsKey(cls)) {
                    Method[] a3 = n.a(cls);
                    int length = a3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            nVar.b.put(cls, false);
                            z = false;
                            break;
                        } else if (((OnLifecycleEvent) a3[i3].getAnnotation(OnLifecycleEvent.class)) != null) {
                            nVar.a(cls, a3);
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = ((Boolean) nVar.b.get(cls)).booleanValue();
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    ArrayList arrayList2 = null;
                    if (c(superclass)) {
                        if (b(superclass) != 1) {
                            arrayList2 = new ArrayList((Collection) b.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    while (true) {
                        if (i2 < length2) {
                            Class<?> cls2 = interfaces[i2];
                            if (c(cls2)) {
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList2 == null) {
                                    arrayList = new ArrayList();
                                } else {
                                    arrayList = arrayList2;
                                }
                                arrayList.addAll((Collection) b.get(cls2));
                            } else {
                                arrayList = arrayList2;
                            }
                            i2++;
                            arrayList2 = arrayList;
                        } else if (arrayList2 != null) {
                            b.put(cls, arrayList2);
                            i = 2;
                        }
                    }
                }
            }
            a.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        a.put(cls, Integer.valueOf(i));
        return i;
    }

    private static boolean c(Class cls) {
        return cls != null && x.class.isAssignableFrom(cls);
    }
}
