package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: bxw  reason: default package */
/* compiled from: PG */
public final class bxw extends bxx {
    private final Context a;
    private final buc b;
    private final cbs c = null;
    private final cbu d = null;
    private final cbt e = null;
    private final cbv f = null;
    private final ExecutorService g = null;

    public bxw(Context context, buc buc) {
        this.a = context;
        this.b = buc;
    }

    @Override // defpackage.bxx
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.bxx
    public final buc b() {
        return this.b;
    }

    @Override // defpackage.bxx
    public final cbs c() {
        return null;
    }

    @Override // defpackage.bxx
    public final cbu d() {
        return null;
    }

    @Override // defpackage.bxx
    public final cbt e() {
        return null;
    }

    @Override // defpackage.bxx
    public final cbv f() {
        return null;
    }

    @Override // defpackage.bxx
    public final ExecutorService g() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf((Object) null);
        String valueOf4 = String.valueOf((Object) null);
        String valueOf5 = String.valueOf((Object) null);
        String valueOf6 = String.valueOf((Object) null);
        String valueOf7 = String.valueOf((Object) null);
        return new StringBuilder(String.valueOf(valueOf).length() + 137 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length()).append("Params{context=").append(valueOf).append(", chimeConfig=").append(valueOf2).append(", devicePayloadProvider=").append(valueOf3).append(", notificationEventHandler=").append(valueOf4).append(", notificationCustomizer=").append(valueOf5).append(", threadInterceptor=").append(valueOf6).append(", executor=").append(valueOf7).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxx)) {
            return false;
        }
        bxx bxx = (bxx) obj;
        return this.a.equals(bxx.a()) && this.b.equals(bxx.b()) && bxx.c() == null && bxx.d() == null && bxx.e() == null && bxx.f() == null && bxx.g() == null;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003 * 1000003 * 1000003 * 1000003 * 1000003;
    }
}
