package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: byb  reason: default package */
/* compiled from: PG */
public final class byb {
    public String a = null;
    public List b = null;
    private final bya c;
    private final ddr d;
    private final ddi e;
    private final buc f;
    private final bzc g;
    private final bzb h;
    private String i = null;

    public final byb a(bul bul) {
        if (bul != null) {
            this.i = bul.b();
            this.a = bul.c();
        }
        return this;
    }

    public final byb a(buv buv) {
        this.b = Arrays.asList(buv);
        return this;
    }

    public final byb a(dfy dfy) {
        if (dfy != null && !TextUtils.isEmpty(dfy.d)) {
            this.b = Arrays.asList(buv.a(dfy));
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:288:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 2003
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byb.a():void");
    }

    public byb(bya bya, ddr ddr, ddi ddi, buc buc, bzc bzc, bzb bzb) {
        this.c = bya;
        this.d = ddr;
        this.e = ddi;
        this.f = buc;
        this.g = bzc;
        this.h = bzb;
    }
}
