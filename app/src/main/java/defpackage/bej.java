package defpackage;

/* renamed from: bej reason: default package */
/* compiled from: PG */
public final class bej extends defpackage.beh {
    private /* synthetic */ android.content.Intent a;
    private /* synthetic */ defpackage.bax b;
    private /* synthetic */ int c = 2;

    public bej(android.content.Intent intent, defpackage.bax bax) {
        this.a = intent;
        this.b = bax;
    }

    public final void a() {
        if (this.a != null) {
            this.b.startActivityForResult(this.a, this.c);
        }
    }
}
