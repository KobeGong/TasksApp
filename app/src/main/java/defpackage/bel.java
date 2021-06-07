package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* renamed from: bel  reason: default package */
/* compiled from: PG */
public abstract class bel extends bcx implements ayj, ben {
    private final Set a;
    private final Account h;

    public bel(Context context, Looper looper, int i, bdj bdj, ayr ayr, ays ays) {
        this(context, looper, bdn.a(context), axt.a, i, bdj, (ayr) azb.b(ayr), (ays) azb.b(ays));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bel(android.content.Context r11, android.os.Looper r12, defpackage.bdn r13, defpackage.axt r14, int r15, defpackage.bdj r16, defpackage.ayr r17, defpackage.ays r18) {
        /*
            r10 = this;
            if (r17 != 0) goto L_0x003b
            r7 = 0
        L_0x0003:
            if (r18 != 0) goto L_0x0043
            r8 = 0
        L_0x0006:
            r0 = r16
            java.lang.String r9 = r0.f
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r16
            android.accounts.Account r1 = r0.a
            r10.h = r1
            r0 = r16
            java.util.Set r2 = r0.c
            java.util.Iterator r3 = r2.iterator()
        L_0x0021:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r3.next()
            com.google.android.gms.common.api.Scope r1 = (com.google.android.gms.common.api.Scope) r1
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0021
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Expanding scopes is not permitted, use implied scopes instead"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            bcy r7 = new bcy
            r0 = r17
            r7.<init>(r0)
            goto L_0x0003
        L_0x0043:
            bcz r8 = new bcz
            r0 = r18
            r8.<init>(r0)
            goto L_0x0006
        L_0x004b:
            r10.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bel.<init>(android.content.Context, android.os.Looper, bdn, axt, int, bdj, ayr, ays):void");
    }

    @Override // defpackage.bcx
    public final Account k() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final Set p() {
        return this.a;
    }

    @Override // defpackage.bcx
    public final axs[] l() {
        return new axs[0];
    }
}
