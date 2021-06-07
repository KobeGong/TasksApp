package defpackage;

/* renamed from: cus  reason: default package */
/* compiled from: PG */
final class cus implements cur {
    cus() {
    }

    @Override // defpackage.cur
    public final int a() {
        return 0;
    }

    @Override // defpackage.cur
    public final cuc a(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.cur
    public final Object b(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.cur
    public final Object b(cuc cuc) {
        return null;
    }
}
