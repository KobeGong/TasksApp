package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bwa  reason: default package */
/* compiled from: PG */
public final class bwa implements bvn {
    private final bwc a;
    private final byu b;
    private final cbb c;
    private final bya d;

    public bwa(avi avi, bwc bwc, byu byu, cbb cbb, bya bya) {
        this.a = bwc;
        this.b = byu;
        this.c = cbb;
        this.d = bya;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        if (intent != null && "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            Bundle extras = intent == null ? null : intent.getExtras();
            StringBuilder sb = new StringBuilder();
            sb.append("Extras: [\n");
            if (extras != null) {
                for (String str : extras.keySet()) {
                    sb.append(str);
                    sb.append(" : ");
                    sb.append(extras.get(str));
                    sb.append("\n");
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            bty.a("GcmIntentHandler", new StringBuilder(String.valueOf(valueOf).length() + 12 + String.valueOf(sb2).length()).append("onReceive: ").append(valueOf).append("\n").append(sb2).toString(), new Object[0]);
            if ("gcm".equals(bhh.a(intent)) || TextUtils.isEmpty(bhh.a(intent))) {
                bty.a("GcmIntentHandler", "Received a GCM message.", new Object[0]);
                return intent.hasExtra("casp");
            } else if ("send_error".equals(bhh.a(intent))) {
                bty.c("GcmIntentHandler", "GCM Send error message.", new Object[0]);
            } else if ("deleted_messages".equals(bhh.a(intent))) {
                bty.c("GcmIntentHandler", "Deleted messages on server.", new Object[0]);
            }
        }
        return false;
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bul bul;
        dgg dgg;
        dfy dfy;
        dfy dfy2;
        dfy dfy3;
        dfy dfy4;
        dfm a2 = bwc.a(intent.getStringExtra("casp"));
        if (a2 == null) {
            bty.e("GcmIntentHandler", "AndroidPayload is null.", new Object[0]);
            this.d.a(ddi.BAD_PAYLOAD).a();
            return;
        }
        bwc bwc = this.a;
        if (a2 != null) {
            String str = a2.b;
            if (!TextUtils.isEmpty(str)) {
                Iterator it = bwc.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bty.e("PayloadUtil", "The recipient [%s] is not found in SDK's account storage.", str);
                        break;
                    }
                    bul = (bul) it.next();
                    if (str.equals(bul.c())) {
                        if (!bwc.b.contains(bul.f()) || !bwc.a(bul)) {
                            bty.e("PayloadUtil", "The recipient [%s] is not registered or doesn't have valid credentials.", str);
                        }
                    }
                }
            }
        }
        bul = null;
        if (!TextUtils.isEmpty(a2.b) && bul == null) {
            byb a3 = this.d.a(ddi.INVALID_USER);
            a3.a = a2.b;
            if (a2.c == null) {
                dfy4 = dfy.m;
            } else {
                dfy4 = a2.c;
            }
            a3.a(dfy4).a();
        } else if (!bwc.a(a2)) {
            byb a4 = this.d.a(ddi.BAD_PAYLOAD).a(bul);
            if (a2.c == null) {
                dfy3 = dfy.m;
            } else {
                dfy3 = a2.c;
            }
            a4.a(dfy3).a();
            bty.e("GcmIntentHandler", "AndroidPayload doesn't have sufficent data to show the notification.", new Object[0]);
        } else if ((a2.a & 2) == 2) {
            byb a5 = this.d.a(ddr.DELIVERED).a(bul);
            if (a2.c == null) {
                dfy = dfy.m;
            } else {
                dfy = a2.c;
            }
            a5.a(dfy).a();
            byu byu = this.b;
            dfy[] dfyArr = new dfy[1];
            if (a2.c == null) {
                dfy2 = dfy.m;
            } else {
                dfy2 = a2.c;
            }
            dfyArr[0] = dfy2;
            byu.a(bul, Arrays.asList(dfyArr), bvo);
        } else if ((a2.a & 4) == 4 && bul != null) {
            if (a2.d == null) {
                dgg = dgg.d;
            } else {
                dgg = a2.d;
            }
            dgh a6 = dgh.a(dgg.b);
            if (a6 == null) {
                a6 = dgh.UNKNOWN_INSTRUCTION;
            }
            switch (a6.ordinal()) {
                case 1:
                    bty.a("GcmIntentHandler", "Payload has SYNC instruction.", new Object[0]);
                    this.d.a(ddr.DELIVERED_SYNC_INSTRUCTION).a(bul).a();
                    cbb cbb = this.c;
                    long j = dgg.c;
                    if (bul.d().longValue() == 0) {
                        bty.a("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", bul.b());
                        cbb.a(bul);
                        return;
                    } else if (bul.d().longValue() >= j) {
                        bty.a("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", bul.b(), bul.d(), Long.valueOf(j));
                        return;
                    } else {
                        cbb.a.a(bul, j, "FetchUpdatedThreadsCallback");
                        return;
                    }
                case 2:
                    bty.a("GcmIntentHandler", "Payload has FULL_SYNC instruction.", new Object[0]);
                    this.d.a(ddr.DELIVERED_FULL_SYNC_INSTRUCTION).a(bul).a();
                    this.c.a(bul);
                    return;
                default:
                    bty.e("GcmIntentHandler", "Unknown sync instruction.", new Object[0]);
                    return;
            }
        }
    }
}
