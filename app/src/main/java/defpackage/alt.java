package defpackage;

import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: alt  reason: default package */
public final /* synthetic */ class alt implements Runnable {
    private final alq a;
    private final String b;
    private final String c;

    alt(alq alq, String str, String str2) {
        this.a = alq;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        alq alq = this.a;
        String str = this.b;
        String str2 = this.c;
        if (cru.d(str, alq.c)) {
            ArrayList a2 = cky.a((Iterable) alq.a);
            int size = a2.size();
            int i = 0;
            while (i < size) {
                Object obj = a2.get(i);
                i++;
                ((alu) obj).a(str2);
            }
        }
    }
}
