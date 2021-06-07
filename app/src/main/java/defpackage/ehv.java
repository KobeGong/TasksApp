package defpackage;

import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: ehv  reason: default package */
/* compiled from: PG */
public final class ehv implements Comparator {
    ehv() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ehx ehx = (ehx) obj;
        ehx ehx2 = (ehx) obj2;
        if ("Fallback-Cronet-Provider".equals(ehx.b())) {
            return 1;
        }
        if ("Fallback-Cronet-Provider".equals(ehx2.b())) {
            return -1;
        }
        return -ehu.a(ehx.c(), ehx2.c());
    }
}
