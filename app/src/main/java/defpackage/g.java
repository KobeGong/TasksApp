package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: g  reason: default package */
/* compiled from: PG */
public class g implements Iterable {
    public j b;
    public j c;
    public WeakHashMap d = new WeakHashMap();
    public int e = 0;

    /* access modifiers changed from: protected */
    public j a(Object obj) {
        j jVar = this.b;
        while (jVar != null && !jVar.a.equals(obj)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public Object a(Object obj, Object obj2) {
        j a = a(obj);
        if (a != null) {
            return a.b;
        }
        b(obj, obj2);
        return null;
    }

    /* access modifiers changed from: protected */
    public final j b(Object obj, Object obj2) {
        j jVar = new j(obj, obj2);
        this.e++;
        if (this.c == null) {
            this.b = jVar;
            this.c = this.b;
        } else {
            this.c.c = jVar;
            jVar.d = this.c;
            this.c = jVar;
        }
        return jVar;
    }

    public Object b(Object obj) {
        j a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (m mVar : this.d.keySet()) {
                mVar.a_(a);
            }
        }
        if (a.d != null) {
            a.d.c = a.c;
        } else {
            this.b = a.c;
        }
        if (a.c != null) {
            a.c.d = a.d;
        } else {
            this.c = a.d;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = new h(this.b, this.c);
        this.d.put(hVar, false);
        return hVar;
    }

    public final k a() {
        k kVar = new k(this);
        this.d.put(kVar, false);
        return kVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.e != gVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
