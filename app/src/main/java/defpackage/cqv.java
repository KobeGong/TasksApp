package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cqv  reason: default package */
/* compiled from: PG */
public final class cqv {
    private static final ctl d = ctl.a("com/google/android/libraries/toolkit/monogram/impl/MonogramData");
    public final cyl a;
    public final AtomicReference b = new AtomicReference();
    public boolean c;
    private final Context e;

    public cqv(Context context, cyl cyl) {
        this.e = context;
        this.a = cyl;
    }

    static ri a(cyi cyi) {
        try {
            return (ri) cyd.b(cyi);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ defpackage.ri a() {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqv.a():ri");
    }
}
