package defpackage;

import android.app.Notification;
import java.util.ArrayList;

/* renamed from: nj  reason: default package */
/* compiled from: PG */
public final class nj extends nk {
    private ArrayList a = new ArrayList();

    public nj() {
    }

    public nj(ni niVar) {
        a(niVar);
    }

    public final nj a(CharSequence charSequence) {
        this.a.add(ni.e(charSequence));
        return this;
    }

    @Override // defpackage.nk
    public final void a(ne neVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(neVar.a).setBigContentTitle(this.b);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bigContentTitle.addLine((CharSequence) obj);
        }
    }
}
