package defpackage;

/* renamed from: bxw reason: default package */
/* compiled from: PG */
public final class bxw extends defpackage.bxx {
    private final android.content.Context a;
    private final defpackage.buc b;
    private final defpackage.cbs c = null;
    private final defpackage.cbu d = null;
    private final defpackage.cbt e = null;
    private final defpackage.cbv f = null;
    private final java.util.concurrent.ExecutorService g = null;

    public bxw(android.content.Context context, defpackage.buc buc) {
        this.a = context;
        this.b = buc;
    }

    public final android.content.Context a() {
        return this.a;
    }

    public final defpackage.buc b() {
        return this.b;
    }

    public final defpackage.cbs c() {
        return null;
    }

    public final defpackage.cbu d() {
        return null;
    }

    public final defpackage.cbt e() {
        return null;
    }

    public final defpackage.cbv f() {
        return null;
    }

    public final java.util.concurrent.ExecutorService g() {
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.b);
        java.lang.String valueOf3 = java.lang.String.valueOf(null);
        java.lang.String valueOf4 = java.lang.String.valueOf(null);
        java.lang.String valueOf5 = java.lang.String.valueOf(null);
        java.lang.String valueOf6 = java.lang.String.valueOf(null);
        java.lang.String valueOf7 = java.lang.String.valueOf(null);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 137 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length() + java.lang.String.valueOf(valueOf5).length() + java.lang.String.valueOf(valueOf6).length() + java.lang.String.valueOf(valueOf7).length()).append("Params{context=").append(valueOf).append(", chimeConfig=").append(valueOf2).append(", devicePayloadProvider=").append(valueOf3).append(", notificationEventHandler=").append(valueOf4).append(", notificationCustomizer=").append(valueOf5).append(", threadInterceptor=").append(valueOf6).append(", executor=").append(valueOf7).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bxx)) {
            return false;
        }
        defpackage.bxx bxx = (defpackage.bxx) obj;
        if (this.a.equals(bxx.a()) && this.b.equals(bxx.b()) && bxx.c() == null && bxx.d() == null && bxx.e() == null && bxx.f() == null && bxx.g() == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003 * 1000003 * 1000003 * 1000003 * 1000003;
    }
}
