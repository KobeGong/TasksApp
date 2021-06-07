package defpackage;

import java.util.Comparator;

/* renamed from: dpu  reason: default package */
/* compiled from: PG */
public final class dpu implements Comparator {
    private final /* synthetic */ dpv a;

    public dpu(dpv dpv) {
        this.a = dpv;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.a(obj) - this.a.a(obj2);
    }
}
