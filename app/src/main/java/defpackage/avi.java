package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: avi  reason: default package */
/* compiled from: PG */
public class avi {
    public avi() {
    }

    private avi(String[] strArr) {
        azb.b(strArr);
        new ArrayList();
        new HashMap();
    }

    public avi(String[] strArr, byte b) {
        this(strArr);
    }

    private avi(String str) {
        boolean z;
        azb.b(str, "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {str, 23};
        if (!z) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }

    public avi(String str, byte b) {
        this(str);
    }

    public String a() {
        return "GCM";
    }

    public avi(Context context) {
        bhh.a(context);
    }

    public avi(Context context, byte b) {
        this(context);
    }
}
