package defpackage;

/* renamed from: dof  reason: default package */
/* compiled from: PG */
public class dof extends dpm {
    public final dnd a;

    public dof() {
    }

    @Override // defpackage.dpm
    public final dnd b() {
        return this.a;
    }

    @Override // defpackage.dnd
    public void a(dne dne, dor dor) {
        b().a(dne, dor);
    }

    @Override // defpackage.dnd
    public final void a(Object obj) {
        b().a(obj);
    }

    @Override // defpackage.dpm, defpackage.dnd
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.dpm, defpackage.dnd
    public final /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    @Override // defpackage.dpm, defpackage.dnd
    public final /* bridge */ /* synthetic */ void a(int i) {
        super.a(i);
    }

    public dof(dnd dnd) {
        this();
        this.a = dnd;
    }
}
