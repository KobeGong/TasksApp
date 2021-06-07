package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: dkr  reason: default package */
/* compiled from: PG */
public final class dkr implements Comparable, Map.Entry {
    private final Comparable a;
    private Object b;
    private final /* synthetic */ dkk c;

    dkr(dkk dkk, Map.Entry entry) {
        this(dkk, (Comparable) entry.getKey(), entry.getValue());
    }

    dkr(dkk dkk, Comparable comparable, Object obj) {
        this.c = dkk;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.e();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.a == null ? 0 : this.a.hashCode();
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((dkr) obj).getKey());
    }
}
