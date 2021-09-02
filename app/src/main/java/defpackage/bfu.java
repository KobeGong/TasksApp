package defpackage;

/* renamed from: bfu reason: default package */
/* compiled from: PG */
public final class bfu implements defpackage.bfs {
    public final defpackage.bgc a(android.content.Context context, java.lang.String str, defpackage.bgb bgb) {
        defpackage.bgc bgc = new defpackage.bgc();
        bgc.b = bgb.a(context, str, true);
        if (bgc.b != 0) {
            bgc.c = 1;
        } else {
            bgc.a = bgb.a(context, str);
            if (bgc.a != 0) {
                bgc.c = -1;
            }
        }
        return bgc;
    }
}
