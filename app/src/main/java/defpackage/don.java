package defpackage;

import java.util.Arrays;

/* renamed from: don  reason: default package */
/* compiled from: PG */
public final class don {
    public static final don a = new don(null, dpw.b, false);
    public final dop b;
    public final dnm c = null;
    public final dpw d;
    public final boolean e;

    private don(dop dop, dpw dpw, boolean z) {
        this.b = dop;
        this.d = (dpw) cld.a(dpw, "status");
        this.e = z;
    }

    public static don a(dop dop) {
        return new don((dop) cld.a(dop, "subchannel"), dpw.b, false);
    }

    public static don a(dpw dpw) {
        boolean z;
        if (!dpw.a()) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z, "error status shouldn't be OK");
        return new don(null, dpw, false);
    }

    public static don b(dpw dpw) {
        cld.a(!dpw.a(), "drop status shouldn't be OK");
        return new don(null, dpw, true);
    }

    public final String toString() {
        return cky.b(this).a("subchannel", this.b).a("streamTracerFactory", (Object) null).a("status", this.d).a("drop", this.e).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, null, Boolean.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof don)) {
            return false;
        }
        don don = (don) obj;
        if (!cru.d(this.b, don.b) || !cru.d(this.d, don.d) || !cru.d((Object) null, (Object) null) || this.e != don.e) {
            return false;
        }
        return true;
    }
}
