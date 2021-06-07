package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: aym  reason: default package */
/* compiled from: PG */
public final class aym extends Exception {
    public final qr a;

    public aym(qr qrVar) {
        this.a = qrVar;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (bbu bbu : this.a.keySet()) {
            axq axq = (axq) this.a.get(bbu);
            if (axq.b()) {
                z = false;
            }
            String str = bbu.a.b;
            String valueOf = String.valueOf(axq);
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length()).append(str).append(": ").append(valueOf).toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
