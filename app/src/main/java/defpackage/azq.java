package defpackage;

/* renamed from: azq reason: default package */
/* compiled from: PG */
final class azq extends defpackage.azu {
    private final java.util.ArrayList a;
    private /* synthetic */ defpackage.azk b;

    public azq(defpackage.azk azk, java.util.ArrayList arrayList) {
        this.b = azk;
        super(azk);
        this.a = arrayList;
    }

    public final void a() {
        java.util.Set set;
        defpackage.azx azx = this.b.a.m;
        defpackage.azk azk = this.b;
        if (azk.j == null) {
            set = java.util.Collections.emptySet();
        } else {
            java.util.Set hashSet = new java.util.HashSet(azk.j.b);
            java.util.Map map = azk.j.d;
            for (defpackage.ayd ayd : map.keySet()) {
                if (!azk.a.g.containsKey(ayd.b())) {
                    map.get(ayd);
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        azx.e = set;
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ((defpackage.ayj) obj).a(this.b.g, this.b.a.m.e);
        }
    }
}
