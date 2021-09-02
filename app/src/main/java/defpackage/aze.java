package defpackage;

/* renamed from: aze reason: default package */
/* compiled from: PG */
public final class aze {
    public final java.util.Map a = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    public final java.util.Map b = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    /* access modifiers changed from: 0000 */
    public final void a(boolean z, com.google.android.gms.common.api.Status status) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new java.util.HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new java.util.HashMap(this.b);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((defpackage.bpw) entry2.getKey()).b(new defpackage.ayl(status));
            }
        }
    }
}
