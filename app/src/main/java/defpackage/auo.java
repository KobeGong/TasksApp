package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: auo  reason: default package */
public final /* synthetic */ class auo implements Callable {
    private final auj a;

    auo(auj auj) {
        this.a = auj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        auj auj = this.a;
        if (auj.a == null) {
            return null;
        }
        auj.a.post(new aut(auj));
        return null;
    }
}
