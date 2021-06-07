package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Random;

/* renamed from: amg  reason: default package */
/* compiled from: PG */
public final class amg {
    private static final int a = ((int) Math.pow(10.0d, 8.0d));
    private final Random b;

    public amg() {
        this(new Random());
    }

    private amg(Random random) {
        this.b = random;
    }

    public final String a(dcb dcb) {
        String str = dcb.e;
        if (!TextUtils.isEmpty(str)) {
            return a(str);
        }
        String str2 = dcb.b;
        if (str2.indexOf(58) >= 0) {
            return a(str2);
        }
        return a();
    }

    private final String a(String str) {
        String substring = str.substring(0, str.length() - 2);
        String b2 = b();
        return new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(b2).length()).append(substring).append(":").append(b2).toString();
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        byte[] bArr = new byte[12];
        this.b.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        String valueOf = String.valueOf(a(this.b.nextInt(a)));
        String valueOf2 = String.valueOf(a(this.b.nextInt(a)));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String a(int i) {
        String sb = new StringBuilder(19).append("00000000").append(i).toString();
        return sb.substring(sb.length() - 8);
    }
}
