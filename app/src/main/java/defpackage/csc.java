package defpackage;

/* renamed from: csc reason: default package */
/* compiled from: PG */
final /* synthetic */ class csc {
    public static final /* synthetic */ int[] a = new int[java.util.concurrent.TimeUnit.values().length];

    static {
        try {
            a[java.util.concurrent.TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError e) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError e2) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError e3) {
        }
        try {
            a[java.util.concurrent.TimeUnit.SECONDS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError e4) {
        }
        try {
            a[java.util.concurrent.TimeUnit.MINUTES.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError e5) {
        }
        try {
            a[java.util.concurrent.TimeUnit.HOURS.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError e6) {
        }
        try {
            a[java.util.concurrent.TimeUnit.DAYS.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError e7) {
        }
    }
}
