package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: ech  reason: default package */
/* compiled from: PG */
public final class ech {
    public static final List a;
    public static final ech b = eci.OK.a();
    public static final ech c = eci.CANCELLED.a();
    public static final ech d = eci.UNKNOWN.a();
    public static final ech e = eci.INVALID_ARGUMENT.a();
    public static final ech f = eci.DEADLINE_EXCEEDED.a();
    public static final ech g = eci.NOT_FOUND.a();
    public static final ech h = eci.ALREADY_EXISTS.a();
    public static final ech i = eci.PERMISSION_DENIED.a();
    public static final ech j = eci.UNAUTHENTICATED.a();
    public static final ech k = eci.RESOURCE_EXHAUSTED.a();
    public static final ech l = eci.FAILED_PRECONDITION.a();
    public static final ech m = eci.ABORTED.a();
    public static final ech n = eci.OUT_OF_RANGE.a();
    public static final ech o = eci.UNIMPLEMENTED.a();
    public static final ech p = eci.INTERNAL.a();
    public static final ech q = eci.UNAVAILABLE.a();
    public static final ech r = eci.DATA_LOSS.a();
    public final eci s;
    public final String t;

    public ech(eci eci, String str) {
        this.s = (eci) cld.a(eci, "canonicalCode");
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ech)) {
            return false;
        }
        ech ech = (ech) obj;
        return this.s == ech.s && cru.d(this.t, ech.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, this.t});
    }

    public final String toString() {
        return cky.b(this).a("canonicalCode", this.s).a("description", this.t).toString();
    }

    static {
        TreeMap treeMap = new TreeMap();
        eci[] values = eci.values();
        for (eci eci : values) {
            ech ech = (ech) treeMap.put(Integer.valueOf(eci.r), new ech(eci, null));
            if (ech != null) {
                String name = ech.s.name();
                String name2 = eci.name();
                throw new IllegalStateException(new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length()).append("Code value duplication between ").append(name).append(" & ").append(name2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }
}
