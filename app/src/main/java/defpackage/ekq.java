package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ekq  reason: default package */
/* compiled from: PG */
public final class ekq extends ejg {
    private final List a;
    private final int b;
    private final String c;
    private final String d;
    private final AtomicLong e;
    private final ejh f;

    public ekq(List list, int i, String str, List list2, String str2, long j) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.f = new ejh(Collections.unmodifiableList(list2));
        this.d = str2;
        this.e = new AtomicLong(j);
    }

    @Override // defpackage.ejg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ejg
    public final List b() {
        return this.f.a;
    }

    @Override // defpackage.ejg
    public final Map c() {
        ejh ejh = this.f;
        if (ejh.b != null) {
            return ejh.b;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : ejh.a) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        ejh.b = Collections.unmodifiableMap(treeMap);
        return ejh.b;
    }

    @Override // defpackage.ejg
    public final String d() {
        return this.d;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), (String) this.a.get(this.a.size() - 1), this.a.toString(), Integer.valueOf(a()), this.c, b().toString(), false, d(), null, Long.valueOf(this.e.get()));
    }

    public final void a(long j) {
        this.e.set(j);
    }
}
