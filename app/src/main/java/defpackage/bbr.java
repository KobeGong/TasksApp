package defpackage;

/* renamed from: bbr reason: default package */
/* compiled from: PG */
public final class bbr {
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(8, "The connection to Google Play services was lost");
    public static final com.google.android.gms.common.api.internal.BasePendingResult[] b = new com.google.android.gms.common.api.internal.BasePendingResult[0];
    public final java.util.Set c = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private final defpackage.bbs d = new defpackage.bbs(this);

    public bbr(java.util.Map map) {
    }

    /* access modifiers changed from: 0000 */
    public final void a(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.c.add(basePendingResult);
        basePendingResult.a(this.d);
    }
}
