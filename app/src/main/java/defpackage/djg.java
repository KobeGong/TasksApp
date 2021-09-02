package defpackage;

/* renamed from: djg reason: default package */
/* compiled from: PG */
final class djg implements defpackage.djn {
    private defpackage.djn[] a;

    djg(defpackage.djn... djnArr) {
        this.a = djnArr;
    }

    public final boolean a(java.lang.Class cls) {
        for (defpackage.djn a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.djm b(java.lang.Class cls) {
        defpackage.djn[] djnArr;
        for (defpackage.djn djn : this.a) {
            if (djn.a(cls)) {
                return djn.b(cls);
            }
        }
        java.lang.String str = "No factory is available for message type: ";
        java.lang.String valueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
    }
}
