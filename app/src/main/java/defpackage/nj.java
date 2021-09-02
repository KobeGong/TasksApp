package defpackage;

/* renamed from: nj reason: default package */
/* compiled from: PG */
public final class nj extends defpackage.nk {
    private java.util.ArrayList a = new java.util.ArrayList();

    public nj() {
    }

    public nj(defpackage.ni niVar) {
        a(niVar);
    }

    public final defpackage.nj a(java.lang.CharSequence charSequence) {
        this.a.add(defpackage.ni.e(charSequence));
        return this;
    }

    public final void a(defpackage.ne neVar) {
        android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle(neVar.a).setBigContentTitle(this.b);
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            bigContentTitle.addLine((java.lang.CharSequence) obj);
        }
    }
}
