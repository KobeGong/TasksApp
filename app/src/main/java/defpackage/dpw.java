package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: dpw  reason: default package */
/* compiled from: PG */
public final class dpw {
    public static final List a;
    public static final dpw b = dpx.OK.a();
    public static final dpw c = dpx.CANCELLED.a();
    public static final dpw d = dpx.UNKNOWN.a();
    public static final dpw e = dpx.DEADLINE_EXCEEDED.a();
    public static final dpw f = dpx.UNAUTHENTICATED.a();
    public static final dpw g = dpx.RESOURCE_EXHAUSTED.a();
    public static final dpw h = dpx.INTERNAL.a();
    public static final dpw i = dpx.UNAVAILABLE.a();
    public static final doy j = doy.a("grpc-status", false, new dpy());
    public static final doy k = doy.a("grpc-message", false, o);
    private static final dpa o = new dpz();
    public final dpx l;
    public final String m;
    public final Throwable n;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.dpw a(byte[] r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpw.a(byte[]):dpw");
    }

    public static dpw a(Throwable th) {
        for (Throwable th2 = (Throwable) cld.a(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof dqa) {
                return ((dqa) th2).a;
            }
            if (th2 instanceof dqb) {
                return ((dqb) th2).a;
            }
        }
        return d.b(th);
    }

    static String a(dpw dpw) {
        if (dpw.m == null) {
            return dpw.l.toString();
        }
        String valueOf = String.valueOf(dpw.l);
        String str = dpw.m;
        return new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
    }

    private dpw(dpx dpx) {
        this(dpx, null, null);
    }

    private dpw(dpx dpx, String str, Throwable th) {
        this.l = (dpx) cld.a(dpx, "code");
        this.m = str;
        this.n = th;
    }

    public final dpw b(Throwable th) {
        return cru.d(this.n, th) ? this : new dpw(this.l, this.m, th);
    }

    public final dpw a(String str) {
        return cru.d(this.m, str) ? this : new dpw(this.l, str, this.n);
    }

    public final dpw b(String str) {
        if (str == null) {
            return this;
        }
        if (this.m == null) {
            return new dpw(this.l, str, this.n);
        }
        dpx dpx = this.l;
        String str2 = this.m;
        return new dpw(dpx, new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.n);
    }

    public final boolean a() {
        return dpx.OK == this.l;
    }

    public final dqb b() {
        return new dqb(this);
    }

    public final dqb a(dor dor) {
        return new dqb(this, dor);
    }

    public final dqa c() {
        return new dqa(this);
    }

    public final String toString() {
        return cky.b(this).a("code", this.l.name()).a("description", this.m).a("cause", this.n != null ? cse.c(this.n) : this.n).toString();
    }

    static {
        TreeMap treeMap = new TreeMap();
        dpx[] values = dpx.values();
        for (dpx dpx : values) {
            dpw dpw = (dpw) treeMap.put(Integer.valueOf(dpx.r), new dpw(dpx));
            if (dpw != null) {
                String name = dpw.l.name();
                String name2 = dpx.name();
                throw new IllegalStateException(new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length()).append("Code value duplication between ").append(name).append(" & ").append(name2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        dpx.INVALID_ARGUMENT.a();
        dpx.NOT_FOUND.a();
        dpx.ALREADY_EXISTS.a();
        dpx.PERMISSION_DENIED.a();
        dpx.FAILED_PRECONDITION.a();
        dpx.ABORTED.a();
        dpx.OUT_OF_RANGE.a();
        dpx.UNIMPLEMENTED.a();
        dpx.DATA_LOSS.a();
    }
}
