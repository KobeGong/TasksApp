package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: csc  reason: default package */
/* compiled from: PG */
final /* synthetic */ class csc {
    public static final /* synthetic */ int[] a = new int[TimeUnit.values().length];

    static {
        try {
            a[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[TimeUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[TimeUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[TimeUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[TimeUnit.DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
    }
}