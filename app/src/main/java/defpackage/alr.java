package defpackage;

import java.util.ArrayList;

/* renamed from: alr  reason: default package */
final /* synthetic */ class alr implements Runnable {
    private final alq a;
    private final String b;

    alr(alq alq, String str) {
        this.a = alq;
        this.b = str;
    }

    public final void run() {
        alq alq = this.a;
        if (cru.d(this.b, alq.c)) {
            ArrayList a2 = cky.a((Iterable) alq.a);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                Object obj = a2.get(i);
                i++;
                ((alu) obj).a();
            }
        }
    }
}
