package defpackage;

/* renamed from: cor  reason: default package */
/* compiled from: PG */
public final class cor implements ecz {
    private final ecz a;
    private coo b;

    cor(ecz ecz) {
        this.a = ecz;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        if (this.b == null) {
            this.b = (coo) this.a.a();
        }
        return this.b;
    }
}
