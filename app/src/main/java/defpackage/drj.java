package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: drj  reason: default package */
/* compiled from: PG */
public final class drj implements dwe {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.dwe
    public final void a() {
        this.a.getAndAdd(1);
    }
}
