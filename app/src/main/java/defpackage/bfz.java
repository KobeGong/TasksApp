package defpackage;

/* renamed from: bfz reason: default package */
/* compiled from: PG */
public final class bfz implements defpackage.bfs {
    public final defpackage.bgc a(android.content.Context context, java.lang.String str, defpackage.bgb bgb) {
        defpackage.bgc bgc = new defpackage.bgc();
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
