package defpackage;

/* renamed from: ale reason: default package */
final /* synthetic */ class ale implements java.util.concurrent.Callable {
    private final defpackage.ala a;

    ale(defpackage.ala ala, android.content.Context context, java.lang.String str) {
        this.a = ala;
    }

    public final java.lang.Object call() {
        defpackage.ala ala = this.a;
        java.util.List<defpackage.ajo> list = ala.b;
        if (list == null) {
            list = defpackage.ala.N();
            ala.b = list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.ajo ajo : list) {
            defpackage.dby dby = null;
            defpackage.dcb c = defpackage.any.a().c().c(ajo.getTaskListId());
            if (c != null) {
                dby = defpackage.any.a().c().a(ajo.getTaskListId(), ajo.getTaskId());
            }
            if (dby != null) {
                arrayList.add(defpackage.akz.a(c, dby));
            } else {
                defpackage.azb.b("Result not found in local database: %s, %s, %s", defpackage.any.a().c().b(), ajo.getTaskListId(), ajo.getTaskId());
            }
        }
        return arrayList;
    }
}
