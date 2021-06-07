package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: bov  reason: default package */
/* compiled from: PG */
final class bov extends ayf {
    bov() {
    }

    @Override // defpackage.ayf
    public final /* synthetic */ ayj a(Context context, Looper looper, bdj bdj, Object obj, ayr ayr, ays ays) {
        bma bma = (bma) obj;
        azb.b(bma, "Must provide valid PeopleOptions!");
        return new bnq(context, looper, ayr, ays, String.valueOf(bma.a), bdj);
    }
}
