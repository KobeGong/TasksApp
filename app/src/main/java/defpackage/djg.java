package defpackage;

/* renamed from: djg  reason: default package */
/* compiled from: PG */
final class djg implements djn {
    private djn[] a;

    djg(djn... djnArr) {
        this.a = djnArr;
    }

    @Override // defpackage.djn
    public final boolean a(Class cls) {
        for (djn djn : this.a) {
            if (djn.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djn
    public final djm b(Class cls) {
        djn[] djnArr = this.a;
        for (djn djn : djnArr) {
            if (djn.a(cls)) {
                return djn.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
