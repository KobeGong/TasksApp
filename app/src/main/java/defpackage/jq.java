package defpackage;

/* renamed from: jq  reason: default package */
/* compiled from: PG */
final class jq extends jj {
    private jo a;

    jq(jo joVar) {
        this.a = joVar;
    }

    @Override // defpackage.jj, defpackage.ji
    public final void c() {
        if (!this.a.n) {
            this.a.d();
            this.a.n = true;
        }
    }

    @Override // defpackage.jj, defpackage.ji
    public final void a(je jeVar) {
        jo joVar = this.a;
        joVar.m--;
        if (this.a.m == 0) {
            this.a.n = false;
            this.a.e();
        }
        jeVar.b(this);
    }
}
