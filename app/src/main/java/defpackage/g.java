package defpackage;

/* renamed from: g reason: default package */
/* compiled from: PG */
public class g implements java.lang.Iterable {
    public defpackage.j b;
    public defpackage.j c;
    public java.util.WeakHashMap d = new java.util.WeakHashMap();
    public int e = 0;

    /* access modifiers changed from: protected */
    public defpackage.j a(java.lang.Object obj) {
        defpackage.j jVar = this.b;
        while (jVar != null && !jVar.a.equals(obj)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.j a = a(obj);
        if (a != null) {
            return a.b;
        }
        b(obj, obj2);
        return null;
    }

    /* access modifiers changed from: protected */
    public final defpackage.j b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.j jVar = new defpackage.j(obj, obj2);
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

    public java.lang.Object b(java.lang.Object obj) {
        defpackage.j a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (defpackage.m a_ : this.d.keySet()) {
                a_.a_(a);
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

    public java.util.Iterator iterator() {
        defpackage.h hVar = new defpackage.h(this.b, this.c);
        this.d.put(hVar, java.lang.Boolean.valueOf(false));
        return hVar;
    }

    public final defpackage.k a() {
        defpackage.k kVar = new defpackage.k(this);
        this.d.put(kVar, java.lang.Boolean.valueOf(false));
        return kVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.g)) {
            return false;
        }
        defpackage.g gVar = (defpackage.g) obj;
        if (this.e != gVar.e) {
            return false;
        }
        java.util.Iterator it = iterator();
        java.util.Iterator it2 = gVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((java.util.Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
