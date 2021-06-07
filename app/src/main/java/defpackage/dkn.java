package defpackage;

import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: dkn  reason: default package */
/* compiled from: PG */
public final class dkn extends dkt {
    private final /* synthetic */ dkk a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dkn(dkk dkk) {
        super(dkk);
        this.a = dkk;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, defpackage.dkt, java.lang.Iterable
    public final Iterator iterator() {
        return new dkm(this.a);
    }
}
