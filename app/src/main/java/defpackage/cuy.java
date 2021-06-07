package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: cuy  reason: default package */
/* compiled from: PG */
public final class cuy {
    public static final cuy a = new cuy(Collections.unmodifiableSortedMap(new TreeMap()));
    public final SortedMap b;
    private Integer c = null;
    private String d = null;

    private cuy(SortedMap sortedMap) {
        this.b = sortedMap;
    }

    public final void a(cun cun) {
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            Set<Object> set = (Set) entry.getValue();
            if (!set.isEmpty()) {
                for (Object obj : set) {
                    cun.a(str, obj);
                }
            } else {
                cun.a(str, null);
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cuy) && ((cuy) obj).b.equals(this.b);
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.b.hashCode());
        }
        return this.c.intValue();
    }

    public final String toString() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder();
            cum cum = new cum("[ ", " ]", sb);
            a(cum);
            cum.a();
            this.d = sb.toString();
        }
        return this.d;
    }

    static {
        new cuz();
        Collections.unmodifiableSortedSet(new TreeSet());
    }
}
