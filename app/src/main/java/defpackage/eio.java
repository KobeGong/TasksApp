package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: eio  reason: default package */
/* compiled from: PG */
public final class eio {
    public final String a;
    private final boolean b;
    private final int c;
    private final int d;

    public eio(boolean z, int i, int i2, String str) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.a = str == null ? "" : str;
    }

    public final int a() {
        if (!this.b) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.a(this.c, this.d);
    }

    public final int b() {
        if (!this.b) {
            return 1;
        }
        switch (this.c) {
            case 0:
                switch (this.d) {
                    case 1:
                        return 7;
                    case 2:
                        return 8;
                    case 3:
                        return 9;
                    case 4:
                        return 5;
                    case 5:
                        return 10;
                    case 6:
                        return 11;
                    case 7:
                        return 6;
                    case 8:
                        return 14;
                    case 9:
                        return 15;
                    case 10:
                        return 12;
                    case 11:
                        return 4;
                    case 12:
                        return 13;
                    case 13:
                        return 18;
                    case 14:
                        return 16;
                    case 15:
                        return 17;
                    default:
                        return 0;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return 0;
        }
    }
}
