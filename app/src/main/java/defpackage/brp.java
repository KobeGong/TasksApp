package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: brp  reason: default package */
/* compiled from: PG */
public final class brp implements bre {
    private final Status a;

    public brp(Status status) {
        this.a = status;
    }

    @Override // defpackage.brc
    public final bre a() {
        return this;
    }

    @Override // defpackage.bre
    public final boolean b() {
        return this.a.a();
    }

    @Override // defpackage.bre
    public final String c() {
        return this.a.g;
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof brp)) {
            return false;
        }
        return this.a.equals(((brp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    static {
        new brq();
    }
}
