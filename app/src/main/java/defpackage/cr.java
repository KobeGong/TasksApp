package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cr  reason: default package */
/* compiled from: PG */
public final class cr {
    public final Map a = new HashMap();
    public final Map b;

    public cr(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            v vVar = (v) entry.getValue();
            List list = (List) this.a.get(vVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(vVar, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void a(List list, y yVar, v vVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                o oVar = (o) list.get(size);
                try {
                    switch (oVar.a) {
                        case 0:
                            oVar.b.invoke(obj, new Object[0]);
                            break;
                        case 1:
                            oVar.b.invoke(obj, yVar);
                            break;
                        case 2:
                            oVar.b.invoke(obj, yVar, vVar);
                            break;
                    }
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
