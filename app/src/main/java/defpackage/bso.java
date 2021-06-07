package defpackage;

/* renamed from: bso  reason: default package */
/* compiled from: PG */
public final class bso implements bsf {
    public final bly a;
    private final /* synthetic */ bsf b;

    bso() {
        this.a = new bly(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public bso(bsf bsf) {
        this();
        this.b = bsf;
    }

    @Override // defpackage.bsf
    public final void a(String str, String str2, int i) {
        this.b.a(str, str2, i);
    }
}
