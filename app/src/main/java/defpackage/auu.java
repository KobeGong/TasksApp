package defpackage;

/* renamed from: auu reason: default package */
/* compiled from: PG */
final class auu extends defpackage.acs {
    private final /* synthetic */ TasksFragment m;

    auu(TasksFragment auj) {
        this.m = auj;
    }

    public final boolean b(RecyclerViewHolder afv, defpackage.afb afb, defpackage.afb afb2) {
        defpackage.dby g = this.m.taskAdapter.g(afv.d());
        if (g == null || !g.d.equals(this.m.taskAdapter.a)) {
            return super.b(afv, afb, afb2);
        }
        this.m.taskAdapter.a = null;
        android.view.View view = afv.itemView;
        return a(afv, -view.getWidth(), view.getTop(), 0, view.getTop());
    }
}
