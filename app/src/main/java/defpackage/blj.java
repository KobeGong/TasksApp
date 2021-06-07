package defpackage;

/* renamed from: blj  reason: default package */
/* compiled from: PG */
public final class blj extends bkw implements Cloneable {
    private int c = -1;

    public blj() {
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final blj clone() {
        try {
            return (blj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blj)) {
            return false;
        }
        blj blj = (blj) obj;
        if (this.c != blj.c) {
            return false;
        }
        if (this.a == null || this.a.a()) {
            return blj.a == null || blj.a.a();
        }
        return this.a.equals(blj.a);
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.c) * 31 * 31;
        if (this.a == null || this.a.a()) {
            i = 0;
        } else {
            i = this.a.hashCode();
        }
        return i + hashCode;
    }

    @Override // defpackage.blb, defpackage.bkw
    public final void a(bku bku) {
        if (this.c != -1) {
            bku.a(1, this.c);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.blb, defpackage.bkw
    public final int a() {
        int a = super.a();
        if (this.c == -1) {
            return a;
        }
        int i = this.c;
        return a + bku.a(i) + bku.c(8);
    }

    @Override // defpackage.bkw
    public final /* synthetic */ bkw b() {
        return (blj) clone();
    }

    @Override // defpackage.blb, defpackage.bkw
    public final /* synthetic */ blb c() {
        return (blj) clone();
    }
}
