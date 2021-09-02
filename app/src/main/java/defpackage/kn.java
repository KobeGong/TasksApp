package defpackage;

/* renamed from: kn reason: default package */
/* compiled from: PG */
final class kn {
    private final android.os.IBinder a;

    kn(android.os.IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.kn) && ((defpackage.kn) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
