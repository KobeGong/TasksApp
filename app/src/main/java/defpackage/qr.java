package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: qr  reason: default package */
/* compiled from: PG */
public class qr extends ri implements Map {
    private qz c;

    public qr() {
    }

    public qr(int i) {
        super(i);
    }

    public qr(ri riVar) {
        super(riVar);
    }

    private final qz a() {
        if (this.c == null) {
            this.c = new qs(this);
        }
        return this.c;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        a(this.b + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        qz a = a();
        if (a.a == null) {
            a.a = new rb(a);
        }
        return a.a;
    }

    @Override // java.util.Map
    public Set keySet() {
        return a().d();
    }

    @Override // java.util.Map
    public Collection values() {
        qz a = a();
        if (a.b == null) {
            a.b = new re(a);
        }
        return a.b;
    }
}
