package defpackage;

/* renamed from: bei reason: default package */
/* compiled from: PG */
public final class bei extends defpackage.beh {
    private /* synthetic */ android.content.Intent a;
    private /* synthetic */ android.app.Activity b;
    private /* synthetic */ int c;

    public bei(android.content.Intent intent, android.app.Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    public final void a() {
        if (this.a != null) {
            this.b.startActivityForResult(this.a, this.c);
        }
    }
}
