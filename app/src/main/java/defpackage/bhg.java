package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: bhg  reason: default package */
/* compiled from: PG */
public class bhg extends bhx {
    public void a(Bundle bundle) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026e  */
    @Override // defpackage.bhx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleIntent(android.content.Intent r14) {
        /*
        // Method dump skipped, instructions count: 1206
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhg.handleIntent(android.content.Intent):void");
    }

    private static void b(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
