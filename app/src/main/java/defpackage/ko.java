package defpackage;

/* renamed from: ko reason: default package */
/* compiled from: PG */
final class ko {
    private final android.view.WindowId a;

    ko(android.view.View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ko) && ((defpackage.ko) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
