package defpackage;

import java.util.Arrays;
import java.util.Stack;

/* access modifiers changed from: package-private */
/* renamed from: dke  reason: default package */
/* compiled from: PG */
public final class dke {
    public final Stack a = new Stack();

    dke() {
    }

    /* access modifiers changed from: package-private */
    public final void a(dha dha) {
        dha dha2 = dha;
        while (!dha2.g()) {
            if (dha2 instanceof dkd) {
                dkd dkd = (dkd) dha2;
                a(dkd.d);
                dha2 = dkd.e;
            } else {
                String valueOf = String.valueOf(dha2.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Has a new type of ByteString been created? Found ").append(valueOf).toString());
            }
        }
        int a2 = a(dha2.a());
        int i = dkd.c[a2 + 1];
        if (this.a.isEmpty() || ((dha) this.a.peek()).a() >= i) {
            this.a.push(dha2);
            return;
        }
        int i2 = dkd.c[a2];
        dkd dkd2 = (dha) this.a.pop();
        while (!this.a.isEmpty() && ((dha) this.a.peek()).a() < i2) {
            dkd2 = new dkd((dha) this.a.pop(), dkd2);
        }
        dkd dkd3 = new dkd(dkd2, dha2);
        while (!this.a.isEmpty()) {
            if (((dha) this.a.peek()).a() >= dkd.c[a(dkd3.a()) + 1]) {
                break;
            }
            dkd3 = new dkd((dha) this.a.pop(), dkd3);
        }
        this.a.push(dkd3);
    }

    private static int a(int i) {
        int binarySearch = Arrays.binarySearch(dkd.c, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }
}
