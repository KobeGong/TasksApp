package defpackage;

/* renamed from: aym reason: default package */
/* compiled from: PG */
public final class aym extends java.lang.Exception {
    public final defpackage.qr a;

    public aym(defpackage.qr qrVar) {
        this.a = qrVar;
    }

    public final java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = true;
        for (defpackage.bbu bbu : this.a.keySet()) {
            defpackage.axq axq = (defpackage.axq) this.a.get(bbu);
            if (axq.b()) {
                z = false;
            }
            java.lang.String str = bbu.a.b;
            java.lang.String valueOf = java.lang.String.valueOf(axq);
            arrayList.add(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 2 + java.lang.String.valueOf(valueOf).length()).append(str).append(": ").append(valueOf).toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(android.text.TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
