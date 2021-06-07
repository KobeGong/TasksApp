package defpackage;

import android.content.Context;

/* renamed from: bfv  reason: default package */
/* compiled from: PG */
public final class bfv implements bfs {
    @Override // defpackage.bfs
    public final bgc a(Context context, String str, bgb bgb) {
        bgc bgc = new bgc();
        bgc.a = bgb.a(context, str);
        if (bgc.a != 0) {
            bgc.c = -1;
        } else {
            bgc.b = bgb.a(context, str, true);
            if (bgc.b != 0) {
                bgc.c = 1;
            }
        }
        return bgc;
    }
}
