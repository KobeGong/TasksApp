package defpackage;

/* renamed from: jq reason: default package */
/* compiled from: PG */
final class jq extends defpackage.jj {
    private defpackage.jo a;

    jq(defpackage.jo joVar) {
        this.a = joVar;
    }

    public final void c() {
        if (!this.a.n) {
            this.a.d();
            this.a.n = true;
        }
    }

    public final void a(defpackage.je jeVar) {
        this.a.m--;
        if (this.a.m == 0) {
            this.a.n = false;
            this.a.e();
        }
        jeVar.b((defpackage.ji) this);
    }
}
