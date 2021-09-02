package defpackage;

/* renamed from: auv reason: default package */
/* compiled from: PG */
final class auv extends defpackage.alu {
    private final /* synthetic */ TasksFragment a;

    auv(TasksFragment auj) {
        this.a = auj;
    }

    public final void a() {
        if (!android.text.TextUtils.isEmpty(this.a.X)) {
            this.a.a(this.a.X, this.a.Y, true);
        }
    }

    public final void a(java.lang.String str) {
        if (str != null && str.equals(this.a.X)) {
            this.a.a(this.a.X, this.a.Y, true);
        }
    }
}
