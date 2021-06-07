package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: azq  reason: default package */
/* compiled from: PG */
public final class azq extends azu {
    private final ArrayList a;
    private /* synthetic */ azk b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azq(azk azk, ArrayList arrayList) {
        super(azk);
        this.b = azk;
        this.a = arrayList;
    }

    @Override // defpackage.azu
    public final void a() {
        Set set;
        azx azx = this.b.a.m;
        azk azk = this.b;
        if (azk.j == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(azk.j.b);
            Map map = azk.j.d;
            for (ayd ayd : map.keySet()) {
                if (!azk.a.g.containsKey(ayd.b())) {
                    map.get(ayd);
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        azx.e = set;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ayj) obj).a(this.b.g, this.b.a.m.e);
        }
    }
}
