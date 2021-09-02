package defpackage;

/* renamed from: ul reason: default package */
/* compiled from: PG */
public final class ul {
    public final defpackage.rg a = new defpackage.rg(10);
    public final defpackage.ri b = new defpackage.ri();
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.HashSet d = new java.util.HashSet();

    public final void a(java.lang.Object obj) {
        if (!this.b.containsKey(obj)) {
            this.b.put(obj, null);
        }
    }

    public final java.util.List b(java.lang.Object obj) {
        return (java.util.List) this.b.get(obj);
    }

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.b.get(obj);
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
