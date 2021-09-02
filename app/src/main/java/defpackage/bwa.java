package defpackage;

/* renamed from: bwa reason: default package */
/* compiled from: PG */
public final class bwa implements defpackage.bvn {
    private final defpackage.bwc a;
    private final defpackage.byu b;
    private final defpackage.cbb c;
    private final defpackage.bya d;

    public bwa(defpackage.avi avi, defpackage.bwc bwc, defpackage.byu byu, defpackage.cbb cbb, defpackage.bya bya) {
        this.a = bwc;
        this.b = byu;
        this.c = cbb;
        this.d = bya;
    }

    public final boolean a(android.content.Intent intent) {
        if (intent != null && "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            java.lang.String str = "GcmIntentHandler";
            java.lang.String valueOf = java.lang.String.valueOf(intent);
            android.os.Bundle extras = intent == null ? null : intent.getExtras();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Extras: [\n");
            if (extras != null) {
                for (java.lang.String str2 : extras.keySet()) {
                    sb.append(str2);
                    sb.append(" : ");
                    sb.append(extras.get(str2));
                    sb.append("\n");
                }
            }
            sb.append("]");
            java.lang.String sb2 = sb.toString();
            defpackage.bty.a(str, new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 12 + java.lang.String.valueOf(sb2).length()).append("onReceive: ").append(valueOf).append("\n").append(sb2).toString(), new java.lang.Object[0]);
            if ("gcm".equals(defpackage.bhh.a(intent)) || android.text.TextUtils.isEmpty(defpackage.bhh.a(intent))) {
                defpackage.bty.a("GcmIntentHandler", "Received a GCM message.", new java.lang.Object[0]);
                return intent.hasExtra("casp");
            } else if ("send_error".equals(defpackage.bhh.a(intent))) {
                defpackage.bty.c("GcmIntentHandler", "GCM Send error message.", new java.lang.Object[0]);
            } else if ("deleted_messages".equals(defpackage.bhh.a(intent))) {
                defpackage.bty.c("GcmIntentHandler", "Deleted messages on server.", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bul bul;
        defpackage.dgg dgg;
        defpackage.dfy dfy;
        defpackage.dfy dfy2;
        defpackage.dfy dfy3;
        defpackage.dfy dfy4;
        defpackage.dfm a2 = defpackage.bwc.a(intent.getStringExtra("casp"));
        if (a2 == null) {
            defpackage.bty.e("GcmIntentHandler", "AndroidPayload is null.", new java.lang.Object[0]);
            this.d.a(defpackage.ddi.BAD_PAYLOAD).a();
            return;
        }
        defpackage.bwc bwc = this.a;
        if (a2 != null) {
            java.lang.String str = a2.b;
            if (!android.text.TextUtils.isEmpty(str)) {
                java.util.Iterator it = bwc.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        defpackage.bty.e("PayloadUtil", "The recipient [%s] is not found in SDK's account storage.", str);
                        break;
                    }
                    bul = (defpackage.bul) it.next();
                    if (str.equals(bul.c())) {
                        if (!defpackage.bwc.b.contains(bul.f()) || !bwc.a(bul)) {
                            defpackage.bty.e("PayloadUtil", "The recipient [%s] is not registered or doesn't have valid credentials.", str);
                        }
                    }
                }
            }
        }
        bul = null;
        if (!android.text.TextUtils.isEmpty(a2.b) && bul == null) {
            defpackage.byb a3 = this.d.a(defpackage.ddi.INVALID_USER);
            a3.a = a2.b;
            if (a2.c == null) {
                dfy4 = defpackage.dfy.m;
            } else {
                dfy4 = a2.c;
            }
            a3.a(dfy4).a();
        } else if (!defpackage.bwc.a(a2)) {
            defpackage.byb a4 = this.d.a(defpackage.ddi.BAD_PAYLOAD).a(bul);
            if (a2.c == null) {
                dfy3 = defpackage.dfy.m;
            } else {
                dfy3 = a2.c;
            }
            a4.a(dfy3).a();
            defpackage.bty.e("GcmIntentHandler", "AndroidPayload doesn't have sufficent data to show the notification.", new java.lang.Object[0]);
        } else if ((a2.a & 2) == 2) {
            defpackage.byb a5 = this.d.a(defpackage.ddr.DELIVERED).a(bul);
            if (a2.c == null) {
                dfy = defpackage.dfy.m;
            } else {
                dfy = a2.c;
            }
            a5.a(dfy).a();
            defpackage.byu byu = this.b;
            defpackage.dfy[] dfyArr = new defpackage.dfy[1];
            if (a2.c == null) {
                dfy2 = defpackage.dfy.m;
            } else {
                dfy2 = a2.c;
            }
            dfyArr[0] = dfy2;
            byu.a(bul, java.util.Arrays.asList(dfyArr), bvo);
        } else if ((a2.a & 4) == 4 && bul != null) {
            if (a2.d == null) {
                dgg = defpackage.dgg.d;
            } else {
                dgg = a2.d;
            }
            defpackage.dgh a6 = defpackage.dgh.a(dgg.b);
            if (a6 == null) {
                a6 = defpackage.dgh.UNKNOWN_INSTRUCTION;
            }
            switch (a6.ordinal()) {
                case 1:
                    defpackage.bty.a("GcmIntentHandler", "Payload has SYNC instruction.", new java.lang.Object[0]);
                    this.d.a(defpackage.ddr.DELIVERED_SYNC_INSTRUCTION).a(bul).a();
                    defpackage.cbb cbb = this.c;
                    long j = dgg.c;
                    if (bul.d().longValue() == 0) {
                        defpackage.bty.a("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", bul.b());
                        cbb.a(bul);
                        return;
                    } else if (bul.d().longValue() >= j) {
                        defpackage.bty.a("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", bul.b(), bul.d(), java.lang.Long.valueOf(j));
                        return;
                    } else {
                        cbb.a.a(bul, j, "FetchUpdatedThreadsCallback");
                        return;
                    }
                case 2:
                    defpackage.bty.a("GcmIntentHandler", "Payload has FULL_SYNC instruction.", new java.lang.Object[0]);
                    this.d.a(defpackage.ddr.DELIVERED_FULL_SYNC_INSTRUCTION).a(bul).a();
                    this.c.a(bul);
                    return;
                default:
                    defpackage.bty.e("GcmIntentHandler", "Unknown sync instruction.", new java.lang.Object[0]);
                    return;
            }
        }
    }
}
