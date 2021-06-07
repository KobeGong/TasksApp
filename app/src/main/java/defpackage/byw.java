package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: byw  reason: default package */
public final /* synthetic */ class byw implements Callable {
    private final byu a;
    private final bul b;
    private final List c;
    private final bvo d;

    public byw(byu byu, bul bul, List list, bvo bvo) {
        this.a = byu;
        this.b = bul;
        this.c = list;
        this.d = bvo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byu byu = this.a;
        byu.a.a(this.b, this.c, this.d);
        return null;
    }
}
