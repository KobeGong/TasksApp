package defpackage;

import android.content.Context;

/* renamed from: bfz  reason: default package */
/* compiled from: PG */
public final class bfz implements bfs {
    @Override // defpackage.bfs
    public final bgc a(Context context, String str, bgb bgb) {
        bgc bgc = new bgc();
        bgc.a = bgb.a(context, str);
        if (bgc.a != 0) {
            bgc.b = bgb.a(context, str, false);
        } else {
            bgc.b = bgb.a(context, str, true);
        }
        if (bgc.a == 0 && bgc.b == 0) {
            bgc.c = 0;
        } else if (bgc.b >= bgc.a) {
            bgc.c = 1;
        } else {
            bgc.c = -1;
        }
        return bgc;
    }
}
