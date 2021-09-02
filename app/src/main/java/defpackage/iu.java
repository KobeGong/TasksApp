package defpackage;

/* renamed from: iu reason: default package */
/* compiled from: PG */
final class iu implements defpackage.ji {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ java.util.ArrayList b;

    iu(android.view.View view, java.util.ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void c() {
    }

    public final void a(defpackage.je jeVar) {
        jeVar.b((defpackage.ji) this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) this.b.get(i)).setVisibility(0);
        }
    }

    public final void a() {
    }

    public final void b() {
    }
}
