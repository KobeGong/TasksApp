package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ul  reason: default package */
/* compiled from: PG */
public final class ul {
    public final rg a = new rg(10);
    public final ri b = new ri();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public final void a(Object obj) {
        if (!this.b.containsKey(obj)) {
            this.b.put(obj, null);
        }
    }

    public final List b(Object obj) {
        return (List) this.b.get(obj);
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
        }
    }
}
