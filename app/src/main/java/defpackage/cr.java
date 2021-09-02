package defpackage;

/* renamed from: cr reason: default package */
/* compiled from: PG */
public final class cr {
    public final java.util.Map a = new java.util.HashMap();
    public final java.util.Map b;

    public cr(java.util.Map map) {
        this.b = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.v vVar = (defpackage.v) entry.getValue();
            java.util.List list = (java.util.List) this.a.get(vVar);
            if (list == null) {
                list = new java.util.ArrayList();
                this.a.put(vVar, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void a(java.util.List list, LifecycleOwner yVar, defpackage.v vVar, java.lang.Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                defpackage.o oVar = (defpackage.o) list.get(size);
                try {
                    switch (oVar.a) {
                        case 0:
                            oVar.b.invoke(obj, new java.lang.Object[0]);
                            break;
                        case 1:
                            oVar.b.invoke(obj, new java.lang.Object[]{yVar});
                            break;
                        case 2:
                            oVar.b.invoke(obj, new java.lang.Object[]{yVar, vVar});
                            break;
                    }
                    size--;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    throw new java.lang.RuntimeException("Failed to call observer method", e.getCause());
                } catch (java.lang.IllegalAccessException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            }
        }
    }
}
