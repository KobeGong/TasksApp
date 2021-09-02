package defpackage;

/* renamed from: yi reason: default package */
/* compiled from: PG */
public final class yi implements defpackage.yd {
    private final android.view.ActionMode.Callback a;
    private final android.content.Context b;
    private final java.util.ArrayList c = new java.util.ArrayList();
    private final defpackage.ri d = new defpackage.ri();

    public yi(android.content.Context context, android.view.ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    public final boolean a(defpackage.yc ycVar, android.view.Menu menu) {
        return this.a.onCreateActionMode(b(ycVar), a(menu));
    }

    public final boolean b(defpackage.yc ycVar, android.view.Menu menu) {
        return this.a.onPrepareActionMode(b(ycVar), a(menu));
    }

    public final boolean a(defpackage.yc ycVar, android.view.MenuItem menuItem) {
        return this.a.onActionItemClicked(b(ycVar), defpackage.zx.a(this.b, (defpackage.pp) menuItem));
    }

    public final void a(defpackage.yc ycVar) {
        this.a.onDestroyActionMode(b(ycVar));
    }

    private final android.view.Menu a(android.view.Menu menu) {
        android.view.Menu menu2 = (android.view.Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        android.view.Menu a2 = defpackage.zx.a(this.b, (defpackage.po) menu);
        this.d.put(menu, a2);
        return a2;
    }

    public final android.view.ActionMode b(defpackage.yc ycVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            defpackage.yh yhVar = (defpackage.yh) this.c.get(i);
            if (yhVar != null && yhVar.a == ycVar) {
                return yhVar;
            }
        }
        defpackage.yh yhVar2 = new defpackage.yh(this.b, ycVar);
        this.c.add(yhVar2);
        return yhVar2;
    }
}
