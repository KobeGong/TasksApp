package defpackage;

/* renamed from: cvg  reason: default package */
/* compiled from: PG */
public abstract class cvg extends cup {
    public final String a;

    protected cvg(String str) {
        this.a = str;
    }

    @Override // defpackage.cup
    public String a() {
        return this.a;
    }

    @Override // defpackage.cup
    public void a(RuntimeException runtimeException, cuo cuo) {
        a(new cvh(runtimeException, cuo));
    }

    @Override // defpackage.cup
    public ctt a(Class cls, int i) {
        return ctt.a;
    }
}
