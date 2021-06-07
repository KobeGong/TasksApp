package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dpm  reason: default package */
/* compiled from: PG */
public abstract class dpm extends dnd {
    dpm() {
    }

    /* access modifiers changed from: protected */
    public abstract dnd b();

    @Override // defpackage.dnd
    public void a(int i) {
        b().a(i);
    }

    @Override // defpackage.dnd
    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    @Override // defpackage.dnd
    public void a() {
        b().a();
    }
}
