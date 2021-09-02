package defpackage;

/* renamed from: dpu reason: default package */
/* compiled from: PG */
public final class dpu implements java.util.Comparator {
    private final /* synthetic */ defpackage.dpv a;

    public dpu(defpackage.dpv dpv) {
        this.a = dpv;
    }

    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.a.a(obj) - this.a.a(obj2);
    }
}
