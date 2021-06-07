package defpackage;

/* renamed from: cqu  reason: default package */
/* compiled from: PG */
public final class cqu implements cqm {
    private final cqm a;
    private final cqn b;

    public cqu(cqm cqm, cqn cqn) {
        this.a = cqm;
        this.b = cqn;
    }

    @Override // defpackage.cqm
    public final CharSequence a(cqp cqp) {
        return this.a.a(cqp);
    }

    @Override // defpackage.cqn
    public final int a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.cqn
    public final int a() {
        return this.b.a();
    }
}
