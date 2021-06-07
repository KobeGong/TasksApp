package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhr  reason: default package */
/* compiled from: PG */
public final class bhr {
    private static bjr a = new bjr();

    public static boolean a(Context context, Intent intent) {
        return bht.a(context, intent);
    }

    public static bhq b(Context context, Intent intent) {
        biq biq = null;
        azb.b(context, "Context must not be null.");
        azb.b(intent, "Intent must not be null.");
        if (!bht.a(context, intent)) {
            return null;
        }
        Parcelable.Creator creator = bhq.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
        if (byteArrayExtra != null) {
            azb.b(creator);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            biq = (biq) creator.createFromParcel(obtain);
            obtain.recycle();
        }
        return (bhq) biq;
    }

    static {
        new bht(a);
    }
}
