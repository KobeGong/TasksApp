package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: yi  reason: default package */
/* compiled from: PG */
public final class yi implements yd {
    private final ActionMode.Callback a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final ri d = new ri();

    public yi(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.yd
    public final boolean a(yc ycVar, Menu menu) {
        return this.a.onCreateActionMode(b(ycVar), a(menu));
    }

    @Override // defpackage.yd
    public final boolean b(yc ycVar, Menu menu) {
        return this.a.onPrepareActionMode(b(ycVar), a(menu));
    }

    @Override // defpackage.yd
    public final boolean a(yc ycVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(b(ycVar), zx.a(this.b, (pp) menuItem));
    }

    @Override // defpackage.yd
    public final void a(yc ycVar) {
        this.a.onDestroyActionMode(b(ycVar));
    }

    private final Menu a(Menu menu) {
        Menu menu2 = (Menu) this.d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        Menu a2 = zx.a(this.b, (po) menu);
        this.d.put(menu, a2);
        return a2;
    }

    public final ActionMode b(yc ycVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            yh yhVar = (yh) this.c.get(i);
            if (yhVar != null && yhVar.a == ycVar) {
                return yhVar;
            }
        }
        yh yhVar2 = new yh(this.b, ycVar);
        this.c.add(yhVar2);
        return yhVar2;
    }
}
