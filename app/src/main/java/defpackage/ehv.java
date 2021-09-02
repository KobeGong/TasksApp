package defpackage;

/* renamed from: ehv reason: default package */
/* compiled from: PG */
final class ehv implements java.util.Comparator {
    ehv() {
    }

    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ehx ehx = (defpackage.ehx) obj;
        defpackage.ehx ehx2 = (defpackage.ehx) obj2;
        if ("Fallback-Cronet-Provider".equals(ehx.b())) {
            return 1;
        }
        if ("Fallback-Cronet-Provider".equals(ehx2.b())) {
            return -1;
        }
        return -defpackage.ehu.a(ehx.c(), ehx2.c());
    }
}
